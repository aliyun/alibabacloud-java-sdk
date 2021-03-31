// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518;

import com.aliyun.tea.*;
import com.aliyun.dataworks_public20200518.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;
import com.aliyun.oss.*;
import com.aliyun.oss.models.*;
import com.aliyun.openplatform20191219.*;
import com.aliyun.openplatform20191219.models.*;
import com.aliyun.ossutil.*;
import com.aliyun.ossutil.models.*;
import com.aliyun.fileform.*;
import com.aliyun.fileform.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dataworks-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public UpdateTableAddColumnResponse updateTableAddColumn(UpdateTableAddColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTableAddColumn", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTableAddColumnResponse());
    }

    public UpdateTableAddColumnResponse updateTableAddColumnSimply(UpdateTableAddColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableAddColumn(request, runtime);
    }

    public GetMigrationProcessResponse getMigrationProcess(GetMigrationProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMigrationProcess", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMigrationProcessResponse());
    }

    public GetMigrationProcessResponse getMigrationProcessSimply(GetMigrationProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationProcess(request, runtime);
    }

    public CreateImportMigrationResponse createImportMigration(CreateImportMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateImportMigration", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateImportMigrationResponse());
    }

    public CreateImportMigrationResponse createImportMigrationSimply(CreateImportMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImportMigration(request, runtime);
    }

    public CreateImportMigrationResponse createImportMigrationAdvance(CreateImportMigrationAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        AuthorizeFileUploadRequest authRequest = AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "dataworks-public"),
            new TeaPair("regionId", _regionId)
        ));
        AuthorizeFileUploadResponse authResponse = new AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        FileField fileObj = new FileField();
        PostObjectRequest.PostObjectRequestHeader ossHeader = new PostObjectRequest.PostObjectRequestHeader();
        PostObjectRequest uploadRequest = new PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        CreateImportMigrationRequest createImportMigrationReq = new CreateImportMigrationRequest();
        com.aliyun.common.Common.convert(request, createImportMigrationReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.packageFileObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        createImportMigrationReq.packageFile = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        CreateImportMigrationResponse createImportMigrationResp = this.createImportMigration(createImportMigrationReq, runtime);
        return createImportMigrationResp;
    }

    public StartMigrationResponse startMigration(StartMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartMigration", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new StartMigrationResponse());
    }

    public StartMigrationResponse startMigrationSimply(StartMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMigration(request, runtime);
    }

    public GetNodeParentsResponse getNodeParents(GetNodeParentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeParents", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeParentsResponse());
    }

    public GetNodeParentsResponse getNodeParentsSimply(GetNodeParentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeParents(request, runtime);
    }

    public GetNodeChildrenResponse getNodeChildren(GetNodeChildrenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeChildren", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeChildrenResponse());
    }

    public GetNodeChildrenResponse getNodeChildrenSimply(GetNodeChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeChildren(request, runtime);
    }

    public GetSensitiveDataResponse getSensitiveData(GetSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSensitiveData", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetSensitiveDataResponse());
    }

    public GetSensitiveDataResponse getSensitiveDataSimply(GetSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSensitiveData(request, runtime);
    }

    public DesensitizeDataResponse desensitizeData(DesensitizeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DesensitizeData", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new DesensitizeDataResponse());
    }

    public DesensitizeDataResponse desensitizeDataSimply(DesensitizeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.desensitizeData(request, runtime);
    }

    public GetOpRiskDataResponse getOpRiskData(GetOpRiskDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOpRiskData", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetOpRiskDataResponse());
    }

    public GetOpRiskDataResponse getOpRiskDataSimply(GetOpRiskDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpRiskData(request, runtime);
    }

    public ScanSensitiveDataResponse scanSensitiveData(ScanSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ScanSensitiveData", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new ScanSensitiveDataResponse());
    }

    public ScanSensitiveDataResponse scanSensitiveDataSimply(ScanSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanSensitiveData(request, runtime);
    }

    public GetOpSensitiveDataResponse getOpSensitiveData(GetOpSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOpSensitiveData", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetOpSensitiveDataResponse());
    }

    public GetOpSensitiveDataResponse getOpSensitiveDataSimply(GetOpSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpSensitiveData(request, runtime);
    }

    public CreateBusinessResponse createBusiness(CreateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateBusinessResponse());
    }

    public CreateBusinessResponse createBusinessSimply(CreateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBusiness(request, runtime);
    }

    public RunTriggerNodeResponse runTriggerNode(RunTriggerNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RunTriggerNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new RunTriggerNodeResponse());
    }

    public RunTriggerNodeResponse runTriggerNodeSimply(RunTriggerNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runTriggerNode(request, runtime);
    }

    public GetDagResponse getDag(GetDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDag", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDagResponse());
    }

    public GetDagResponse getDagSimply(GetDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDag(request, runtime);
    }

    public SearchNodesByOutputResponse searchNodesByOutput(SearchNodesByOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchNodesByOutput", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SearchNodesByOutputResponse());
    }

    public SearchNodesByOutputResponse searchNodesByOutputSimply(SearchNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchNodesByOutput(request, runtime);
    }

    public GetManualDagInstancesResponse getManualDagInstances(GetManualDagInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetManualDagInstances", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetManualDagInstancesResponse());
    }

    public GetManualDagInstancesResponse getManualDagInstancesSimply(GetManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManualDagInstances(request, runtime);
    }

    public CreateManualDagResponse createManualDag(CreateManualDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateManualDag", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateManualDagResponse());
    }

    public CreateManualDagResponse createManualDagSimply(CreateManualDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createManualDag(request, runtime);
    }

    public ListQualityResultsByEntityResponse listQualityResultsByEntity(ListQualityResultsByEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListQualityResultsByEntity", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListQualityResultsByEntityResponse());
    }

    public ListQualityResultsByEntityResponse listQualityResultsByEntitySimply(ListQualityResultsByEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByEntity(request, runtime);
    }

    public GetNodeTypeListInfoResponse getNodeTypeListInfo(GetNodeTypeListInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeTypeListInfo", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeTypeListInfoResponse());
    }

    public GetNodeTypeListInfoResponse getNodeTypeListInfoSimply(GetNodeTypeListInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeTypeListInfo(request, runtime);
    }

    public GetInstanceStatusCountResponse getInstanceStatusCount(GetInstanceStatusCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceStatusCount", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceStatusCountResponse());
    }

    public GetInstanceStatusCountResponse getInstanceStatusCountSimply(GetInstanceStatusCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusCount(request, runtime);
    }

    public ListDataServiceFoldersResponse listDataServiceFolders(ListDataServiceFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceFolders", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceFoldersResponse());
    }

    public ListDataServiceFoldersResponse listDataServiceFoldersSimply(ListDataServiceFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceFolders(request, runtime);
    }

    public ListQualityResultsByRuleResponse listQualityResultsByRule(ListQualityResultsByRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListQualityResultsByRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListQualityResultsByRuleResponse());
    }

    public ListQualityResultsByRuleResponse listQualityResultsByRuleSimply(ListQualityResultsByRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByRule(request, runtime);
    }

    public ListMetaDBResponse listMetaDB(ListMetaDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListMetaDB", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new ListMetaDBResponse());
    }

    public ListMetaDBResponse listMetaDBSimply(ListMetaDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaDB(request, runtime);
    }

    public CreateTableResponse createTable(CreateTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTable", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateTableResponse());
    }

    public CreateTableResponse createTableSimply(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTable(request, runtime);
    }

    public CreateTableThemeResponse createTableTheme(CreateTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTableTheme", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateTableThemeResponse());
    }

    public CreateTableThemeResponse createTableThemeSimply(CreateTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableTheme(request, runtime);
    }

    public GetInstanceErrorRankResponse getInstanceErrorRank(GetInstanceErrorRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceErrorRank", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceErrorRankResponse());
    }

    public GetInstanceErrorRankResponse getInstanceErrorRankSimply(GetInstanceErrorRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceErrorRank(request, runtime);
    }

    public GetDDLJobStatusResponse getDDLJobStatus(GetDDLJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDDLJobStatus", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetDDLJobStatusResponse());
    }

    public GetDDLJobStatusResponse getDDLJobStatusSimply(GetDDLJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDDLJobStatus(request, runtime);
    }

    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceConsumeTimeRank", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceConsumeTimeRankResponse());
    }

    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRankSimply(GetInstanceConsumeTimeRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceConsumeTimeRank(request, runtime);
    }

    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDataServiceApiAuthority", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDataServiceApiAuthorityResponse());
    }

    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthoritySimply(CreateDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiAuthority(request, runtime);
    }

    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDataServiceApiAuthority", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDataServiceApiAuthorityResponse());
    }

    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthoritySimply(DeleteDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiAuthority(request, runtime);
    }

    public CreateDataServiceGroupResponse createDataServiceGroup(CreateDataServiceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDataServiceGroup", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDataServiceGroupResponse());
    }

    public CreateDataServiceGroupResponse createDataServiceGroupSimply(CreateDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceGroup(request, runtime);
    }

    public UpdateMetaTableResponse updateMetaTable(UpdateMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMetaTable", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateMetaTableResponse());
    }

    public UpdateMetaTableResponse updateMetaTableSimply(UpdateMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTable(request, runtime);
    }

    public GetInstanceCountTrendResponse getInstanceCountTrend(GetInstanceCountTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceCountTrend", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceCountTrendResponse());
    }

    public GetInstanceCountTrendResponse getInstanceCountTrendSimply(GetInstanceCountTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceCountTrend(request, runtime);
    }

    public DeleteTableResponse deleteTable(DeleteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTable", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTableResponse());
    }

    public DeleteTableResponse deleteTableSimply(DeleteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTable(request, runtime);
    }

    public ListTableThemeResponse listTableTheme(ListTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTableTheme", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new ListTableThemeResponse());
    }

    public ListTableThemeResponse listTableThemeSimply(ListTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableTheme(request, runtime);
    }

    public GetSuccessInstanceTrendResponse getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSuccessInstanceTrend", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetSuccessInstanceTrendResponse());
    }

    public GetSuccessInstanceTrendResponse getSuccessInstanceTrendSimply(GetSuccessInstanceTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuccessInstanceTrend(request, runtime);
    }

    public UpdateTableResponse updateTable(UpdateTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTable", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTableResponse());
    }

    public UpdateTableResponse updateTableSimply(UpdateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTable(request, runtime);
    }

    public GetDataServiceFolderResponse getDataServiceFolder(GetDataServiceFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServiceFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServiceFolderResponse());
    }

    public GetDataServiceFolderResponse getDataServiceFolderSimply(GetDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceFolder(request, runtime);
    }

    public ListTableLevelResponse listTableLevel(ListTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTableLevel", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new ListTableLevelResponse());
    }

    public ListTableLevelResponse listTableLevelSimply(ListTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableLevel(request, runtime);
    }

    public ListDataServiceGroupsResponse listDataServiceGroups(ListDataServiceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceGroups", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceGroupsResponse());
    }

    public ListDataServiceGroupsResponse listDataServiceGroupsSimply(ListDataServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceGroups(request, runtime);
    }

    public UpdateTableThemeResponse updateTableTheme(UpdateTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTableTheme", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTableThemeResponse());
    }

    public UpdateTableThemeResponse updateTableThemeSimply(UpdateTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableTheme(request, runtime);
    }

    public CreateDataServiceFolderResponse createDataServiceFolder(CreateDataServiceFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDataServiceFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDataServiceFolderResponse());
    }

    public CreateDataServiceFolderResponse createDataServiceFolderSimply(CreateDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceFolder(request, runtime);
    }

    public GetDataServiceGroupResponse getDataServiceGroup(GetDataServiceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServiceGroup", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServiceGroupResponse());
    }

    public GetDataServiceGroupResponse getDataServiceGroupSimply(GetDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceGroup(request, runtime);
    }

    public CreateTableLevelResponse createTableLevel(CreateTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTableLevel", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateTableLevelResponse());
    }

    public CreateTableLevelResponse createTableLevelSimply(CreateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableLevel(request, runtime);
    }

    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMetaTableIntroWiki", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateMetaTableIntroWikiResponse());
    }

    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWikiSimply(UpdateMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableIntroWiki(request, runtime);
    }

    public DeleteTableLevelResponse deleteTableLevel(DeleteTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTableLevel", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTableLevelResponse());
    }

    public DeleteTableLevelResponse deleteTableLevelSimply(DeleteTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableLevel(request, runtime);
    }

    public UpdateTableLevelResponse updateTableLevel(UpdateTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTableLevel", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTableLevelResponse());
    }

    public UpdateTableLevelResponse updateTableLevelSimply(UpdateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableLevel(request, runtime);
    }

    public DeleteTableThemeResponse deleteTableTheme(DeleteTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTableTheme", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTableThemeResponse());
    }

    public DeleteTableThemeResponse deleteTableThemeSimply(DeleteTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableTheme(request, runtime);
    }

    public ListProgramTypeCountResponse listProgramTypeCount(ListProgramTypeCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProgramTypeCount", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListProgramTypeCountResponse());
    }

    public ListProgramTypeCountResponse listProgramTypeCountSimply(ListProgramTypeCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProgramTypeCount(request, runtime);
    }

    public UpdateTableModelInfoResponse updateTableModelInfo(UpdateTableModelInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTableModelInfo", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTableModelInfoResponse());
    }

    public UpdateTableModelInfoResponse updateTableModelInfoSimply(UpdateTableModelInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableModelInfo(request, runtime);
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProjects", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjectsSimply(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjects(request, runtime);
    }

    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProjectMembers", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListProjectMembersResponse());
    }

    public ListProjectMembersResponse listProjectMembersSimply(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembers(request, runtime);
    }

    public CreateProjectMemberResponse createProjectMember(CreateProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProjectMember", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateProjectMemberResponse());
    }

    public CreateProjectMemberResponse createProjectMemberSimply(CreateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMember(request, runtime);
    }

    public ListProjectRolesResponse listProjectRoles(ListProjectRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProjectRoles", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListProjectRolesResponse());
    }

    public ListProjectRolesResponse listProjectRolesSimply(ListProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectRoles(request, runtime);
    }

    public AddProjectMemberToRoleResponse addProjectMemberToRole(AddProjectMemberToRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddProjectMemberToRole", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new AddProjectMemberToRoleResponse());
    }

    public AddProjectMemberToRoleResponse addProjectMemberToRoleSimply(AddProjectMemberToRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectMemberToRole(request, runtime);
    }

    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveProjectMemberFromRole", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new RemoveProjectMemberFromRoleResponse());
    }

    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRoleSimply(RemoveProjectMemberFromRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeProjectMemberFromRole(request, runtime);
    }

    public DeleteProjectMemberResponse deleteProjectMember(DeleteProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProjectMember", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProjectMemberResponse());
    }

    public DeleteProjectMemberResponse deleteProjectMemberSimply(DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMember(request, runtime);
    }

    public CreateDagComplementResponse createDagComplement(CreateDagComplementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDagComplement", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDagComplementResponse());
    }

    public CreateDagComplementResponse createDagComplementSimply(CreateDagComplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagComplement(request, runtime);
    }

    public CreateDagTestResponse createDagTest(CreateDagTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDagTest", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDagTestResponse());
    }

    public CreateDagTestResponse createDagTestSimply(CreateDagTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagTest(request, runtime);
    }

    public ListCalcEnginesResponse listCalcEngines(ListCalcEnginesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCalcEngines", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListCalcEnginesResponse());
    }

    public ListCalcEnginesResponse listCalcEnginesSimply(ListCalcEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalcEngines(request, runtime);
    }

    public ListConnectionsResponse listConnections(ListConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListConnections", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new ListConnectionsResponse());
    }

    public ListConnectionsResponse listConnectionsSimply(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnections(request, runtime);
    }

    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateConnection", "HTTPS", "PUT", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateConnectionResponse());
    }

    public UpdateConnectionResponse updateConnectionSimply(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnection(request, runtime);
    }

    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteConnection", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteConnectionResponse());
    }

    public DeleteConnectionResponse deleteConnectionSimply(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnection(request, runtime);
    }

    public GetProjectDetailResponse getProjectDetail(GetProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetProjectDetail", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetProjectDetailResponse());
    }

    public GetProjectDetailResponse getProjectDetailSimply(GetProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectDetail(request, runtime);
    }

    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceGroups", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListResourceGroupsResponse());
    }

    public ListResourceGroupsResponse listResourceGroupsSimply(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroups(request, runtime);
    }

    public CreateConnectionResponse createConnection(CreateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateConnection", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateConnectionResponse());
    }

    public CreateConnectionResponse createConnectionSimply(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnection(request, runtime);
    }

    public GetDataServiceApplicationResponse getDataServiceApplication(GetDataServiceApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServiceApplication", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServiceApplicationResponse());
    }

    public GetDataServiceApplicationResponse getDataServiceApplicationSimply(GetDataServiceApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApplication(request, runtime);
    }

    public ListDataServiceApplicationsResponse listDataServiceApplications(ListDataServiceApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceApplications", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceApplicationsResponse());
    }

    public ListDataServiceApplicationsResponse listDataServiceApplicationsSimply(ListDataServiceApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApplications(request, runtime);
    }

    public GetNodeOnBaselineResponse getNodeOnBaseline(GetNodeOnBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeOnBaseline", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeOnBaselineResponse());
    }

    public GetNodeOnBaselineResponse getNodeOnBaselineSimply(GetNodeOnBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeOnBaseline(request, runtime);
    }

    public ListBaselineConfigsResponse listBaselineConfigs(ListBaselineConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBaselineConfigs", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListBaselineConfigsResponse());
    }

    public ListBaselineConfigsResponse listBaselineConfigsSimply(ListBaselineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineConfigs(request, runtime);
    }

    public GetMetaTableChangeLogResponse getMetaTableChangeLog(GetMetaTableChangeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableChangeLog", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableChangeLogResponse());
    }

    public GetMetaTableChangeLogResponse getMetaTableChangeLogSimply(GetMetaTableChangeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableChangeLog(request, runtime);
    }

    public GetMetaTableOutputResponse getMetaTableOutput(GetMetaTableOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableOutput", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableOutputResponse());
    }

    public GetMetaTableOutputResponse getMetaTableOutputSimply(GetMetaTableOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableOutput(request, runtime);
    }

    public GetMetaTablePartitionResponse getMetaTablePartition(GetMetaTablePartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTablePartition", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTablePartitionResponse());
    }

    public GetMetaTablePartitionResponse getMetaTablePartitionSimply(GetMetaTablePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTablePartition(request, runtime);
    }

    public GetMetaTableFullInfoResponse getMetaTableFullInfo(GetMetaTableFullInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableFullInfo", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableFullInfoResponse());
    }

    public GetMetaTableFullInfoResponse getMetaTableFullInfoSimply(GetMetaTableFullInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableFullInfo(request, runtime);
    }

    public GetFileVersionResponse getFileVersion(GetFileVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFileVersion", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetFileVersionResponse());
    }

    public GetFileVersionResponse getFileVersionSimply(GetFileVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileVersion(request, runtime);
    }

    public GetMetaTableBasicInfoResponse getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableBasicInfo", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableBasicInfoResponse());
    }

    public GetMetaTableBasicInfoResponse getMetaTableBasicInfoSimply(GetMetaTableBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableBasicInfo(request, runtime);
    }

    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableColumn", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableColumnResponse());
    }

    public GetMetaTableColumnResponse getMetaTableColumnSimply(GetMetaTableColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableColumn(request, runtime);
    }

    public GetMetaDBInfoResponse getMetaDBInfo(GetMetaDBInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaDBInfo", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaDBInfoResponse());
    }

    public GetMetaDBInfoResponse getMetaDBInfoSimply(GetMetaDBInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBInfo(request, runtime);
    }

    public GetMetaCategoryResponse getMetaCategory(GetMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaCategoryResponse());
    }

    public GetMetaCategoryResponse getMetaCategorySimply(GetMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCategory(request, runtime);
    }

    public ListAlertMessagesResponse listAlertMessages(ListAlertMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAlertMessages", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListAlertMessagesResponse());
    }

    public ListAlertMessagesResponse listAlertMessagesSimply(ListAlertMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertMessages(request, runtime);
    }

    public GetBaselineConfigResponse getBaselineConfig(GetBaselineConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBaselineConfig", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBaselineConfigResponse());
    }

    public GetBaselineConfigResponse getBaselineConfigSimply(GetBaselineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineConfig(request, runtime);
    }

    public SearchMetaTablesResponse searchMetaTables(SearchMetaTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchMetaTables", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SearchMetaTablesResponse());
    }

    public SearchMetaTablesResponse searchMetaTablesSimply(SearchMetaTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMetaTables(request, runtime);
    }

    public GetMetaTableListByCategoryResponse getMetaTableListByCategory(GetMetaTableListByCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableListByCategory", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableListByCategoryResponse());
    }

    public GetMetaTableListByCategoryResponse getMetaTableListByCategorySimply(GetMetaTableListByCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableListByCategory(request, runtime);
    }

    public DeleteMetaCategoryResponse deleteMetaCategory(DeleteMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMetaCategory", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMetaCategoryResponse());
    }

    public DeleteMetaCategoryResponse deleteMetaCategorySimply(DeleteMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCategory(request, runtime);
    }

    public UpdateMetaCategoryResponse updateMetaCategory(UpdateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateMetaCategoryResponse());
    }

    public UpdateMetaCategoryResponse updateMetaCategorySimply(UpdateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCategory(request, runtime);
    }

    public ListTopicsResponse listTopics(ListTopicsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTopics", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListTopicsResponse());
    }

    public ListTopicsResponse listTopicsSimply(ListTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopics(request, runtime);
    }

    public ListFileVersionsResponse listFileVersions(ListFileVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFileVersions", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListFileVersionsResponse());
    }

    public ListFileVersionsResponse listFileVersionsSimply(ListFileVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileVersions(request, runtime);
    }

    public CreateMetaCategoryResponse createMetaCategory(CreateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateMetaCategoryResponse());
    }

    public CreateMetaCategoryResponse createMetaCategorySimply(CreateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCategory(request, runtime);
    }

    public ListNodeIOResponse listNodeIO(ListNodeIORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListNodeIO", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListNodeIOResponse());
    }

    public ListNodeIOResponse listNodeIOSimply(ListNodeIORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeIO(request, runtime);
    }

    public GetTopicInfluenceResponse getTopicInfluence(GetTopicInfluenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTopicInfluence", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetTopicInfluenceResponse());
    }

    public GetTopicInfluenceResponse getTopicInfluenceSimply(GetTopicInfluenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicInfluence(request, runtime);
    }

    public GetTopicResponse getTopic(GetTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTopic", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetTopicResponse());
    }

    public GetTopicResponse getTopicSimply(GetTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopic(request, runtime);
    }

    public DeleteFromMetaCategoryResponse deleteFromMetaCategory(DeleteFromMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFromMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFromMetaCategoryResponse());
    }

    public DeleteFromMetaCategoryResponse deleteFromMetaCategorySimply(DeleteFromMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFromMetaCategory(request, runtime);
    }

    public GetNodeResponse getNode(GetNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeResponse());
    }

    public GetNodeResponse getNodeSimply(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNode(request, runtime);
    }

    public ListNodesResponse listNodes(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListNodes", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodesSimply(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodes(request, runtime);
    }

    public GetNodeCodeResponse getNodeCode(GetNodeCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeCode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeCodeResponse());
    }

    public GetNodeCodeResponse getNodeCodeSimply(GetNodeCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeCode(request, runtime);
    }

    public EstablishRelationTableToBusinessResponse establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EstablishRelationTableToBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new EstablishRelationTableToBusinessResponse());
    }

    public EstablishRelationTableToBusinessResponse establishRelationTableToBusinessSimply(EstablishRelationTableToBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.establishRelationTableToBusiness(request, runtime);
    }

    public UpdateDataServiceApiResponse updateDataServiceApi(UpdateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDataServiceApiResponse());
    }

    public UpdateDataServiceApiResponse updateDataServiceApiSimply(UpdateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataServiceApi(request, runtime);
    }

    public UpdateUdfFileResponse updateUdfFile(UpdateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUdfFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateUdfFileResponse());
    }

    public UpdateUdfFileResponse updateUdfFileSimply(UpdateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUdfFile(request, runtime);
    }

    public CreateUdfFileResponse createUdfFile(CreateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUdfFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateUdfFileResponse());
    }

    public CreateUdfFileResponse createUdfFileSimply(CreateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUdfFile(request, runtime);
    }

    public ListFilesResponse listFiles(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFiles", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListFilesResponse());
    }

    public ListFilesResponse listFilesSimply(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFiles(request, runtime);
    }

    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceAuthorizedApis", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceAuthorizedApisResponse());
    }

    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApisSimply(ListDataServiceAuthorizedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceAuthorizedApis(request, runtime);
    }

    public UpdateFileResponse updateFile(UpdateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFileResponse());
    }

    public UpdateFileResponse updateFileSimply(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFile(request, runtime);
    }

    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFolderResponse());
    }

    public DeleteFolderResponse deleteFolderSimply(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFolder(request, runtime);
    }

    public ListFoldersResponse listFolders(ListFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFolders", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListFoldersResponse());
    }

    public ListFoldersResponse listFoldersSimply(ListFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFolders(request, runtime);
    }

    public CheckMetaPartitionResponse checkMetaPartition(CheckMetaPartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckMetaPartition", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CheckMetaPartitionResponse());
    }

    public CheckMetaPartitionResponse checkMetaPartitionSimply(CheckMetaPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaPartition(request, runtime);
    }

    public UpdateFolderResponse updateFolder(UpdateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFolderResponse());
    }

    public UpdateFolderResponse updateFolderSimply(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolder(request, runtime);
    }

    public DeleteRemindResponse deleteRemind(DeleteRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRemindResponse());
    }

    public DeleteRemindResponse deleteRemindSimply(DeleteRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRemind(request, runtime);
    }

    public AddToMetaCategoryResponse addToMetaCategory(AddToMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddToMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new AddToMetaCategoryResponse());
    }

    public AddToMetaCategoryResponse addToMetaCategorySimply(AddToMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addToMetaCategory(request, runtime);
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListInstances", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstancesSimply(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstances(request, runtime);
    }

    public SetSuccessInstanceResponse setSuccessInstance(SetSuccessInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetSuccessInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SetSuccessInstanceResponse());
    }

    public SetSuccessInstanceResponse setSuccessInstanceSimply(SetSuccessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessInstance(request, runtime);
    }

    public CreateFileResponse createFile(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateFileResponse());
    }

    public CreateFileResponse createFileSimply(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFile(request, runtime);
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstanceSimply(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstance(request, runtime);
    }

    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResumeInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ResumeInstanceResponse());
    }

    public ResumeInstanceResponse resumeInstanceSimply(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstance(request, runtime);
    }

    public SuspendInstanceResponse suspendInstance(SuspendInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SuspendInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SuspendInstanceResponse());
    }

    public SuspendInstanceResponse suspendInstanceSimply(SuspendInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendInstance(request, runtime);
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestartInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new RestartInstanceResponse());
    }

    public RestartInstanceResponse restartInstanceSimply(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstance(request, runtime);
    }

    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceApiAuthorities", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceApiAuthoritiesResponse());
    }

    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthoritiesSimply(ListDataServiceApiAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiAuthorities(request, runtime);
    }

    public ListDataServicePublishedApisResponse listDataServicePublishedApis(ListDataServicePublishedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServicePublishedApis", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServicePublishedApisResponse());
    }

    public ListDataServicePublishedApisResponse listDataServicePublishedApisSimply(ListDataServicePublishedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServicePublishedApis(request, runtime);
    }

    public GetInstanceLogResponse getInstanceLog(GetInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceLog", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceLogResponse());
    }

    public GetInstanceLogResponse getInstanceLogSimply(GetInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLog(request, runtime);
    }

    public CreateFolderResponse createFolder(CreateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateFolderResponse());
    }

    public CreateFolderResponse createFolderSimply(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolder(request, runtime);
    }

    public GetBusinessResponse getBusiness(GetBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBusinessResponse());
    }

    public GetBusinessResponse getBusinessSimply(GetBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusiness(request, runtime);
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstanceSimply(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstance(request, runtime);
    }

    public GetFileResponse getFile(GetFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetFileResponse());
    }

    public GetFileResponse getFileSimply(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFile(request, runtime);
    }

    public ListBusinessResponse listBusiness(ListBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListBusinessResponse());
    }

    public ListBusinessResponse listBusinessSimply(ListBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusiness(request, runtime);
    }

    public GetMetaDBTableListResponse getMetaDBTableList(GetMetaDBTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaDBTableList", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaDBTableListResponse());
    }

    public GetMetaDBTableListResponse getMetaDBTableListSimply(GetMetaDBTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBTableList(request, runtime);
    }

    public CheckMetaTableResponse checkMetaTable(CheckMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckMetaTable", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CheckMetaTableResponse());
    }

    public CheckMetaTableResponse checkMetaTableSimply(CheckMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaTable(request, runtime);
    }

    public GetFolderResponse getFolder(GetFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetFolderResponse());
    }

    public GetFolderResponse getFolderSimply(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolder(request, runtime);
    }

    public DeployFileResponse deployFile(DeployFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeployFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeployFileResponse());
    }

    public DeployFileResponse deployFileSimply(DeployFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployFile(request, runtime);
    }

    public DeleteBusinessResponse deleteBusiness(DeleteBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBusinessResponse());
    }

    public DeleteBusinessResponse deleteBusinessSimply(DeleteBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusiness(request, runtime);
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFileSimply(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFile(request, runtime);
    }

    public ListQualityRulesResponse listQualityRules(ListQualityRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListQualityRules", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListQualityRulesResponse());
    }

    public ListQualityRulesResponse listQualityRulesSimply(ListQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRules(request, runtime);
    }

    public CreateRemindResponse createRemind(CreateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateRemindResponse());
    }

    public CreateRemindResponse createRemindSimply(CreateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemind(request, runtime);
    }

    public GetQualityRuleResponse getQualityRule(GetQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetQualityRuleResponse());
    }

    public GetQualityRuleResponse getQualityRuleSimply(GetQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRule(request, runtime);
    }

    public GetDeploymentResponse getDeployment(GetDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeployment", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDeploymentResponse());
    }

    public GetDeploymentResponse getDeploymentSimply(GetDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeployment(request, runtime);
    }

    public UpdateRemindResponse updateRemind(UpdateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRemindResponse());
    }

    public UpdateRemindResponse updateRemindSimply(UpdateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemind(request, runtime);
    }

    public GetMetaColumnLineageResponse getMetaColumnLineage(GetMetaColumnLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaColumnLineage", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaColumnLineageResponse());
    }

    public GetMetaColumnLineageResponse getMetaColumnLineageSimply(GetMetaColumnLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaColumnLineage(request, runtime);
    }

    public UpdateBusinessResponse updateBusiness(UpdateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateBusinessResponse());
    }

    public UpdateBusinessResponse updateBusinessSimply(UpdateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBusiness(request, runtime);
    }

    public UpdateQualityRuleResponse updateQualityRule(UpdateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateQualityRuleResponse());
    }

    public UpdateQualityRuleResponse updateQualityRuleSimply(UpdateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityRule(request, runtime);
    }

    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityRuleResponse());
    }

    public DeleteQualityRuleResponse deleteQualityRuleSimply(DeleteQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRule(request, runtime);
    }

    public SubmitFileResponse submitFile(SubmitFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SubmitFileResponse());
    }

    public SubmitFileResponse submitFileSimply(SubmitFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFile(request, runtime);
    }

    public GetDataServiceApiResponse getDataServiceApi(GetDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServiceApiResponse());
    }

    public GetDataServiceApiResponse getDataServiceApiSimply(GetDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApi(request, runtime);
    }

    public ListDataServiceApisResponse listDataServiceApis(ListDataServiceApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceApis", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceApisResponse());
    }

    public ListDataServiceApisResponse listDataServiceApisSimply(ListDataServiceApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApis(request, runtime);
    }

    public GetDataServicePublishedApiResponse getDataServicePublishedApi(GetDataServicePublishedApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServicePublishedApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServicePublishedApiResponse());
    }

    public GetDataServicePublishedApiResponse getDataServicePublishedApiSimply(GetDataServicePublishedApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServicePublishedApi(request, runtime);
    }

    public GetBaselineKeyPathResponse getBaselineKeyPath(GetBaselineKeyPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBaselineKeyPath", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBaselineKeyPathResponse());
    }

    public GetBaselineKeyPathResponse getBaselineKeyPathSimply(GetBaselineKeyPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineKeyPath(request, runtime);
    }

    public GetRemindResponse getRemind(GetRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetRemindResponse());
    }

    public GetRemindResponse getRemindSimply(GetRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemind(request, runtime);
    }

    public GetMetaTableIntroWikiResponse getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableIntroWiki", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableIntroWikiResponse());
    }

    public GetMetaTableIntroWikiResponse getMetaTableIntroWikiSimply(GetMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableIntroWiki(request, runtime);
    }

    public GetBaselineStatusResponse getBaselineStatus(GetBaselineStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBaselineStatus", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBaselineStatusResponse());
    }

    public GetBaselineStatusResponse getBaselineStatusSimply(GetBaselineStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineStatus(request, runtime);
    }

    public DeleteDataServiceApiResponse deleteDataServiceApi(DeleteDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDataServiceApiResponse());
    }

    public DeleteDataServiceApiResponse deleteDataServiceApiSimply(DeleteDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApi(request, runtime);
    }

    public PublishDataServiceApiResponse publishDataServiceApi(PublishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PublishDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new PublishDataServiceApiResponse());
    }

    public PublishDataServiceApiResponse publishDataServiceApiSimply(PublishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDataServiceApi(request, runtime);
    }

    public GetMetaTableLineageResponse getMetaTableLineage(GetMetaTableLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableLineage", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableLineageResponse());
    }

    public GetMetaTableLineageResponse getMetaTableLineageSimply(GetMetaTableLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableLineage(request, runtime);
    }

    public ListBaselineStatusesResponse listBaselineStatuses(ListBaselineStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBaselineStatuses", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListBaselineStatusesResponse());
    }

    public ListBaselineStatusesResponse listBaselineStatusesSimply(ListBaselineStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineStatuses(request, runtime);
    }

    public ListRemindsResponse listReminds(ListRemindsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListReminds", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListRemindsResponse());
    }

    public ListRemindsResponse listRemindsSimply(ListRemindsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReminds(request, runtime);
    }

    public DeleteQualityEntityResponse deleteQualityEntity(DeleteQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityEntity", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityEntityResponse());
    }

    public DeleteQualityEntityResponse deleteQualityEntitySimply(DeleteQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityEntity(request, runtime);
    }

    public CreateQualityFollowerResponse createQualityFollower(CreateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityFollowerResponse());
    }

    public CreateQualityFollowerResponse createQualityFollowerSimply(CreateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityFollower(request, runtime);
    }

    public CreateDataServiceApiResponse createDataServiceApi(CreateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDataServiceApiResponse());
    }

    public CreateDataServiceApiResponse createDataServiceApiSimply(CreateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApi(request, runtime);
    }

    public AbolishDataServiceApiResponse abolishDataServiceApi(AbolishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AbolishDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new AbolishDataServiceApiResponse());
    }

    public AbolishDataServiceApiResponse abolishDataServiceApiSimply(AbolishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishDataServiceApi(request, runtime);
    }

    public GetQualityEntityResponse getQualityEntity(GetQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQualityEntity", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetQualityEntityResponse());
    }

    public GetQualityEntityResponse getQualityEntitySimply(GetQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityEntity(request, runtime);
    }

    public GetQualityFollowerResponse getQualityFollower(GetQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetQualityFollowerResponse());
    }

    public GetQualityFollowerResponse getQualityFollowerSimply(GetQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityFollower(request, runtime);
    }

    public DeleteQualityFollowerResponse deleteQualityFollower(DeleteQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityFollowerResponse());
    }

    public DeleteQualityFollowerResponse deleteQualityFollowerSimply(DeleteQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityFollower(request, runtime);
    }

    public CreateQualityEntityResponse createQualityEntity(CreateQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityEntity", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityEntityResponse());
    }

    public CreateQualityEntityResponse createQualityEntitySimply(CreateQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityEntity(request, runtime);
    }

    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityRuleResponse());
    }

    public CreateQualityRuleResponse createQualityRuleSimply(CreateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRule(request, runtime);
    }

    public UpdateQualityFollowerResponse updateQualityFollower(UpdateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateQualityFollowerResponse());
    }

    public UpdateQualityFollowerResponse updateQualityFollowerSimply(UpdateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityFollower(request, runtime);
    }

    public CreateQualityRelativeNodeResponse createQualityRelativeNode(CreateQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityRelativeNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityRelativeNodeResponse());
    }

    public CreateQualityRelativeNodeResponse createQualityRelativeNodeSimply(CreateQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRelativeNode(request, runtime);
    }

    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityRelativeNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityRelativeNodeResponse());
    }

    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNodeSimply(DeleteQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRelativeNode(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
