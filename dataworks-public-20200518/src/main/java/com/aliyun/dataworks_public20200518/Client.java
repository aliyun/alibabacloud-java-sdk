// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518;

import com.aliyun.tea.*;
import com.aliyun.dataworks_public20200518.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.oss.*;
import com.aliyun.oss.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.openplatform20191219.*;
import com.aliyun.openplatform20191219.models.*;
import com.aliyun.ossutil.*;
import com.aliyun.ossutil.models.*;
import com.aliyun.fileform.*;
import com.aliyun.fileform.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AbolishDataServiceApiResponse abolishDataServiceApiWithOptions(AbolishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbolishDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbolishDataServiceApiResponse());
    }

    public AbolishDataServiceApiResponse abolishDataServiceApi(AbolishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishDataServiceApiWithOptions(request, runtime);
    }

    public AddProjectMemberToRoleResponse addProjectMemberToRoleWithOptions(AddProjectMemberToRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("UserId", request.userId);
        query.put("RoleCode", request.roleCode);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProjectMemberToRole"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProjectMemberToRoleResponse());
    }

    public AddProjectMemberToRoleResponse addProjectMemberToRole(AddProjectMemberToRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectMemberToRoleWithOptions(request, runtime);
    }

    public AddToMetaCategoryResponse addToMetaCategoryWithOptions(AddToMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CategoryId", request.categoryId);
        query.put("TableGuid", request.tableGuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddToMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddToMetaCategoryResponse());
    }

    public AddToMetaCategoryResponse addToMetaCategory(AddToMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addToMetaCategoryWithOptions(request, runtime);
    }

    public ApprovePermissionApplyOrderResponse approvePermissionApplyOrderWithOptions(ApprovePermissionApplyOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowId", request.flowId);
        query.put("ApproveComment", request.approveComment);
        query.put("ApproveAction", request.approveAction);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApprovePermissionApplyOrder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApprovePermissionApplyOrderResponse());
    }

    public ApprovePermissionApplyOrderResponse approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approvePermissionApplyOrderWithOptions(request, runtime);
    }

    public CheckEngineMetaPartitionResponse checkEngineMetaPartitionWithOptions(CheckEngineMetaPartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        query.put("Partition", request.partition);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckEngineMetaPartition"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckEngineMetaPartitionResponse());
    }

    public CheckEngineMetaPartitionResponse checkEngineMetaPartition(CheckEngineMetaPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkEngineMetaPartitionWithOptions(request, runtime);
    }

    public CheckEngineMetaTableResponse checkEngineMetaTableWithOptions(CheckEngineMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckEngineMetaTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckEngineMetaTableResponse());
    }

    public CheckEngineMetaTableResponse checkEngineMetaTable(CheckEngineMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkEngineMetaTableWithOptions(request, runtime);
    }

    public CheckFileDeploymentResponse checkFileDeploymentWithOptions(CheckFileDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckFileDeployment"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckFileDeploymentResponse());
    }

    public CheckFileDeploymentResponse checkFileDeployment(CheckFileDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFileDeploymentWithOptions(request, runtime);
    }

    public CheckMetaPartitionResponse checkMetaPartitionWithOptions(CheckMetaPartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        query.put("Partition", request.partition);
        query.put("ClusterId", request.clusterId);
        query.put("DatabaseName", request.databaseName);
        query.put("TableName", request.tableName);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMetaPartition"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMetaPartitionResponse());
    }

    public CheckMetaPartitionResponse checkMetaPartition(CheckMetaPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaPartitionWithOptions(request, runtime);
    }

    public CheckMetaTableResponse checkMetaTableWithOptions(CheckMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        query.put("ClusterId", request.clusterId);
        query.put("DatabaseName", request.databaseName);
        query.put("TableName", request.tableName);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMetaTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMetaTableResponse());
    }

    public CheckMetaTableResponse checkMetaTable(CheckMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaTableWithOptions(request, runtime);
    }

    public CheckMetaTableTaskResponse checkMetaTableTaskWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMetaTableTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMetaTableTaskResponse());
    }

    public CheckMetaTableTaskResponse checkMetaTableTask() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaTableTaskWithOptions(runtime);
    }

    public CreateBusinessResponse createBusinessWithOptions(CreateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBusinessResponse());
    }

    public CreateBusinessResponse createBusiness(CreateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBusinessWithOptions(request, runtime);
    }

    public CreateConnectionResponse createConnectionWithOptions(CreateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("ConnectionType", request.connectionType);
        query.put("SubType", request.subType);
        query.put("EnvType", request.envType);
        query.put("Content", request.content);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConnectionResponse());
    }

    public CreateConnectionResponse createConnection(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectionWithOptions(request, runtime);
    }

    public CreateDagComplementResponse createDagComplementWithOptions(CreateDagComplementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDagComplement"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDagComplementResponse());
    }

    public CreateDagComplementResponse createDagComplement(CreateDagComplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagComplementWithOptions(request, runtime);
    }

    public CreateDagTestResponse createDagTestWithOptions(CreateDagTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDagTest"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDagTestResponse());
    }

    public CreateDagTestResponse createDagTest(CreateDagTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagTestWithOptions(request, runtime);
    }

    public CreateDataServiceApiResponse createDataServiceApiWithOptions(CreateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceApiResponse());
    }

    public CreateDataServiceApiResponse createDataServiceApi(CreateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiWithOptions(request, runtime);
    }

    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthorityWithOptions(CreateDataServiceApiAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceApiAuthority"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceApiAuthorityResponse());
    }

    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiAuthorityWithOptions(request, runtime);
    }

    public CreateDataServiceFolderResponse createDataServiceFolderWithOptions(CreateDataServiceFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceFolderResponse());
    }

    public CreateDataServiceFolderResponse createDataServiceFolder(CreateDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceFolderWithOptions(request, runtime);
    }

    public CreateDataServiceGroupResponse createDataServiceGroupWithOptions(CreateDataServiceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceGroup"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceGroupResponse());
    }

    public CreateDataServiceGroupResponse createDataServiceGroup(CreateDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceGroupWithOptions(request, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("DataSourceType", request.dataSourceType);
        query.put("SubType", request.subType);
        query.put("EnvType", request.envType);
        query.put("Content", request.content);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    public CreateDISyncTaskResponse createDISyncTaskWithOptions(CreateDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("TaskContent", request.taskContent);
        query.put("TaskParam", request.taskParam);
        query.put("TaskName", request.taskName);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDISyncTaskResponse());
    }

    public CreateDISyncTaskResponse createDISyncTask(CreateDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDISyncTaskWithOptions(request, runtime);
    }

    public CreateFileResponse createFileWithOptions(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    public CreateImportMigrationResponse createImportMigrationWithOptions(CreateImportMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImportMigration"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImportMigrationResponse());
    }

    public CreateImportMigrationResponse createImportMigration(CreateImportMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImportMigrationWithOptions(request, runtime);
    }

    public CreateImportMigrationResponse createImportMigrationAdvance(CreateImportMigrationAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
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
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        CreateImportMigrationRequest createImportMigrationReq = new CreateImportMigrationRequest();
        com.aliyun.openapiutil.Client.convert(request, createImportMigrationReq);
        if (!com.aliyun.teautil.Common.isUnset(request.packageFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
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
        }

        CreateImportMigrationResponse createImportMigrationResp = this.createImportMigrationWithOptions(createImportMigrationReq, runtime);
        return createImportMigrationResp;
    }

    public CreateManualDagResponse createManualDagWithOptions(CreateManualDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateManualDag"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateManualDagResponse());
    }

    public CreateManualDagResponse createManualDag(CreateManualDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createManualDagWithOptions(request, runtime);
    }

    public CreateMetaCategoryResponse createMetaCategoryWithOptions(CreateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetaCategoryResponse());
    }

    public CreateMetaCategoryResponse createMetaCategory(CreateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCategoryWithOptions(request, runtime);
    }

    public CreatePermissionApplyOrderResponse createPermissionApplyOrderWithOptions(CreatePermissionApplyOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApplyUserIds", request.applyUserIds);
        query.put("Deadline", request.deadline);
        query.put("ApplyReason", request.applyReason);
        query.put("MaxComputeProjectName", request.maxComputeProjectName);
        query.put("WorkspaceId", request.workspaceId);
        query.put("OrderType", request.orderType);
        query.put("EngineType", request.engineType);
        query.put("ApplyObject", request.applyObject);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePermissionApplyOrder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePermissionApplyOrderResponse());
    }

    public CreatePermissionApplyOrderResponse createPermissionApplyOrder(CreatePermissionApplyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPermissionApplyOrderWithOptions(request, runtime);
    }

    public CreateProjectMemberResponse createProjectMemberWithOptions(CreateProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("UserId", request.userId);
        query.put("ClientToken", request.clientToken);
        query.put("RoleCode", request.roleCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectMember"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectMemberResponse());
    }

    public CreateProjectMemberResponse createProjectMember(CreateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMemberWithOptions(request, runtime);
    }

    public CreateQualityEntityResponse createQualityEntityWithOptions(CreateQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityEntityResponse());
    }

    public CreateQualityEntityResponse createQualityEntity(CreateQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityEntityWithOptions(request, runtime);
    }

    public CreateQualityFollowerResponse createQualityFollowerWithOptions(CreateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityFollowerResponse());
    }

    public CreateQualityFollowerResponse createQualityFollower(CreateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityFollowerWithOptions(request, runtime);
    }

    public CreateQualityRelativeNodeResponse createQualityRelativeNodeWithOptions(CreateQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityRelativeNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityRelativeNodeResponse());
    }

    public CreateQualityRelativeNodeResponse createQualityRelativeNode(CreateQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRelativeNodeWithOptions(request, runtime);
    }

    public CreateQualityRuleResponse createQualityRuleWithOptions(CreateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityRuleResponse());
    }

    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRuleWithOptions(request, runtime);
    }

    public CreateRemindResponse createRemindWithOptions(CreateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRemindResponse());
    }

    public CreateRemindResponse createRemind(CreateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemindWithOptions(request, runtime);
    }

    public CreateTableResponse createTableWithOptions(CreateTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IsView", request.isView);
        query.put("Visibility", request.visibility);
        query.put("LifeCycle", request.lifeCycle);
        query.put("CategoryId", request.categoryId);
        query.put("LogicalLevelId", request.logicalLevelId);
        query.put("PhysicsLevelId", request.physicsLevelId);
        query.put("ExternalTableType", request.externalTableType);
        query.put("Location", request.location);
        query.put("ProjectId", request.projectId);
        query.put("TableName", request.tableName);
        query.put("AppGuid", request.appGuid);
        query.put("Comment", request.comment);
        query.put("OwnerId", request.ownerId);
        query.put("HasPart", request.hasPart);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableResponse());
    }

    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableWithOptions(request, runtime);
    }

    public CreateTableLevelResponse createTableLevelWithOptions(CreateTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("LevelType", request.levelType);
        query.put("Name", request.name);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableLevelResponse());
    }

    public CreateTableLevelResponse createTableLevel(CreateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableLevelWithOptions(request, runtime);
    }

    public CreateTableThemeResponse createTableThemeWithOptions(CreateTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("Level", request.level);
        query.put("Name", request.name);
        query.put("ParentId", request.parentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableThemeResponse());
    }

    public CreateTableThemeResponse createTableTheme(CreateTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableThemeWithOptions(request, runtime);
    }

    public CreateUdfFileResponse createUdfFileWithOptions(CreateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUdfFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUdfFileResponse());
    }

    public CreateUdfFileResponse createUdfFile(CreateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUdfFileWithOptions(request, runtime);
    }

    public CreateViewResponse createViewWithOptions(CreateViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateView"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateViewResponse());
    }

    public CreateViewResponse createView(CreateViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createViewWithOptions(request, runtime);
    }

    public DeleteBusinessResponse deleteBusinessWithOptions(DeleteBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBusinessResponse());
    }

    public DeleteBusinessResponse deleteBusiness(DeleteBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusinessWithOptions(request, runtime);
    }

    public DeleteConnectionResponse deleteConnectionWithOptions(DeleteConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConnectionId", request.connectionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectionResponse());
    }

    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectionWithOptions(request, runtime);
    }

    public DeleteDataServiceApiResponse deleteDataServiceApiWithOptions(DeleteDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataServiceApiResponse());
    }

    public DeleteDataServiceApiResponse deleteDataServiceApi(DeleteDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiWithOptions(request, runtime);
    }

    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthorityWithOptions(DeleteDataServiceApiAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataServiceApiAuthority"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataServiceApiAuthorityResponse());
    }

    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiAuthorityWithOptions(request, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataSourceId", request.dataSourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    public DeleteDISyncTaskResponse deleteDISyncTaskWithOptions(DeleteDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDISyncTaskResponse());
    }

    public DeleteDISyncTaskResponse deleteDISyncTask(DeleteDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDISyncTaskWithOptions(request, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    public DeleteFromMetaCategoryResponse deleteFromMetaCategoryWithOptions(DeleteFromMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CategoryId", request.categoryId);
        query.put("TableGuid", request.tableGuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFromMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFromMetaCategoryResponse());
    }

    public DeleteFromMetaCategoryResponse deleteFromMetaCategory(DeleteFromMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFromMetaCategoryWithOptions(request, runtime);
    }

    public DeleteMetaCategoryResponse deleteMetaCategoryWithOptions(DeleteMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetaCategoryResponse());
    }

    public DeleteMetaCategoryResponse deleteMetaCategory(DeleteMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCategoryWithOptions(request, runtime);
    }

    public DeleteProjectMemberResponse deleteProjectMemberWithOptions(DeleteProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectMember"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectMemberResponse());
    }

    public DeleteProjectMemberResponse deleteProjectMember(DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMemberWithOptions(request, runtime);
    }

    public DeleteQualityEntityResponse deleteQualityEntityWithOptions(DeleteQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityEntityResponse());
    }

    public DeleteQualityEntityResponse deleteQualityEntity(DeleteQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityEntityWithOptions(request, runtime);
    }

    public DeleteQualityFollowerResponse deleteQualityFollowerWithOptions(DeleteQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityFollowerResponse());
    }

    public DeleteQualityFollowerResponse deleteQualityFollower(DeleteQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityFollowerWithOptions(request, runtime);
    }

    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNodeWithOptions(DeleteQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityRelativeNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityRelativeNodeResponse());
    }

    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRelativeNodeWithOptions(request, runtime);
    }

    public DeleteQualityRuleResponse deleteQualityRuleWithOptions(DeleteQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityRuleResponse());
    }

    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRuleWithOptions(request, runtime);
    }

    public DeleteRemindResponse deleteRemindWithOptions(DeleteRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRemindResponse());
    }

    public DeleteRemindResponse deleteRemind(DeleteRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRemindWithOptions(request, runtime);
    }

    public DeleteTableResponse deleteTableWithOptions(DeleteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TableName", request.tableName);
        query.put("EnvType", request.envType);
        query.put("AppGuid", request.appGuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableResponse());
    }

    public DeleteTableResponse deleteTable(DeleteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableWithOptions(request, runtime);
    }

    public DeleteTableLevelResponse deleteTableLevelWithOptions(DeleteTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LevelId", request.levelId);
        query.put("ProjectId", request.projectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableLevelResponse());
    }

    public DeleteTableLevelResponse deleteTableLevel(DeleteTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableLevelWithOptions(request, runtime);
    }

    public DeleteTableThemeResponse deleteTableThemeWithOptions(DeleteTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ThemeId", request.themeId);
        query.put("ProjectId", request.projectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableThemeResponse());
    }

    public DeleteTableThemeResponse deleteTableTheme(DeleteTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableThemeWithOptions(request, runtime);
    }

    public DeleteViewResponse deleteViewWithOptions(DeleteViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ViewName", request.viewName);
        query.put("AppGuid", request.appGuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteView"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteViewResponse());
    }

    public DeleteViewResponse deleteView(DeleteViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteViewWithOptions(request, runtime);
    }

    public DeployDISyncTaskResponse deployDISyncTaskWithOptions(DeployDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployDISyncTaskResponse());
    }

    public DeployDISyncTaskResponse deployDISyncTask(DeployDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployDISyncTaskWithOptions(request, runtime);
    }

    public DeployFileResponse deployFileWithOptions(DeployFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployFileResponse());
    }

    public DeployFileResponse deployFile(DeployFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployFileWithOptions(request, runtime);
    }

    public DesensitizeDataResponse desensitizeDataWithOptions(DesensitizeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DesensitizeData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DesensitizeDataResponse());
    }

    public DesensitizeDataResponse desensitizeData(DesensitizeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.desensitizeDataWithOptions(request, runtime);
    }

    public EstablishRelationTableToBusinessResponse establishRelationTableToBusinessWithOptions(EstablishRelationTableToBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EstablishRelationTableToBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstablishRelationTableToBusinessResponse());
    }

    public EstablishRelationTableToBusinessResponse establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.establishRelationTableToBusinessWithOptions(request, runtime);
    }

    public ExportConnectionsResponse exportConnectionsWithOptions(ExportConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportConnections"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportConnectionsResponse());
    }

    public ExportConnectionsResponse exportConnections(ExportConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportConnectionsWithOptions(request, runtime);
    }

    public ExportDataSourcesResponse exportDataSourcesWithOptions(ExportDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDataSources"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDataSourcesResponse());
    }

    public ExportDataSourcesResponse exportDataSources(ExportDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDataSourcesWithOptions(request, runtime);
    }

    public ExportDISyncTasksResponse exportDISyncTasksWithOptions(ExportDISyncTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("TaskParam", request.taskParam);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDISyncTasks"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDISyncTasksResponse());
    }

    public ExportDISyncTasksResponse exportDISyncTasks(ExportDISyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDISyncTasksWithOptions(request, runtime);
    }

    public GenerateDISyncTaskConfigForCreatingResponse generateDISyncTaskConfigForCreatingWithOptions(GenerateDISyncTaskConfigForCreatingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("TaskParam", request.taskParam);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDISyncTaskConfigForCreating"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDISyncTaskConfigForCreatingResponse());
    }

    public GenerateDISyncTaskConfigForCreatingResponse generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDISyncTaskConfigForCreatingWithOptions(request, runtime);
    }

    public GenerateDISyncTaskConfigForUpdatingResponse generateDISyncTaskConfigForUpdatingWithOptions(GenerateDISyncTaskConfigForUpdatingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("TaskParam", request.taskParam);
        query.put("ClientToken", request.clientToken);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDISyncTaskConfigForUpdating"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDISyncTaskConfigForUpdatingResponse());
    }

    public GenerateDISyncTaskConfigForUpdatingResponse generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDISyncTaskConfigForUpdatingWithOptions(request, runtime);
    }

    public GetBaselineConfigResponse getBaselineConfigWithOptions(GetBaselineConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineConfig"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineConfigResponse());
    }

    public GetBaselineConfigResponse getBaselineConfig(GetBaselineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineConfigWithOptions(request, runtime);
    }

    public GetBaselineKeyPathResponse getBaselineKeyPathWithOptions(GetBaselineKeyPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineKeyPath"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineKeyPathResponse());
    }

    public GetBaselineKeyPathResponse getBaselineKeyPath(GetBaselineKeyPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineKeyPathWithOptions(request, runtime);
    }

    public GetBaselineStatusResponse getBaselineStatusWithOptions(GetBaselineStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineStatus"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineStatusResponse());
    }

    public GetBaselineStatusResponse getBaselineStatus(GetBaselineStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineStatusWithOptions(request, runtime);
    }

    public GetBusinessResponse getBusinessWithOptions(GetBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBusinessResponse());
    }

    public GetBusinessResponse getBusiness(GetBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusinessWithOptions(request, runtime);
    }

    public GetConnectionMetaResponse getConnectionMetaWithOptions(GetConnectionMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DatasourceName", request.datasourceName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("EnvType", request.envType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionMeta"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionMetaResponse());
    }

    public GetConnectionMetaResponse getConnectionMeta(GetConnectionMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionMetaWithOptions(request, runtime);
    }

    public GetDagResponse getDagWithOptions(GetDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDag"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDagResponse());
    }

    public GetDagResponse getDag(GetDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDagWithOptions(request, runtime);
    }

    public GetDataServiceApiResponse getDataServiceApiWithOptions(GetDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiResponse());
    }

    public GetDataServiceApiResponse getDataServiceApi(GetDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiWithOptions(request, runtime);
    }

    public GetDataServiceApplicationResponse getDataServiceApplicationWithOptions(GetDataServiceApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApplication"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApplicationResponse());
    }

    public GetDataServiceApplicationResponse getDataServiceApplication(GetDataServiceApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApplicationWithOptions(request, runtime);
    }

    public GetDataServiceFolderResponse getDataServiceFolderWithOptions(GetDataServiceFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceFolderResponse());
    }

    public GetDataServiceFolderResponse getDataServiceFolder(GetDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceFolderWithOptions(request, runtime);
    }

    public GetDataServiceGroupResponse getDataServiceGroupWithOptions(GetDataServiceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceGroup"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceGroupResponse());
    }

    public GetDataServiceGroupResponse getDataServiceGroup(GetDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceGroupWithOptions(request, runtime);
    }

    public GetDataServicePublishedApiResponse getDataServicePublishedApiWithOptions(GetDataServicePublishedApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServicePublishedApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServicePublishedApiResponse());
    }

    public GetDataServicePublishedApiResponse getDataServicePublishedApi(GetDataServicePublishedApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServicePublishedApiWithOptions(request, runtime);
    }

    public GetDataSourceMetaResponse getDataSourceMetaWithOptions(GetDataSourceMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DatasourceName", request.datasourceName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("EnvType", request.envType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSourceMeta"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceMetaResponse());
    }

    public GetDataSourceMetaResponse getDataSourceMeta(GetDataSourceMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceMetaWithOptions(request, runtime);
    }

    public GetDDLJobStatusResponse getDDLJobStatusWithOptions(GetDDLJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDDLJobStatus"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDDLJobStatusResponse());
    }

    public GetDDLJobStatusResponse getDDLJobStatus(GetDDLJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDDLJobStatusWithOptions(request, runtime);
    }

    public GetDeploymentResponse getDeploymentWithOptions(GetDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployment"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
    }

    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentWithOptions(request, runtime);
    }

    public GetDISyncInstanceInfoResponse getDISyncInstanceInfoWithOptions(GetDISyncInstanceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDISyncInstanceInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDISyncInstanceInfoResponse());
    }

    public GetDISyncInstanceInfoResponse getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDISyncInstanceInfoWithOptions(request, runtime);
    }

    public GetDISyncTaskResponse getDISyncTaskWithOptions(GetDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDISyncTaskResponse());
    }

    public GetDISyncTaskResponse getDISyncTask(GetDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDISyncTaskWithOptions(request, runtime);
    }

    public GetFileResponse getFileWithOptions(GetFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileResponse());
    }

    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileWithOptions(request, runtime);
    }

    public GetFileTypeStatisticResponse getFileTypeStatisticWithOptions(GetFileTypeStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileTypeStatistic"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileTypeStatisticResponse());
    }

    public GetFileTypeStatisticResponse getFileTypeStatistic(GetFileTypeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileTypeStatisticWithOptions(request, runtime);
    }

    public GetFileVersionResponse getFileVersionWithOptions(GetFileVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileVersion"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileVersionResponse());
    }

    public GetFileVersionResponse getFileVersion(GetFileVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileVersionWithOptions(request, runtime);
    }

    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFolderResponse());
    }

    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRankWithOptions(GetInstanceConsumeTimeRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceConsumeTimeRank"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceConsumeTimeRankResponse());
    }

    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceConsumeTimeRankWithOptions(request, runtime);
    }

    public GetInstanceCountTrendResponse getInstanceCountTrendWithOptions(GetInstanceCountTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceCountTrend"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceCountTrendResponse());
    }

    public GetInstanceCountTrendResponse getInstanceCountTrend(GetInstanceCountTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceCountTrendWithOptions(request, runtime);
    }

    public GetInstanceErrorRankResponse getInstanceErrorRankWithOptions(GetInstanceErrorRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceErrorRank"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceErrorRankResponse());
    }

    public GetInstanceErrorRankResponse getInstanceErrorRank(GetInstanceErrorRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceErrorRankWithOptions(request, runtime);
    }

    public GetInstanceLogResponse getInstanceLogWithOptions(GetInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceLog"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceLogResponse());
    }

    public GetInstanceLogResponse getInstanceLog(GetInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLogWithOptions(request, runtime);
    }

    public GetInstanceStatusCountResponse getInstanceStatusCountWithOptions(GetInstanceStatusCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceStatusCount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceStatusCountResponse());
    }

    public GetInstanceStatusCountResponse getInstanceStatusCount(GetInstanceStatusCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusCountWithOptions(request, runtime);
    }

    public GetInstanceStatusStatisticResponse getInstanceStatusStatisticWithOptions(GetInstanceStatusStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceStatusStatistic"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceStatusStatisticResponse());
    }

    public GetInstanceStatusStatisticResponse getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusStatisticWithOptions(request, runtime);
    }

    public GetManualDagInstancesResponse getManualDagInstancesWithOptions(GetManualDagInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManualDagInstances"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManualDagInstancesResponse());
    }

    public GetManualDagInstancesResponse getManualDagInstances(GetManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManualDagInstancesWithOptions(request, runtime);
    }

    public GetMetaCategoryResponse getMetaCategoryWithOptions(GetMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ParentCategoryId", request.parentCategoryId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaCategoryResponse());
    }

    public GetMetaCategoryResponse getMetaCategory(GetMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCategoryWithOptions(request, runtime);
    }

    public GetMetaColumnLineageResponse getMetaColumnLineageWithOptions(GetMetaColumnLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ColumnGuid", request.columnGuid);
        query.put("Direction", request.direction);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ClusterId", request.clusterId);
        query.put("DatabaseName", request.databaseName);
        query.put("TableName", request.tableName);
        query.put("ColumnName", request.columnName);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaColumnLineage"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaColumnLineageResponse());
    }

    public GetMetaColumnLineageResponse getMetaColumnLineage(GetMetaColumnLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaColumnLineageWithOptions(request, runtime);
    }

    public GetMetaDBInfoResponse getMetaDBInfoWithOptions(GetMetaDBInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaDBInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaDBInfoResponse());
    }

    public GetMetaDBInfoResponse getMetaDBInfo(GetMetaDBInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBInfoWithOptions(request, runtime);
    }

    public GetMetaDBTableListResponse getMetaDBTableListWithOptions(GetMetaDBTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AppGuid", request.appGuid);
        query.put("ClusterId", request.clusterId);
        query.put("DatabaseName", request.databaseName);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaDBTableList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaDBTableListResponse());
    }

    public GetMetaDBTableListResponse getMetaDBTableList(GetMetaDBTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBTableListWithOptions(request, runtime);
    }

    public GetMetaTableBasicInfoResponse getMetaTableBasicInfoWithOptions(GetMetaTableBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableBasicInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableBasicInfoResponse());
    }

    public GetMetaTableBasicInfoResponse getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableBasicInfoWithOptions(request, runtime);
    }

    public GetMetaTableChangeLogResponse getMetaTableChangeLogWithOptions(GetMetaTableChangeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableChangeLog"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableChangeLogResponse());
    }

    public GetMetaTableChangeLogResponse getMetaTableChangeLog(GetMetaTableChangeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableChangeLogWithOptions(request, runtime);
    }

    public GetMetaTableColumnResponse getMetaTableColumnWithOptions(GetMetaTableColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableColumn"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableColumnResponse());
    }

    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    public GetMetaTableFullInfoResponse getMetaTableFullInfoWithOptions(GetMetaTableFullInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableFullInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableFullInfoResponse());
    }

    public GetMetaTableFullInfoResponse getMetaTableFullInfo(GetMetaTableFullInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableFullInfoWithOptions(request, runtime);
    }

    public GetMetaTableIntroWikiResponse getMetaTableIntroWikiWithOptions(GetMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        query.put("WikiVersion", request.wikiVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableIntroWiki"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableIntroWikiResponse());
    }

    public GetMetaTableIntroWikiResponse getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableIntroWikiWithOptions(request, runtime);
    }

    public GetMetaTableLineageResponse getMetaTableLineageWithOptions(GetMetaTableLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        query.put("Direction", request.direction);
        query.put("NextPrimaryKey", request.nextPrimaryKey);
        query.put("PageSize", request.pageSize);
        query.put("ClusterId", request.clusterId);
        query.put("DatabaseName", request.databaseName);
        query.put("TableName", request.tableName);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableLineage"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableLineageResponse());
    }

    public GetMetaTableLineageResponse getMetaTableLineage(GetMetaTableLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableLineageWithOptions(request, runtime);
    }

    public GetMetaTableListByCategoryResponse getMetaTableListByCategoryWithOptions(GetMetaTableListByCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableListByCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableListByCategoryResponse());
    }

    public GetMetaTableListByCategoryResponse getMetaTableListByCategory(GetMetaTableListByCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableListByCategoryWithOptions(request, runtime);
    }

    public GetMetaTableOutputResponse getMetaTableOutputWithOptions(GetMetaTableOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("TableGuid", request.tableGuid);
        query.put("StartDate", request.startDate);
        query.put("EndDate", request.endDate);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableOutputResponse());
    }

    public GetMetaTableOutputResponse getMetaTableOutput(GetMetaTableOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableOutputWithOptions(request, runtime);
    }

    public GetMetaTablePartitionResponse getMetaTablePartitionWithOptions(GetMetaTablePartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("TableGuid", request.tableGuid);
        query.put("ClusterId", request.clusterId);
        query.put("DatabaseName", request.databaseName);
        query.put("TableName", request.tableName);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTablePartition"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTablePartitionResponse());
    }

    public GetMetaTablePartitionResponse getMetaTablePartition(GetMetaTablePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTablePartitionWithOptions(request, runtime);
    }

    public GetMetaTableThemeLevelResponse getMetaTableThemeLevelWithOptions(GetMetaTableThemeLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableThemeLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableThemeLevelResponse());
    }

    public GetMetaTableThemeLevelResponse getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableThemeLevelWithOptions(request, runtime);
    }

    public GetMigrationProcessResponse getMigrationProcessWithOptions(GetMigrationProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMigrationProcess"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMigrationProcessResponse());
    }

    public GetMigrationProcessResponse getMigrationProcess(GetMigrationProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationProcessWithOptions(request, runtime);
    }

    public GetNodeResponse getNodeWithOptions(GetNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeResponse());
    }

    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeWithOptions(request, runtime);
    }

    public GetNodeChildrenResponse getNodeChildrenWithOptions(GetNodeChildrenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeChildren"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeChildrenResponse());
    }

    public GetNodeChildrenResponse getNodeChildren(GetNodeChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeChildrenWithOptions(request, runtime);
    }

    public GetNodeCodeResponse getNodeCodeWithOptions(GetNodeCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeCode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeCodeResponse());
    }

    public GetNodeCodeResponse getNodeCode(GetNodeCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeCodeWithOptions(request, runtime);
    }

    public GetNodeOnBaselineResponse getNodeOnBaselineWithOptions(GetNodeOnBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeOnBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeOnBaselineResponse());
    }

    public GetNodeOnBaselineResponse getNodeOnBaseline(GetNodeOnBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeOnBaselineWithOptions(request, runtime);
    }

    public GetNodeParentsResponse getNodeParentsWithOptions(GetNodeParentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeParents"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeParentsResponse());
    }

    public GetNodeParentsResponse getNodeParents(GetNodeParentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeParentsWithOptions(request, runtime);
    }

    public GetNodeTypeListInfoResponse getNodeTypeListInfoWithOptions(GetNodeTypeListInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeTypeListInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeTypeListInfoResponse());
    }

    public GetNodeTypeListInfoResponse getNodeTypeListInfo(GetNodeTypeListInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeTypeListInfoWithOptions(request, runtime);
    }

    public GetOpRiskDataResponse getOpRiskDataWithOptions(GetOpRiskDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpRiskData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpRiskDataResponse());
    }

    public GetOpRiskDataResponse getOpRiskData(GetOpRiskDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpRiskDataWithOptions(request, runtime);
    }

    public GetOpSensitiveDataResponse getOpSensitiveDataWithOptions(GetOpSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpSensitiveData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpSensitiveDataResponse());
    }

    public GetOpSensitiveDataResponse getOpSensitiveData(GetOpSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpSensitiveDataWithOptions(request, runtime);
    }

    public GetPermissionApplyOrderDetailResponse getPermissionApplyOrderDetailWithOptions(GetPermissionApplyOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowId", request.flowId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermissionApplyOrderDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermissionApplyOrderDetailResponse());
    }

    public GetPermissionApplyOrderDetailResponse getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionApplyOrderDetailWithOptions(request, runtime);
    }

    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    public GetProjectDetailResponse getProjectDetailWithOptions(GetProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectDetailResponse());
    }

    public GetProjectDetailResponse getProjectDetail(GetProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectDetailWithOptions(request, runtime);
    }

    public GetQualityEntityResponse getQualityEntityWithOptions(GetQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityEntityResponse());
    }

    public GetQualityEntityResponse getQualityEntity(GetQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityEntityWithOptions(request, runtime);
    }

    public GetQualityFollowerResponse getQualityFollowerWithOptions(GetQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityFollowerResponse());
    }

    public GetQualityFollowerResponse getQualityFollower(GetQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityFollowerWithOptions(request, runtime);
    }

    public GetQualityRuleResponse getQualityRuleWithOptions(GetQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleResponse());
    }

    public GetQualityRuleResponse getQualityRule(GetQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleWithOptions(request, runtime);
    }

    public GetRemindResponse getRemindWithOptions(GetRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRemindResponse());
    }

    public GetRemindResponse getRemind(GetRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemindWithOptions(request, runtime);
    }

    public GetSensitiveDataResponse getSensitiveDataWithOptions(GetSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSensitiveData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSensitiveDataResponse());
    }

    public GetSensitiveDataResponse getSensitiveData(GetSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSensitiveDataWithOptions(request, runtime);
    }

    public GetSuccessInstanceTrendResponse getSuccessInstanceTrendWithOptions(GetSuccessInstanceTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuccessInstanceTrend"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuccessInstanceTrendResponse());
    }

    public GetSuccessInstanceTrendResponse getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuccessInstanceTrendWithOptions(request, runtime);
    }

    public GetTopicResponse getTopicWithOptions(GetTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopic"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicResponse());
    }

    public GetTopicResponse getTopic(GetTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicWithOptions(request, runtime);
    }

    public GetTopicInfluenceResponse getTopicInfluenceWithOptions(GetTopicInfluenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicInfluence"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicInfluenceResponse());
    }

    public GetTopicInfluenceResponse getTopicInfluence(GetTopicInfluenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicInfluenceWithOptions(request, runtime);
    }

    public ImportConnectionsResponse importConnectionsWithOptions(ImportConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("Connections", request.connections);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportConnections"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportConnectionsResponse());
    }

    public ImportConnectionsResponse importConnections(ImportConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importConnectionsWithOptions(request, runtime);
    }

    public ImportDataSourcesResponse importDataSourcesWithOptions(ImportDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DataSources", request.dataSources);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDataSources"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDataSourcesResponse());
    }

    public ImportDataSourcesResponse importDataSources(ImportDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDataSourcesWithOptions(request, runtime);
    }

    public ImportDISyncTasksResponse importDISyncTasksWithOptions(ImportDISyncTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("TaskContent", request.taskContent);
        query.put("TaskParam", request.taskParam);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDISyncTasks"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDISyncTasksResponse());
    }

    public ImportDISyncTasksResponse importDISyncTasks(ImportDISyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDISyncTasksWithOptions(request, runtime);
    }

    public ListAlertMessagesResponse listAlertMessagesWithOptions(ListAlertMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertMessages"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertMessagesResponse());
    }

    public ListAlertMessagesResponse listAlertMessages(ListAlertMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertMessagesWithOptions(request, runtime);
    }

    public ListBaselineConfigsResponse listBaselineConfigsWithOptions(ListBaselineConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaselineConfigs"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaselineConfigsResponse());
    }

    public ListBaselineConfigsResponse listBaselineConfigs(ListBaselineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineConfigsWithOptions(request, runtime);
    }

    public ListBaselineStatusesResponse listBaselineStatusesWithOptions(ListBaselineStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaselineStatuses"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaselineStatusesResponse());
    }

    public ListBaselineStatusesResponse listBaselineStatuses(ListBaselineStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineStatusesWithOptions(request, runtime);
    }

    public ListBusinessResponse listBusinessWithOptions(ListBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusinessResponse());
    }

    public ListBusinessResponse listBusiness(ListBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusinessWithOptions(request, runtime);
    }

    public ListCalcEnginesResponse listCalcEnginesWithOptions(ListCalcEnginesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("Name", request.name);
        query.put("CalcEngineType", request.calcEngineType);
        query.put("EnvType", request.envType);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCalcEngines"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCalcEnginesResponse());
    }

    public ListCalcEnginesResponse listCalcEngines(ListCalcEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalcEnginesWithOptions(request, runtime);
    }

    public ListConnectionsResponse listConnectionsWithOptions(ListConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnections"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionsResponse());
    }

    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectionsWithOptions(request, runtime);
    }

    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthoritiesWithOptions(ListDataServiceApiAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApiAuthorities"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApiAuthoritiesResponse());
    }

    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiAuthoritiesWithOptions(request, runtime);
    }

    public ListDataServiceApisResponse listDataServiceApisWithOptions(ListDataServiceApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApis"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApisResponse());
    }

    public ListDataServiceApisResponse listDataServiceApis(ListDataServiceApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApisWithOptions(request, runtime);
    }

    public ListDataServiceApplicationsResponse listDataServiceApplicationsWithOptions(ListDataServiceApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApplications"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApplicationsResponse());
    }

    public ListDataServiceApplicationsResponse listDataServiceApplications(ListDataServiceApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApplicationsWithOptions(request, runtime);
    }

    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApisWithOptions(ListDataServiceAuthorizedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceAuthorizedApis"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceAuthorizedApisResponse());
    }

    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceAuthorizedApisWithOptions(request, runtime);
    }

    public ListDataServiceFoldersResponse listDataServiceFoldersWithOptions(ListDataServiceFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceFolders"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceFoldersResponse());
    }

    public ListDataServiceFoldersResponse listDataServiceFolders(ListDataServiceFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceFoldersWithOptions(request, runtime);
    }

    public ListDataServiceGroupsResponse listDataServiceGroupsWithOptions(ListDataServiceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceGroups"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceGroupsResponse());
    }

    public ListDataServiceGroupsResponse listDataServiceGroups(ListDataServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceGroupsWithOptions(request, runtime);
    }

    public ListDataServicePublishedApisResponse listDataServicePublishedApisWithOptions(ListDataServicePublishedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServicePublishedApis"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServicePublishedApisResponse());
    }

    public ListDataServicePublishedApisResponse listDataServicePublishedApis(ListDataServicePublishedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServicePublishedApisWithOptions(request, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    public ListDIProjectConfigResponse listDIProjectConfigWithOptions(ListDIProjectConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DestinationType", request.destinationType);
        query.put("SourceType", request.sourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIProjectConfig"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIProjectConfigResponse());
    }

    public ListDIProjectConfigResponse listDIProjectConfig(ListDIProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIProjectConfigWithOptions(request, runtime);
    }

    public ListDISyncTasksResponse listDISyncTasksWithOptions(ListDISyncTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDISyncTasks"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDISyncTasksResponse());
    }

    public ListDISyncTasksResponse listDISyncTasks(ListDISyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDISyncTasksWithOptions(request, runtime);
    }

    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFiles"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
    }

    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    public ListFileTypeResponse listFileTypeWithOptions(ListFileTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileType"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileTypeResponse());
    }

    public ListFileTypeResponse listFileType(ListFileTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileTypeWithOptions(request, runtime);
    }

    public ListFileVersionsResponse listFileVersionsWithOptions(ListFileVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileVersions"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileVersionsResponse());
    }

    public ListFileVersionsResponse listFileVersions(ListFileVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileVersionsWithOptions(request, runtime);
    }

    public ListFoldersResponse listFoldersWithOptions(ListFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFolders"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoldersResponse());
    }

    public ListFoldersResponse listFolders(ListFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersWithOptions(request, runtime);
    }

    public ListInstanceAmountResponse listInstanceAmountWithOptions(ListInstanceAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceAmount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceAmountResponse());
    }

    public ListInstanceAmountResponse listInstanceAmount(ListInstanceAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceAmountWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ListManualDagInstancesResponse listManualDagInstancesWithOptions(ListManualDagInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManualDagInstances"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManualDagInstancesResponse());
    }

    public ListManualDagInstancesResponse listManualDagInstances(ListManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManualDagInstancesWithOptions(request, runtime);
    }

    public ListMetaDBResponse listMetaDBWithOptions(ListMetaDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetaDB"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetaDBResponse());
    }

    public ListMetaDBResponse listMetaDB(ListMetaDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaDBWithOptions(request, runtime);
    }

    public ListNodeInputOrOutputResponse listNodeInputOrOutputWithOptions(ListNodeInputOrOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeInputOrOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeInputOrOutputResponse());
    }

    public ListNodeInputOrOutputResponse listNodeInputOrOutput(ListNodeInputOrOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeInputOrOutputWithOptions(request, runtime);
    }

    public ListNodeIOResponse listNodeIOWithOptions(ListNodeIORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeIO"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeIOResponse());
    }

    public ListNodeIOResponse listNodeIO(ListNodeIORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeIOWithOptions(request, runtime);
    }

    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    public ListNodesByBaselineResponse listNodesByBaselineWithOptions(ListNodesByBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodesByBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesByBaselineResponse());
    }

    public ListNodesByBaselineResponse listNodesByBaseline(ListNodesByBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByBaselineWithOptions(request, runtime);
    }

    public ListNodesByOutputResponse listNodesByOutputWithOptions(ListNodesByOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodesByOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesByOutputResponse());
    }

    public ListNodesByOutputResponse listNodesByOutput(ListNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByOutputWithOptions(request, runtime);
    }

    public ListPermissionApplyOrdersResponse listPermissionApplyOrdersWithOptions(ListPermissionApplyOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowStatus", request.flowStatus);
        query.put("WorkspaceId", request.workspaceId);
        query.put("OrderType", request.orderType);
        query.put("MaxComputeProjectName", request.maxComputeProjectName);
        query.put("TableName", request.tableName);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("EngineType", request.engineType);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("QueryType", request.queryType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionApplyOrders"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionApplyOrdersResponse());
    }

    public ListPermissionApplyOrdersResponse listPermissionApplyOrders(ListPermissionApplyOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionApplyOrdersWithOptions(request, runtime);
    }

    public ListProgramTypeCountResponse listProgramTypeCountWithOptions(ListProgramTypeCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProgramTypeCount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProgramTypeCountResponse());
    }

    public ListProgramTypeCountResponse listProgramTypeCount(ListProgramTypeCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProgramTypeCountWithOptions(request, runtime);
    }

    public ListProjectIdsResponse listProjectIdsWithOptions(ListProjectIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectIds"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectIdsResponse());
    }

    public ListProjectIdsResponse listProjectIds(ListProjectIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectIdsWithOptions(request, runtime);
    }

    public ListProjectMembersResponse listProjectMembersWithOptions(ListProjectMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
    }

    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    public ListProjectRolesResponse listProjectRolesWithOptions(ListProjectRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectRoles"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectRolesResponse());
    }

    public ListProjectRolesResponse listProjectRoles(ListProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectRolesWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ListQualityResultsByEntityResponse listQualityResultsByEntityWithOptions(ListQualityResultsByEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityResultsByEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityResultsByEntityResponse());
    }

    public ListQualityResultsByEntityResponse listQualityResultsByEntity(ListQualityResultsByEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByEntityWithOptions(request, runtime);
    }

    public ListQualityResultsByRuleResponse listQualityResultsByRuleWithOptions(ListQualityResultsByRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityResultsByRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityResultsByRuleResponse());
    }

    public ListQualityResultsByRuleResponse listQualityResultsByRule(ListQualityResultsByRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByRuleWithOptions(request, runtime);
    }

    public ListQualityRulesResponse listQualityRulesWithOptions(ListQualityRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityRules"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityRulesResponse());
    }

    public ListQualityRulesResponse listQualityRules(ListQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRulesWithOptions(request, runtime);
    }

    public ListRefDISyncTasksResponse listRefDISyncTasksWithOptions(ListRefDISyncTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DatasourceName", request.datasourceName);
        query.put("TaskType", request.taskType);
        query.put("RefType", request.refType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRefDISyncTasks"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRefDISyncTasksResponse());
    }

    public ListRefDISyncTasksResponse listRefDISyncTasks(ListRefDISyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRefDISyncTasksWithOptions(request, runtime);
    }

    public ListRemindsResponse listRemindsWithOptions(ListRemindsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReminds"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRemindsResponse());
    }

    public ListRemindsResponse listReminds(ListRemindsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemindsWithOptions(request, runtime);
    }

    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceGroupType", request.resourceGroupType);
        query.put("Keyword", request.keyword);
        query.put("BizExtKey", request.bizExtKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    public ListSuccessInstanceAmountResponse listSuccessInstanceAmountWithOptions(ListSuccessInstanceAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSuccessInstanceAmount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSuccessInstanceAmountResponse());
    }

    public ListSuccessInstanceAmountResponse listSuccessInstanceAmount(ListSuccessInstanceAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSuccessInstanceAmountWithOptions(request, runtime);
    }

    public ListTableLevelResponse listTableLevelWithOptions(ListTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableLevelResponse());
    }

    public ListTableLevelResponse listTableLevel(ListTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableLevelWithOptions(request, runtime);
    }

    public ListTableThemeResponse listTableThemeWithOptions(ListTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableThemeResponse());
    }

    public ListTableThemeResponse listTableTheme(ListTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableThemeWithOptions(request, runtime);
    }

    public ListTopicsResponse listTopicsWithOptions(ListTopicsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopics"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicsResponse());
    }

    public ListTopicsResponse listTopics(ListTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicsWithOptions(request, runtime);
    }

    public PublishDataServiceApiResponse publishDataServiceApiWithOptions(PublishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishDataServiceApiResponse());
    }

    public PublishDataServiceApiResponse publishDataServiceApi(PublishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDataServiceApiWithOptions(request, runtime);
    }

    public QueryDISyncTaskConfigProcessResultResponse queryDISyncTaskConfigProcessResultWithOptions(QueryDISyncTaskConfigProcessResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("AsyncProcessId", request.asyncProcessId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDISyncTaskConfigProcessResult"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDISyncTaskConfigProcessResultResponse());
    }

    public QueryDISyncTaskConfigProcessResultResponse queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDISyncTaskConfigProcessResultWithOptions(request, runtime);
    }

    public QueryPublicModelEngineResponse queryPublicModelEngineWithOptions(QueryPublicModelEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPublicModelEngine"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPublicModelEngineResponse());
    }

    public QueryPublicModelEngineResponse queryPublicModelEngine(QueryPublicModelEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPublicModelEngineWithOptions(request, runtime);
    }

    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRoleWithOptions(RemoveProjectMemberFromRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("UserId", request.userId);
        query.put("RoleCode", request.roleCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveProjectMemberFromRole"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveProjectMemberFromRoleResponse());
    }

    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeProjectMemberFromRoleWithOptions(request, runtime);
    }

    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    public ResumeInstanceResponse resumeInstanceWithOptions(ResumeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceResponse());
    }

    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    public RevokeColumnPermissionResponse revokeColumnPermissionWithOptions(RevokeColumnPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorkspaceId", request.workspaceId);
        query.put("MaxComputeProjectName", request.maxComputeProjectName);
        query.put("TableName", request.tableName);
        query.put("Columns", request.columns);
        query.put("RevokeUserName", request.revokeUserName);
        query.put("RevokeUserId", request.revokeUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeColumnPermission"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeColumnPermissionResponse());
    }

    public RevokeColumnPermissionResponse revokeColumnPermission(RevokeColumnPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeColumnPermissionWithOptions(request, runtime);
    }

    public RevokeTablePermissionResponse revokeTablePermissionWithOptions(RevokeTablePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorkspaceId", request.workspaceId);
        query.put("MaxComputeProjectName", request.maxComputeProjectName);
        query.put("TableName", request.tableName);
        query.put("Actions", request.actions);
        query.put("RevokeUserName", request.revokeUserName);
        query.put("RevokeUserId", request.revokeUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeTablePermission"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTablePermissionResponse());
    }

    public RevokeTablePermissionResponse revokeTablePermission(RevokeTablePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeTablePermissionWithOptions(request, runtime);
    }

    public RunCycleDagNodesResponse runCycleDagNodesWithOptions(RunCycleDagNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCycleDagNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCycleDagNodesResponse());
    }

    public RunCycleDagNodesResponse runCycleDagNodes(RunCycleDagNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCycleDagNodesWithOptions(request, runtime);
    }

    public RunManualDagNodesResponse runManualDagNodesWithOptions(RunManualDagNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunManualDagNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunManualDagNodesResponse());
    }

    public RunManualDagNodesResponse runManualDagNodes(RunManualDagNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runManualDagNodesWithOptions(request, runtime);
    }

    public RunSmokeTestResponse runSmokeTestWithOptions(RunSmokeTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSmokeTest"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSmokeTestResponse());
    }

    public RunSmokeTestResponse runSmokeTest(RunSmokeTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runSmokeTestWithOptions(request, runtime);
    }

    public RunTriggerNodeResponse runTriggerNodeWithOptions(RunTriggerNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunTriggerNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunTriggerNodeResponse());
    }

    public RunTriggerNodeResponse runTriggerNode(RunTriggerNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runTriggerNodeWithOptions(request, runtime);
    }

    public ScanSensitiveDataResponse scanSensitiveDataWithOptions(ScanSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanSensitiveData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanSensitiveDataResponse());
    }

    public ScanSensitiveDataResponse scanSensitiveData(ScanSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanSensitiveDataWithOptions(request, runtime);
    }

    public SearchMetaTablesResponse searchMetaTablesWithOptions(SearchMetaTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AppGuid", request.appGuid);
        query.put("Keyword", request.keyword);
        query.put("EntityType", request.entityType);
        query.put("ClusterId", request.clusterId);
        query.put("DataSourceType", request.dataSourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMetaTables"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMetaTablesResponse());
    }

    public SearchMetaTablesResponse searchMetaTables(SearchMetaTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMetaTablesWithOptions(request, runtime);
    }

    public SearchNodesByOutputResponse searchNodesByOutputWithOptions(SearchNodesByOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchNodesByOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchNodesByOutputResponse());
    }

    public SearchNodesByOutputResponse searchNodesByOutput(SearchNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchNodesByOutputWithOptions(request, runtime);
    }

    public SetConnectionShareResponse setConnectionShareWithOptions(SetConnectionShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DatasourceName", request.datasourceName);
        query.put("EnvType", request.envType);
        query.put("ProjectPermissions", request.projectPermissions);
        query.put("UserPermissions", request.userPermissions);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetConnectionShare"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetConnectionShareResponse());
    }

    public SetConnectionShareResponse setConnectionShare(SetConnectionShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setConnectionShareWithOptions(request, runtime);
    }

    public SetDataSourceShareResponse setDataSourceShareWithOptions(SetDataSourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DatasourceName", request.datasourceName);
        query.put("EnvType", request.envType);
        query.put("ProjectPermissions", request.projectPermissions);
        query.put("UserPermissions", request.userPermissions);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDataSourceShare"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataSourceShareResponse());
    }

    public SetDataSourceShareResponse setDataSourceShare(SetDataSourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataSourceShareWithOptions(request, runtime);
    }

    public SetSuccessInstanceResponse setSuccessInstanceWithOptions(SetSuccessInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSuccessInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSuccessInstanceResponse());
    }

    public SetSuccessInstanceResponse setSuccessInstance(SetSuccessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessInstanceWithOptions(request, runtime);
    }

    public StartDISyncInstanceResponse startDISyncInstanceWithOptions(StartDISyncInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        query.put("StartParam", request.startParam);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDISyncInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDISyncInstanceResponse());
    }

    public StartDISyncInstanceResponse startDISyncInstance(StartDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDISyncInstanceWithOptions(request, runtime);
    }

    public StartMigrationResponse startMigrationWithOptions(StartMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMigration"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMigrationResponse());
    }

    public StartMigrationResponse startMigration(StartMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMigrationWithOptions(request, runtime);
    }

    public StopDISyncInstanceResponse stopDISyncInstanceWithOptions(StopDISyncInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDISyncInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDISyncInstanceResponse());
    }

    public StopDISyncInstanceResponse stopDISyncInstance(StopDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDISyncInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public SubmitFileResponse submitFileWithOptions(SubmitFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFileResponse());
    }

    public SubmitFileResponse submitFile(SubmitFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFileWithOptions(request, runtime);
    }

    public SuspendInstanceResponse suspendInstanceWithOptions(SuspendInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendInstanceResponse());
    }

    public SuspendInstanceResponse suspendInstance(SuspendInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendInstanceWithOptions(request, runtime);
    }

    public TerminateDISyncInstanceResponse terminateDISyncInstanceWithOptions(TerminateDISyncInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateDISyncInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateDISyncInstanceResponse());
    }

    public TerminateDISyncInstanceResponse terminateDISyncInstance(TerminateDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateDISyncInstanceWithOptions(request, runtime);
    }

    public TestNetworkConnectionResponse testNetworkConnectionWithOptions(TestNetworkConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DatasourceName", request.datasourceName);
        query.put("EnvType", request.envType);
        query.put("ResourceGroup", request.resourceGroup);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestNetworkConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestNetworkConnectionResponse());
    }

    public TestNetworkConnectionResponse testNetworkConnection(TestNetworkConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testNetworkConnectionWithOptions(request, runtime);
    }

    public TopTenElapsedTimeInstanceResponse topTenElapsedTimeInstanceWithOptions(TopTenElapsedTimeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TopTenElapsedTimeInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TopTenElapsedTimeInstanceResponse());
    }

    public TopTenElapsedTimeInstanceResponse topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.topTenElapsedTimeInstanceWithOptions(request, runtime);
    }

    public TopTenErrorTimesInstanceResponse topTenErrorTimesInstanceWithOptions(TopTenErrorTimesInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TopTenErrorTimesInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TopTenErrorTimesInstanceResponse());
    }

    public TopTenErrorTimesInstanceResponse topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.topTenErrorTimesInstanceWithOptions(request, runtime);
    }

    public UpdateBusinessResponse updateBusinessWithOptions(UpdateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBusinessResponse());
    }

    public UpdateBusinessResponse updateBusiness(UpdateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBusinessWithOptions(request, runtime);
    }

    public UpdateConnectionResponse updateConnectionWithOptions(UpdateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("EnvType", request.envType);
        query.put("Content", request.content);
        query.put("Status", request.status);
        query.put("ConnectionId", request.connectionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectionResponse());
    }

    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }

    public UpdateDataServiceApiResponse updateDataServiceApiWithOptions(UpdateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataServiceApiResponse());
    }

    public UpdateDataServiceApiResponse updateDataServiceApi(UpdateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataServiceApiWithOptions(request, runtime);
    }

    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("EnvType", request.envType);
        query.put("Content", request.content);
        query.put("Status", request.status);
        query.put("DataSourceId", request.dataSourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    public UpdateDIProjectConfigResponse updateDIProjectConfigWithOptions(UpdateDIProjectConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("DestinationType", request.destinationType);
        query.put("SourceType", request.sourceType);
        query.put("ProjectConfig", request.projectConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIProjectConfig"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIProjectConfigResponse());
    }

    public UpdateDIProjectConfigResponse updateDIProjectConfig(UpdateDIProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIProjectConfigWithOptions(request, runtime);
    }

    public UpdateDISyncTaskResponse updateDISyncTaskWithOptions(UpdateDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TaskType", request.taskType);
        query.put("TaskContent", request.taskContent);
        query.put("TaskParam", request.taskParam);
        query.put("FileId", request.fileId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDISyncTaskResponse());
    }

    public UpdateDISyncTaskResponse updateDISyncTask(UpdateDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDISyncTaskWithOptions(request, runtime);
    }

    public UpdateFileResponse updateFileWithOptions(UpdateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileResponse());
    }

    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileWithOptions(request, runtime);
    }

    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFolderResponse());
    }

    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    public UpdateMetaCategoryResponse updateMetaCategoryWithOptions(UpdateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaCategoryResponse());
    }

    public UpdateMetaCategoryResponse updateMetaCategory(UpdateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCategoryWithOptions(request, runtime);
    }

    public UpdateMetaTableResponse updateMetaTableWithOptions(UpdateMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("TableName", request.tableName);
        query.put("EnvType", request.envType);
        query.put("TableGuid", request.tableGuid);
        query.put("NewOwnerId", request.newOwnerId);
        query.put("CategoryId", request.categoryId);
        query.put("Visibility", request.visibility);
        query.put("Caption", request.caption);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaTableResponse());
    }

    public UpdateMetaTableResponse updateMetaTable(UpdateMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableWithOptions(request, runtime);
    }

    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWikiWithOptions(UpdateMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaTableIntroWiki"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaTableIntroWikiResponse());
    }

    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableIntroWikiWithOptions(request, runtime);
    }

    public UpdateNodeOwnerResponse updateNodeOwnerWithOptions(UpdateNodeOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodeOwner"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeOwnerResponse());
    }

    public UpdateNodeOwnerResponse updateNodeOwner(UpdateNodeOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeOwnerWithOptions(request, runtime);
    }

    public UpdateNodeRunModeResponse updateNodeRunModeWithOptions(UpdateNodeRunModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodeRunMode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeRunModeResponse());
    }

    public UpdateNodeRunModeResponse updateNodeRunMode(UpdateNodeRunModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeRunModeWithOptions(request, runtime);
    }

    public UpdateQualityFollowerResponse updateQualityFollowerWithOptions(UpdateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityFollowerResponse());
    }

    public UpdateQualityFollowerResponse updateQualityFollower(UpdateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityFollowerWithOptions(request, runtime);
    }

    public UpdateQualityRuleResponse updateQualityRuleWithOptions(UpdateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityRuleResponse());
    }

    public UpdateQualityRuleResponse updateQualityRule(UpdateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityRuleWithOptions(request, runtime);
    }

    public UpdateRemindResponse updateRemindWithOptions(UpdateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRemindResponse());
    }

    public UpdateRemindResponse updateRemind(UpdateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemindWithOptions(request, runtime);
    }

    public UpdateTableResponse updateTableWithOptions(UpdateTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IsView", request.isView);
        query.put("Visibility", request.visibility);
        query.put("LifeCycle", request.lifeCycle);
        query.put("CategoryId", request.categoryId);
        query.put("LogicalLevelId", request.logicalLevelId);
        query.put("PhysicsLevelId", request.physicsLevelId);
        query.put("ExternalTableType", request.externalTableType);
        query.put("Location", request.location);
        query.put("ProjectId", request.projectId);
        query.put("TableName", request.tableName);
        query.put("AppGuid", request.appGuid);
        query.put("CreateIfNotExists", request.createIfNotExists);
        query.put("OwnerId", request.ownerId);
        query.put("HasPart", request.hasPart);
        query.put("Comment", request.comment);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableResponse());
    }

    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableWithOptions(request, runtime);
    }

    public UpdateTableAddColumnResponse updateTableAddColumnWithOptions(UpdateTableAddColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TableGuid", request.tableGuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableAddColumn"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableAddColumnResponse());
    }

    public UpdateTableAddColumnResponse updateTableAddColumn(UpdateTableAddColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableAddColumnWithOptions(request, runtime);
    }

    public UpdateTableLevelResponse updateTableLevelWithOptions(UpdateTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("LevelType", request.levelType);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("LevelId", request.levelId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableLevelResponse());
    }

    public UpdateTableLevelResponse updateTableLevel(UpdateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableLevelWithOptions(request, runtime);
    }

    public UpdateTableModelInfoResponse updateTableModelInfoWithOptions(UpdateTableModelInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FirstLevelThemeId", request.firstLevelThemeId);
        query.put("SecondLevelThemeId", request.secondLevelThemeId);
        query.put("LevelId", request.levelId);
        query.put("TableGuid", request.tableGuid);
        query.put("LevelType", request.levelType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableModelInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableModelInfoResponse());
    }

    public UpdateTableModelInfoResponse updateTableModelInfo(UpdateTableModelInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableModelInfoWithOptions(request, runtime);
    }

    public UpdateTableThemeResponse updateTableThemeWithOptions(UpdateTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("Name", request.name);
        query.put("ThemeId", request.themeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableThemeResponse());
    }

    public UpdateTableThemeResponse updateTableTheme(UpdateTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableThemeWithOptions(request, runtime);
    }

    public UpdateUdfFileResponse updateUdfFileWithOptions(UpdateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUdfFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUdfFileResponse());
    }

    public UpdateUdfFileResponse updateUdfFile(UpdateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUdfFileWithOptions(request, runtime);
    }
}
