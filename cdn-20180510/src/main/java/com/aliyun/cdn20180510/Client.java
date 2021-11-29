// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510;

import com.aliyun.tea.*;
import com.aliyun.cdn20180510.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "cdn.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddCdnDomainResponse addCdnDomainWithOptions(AddCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CdnType", request.cdnType);
        query.put("CheckUrl", request.checkUrl);
        query.put("DomainName", request.domainName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Scope", request.scope);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        query.put("TopLevelDomain", request.topLevelDomain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCdnDomainResponse());
    }

    public AddCdnDomainResponse addCdnDomain(AddCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCdnDomainWithOptions(request, runtime);
    }

    public AddFCTriggerResponse addFCTriggerWithOptions(AddFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TriggerARN", request.triggerARN);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFCTriggerResponse());
    }

    public AddFCTriggerResponse addFCTrigger(AddFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFCTriggerWithOptions(request, runtime);
    }

    public BatchAddCdnDomainResponse batchAddCdnDomainWithOptions(BatchAddCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CdnType", request.cdnType);
        query.put("CheckUrl", request.checkUrl);
        query.put("DomainName", request.domainName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Scope", request.scope);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        query.put("TopLevelDomain", request.topLevelDomain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddCdnDomainResponse());
    }

    public BatchAddCdnDomainResponse batchAddCdnDomain(BatchAddCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddCdnDomainWithOptions(request, runtime);
    }

    public BatchDeleteCdnDomainConfigResponse batchDeleteCdnDomainConfigWithOptions(BatchDeleteCdnDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("FunctionNames", request.functionNames);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteCdnDomainConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteCdnDomainConfigResponse());
    }

    public BatchDeleteCdnDomainConfigResponse batchDeleteCdnDomainConfig(BatchDeleteCdnDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteCdnDomainConfigWithOptions(request, runtime);
    }

    public BatchSetCdnDomainConfigResponse batchSetCdnDomainConfigWithOptions(BatchSetCdnDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("Functions", request.functions);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetCdnDomainConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetCdnDomainConfigResponse());
    }

    public BatchSetCdnDomainConfigResponse batchSetCdnDomainConfig(BatchSetCdnDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetCdnDomainConfigWithOptions(request, runtime);
    }

    public BatchSetCdnDomainServerCertificateResponse batchSetCdnDomainServerCertificateWithOptions(BatchSetCdnDomainServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertName", request.certName);
        query.put("CertType", request.certType);
        query.put("DomainName", request.domainName);
        query.put("ForceSet", request.forceSet);
        query.put("OwnerId", request.ownerId);
        query.put("Region", request.region);
        query.put("SSLPri", request.SSLPri);
        query.put("SSLProtocol", request.SSLProtocol);
        query.put("SSLPub", request.SSLPub);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetCdnDomainServerCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetCdnDomainServerCertificateResponse());
    }

    public BatchSetCdnDomainServerCertificateResponse batchSetCdnDomainServerCertificate(BatchSetCdnDomainServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetCdnDomainServerCertificateWithOptions(request, runtime);
    }

    public BatchStartCdnDomainResponse batchStartCdnDomainWithOptions(BatchStartCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartCdnDomainResponse());
    }

    public BatchStartCdnDomainResponse batchStartCdnDomain(BatchStartCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartCdnDomainWithOptions(request, runtime);
    }

    public BatchStopCdnDomainResponse batchStopCdnDomainWithOptions(BatchStopCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopCdnDomainResponse());
    }

    public BatchStopCdnDomainResponse batchStopCdnDomain(BatchStopCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopCdnDomainWithOptions(request, runtime);
    }

    public BatchUpdateCdnDomainResponse batchUpdateCdnDomainWithOptions(BatchUpdateCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        query.put("TopLevelDomain", request.topLevelDomain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateCdnDomainResponse());
    }

    public BatchUpdateCdnDomainResponse batchUpdateCdnDomain(BatchUpdateCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateCdnDomainWithOptions(request, runtime);
    }

    public CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequestWithOptions(CreateCdnCertificateSigningRequestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("City", request.city);
        query.put("CommonName", request.commonName);
        query.put("Country", request.country);
        query.put("Email", request.email);
        query.put("Organization", request.organization);
        query.put("OrganizationUnit", request.organizationUnit);
        query.put("OwnerId", request.ownerId);
        query.put("SANs", request.SANs);
        query.put("State", request.state);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdnCertificateSigningRequest"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdnCertificateSigningRequestResponse());
    }

    public CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequest(CreateCdnCertificateSigningRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCdnCertificateSigningRequestWithOptions(request, runtime);
    }

    public CreateCdnDeliverTaskResponse createCdnDeliverTaskWithOptions(CreateCdnDeliverTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdnDeliverTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdnDeliverTaskResponse());
    }

    public CreateCdnDeliverTaskResponse createCdnDeliverTask(CreateCdnDeliverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCdnDeliverTaskWithOptions(request, runtime);
    }

    public CreateCdnSubTaskResponse createCdnSubTaskWithOptions(CreateCdnSubTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdnSubTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdnSubTaskResponse());
    }

    public CreateCdnSubTaskResponse createCdnSubTask(CreateCdnSubTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCdnSubTaskWithOptions(request, runtime);
    }

    public CreateIllegalUrlExportTaskResponse createIllegalUrlExportTaskWithOptions(CreateIllegalUrlExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TaskName", request.taskName);
        query.put("TimePoint", request.timePoint);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIllegalUrlExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIllegalUrlExportTaskResponse());
    }

    public CreateIllegalUrlExportTaskResponse createIllegalUrlExportTask(CreateIllegalUrlExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIllegalUrlExportTaskWithOptions(request, runtime);
    }

    public CreateRealTimeLogDeliveryResponse createRealTimeLogDeliveryWithOptions(CreateRealTimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRealTimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRealTimeLogDeliveryResponse());
    }

    public CreateRealTimeLogDeliveryResponse createRealTimeLogDelivery(CreateRealTimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRealTimeLogDeliveryWithOptions(request, runtime);
    }

    public CreateUsageDetailDataExportTaskResponse createUsageDetailDataExportTaskWithOptions(CreateUsageDetailDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("EndTime", request.endTime);
        query.put("Group", request.group);
        query.put("Language", request.language);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("TaskName", request.taskName);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUsageDetailDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUsageDetailDataExportTaskResponse());
    }

    public CreateUsageDetailDataExportTaskResponse createUsageDetailDataExportTask(CreateUsageDetailDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    public CreateUserUsageDataExportTaskResponse createUserUsageDataExportTaskWithOptions(CreateUserUsageDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("Language", request.language);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("TaskName", request.taskName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserUsageDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserUsageDataExportTaskResponse());
    }

    public CreateUserUsageDataExportTaskResponse createUserUsageDataExportTask(CreateUserUsageDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserUsageDataExportTaskWithOptions(request, runtime);
    }

    public DeleteCdnDeliverTaskResponse deleteCdnDeliverTaskWithOptions(DeleteCdnDeliverTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeliverId", request.deliverId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdnDeliverTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdnDeliverTaskResponse());
    }

    public DeleteCdnDeliverTaskResponse deleteCdnDeliverTask(DeleteCdnDeliverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCdnDeliverTaskWithOptions(request, runtime);
    }

    public DeleteCdnDomainResponse deleteCdnDomainWithOptions(DeleteCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdnDomainResponse());
    }

    public DeleteCdnDomainResponse deleteCdnDomain(DeleteCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCdnDomainWithOptions(request, runtime);
    }

    public DeleteCdnSubTaskResponse deleteCdnSubTaskWithOptions(DeleteCdnSubTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdnSubTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdnSubTaskResponse());
    }

    public DeleteCdnSubTaskResponse deleteCdnSubTask(DeleteCdnSubTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCdnSubTaskWithOptions(request, runtime);
    }

    public DeleteFCTriggerResponse deleteFCTriggerWithOptions(DeleteFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TriggerARN", request.triggerARN);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFCTriggerResponse());
    }

    public DeleteFCTriggerResponse deleteFCTrigger(DeleteFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFCTriggerWithOptions(request, runtime);
    }

    public DeleteRealtimeLogDeliveryResponse deleteRealtimeLogDeliveryWithOptions(DeleteRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRealtimeLogDeliveryResponse());
    }

    public DeleteRealtimeLogDeliveryResponse deleteRealtimeLogDelivery(DeleteRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteSpecificConfigResponse deleteSpecificConfigWithOptions(DeleteSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpecificConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpecificConfigResponse());
    }

    public DeleteSpecificConfigResponse deleteSpecificConfig(DeleteSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpecificConfigWithOptions(request, runtime);
    }

    public DeleteSpecificStagingConfigResponse deleteSpecificStagingConfigWithOptions(DeleteSpecificStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpecificStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpecificStagingConfigResponse());
    }

    public DeleteSpecificStagingConfigResponse deleteSpecificStagingConfig(DeleteSpecificStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpecificStagingConfigWithOptions(request, runtime);
    }

    public DeleteUsageDetailDataExportTaskResponse deleteUsageDetailDataExportTaskWithOptions(DeleteUsageDetailDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUsageDetailDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUsageDetailDataExportTaskResponse());
    }

    public DeleteUsageDetailDataExportTaskResponse deleteUsageDetailDataExportTask(DeleteUsageDetailDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    public DeleteUserUsageDataExportTaskResponse deleteUserUsageDataExportTaskWithOptions(DeleteUserUsageDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserUsageDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserUsageDataExportTaskResponse());
    }

    public DeleteUserUsageDataExportTaskResponse deleteUserUsageDataExportTask(DeleteUserUsageDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserUsageDataExportTaskWithOptions(request, runtime);
    }

    public DescribeActiveVersionOfConfigGroupResponse describeActiveVersionOfConfigGroupWithOptions(DescribeActiveVersionOfConfigGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigGroupId", request.configGroupId);
        query.put("Env", request.env);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveVersionOfConfigGroup"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveVersionOfConfigGroupResponse());
    }

    public DescribeActiveVersionOfConfigGroupResponse describeActiveVersionOfConfigGroup(DescribeActiveVersionOfConfigGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveVersionOfConfigGroupWithOptions(request, runtime);
    }

    public DescribeBlockedRegionsResponse describeBlockedRegionsWithOptions(DescribeBlockedRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockedRegions"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockedRegionsResponse());
    }

    public DescribeBlockedRegionsResponse describeBlockedRegions(DescribeBlockedRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBlockedRegionsWithOptions(request, runtime);
    }

    public DescribeCdnCertificateDetailResponse describeCdnCertificateDetailWithOptions(DescribeCdnCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertName", request.certName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnCertificateDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnCertificateDetailResponse());
    }

    public DescribeCdnCertificateDetailResponse describeCdnCertificateDetail(DescribeCdnCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnCertificateDetailWithOptions(request, runtime);
    }

    public DescribeCdnCertificateListResponse describeCdnCertificateListWithOptions(DescribeCdnCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnCertificateList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnCertificateListResponse());
    }

    public DescribeCdnCertificateListResponse describeCdnCertificateList(DescribeCdnCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnCertificateListWithOptions(request, runtime);
    }

    public DescribeCdnDeletedDomainsResponse describeCdnDeletedDomainsWithOptions(DescribeCdnDeletedDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDeletedDomains"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDeletedDomainsResponse());
    }

    public DescribeCdnDeletedDomainsResponse describeCdnDeletedDomains(DescribeCdnDeletedDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDeletedDomainsWithOptions(request, runtime);
    }

    public DescribeCdnDeliverListResponse describeCdnDeliverListWithOptions(DescribeCdnDeliverListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeliverId", request.deliverId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDeliverList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDeliverListResponse());
    }

    public DescribeCdnDeliverListResponse describeCdnDeliverList(DescribeCdnDeliverListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDeliverListWithOptions(request, runtime);
    }

    public DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificateWithOptions(DescribeCdnDomainByCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SSLPub", request.SSLPub);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainByCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainByCertificateResponse());
    }

    public DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificate(DescribeCdnDomainByCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainByCertificateWithOptions(request, runtime);
    }

    public DescribeCdnDomainConfigsResponse describeCdnDomainConfigsWithOptions(DescribeCdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("FunctionNames", request.functionNames);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainConfigs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainConfigsResponse());
    }

    public DescribeCdnDomainConfigsResponse describeCdnDomainConfigs(DescribeCdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainConfigsWithOptions(request, runtime);
    }

    public DescribeCdnDomainDetailResponse describeCdnDomainDetailWithOptions(DescribeCdnDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainDetailResponse());
    }

    public DescribeCdnDomainDetailResponse describeCdnDomainDetail(DescribeCdnDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainDetailWithOptions(request, runtime);
    }

    public DescribeCdnDomainLogsResponse describeCdnDomainLogsWithOptions(DescribeCdnDomainLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainLogs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainLogsResponse());
    }

    public DescribeCdnDomainLogsResponse describeCdnDomainLogs(DescribeCdnDomainLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainLogsWithOptions(request, runtime);
    }

    public DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfigWithOptions(DescribeCdnDomainStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("FunctionNames", request.functionNames);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainStagingConfigResponse());
    }

    public DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfig(DescribeCdnDomainStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainStagingConfigWithOptions(request, runtime);
    }

    public DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainListWithOptions(DescribeCdnHttpsDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Keyword", request.keyword);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnHttpsDomainList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnHttpsDomainListResponse());
    }

    public DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainList(DescribeCdnHttpsDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnHttpsDomainListWithOptions(request, runtime);
    }

    public DescribeCdnRegionAndIspResponse describeCdnRegionAndIspWithOptions(DescribeCdnRegionAndIspRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnRegionAndIsp"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnRegionAndIspResponse());
    }

    public DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(DescribeCdnRegionAndIspRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnRegionAndIspWithOptions(request, runtime);
    }

    public DescribeCdnReportResponse describeCdnReportWithOptions(DescribeCdnReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Area", request.area);
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("HttpCode", request.httpCode);
        query.put("IsOverseas", request.isOverseas);
        query.put("OwnerId", request.ownerId);
        query.put("ReportId", request.reportId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnReport"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnReportResponse());
    }

    public DescribeCdnReportResponse describeCdnReport(DescribeCdnReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnReportWithOptions(request, runtime);
    }

    public DescribeCdnReportListResponse describeCdnReportListWithOptions(DescribeCdnReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ReportId", request.reportId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnReportList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnReportListResponse());
    }

    public DescribeCdnReportListResponse describeCdnReportList(DescribeCdnReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnReportListWithOptions(request, runtime);
    }

    public DescribeCdnSMCertificateDetailResponse describeCdnSMCertificateDetailWithOptions(DescribeCdnSMCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertIdentifier", request.certIdentifier);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSMCertificateDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSMCertificateDetailResponse());
    }

    public DescribeCdnSMCertificateDetailResponse describeCdnSMCertificateDetail(DescribeCdnSMCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnSMCertificateDetailWithOptions(request, runtime);
    }

    public DescribeCdnSMCertificateListResponse describeCdnSMCertificateListWithOptions(DescribeCdnSMCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSMCertificateList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSMCertificateListResponse());
    }

    public DescribeCdnSMCertificateListResponse describeCdnSMCertificateList(DescribeCdnSMCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnSMCertificateListWithOptions(request, runtime);
    }

    public DescribeCdnServiceResponse describeCdnServiceWithOptions(DescribeCdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnService"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnServiceResponse());
    }

    public DescribeCdnServiceResponse describeCdnService(DescribeCdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnServiceWithOptions(request, runtime);
    }

    public DescribeCdnSubListResponse describeCdnSubListWithOptions(DescribeCdnSubListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSubList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSubListResponse());
    }

    public DescribeCdnSubListResponse describeCdnSubList(DescribeCdnSubListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnSubListWithOptions(request, runtime);
    }

    public DescribeCdnUserBillHistoryResponse describeCdnUserBillHistoryWithOptions(DescribeCdnUserBillHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserBillHistory"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserBillHistoryResponse());
    }

    public DescribeCdnUserBillHistoryResponse describeCdnUserBillHistory(DescribeCdnUserBillHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserBillHistoryWithOptions(request, runtime);
    }

    public DescribeCdnUserBillPredictionResponse describeCdnUserBillPredictionWithOptions(DescribeCdnUserBillPredictionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Area", request.area);
        query.put("Dimension", request.dimension);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserBillPrediction"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserBillPredictionResponse());
    }

    public DescribeCdnUserBillPredictionResponse describeCdnUserBillPrediction(DescribeCdnUserBillPredictionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserBillPredictionWithOptions(request, runtime);
    }

    public DescribeCdnUserBillTypeResponse describeCdnUserBillTypeWithOptions(DescribeCdnUserBillTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserBillType"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserBillTypeResponse());
    }

    public DescribeCdnUserBillTypeResponse describeCdnUserBillType(DescribeCdnUserBillTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserBillTypeWithOptions(request, runtime);
    }

    public DescribeCdnUserConfigsResponse describeCdnUserConfigsWithOptions(DescribeCdnUserConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FunctionName", request.functionName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserConfigs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserConfigsResponse());
    }

    public DescribeCdnUserConfigsResponse describeCdnUserConfigs(DescribeCdnUserConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserConfigsWithOptions(request, runtime);
    }

    public DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFuncWithOptions(DescribeCdnUserDomainsByFuncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FuncId", request.funcId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserDomainsByFunc"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserDomainsByFuncResponse());
    }

    public DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFunc(DescribeCdnUserDomainsByFuncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserDomainsByFuncWithOptions(request, runtime);
    }

    public DescribeCdnUserQuotaResponse describeCdnUserQuotaWithOptions(DescribeCdnUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserQuota"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserQuotaResponse());
    }

    public DescribeCdnUserQuotaResponse describeCdnUserQuota(DescribeCdnUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserQuotaWithOptions(request, runtime);
    }

    public DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackageWithOptions(DescribeCdnUserResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserResourcePackage"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserResourcePackageResponse());
    }

    public DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackage(DescribeCdnUserResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserResourcePackageWithOptions(request, runtime);
    }

    public DescribeCdnWafDomainResponse describeCdnWafDomainWithOptions(DescribeCdnWafDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnWafDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnWafDomainResponse());
    }

    public DescribeCdnWafDomainResponse describeCdnWafDomain(DescribeCdnWafDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnWafDomainWithOptions(request, runtime);
    }

    public DescribeCertificateInfoByIDResponse describeCertificateInfoByIDWithOptions(DescribeCertificateInfoByIDRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificateInfoByID"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificateInfoByIDResponse());
    }

    public DescribeCertificateInfoByIDResponse describeCertificateInfoByID(DescribeCertificateInfoByIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificateInfoByIDWithOptions(request, runtime);
    }

    public DescribeConfigGroupDetailResponse describeConfigGroupDetailWithOptions(DescribeConfigGroupDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigGroupId", request.configGroupId);
        query.put("ConfigGroupName", request.configGroupName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigGroupDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigGroupDetailResponse());
    }

    public DescribeConfigGroupDetailResponse describeConfigGroupDetail(DescribeConfigGroupDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigGroupDetailWithOptions(request, runtime);
    }

    public DescribeConfigOfVersionResponse describeConfigOfVersionWithOptions(DescribeConfigOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FunctionId", request.functionId);
        query.put("FunctionName", request.functionName);
        query.put("GroupId", request.groupId);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("VersionId", request.versionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigOfVersion"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigOfVersionResponse());
    }

    public DescribeConfigOfVersionResponse describeConfigOfVersion(DescribeConfigOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigOfVersionWithOptions(request, runtime);
    }

    public DescribeCustomLogConfigResponse describeCustomLogConfigWithOptions(DescribeCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomLogConfigResponse());
    }

    public DescribeCustomLogConfigResponse describeCustomLogConfig(DescribeCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomLogConfigWithOptions(request, runtime);
    }

    public DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTimeWithOptions(DescribeDomainAverageResponseTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("DomainType", request.domainType);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("TimeMerge", request.timeMerge);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainAverageResponseTime"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainAverageResponseTimeResponse());
    }

    public DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTime(DescribeDomainAverageResponseTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAverageResponseTimeWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataResponse describeDomainBpsDataWithOptions(DescribeDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsDataResponse());
    }

    public DescribeDomainBpsDataResponse describeDomainBpsData(DescribeDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayerWithOptions(DescribeDomainBpsDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("Layer", request.layer);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBpsDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsDataByLayerResponse());
    }

    public DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayer(DescribeDomainBpsDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBpsDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStampWithOptions(DescribeDomainBpsDataByTimeStampRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("IspNames", request.ispNames);
        query.put("LocationNames", request.locationNames);
        query.put("OwnerId", request.ownerId);
        query.put("TimePoint", request.timePoint);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBpsDataByTimeStamp"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsDataByTimeStampResponse());
    }

    public DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStamp(DescribeDomainBpsDataByTimeStampRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBpsDataByTimeStampWithOptions(request, runtime);
    }

    public DescribeDomainCcActivityLogResponse describeDomainCcActivityLogWithOptions(DescribeDomainCcActivityLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RuleName", request.ruleName);
        query.put("StartTime", request.startTime);
        query.put("TriggerObject", request.triggerObject);
        query.put("Value", request.value);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCcActivityLog"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCcActivityLogResponse());
    }

    public DescribeDomainCcActivityLogResponse describeDomainCcActivityLog(DescribeDomainCcActivityLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCcActivityLogWithOptions(request, runtime);
    }

    public DescribeDomainCertificateInfoResponse describeDomainCertificateInfoWithOptions(DescribeDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCertificateInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCertificateInfoResponse());
    }

    public DescribeDomainCertificateInfoResponse describeDomainCertificateInfo(DescribeDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfigWithOptions(DescribeDomainCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCustomLogConfigResponse());
    }

    public DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfig(DescribeDomainCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCustomLogConfigWithOptions(request, runtime);
    }

    public DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayerWithOptions(DescribeDomainDetailDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainDetailDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainDetailDataByLayerResponse());
    }

    public DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayer(DescribeDomainDetailDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainDetailDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainFileSizeProportionDataResponse describeDomainFileSizeProportionDataWithOptions(DescribeDomainFileSizeProportionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainFileSizeProportionData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainFileSizeProportionDataResponse());
    }

    public DescribeDomainFileSizeProportionDataResponse describeDomainFileSizeProportionData(DescribeDomainFileSizeProportionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainFileSizeProportionDataWithOptions(request, runtime);
    }

    public DescribeDomainHitRateDataResponse describeDomainHitRateDataWithOptions(DescribeDomainHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainHitRateDataResponse());
    }

    public DescribeDomainHitRateDataResponse describeDomainHitRateData(DescribeDomainHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainHttpCodeDataResponse describeDomainHttpCodeDataWithOptions(DescribeDomainHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainHttpCodeDataResponse());
    }

    public DescribeDomainHttpCodeDataResponse describeDomainHttpCodeData(DescribeDomainHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayerWithOptions(DescribeDomainHttpCodeDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("Layer", request.layer);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainHttpCodeDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainHttpCodeDataByLayerResponse());
    }

    public DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayer(DescribeDomainHttpCodeDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainHttpCodeDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainISPDataResponse describeDomainISPDataWithOptions(DescribeDomainISPDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainISPData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainISPDataResponse());
    }

    public DescribeDomainISPDataResponse describeDomainISPData(DescribeDomainISPDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainISPDataWithOptions(request, runtime);
    }

    public DescribeDomainMax95BpsDataResponse describeDomainMax95BpsDataWithOptions(DescribeDomainMax95BpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Cycle", request.cycle);
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("TimePoint", request.timePoint);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainMax95BpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainMax95BpsDataResponse());
    }

    public DescribeDomainMax95BpsDataResponse describeDomainMax95BpsData(DescribeDomainMax95BpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainMax95BpsDataWithOptions(request, runtime);
    }

    public DescribeDomainMultiUsageDataResponse describeDomainMultiUsageDataWithOptions(DescribeDomainMultiUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainMultiUsageData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainMultiUsageDataResponse());
    }

    public DescribeDomainMultiUsageDataResponse describeDomainMultiUsageData(DescribeDomainMultiUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainMultiUsageDataWithOptions(request, runtime);
    }

    public DescribeDomainNamesOfVersionResponse describeDomainNamesOfVersionWithOptions(DescribeDomainNamesOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageIndex", request.pageIndex);
        query.put("PageSize", request.pageSize);
        query.put("VersionId", request.versionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainNamesOfVersion"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainNamesOfVersionResponse());
    }

    public DescribeDomainNamesOfVersionResponse describeDomainNamesOfVersion(DescribeDomainNamesOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNamesOfVersionWithOptions(request, runtime);
    }

    public DescribeDomainPathDataResponse describeDomainPathDataWithOptions(DescribeDomainPathDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainPathData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainPathDataResponse());
    }

    public DescribeDomainPathDataResponse describeDomainPathData(DescribeDomainPathDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainPathDataWithOptions(request, runtime);
    }

    public DescribeDomainPvDataResponse describeDomainPvDataWithOptions(DescribeDomainPvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainPvData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainPvDataResponse());
    }

    public DescribeDomainPvDataResponse describeDomainPvData(DescribeDomainPvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainPvDataWithOptions(request, runtime);
    }

    public DescribeDomainQpsDataResponse describeDomainQpsDataWithOptions(DescribeDomainQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainQpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainQpsDataResponse());
    }

    public DescribeDomainQpsDataResponse describeDomainQpsData(DescribeDomainQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQpsDataWithOptions(request, runtime);
    }

    public DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayerWithOptions(DescribeDomainQpsDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("Layer", request.layer);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainQpsDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainQpsDataByLayerResponse());
    }

    public DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayer(DescribeDomainQpsDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQpsDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsDataWithOptions(DescribeDomainRealTimeBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeBpsDataResponse());
    }

    public DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsData(DescribeDomainRealTimeBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateDataWithOptions(DescribeDomainRealTimeByteHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeByteHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeByteHitRateDataResponse());
    }

    public DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateData(DescribeDomainRealTimeByteHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeDetailDataResponse describeDomainRealTimeDetailDataWithOptions(DescribeDomainRealTimeDetailDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeDetailData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeDetailDataResponse());
    }

    public DescribeDomainRealTimeDetailDataResponse describeDomainRealTimeDetailData(DescribeDomainRealTimeDetailDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeDataWithOptions(DescribeDomainRealTimeHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsDataWithOptions(DescribeDomainRealTimeQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeQpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeQpsDataResponse());
    }

    public DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsData(DescribeDomainRealTimeQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateDataWithOptions(DescribeDomainRealTimeReqHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeReqHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeReqHitRateDataResponse());
    }

    public DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateData(DescribeDomainRealTimeReqHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsDataWithOptions(DescribeDomainRealTimeSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeSrcBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeSrcBpsDataResponse());
    }

    public DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsData(DescribeDomainRealTimeSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeDataWithOptions(DescribeDomainRealTimeSrcHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeSrcHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeSrcHttpCodeDataResponse());
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeSrcHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficDataWithOptions(DescribeDomainRealTimeSrcTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeSrcTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeSrcTrafficDataResponse());
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficData(DescribeDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficDataWithOptions(DescribeDomainRealTimeTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeTrafficDataResponse());
    }

    public DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficData(DescribeDomainRealTimeTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainRealtimeLogDeliveryResponse describeDomainRealtimeLogDeliveryWithOptions(DescribeDomainRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealtimeLogDeliveryResponse());
    }

    public DescribeDomainRealtimeLogDeliveryResponse describeDomainRealtimeLogDelivery(DescribeDomainRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeDomainRegionDataResponse describeDomainRegionDataWithOptions(DescribeDomainRegionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRegionData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRegionDataResponse());
    }

    public DescribeDomainRegionDataResponse describeDomainRegionData(DescribeDomainRegionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRegionDataWithOptions(request, runtime);
    }

    public DescribeDomainReqHitRateDataResponse describeDomainReqHitRateDataWithOptions(DescribeDomainReqHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainReqHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainReqHitRateDataResponse());
    }

    public DescribeDomainReqHitRateDataResponse describeDomainReqHitRateData(DescribeDomainReqHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcBpsDataResponse describeDomainSrcBpsDataWithOptions(DescribeDomainSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcBpsDataResponse());
    }

    public DescribeDomainSrcBpsDataResponse describeDomainSrcBpsData(DescribeDomainSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeDataWithOptions(DescribeDomainSrcHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcHttpCodeDataResponse());
    }

    public DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeData(DescribeDomainSrcHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcQpsDataResponse describeDomainSrcQpsDataWithOptions(DescribeDomainSrcQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcQpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcQpsDataResponse());
    }

    public DescribeDomainSrcQpsDataResponse describeDomainSrcQpsData(DescribeDomainSrcQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcQpsDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisitWithOptions(DescribeDomainSrcTopUrlVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcTopUrlVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcTopUrlVisitResponse());
    }

    public DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisit(DescribeDomainSrcTopUrlVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficDataWithOptions(DescribeDomainSrcTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcTrafficDataResponse());
    }

    public DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficData(DescribeDomainSrcTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisitWithOptions(DescribeDomainTopClientIpVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Limit", request.limit);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopClientIpVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopClientIpVisitResponse());
    }

    public DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisit(DescribeDomainTopClientIpVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopClientIpVisitWithOptions(request, runtime);
    }

    public DescribeDomainTopReferVisitResponse describeDomainTopReferVisitWithOptions(DescribeDomainTopReferVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("Percent", request.percent);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopReferVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopReferVisitResponse());
    }

    public DescribeDomainTopReferVisitResponse describeDomainTopReferVisit(DescribeDomainTopReferVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopReferVisitWithOptions(request, runtime);
    }

    public DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisitWithOptions(DescribeDomainTopUrlVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("SortBy", request.sortBy);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopUrlVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopUrlVisitResponse());
    }

    public DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisit(DescribeDomainTopUrlVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeDomainTrafficDataResponse describeDomainTrafficDataWithOptions(DescribeDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("IspNameEn", request.ispNameEn);
        query.put("LocationNameEn", request.locationNameEn);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTrafficDataResponse());
    }

    public DescribeDomainTrafficDataResponse describeDomainTrafficData(DescribeDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainUsageDataResponse describeDomainUsageDataWithOptions(DescribeDomainUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Area", request.area);
        query.put("DataProtocol", request.dataProtocol);
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("Field", request.field);
        query.put("Interval", request.interval);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainUsageData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainUsageDataResponse());
    }

    public DescribeDomainUsageDataResponse describeDomainUsageData(DescribeDomainUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeDomainUvDataResponse describeDomainUvDataWithOptions(DescribeDomainUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainUvData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainUvDataResponse());
    }

    public DescribeDomainUvDataResponse describeDomainUvData(DescribeDomainUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainUvDataWithOptions(request, runtime);
    }

    public DescribeDomainsBySourceResponse describeDomainsBySourceWithOptions(DescribeDomainsBySourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainsBySource"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsBySourceResponse());
    }

    public DescribeDomainsBySourceResponse describeDomainsBySource(DescribeDomainsBySourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsBySourceWithOptions(request, runtime);
    }

    public DescribeDomainsUsageByDayResponse describeDomainsUsageByDayWithOptions(DescribeDomainsUsageByDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainsUsageByDay"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsUsageByDayResponse());
    }

    public DescribeDomainsUsageByDayResponse describeDomainsUsageByDay(DescribeDomainsUsageByDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsUsageByDayWithOptions(request, runtime);
    }

    public DescribeEsExceptionDataResponse describeEsExceptionDataWithOptions(DescribeEsExceptionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("RuleId", request.ruleId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEsExceptionData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEsExceptionDataResponse());
    }

    public DescribeEsExceptionDataResponse describeEsExceptionData(DescribeEsExceptionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEsExceptionDataWithOptions(request, runtime);
    }

    public DescribeEsExecuteDataResponse describeEsExecuteDataWithOptions(DescribeEsExecuteDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("RuleId", request.ruleId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEsExecuteData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEsExecuteDataResponse());
    }

    public DescribeEsExecuteDataResponse describeEsExecuteData(DescribeEsExecuteDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEsExecuteDataWithOptions(request, runtime);
    }

    public DescribeFCTriggerResponse describeFCTriggerWithOptions(DescribeFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFCTriggerResponse());
    }

    public DescribeFCTriggerResponse describeFCTrigger(DescribeFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFCTriggerWithOptions(request, runtime);
    }

    public DescribeIllegalUrlExportTaskResponse describeIllegalUrlExportTaskWithOptions(DescribeIllegalUrlExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIllegalUrlExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIllegalUrlExportTaskResponse());
    }

    public DescribeIllegalUrlExportTaskResponse describeIllegalUrlExportTask(DescribeIllegalUrlExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIllegalUrlExportTaskWithOptions(request, runtime);
    }

    public DescribeIpInfoResponse describeIpInfoWithOptions(DescribeIpInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IP", request.IP);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpInfoResponse());
    }

    public DescribeIpInfoResponse describeIpInfo(DescribeIpInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpInfoWithOptions(request, runtime);
    }

    public DescribeL2VipsByDomainResponse describeL2VipsByDomainWithOptions(DescribeL2VipsByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeL2VipsByDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeL2VipsByDomainResponse());
    }

    public DescribeL2VipsByDomainResponse describeL2VipsByDomain(DescribeL2VipsByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeL2VipsByDomainWithOptions(request, runtime);
    }

    public DescribeRangeDataByLocateAndIspServiceResponse describeRangeDataByLocateAndIspServiceWithOptions(DescribeRangeDataByLocateAndIspServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainNames", request.domainNames);
        query.put("EndTime", request.endTime);
        query.put("IspNames", request.ispNames);
        query.put("LocationNames", request.locationNames);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRangeDataByLocateAndIspService"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRangeDataByLocateAndIspServiceResponse());
    }

    public DescribeRangeDataByLocateAndIspServiceResponse describeRangeDataByLocateAndIspService(DescribeRangeDataByLocateAndIspServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRangeDataByLocateAndIspServiceWithOptions(request, runtime);
    }

    public DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAccWithOptions(DescribeRealtimeDeliveryAccRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("LogStore", request.logStore);
        query.put("OwnerId", request.ownerId);
        query.put("Project", request.project);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRealtimeDeliveryAcc"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRealtimeDeliveryAccResponse());
    }

    public DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAcc(DescribeRealtimeDeliveryAccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRealtimeDeliveryAccWithOptions(request, runtime);
    }

    public DescribeRefreshQuotaResponse describeRefreshQuotaWithOptions(DescribeRefreshQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRefreshQuota"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRefreshQuotaResponse());
    }

    public DescribeRefreshQuotaResponse describeRefreshQuota(DescribeRefreshQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeRefreshTaskByIdResponse describeRefreshTaskByIdWithOptions(DescribeRefreshTaskByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRefreshTaskById"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRefreshTaskByIdResponse());
    }

    public DescribeRefreshTaskByIdResponse describeRefreshTaskById(DescribeRefreshTaskByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRefreshTaskByIdWithOptions(request, runtime);
    }

    public DescribeRefreshTasksResponse describeRefreshTasksWithOptions(DescribeRefreshTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("EndTime", request.endTime);
        query.put("ObjectPath", request.objectPath);
        query.put("ObjectType", request.objectType);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRefreshTasks"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRefreshTasksResponse());
    }

    public DescribeRefreshTasksResponse describeRefreshTasks(DescribeRefreshTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRefreshTasksWithOptions(request, runtime);
    }

    public DescribeStagingIpResponse describeStagingIpWithOptions(DescribeStagingIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStagingIp"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStagingIpResponse());
    }

    public DescribeStagingIpResponse describeStagingIp(DescribeStagingIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStagingIpWithOptions(request, runtime);
    }

    public DescribeTagResourcesResponse describeTagResourcesWithOptions(DescribeTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagResourcesResponse());
    }

    public DescribeTagResourcesResponse describeTagResources(DescribeTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagResourcesWithOptions(request, runtime);
    }

    public DescribeTopDomainsByFlowResponse describeTopDomainsByFlowWithOptions(DescribeTopDomainsByFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("Limit", request.limit);
        query.put("OwnerId", request.ownerId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopDomainsByFlow"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTopDomainsByFlowResponse());
    }

    public DescribeTopDomainsByFlowResponse describeTopDomainsByFlow(DescribeTopDomainsByFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeUserCertificateExpireCountResponse describeUserCertificateExpireCountWithOptions(DescribeUserCertificateExpireCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserCertificateExpireCount"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserCertificateExpireCountResponse());
    }

    public DescribeUserCertificateExpireCountResponse describeUserCertificateExpireCount(DescribeUserCertificateExpireCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserCertificateExpireCountWithOptions(request, runtime);
    }

    public DescribeUserConfigsResponse describeUserConfigsWithOptions(DescribeUserConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Config", request.config);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserConfigs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserConfigsResponse());
    }

    public DescribeUserConfigsResponse describeUserConfigs(DescribeUserConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserConfigsWithOptions(request, runtime);
    }

    public DescribeUserDomainsResponse describeUserDomainsWithOptions(DescribeUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CdnType", request.cdnType);
        query.put("ChangeEndTime", request.changeEndTime);
        query.put("ChangeStartTime", request.changeStartTime);
        query.put("CheckDomainShow", request.checkDomainShow);
        query.put("Coverage", request.coverage);
        query.put("DomainName", request.domainName);
        query.put("DomainSearchType", request.domainSearchType);
        query.put("DomainStatus", request.domainStatus);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityToken", request.securityToken);
        query.put("Source", request.source);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserDomains"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserDomainsResponse());
    }

    public DescribeUserDomainsResponse describeUserDomains(DescribeUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserDomainsWithOptions(request, runtime);
    }

    public DescribeUserTagsResponse describeUserTagsWithOptions(DescribeUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserTags"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserTagsResponse());
    }

    public DescribeUserTagsResponse describeUserTags(DescribeUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserTagsWithOptions(request, runtime);
    }

    public DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTaskWithOptions(DescribeUserUsageDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserUsageDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserUsageDataExportTaskResponse());
    }

    public DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTask(DescribeUserUsageDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserUsageDataExportTaskWithOptions(request, runtime);
    }

    public DescribeUserUsageDetailDataExportTaskResponse describeUserUsageDetailDataExportTaskWithOptions(DescribeUserUsageDetailDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserUsageDetailDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserUsageDetailDataExportTaskResponse());
    }

    public DescribeUserUsageDetailDataExportTaskResponse describeUserUsageDetailDataExportTask(DescribeUserUsageDetailDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    public DescribeUserVipsByDomainResponse describeUserVipsByDomainWithOptions(DescribeUserVipsByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserVipsByDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserVipsByDomainResponse());
    }

    public DescribeUserVipsByDomainResponse describeUserVipsByDomain(DescribeUserVipsByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserVipsByDomainWithOptions(request, runtime);
    }

    public DescribeVerifyContentResponse describeVerifyContentWithOptions(DescribeVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyContent"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyContentResponse());
    }

    public DescribeVerifyContentResponse describeVerifyContent(DescribeVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVerifyContentWithOptions(request, runtime);
    }

    public DisableRealtimeLogDeliveryResponse disableRealtimeLogDeliveryWithOptions(DisableRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRealtimeLogDeliveryResponse());
    }

    public DisableRealtimeLogDeliveryResponse disableRealtimeLogDelivery(DisableRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public EnableRealtimeLogDeliveryResponse enableRealtimeLogDeliveryWithOptions(EnableRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRealtimeLogDeliveryResponse());
    }

    public EnableRealtimeLogDeliveryResponse enableRealtimeLogDelivery(EnableRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ListDomainsByLogConfigIdResponse listDomainsByLogConfigIdWithOptions(ListDomainsByLogConfigIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomainsByLogConfigId"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsByLogConfigIdResponse());
    }

    public ListDomainsByLogConfigIdResponse listDomainsByLogConfigId(ListDomainsByLogConfigIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDomainsByLogConfigIdWithOptions(request, runtime);
    }

    public ListFCTriggerResponse listFCTriggerWithOptions(ListFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFCTriggerResponse());
    }

    public ListFCTriggerResponse listFCTrigger(ListFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFCTriggerWithOptions(request, runtime);
    }

    public ListRealtimeLogDeliveryDomainsResponse listRealtimeLogDeliveryDomainsWithOptions(ListRealtimeLogDeliveryDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeLogDeliveryDomains"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeLogDeliveryDomainsResponse());
    }

    public ListRealtimeLogDeliveryDomainsResponse listRealtimeLogDeliveryDomains(ListRealtimeLogDeliveryDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    public ListRealtimeLogDeliveryInfosResponse listRealtimeLogDeliveryInfosWithOptions(ListRealtimeLogDeliveryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeLogDeliveryInfos"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeLogDeliveryInfosResponse());
    }

    public ListRealtimeLogDeliveryInfosResponse listRealtimeLogDeliveryInfos(ListRealtimeLogDeliveryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealtimeLogDeliveryInfosWithOptions(request, runtime);
    }

    public ListUserCustomLogConfigResponse listUserCustomLogConfigWithOptions(ListUserCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserCustomLogConfigResponse());
    }

    public ListUserCustomLogConfigResponse listUserCustomLogConfig(ListUserCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserCustomLogConfigWithOptions(request, runtime);
    }

    public ModifyCdnDomainResponse modifyCdnDomainWithOptions(ModifyCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityToken", request.securityToken);
        query.put("Sources", request.sources);
        query.put("TopLevelDomain", request.topLevelDomain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdnDomainResponse());
    }

    public ModifyCdnDomainResponse modifyCdnDomain(ModifyCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCdnDomainWithOptions(request, runtime);
    }

    public ModifyCdnDomainSchdmByPropertyResponse modifyCdnDomainSchdmByPropertyWithOptions(ModifyCdnDomainSchdmByPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("Property", request.property);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdnDomainSchdmByProperty"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdnDomainSchdmByPropertyResponse());
    }

    public ModifyCdnDomainSchdmByPropertyResponse modifyCdnDomainSchdmByProperty(ModifyCdnDomainSchdmByPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCdnDomainSchdmByPropertyWithOptions(request, runtime);
    }

    public ModifyDomainCustomLogConfigResponse modifyDomainCustomLogConfigWithOptions(ModifyDomainCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomainCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainCustomLogConfigResponse());
    }

    public ModifyDomainCustomLogConfigResponse modifyDomainCustomLogConfig(ModifyDomainCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainCustomLogConfigWithOptions(request, runtime);
    }

    public ModifyRealtimeLogDeliveryResponse modifyRealtimeLogDeliveryWithOptions(ModifyRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRealtimeLogDeliveryResponse());
    }

    public ModifyRealtimeLogDeliveryResponse modifyRealtimeLogDelivery(ModifyRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ModifyUserCustomLogConfigResponse modifyUserCustomLogConfigWithOptions(ModifyUserCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserCustomLogConfigResponse());
    }

    public ModifyUserCustomLogConfigResponse modifyUserCustomLogConfig(ModifyUserCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserCustomLogConfigWithOptions(request, runtime);
    }

    public OpenCdnServiceResponse openCdnServiceWithOptions(OpenCdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InternetChargeType", request.internetChargeType);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenCdnService"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenCdnServiceResponse());
    }

    public OpenCdnServiceResponse openCdnService(OpenCdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openCdnServiceWithOptions(request, runtime);
    }

    public PublishStagingConfigToProductionResponse publishStagingConfigToProductionWithOptions(PublishStagingConfigToProductionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("FunctionName", request.functionName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishStagingConfigToProduction"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishStagingConfigToProductionResponse());
    }

    public PublishStagingConfigToProductionResponse publishStagingConfigToProduction(PublishStagingConfigToProductionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishStagingConfigToProductionWithOptions(request, runtime);
    }

    public PushObjectCacheResponse pushObjectCacheWithOptions(PushObjectCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Area", request.area);
        query.put("ObjectPath", request.objectPath);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushObjectCache"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushObjectCacheResponse());
    }

    public PushObjectCacheResponse pushObjectCache(PushObjectCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushObjectCacheWithOptions(request, runtime);
    }

    public RefreshObjectCachesResponse refreshObjectCachesWithOptions(RefreshObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ObjectPath", request.objectPath);
        query.put("ObjectType", request.objectType);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshObjectCaches"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshObjectCachesResponse());
    }

    public RefreshObjectCachesResponse refreshObjectCaches(RefreshObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshObjectCachesWithOptions(request, runtime);
    }

    public RollbackStagingConfigResponse rollbackStagingConfigWithOptions(RollbackStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("FunctionName", request.functionName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackStagingConfigResponse());
    }

    public RollbackStagingConfigResponse rollbackStagingConfig(RollbackStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackStagingConfigWithOptions(request, runtime);
    }

    public SetCcConfigResponse setCcConfigWithOptions(SetCcConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllowIps", request.allowIps);
        query.put("BlockIps", request.blockIps);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCcConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCcConfigResponse());
    }

    public SetCcConfigResponse setCcConfig(SetCcConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCcConfigWithOptions(request, runtime);
    }

    public SetCdnDomainCSRCertificateResponse setCdnDomainCSRCertificateWithOptions(SetCdnDomainCSRCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("ServerCertificate", request.serverCertificate);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainCSRCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainCSRCertificateResponse());
    }

    public SetCdnDomainCSRCertificateResponse setCdnDomainCSRCertificate(SetCdnDomainCSRCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCdnDomainCSRCertificateWithOptions(request, runtime);
    }

    public SetCdnDomainSMCertificateResponse setCdnDomainSMCertificateWithOptions(SetCdnDomainSMCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertIdentifier", request.certIdentifier);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SSLProtocol", request.SSLProtocol);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainSMCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainSMCertificateResponse());
    }

    public SetCdnDomainSMCertificateResponse setCdnDomainSMCertificate(SetCdnDomainSMCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCdnDomainSMCertificateWithOptions(request, runtime);
    }

    public SetCdnDomainStagingConfigResponse setCdnDomainStagingConfigWithOptions(SetCdnDomainStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("Functions", request.functions);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainStagingConfigResponse());
    }

    public SetCdnDomainStagingConfigResponse setCdnDomainStagingConfig(SetCdnDomainStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCdnDomainStagingConfigWithOptions(request, runtime);
    }

    public SetConfigOfVersionResponse setConfigOfVersionWithOptions(SetConfigOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("FunctionArgs", request.functionArgs);
        query.put("FunctionId", request.functionId);
        query.put("FunctionMatches", request.functionMatches);
        query.put("FunctionName", request.functionName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("VersionId", request.versionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetConfigOfVersion"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetConfigOfVersionResponse());
    }

    public SetConfigOfVersionResponse setConfigOfVersion(SetConfigOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setConfigOfVersionWithOptions(request, runtime);
    }

    public SetDomainGreenManagerConfigResponse setDomainGreenManagerConfigWithOptions(SetDomainGreenManagerConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainGreenManagerConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainGreenManagerConfigResponse());
    }

    public SetDomainGreenManagerConfigResponse setDomainGreenManagerConfig(SetDomainGreenManagerConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainGreenManagerConfigWithOptions(request, runtime);
    }

    public SetDomainServerCertificateResponse setDomainServerCertificateWithOptions(SetDomainServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertName", request.certName);
        query.put("CertType", request.certType);
        query.put("DomainName", request.domainName);
        query.put("ForceSet", request.forceSet);
        query.put("OwnerId", request.ownerId);
        query.put("PrivateKey", request.privateKey);
        query.put("SecurityToken", request.securityToken);
        query.put("ServerCertificate", request.serverCertificate);
        query.put("ServerCertificateStatus", request.serverCertificateStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainServerCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainServerCertificateResponse());
    }

    public SetDomainServerCertificateResponse setDomainServerCertificate(SetDomainServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainServerCertificateWithOptions(request, runtime);
    }

    public SetErrorPageConfigResponse setErrorPageConfigWithOptions(SetErrorPageConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CustomPageUrl", request.customPageUrl);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("PageType", request.pageType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetErrorPageConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetErrorPageConfigResponse());
    }

    public SetErrorPageConfigResponse setErrorPageConfig(SetErrorPageConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setErrorPageConfigWithOptions(request, runtime);
    }

    public SetFileCacheExpiredConfigResponse setFileCacheExpiredConfigWithOptions(SetFileCacheExpiredConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheContent", request.cacheContent);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("TTL", request.TTL);
        query.put("Weight", request.weight);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetFileCacheExpiredConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetFileCacheExpiredConfigResponse());
    }

    public SetFileCacheExpiredConfigResponse setFileCacheExpiredConfig(SetFileCacheExpiredConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setFileCacheExpiredConfigWithOptions(request, runtime);
    }

    public SetForceRedirectConfigResponse setForceRedirectConfigWithOptions(SetForceRedirectConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("RedirectType", request.redirectType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetForceRedirectConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetForceRedirectConfigResponse());
    }

    public SetForceRedirectConfigResponse setForceRedirectConfig(SetForceRedirectConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setForceRedirectConfigWithOptions(request, runtime);
    }

    public SetForwardSchemeConfigResponse setForwardSchemeConfigWithOptions(SetForwardSchemeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("OwnerId", request.ownerId);
        query.put("SchemeOrigin", request.schemeOrigin);
        query.put("SchemeOriginPort", request.schemeOriginPort);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetForwardSchemeConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetForwardSchemeConfigResponse());
    }

    public SetForwardSchemeConfigResponse setForwardSchemeConfig(SetForwardSchemeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setForwardSchemeConfigWithOptions(request, runtime);
    }

    public SetHttpErrorPageConfigResponse setHttpErrorPageConfigWithOptions(SetHttpErrorPageConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("ErrorCode", request.errorCode);
        query.put("OwnerId", request.ownerId);
        query.put("PageUrl", request.pageUrl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpErrorPageConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpErrorPageConfigResponse());
    }

    public SetHttpErrorPageConfigResponse setHttpErrorPageConfig(SetHttpErrorPageConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setHttpErrorPageConfigWithOptions(request, runtime);
    }

    public SetHttpHeaderConfigResponse setHttpHeaderConfigWithOptions(SetHttpHeaderConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("HeaderKey", request.headerKey);
        query.put("HeaderValue", request.headerValue);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpHeaderConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpHeaderConfigResponse());
    }

    public SetHttpHeaderConfigResponse setHttpHeaderConfig(SetHttpHeaderConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setHttpHeaderConfigWithOptions(request, runtime);
    }

    public SetHttpsOptionConfigResponse setHttpsOptionConfigWithOptions(SetHttpsOptionConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Http2", request.http2);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpsOptionConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpsOptionConfigResponse());
    }

    public SetHttpsOptionConfigResponse setHttpsOptionConfig(SetHttpsOptionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setHttpsOptionConfigWithOptions(request, runtime);
    }

    public SetIgnoreQueryStringConfigResponse setIgnoreQueryStringConfigWithOptions(SetIgnoreQueryStringConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("HashKeyArgs", request.hashKeyArgs);
        query.put("KeepOssArgs", request.keepOssArgs);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIgnoreQueryStringConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIgnoreQueryStringConfigResponse());
    }

    public SetIgnoreQueryStringConfigResponse setIgnoreQueryStringConfig(SetIgnoreQueryStringConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIgnoreQueryStringConfigWithOptions(request, runtime);
    }

    public SetIpAllowListConfigResponse setIpAllowListConfigWithOptions(SetIpAllowListConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllowIps", request.allowIps);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIpAllowListConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIpAllowListConfigResponse());
    }

    public SetIpAllowListConfigResponse setIpAllowListConfig(SetIpAllowListConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIpAllowListConfigWithOptions(request, runtime);
    }

    public SetIpBlackListConfigResponse setIpBlackListConfigWithOptions(SetIpBlackListConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BlockIps", request.blockIps);
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIpBlackListConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIpBlackListConfigResponse());
    }

    public SetIpBlackListConfigResponse setIpBlackListConfig(SetIpBlackListConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIpBlackListConfigWithOptions(request, runtime);
    }

    public SetOptimizeConfigResponse setOptimizeConfigWithOptions(SetOptimizeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetOptimizeConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetOptimizeConfigResponse());
    }

    public SetOptimizeConfigResponse setOptimizeConfig(SetOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOptimizeConfigWithOptions(request, runtime);
    }

    public SetPageCompressConfigResponse setPageCompressConfigWithOptions(SetPageCompressConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPageCompressConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPageCompressConfigResponse());
    }

    public SetPageCompressConfigResponse setPageCompressConfig(SetPageCompressConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setPageCompressConfigWithOptions(request, runtime);
    }

    public SetRangeConfigResponse setRangeConfigWithOptions(SetRangeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRangeConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRangeConfigResponse());
    }

    public SetRangeConfigResponse setRangeConfig(SetRangeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRangeConfigWithOptions(request, runtime);
    }

    public SetRefererConfigResponse setRefererConfigWithOptions(SetRefererConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllowEmpty", request.allowEmpty);
        query.put("DisableAst", request.disableAst);
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("ReferList", request.referList);
        query.put("ReferType", request.referType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRefererConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRefererConfigResponse());
    }

    public SetRefererConfigResponse setRefererConfig(SetRefererConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRefererConfigWithOptions(request, runtime);
    }

    public SetRemoveQueryStringConfigResponse setRemoveQueryStringConfigWithOptions(SetRemoveQueryStringConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AliRemoveArgs", request.aliRemoveArgs);
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("KeepOssArgs", request.keepOssArgs);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRemoveQueryStringConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRemoveQueryStringConfigResponse());
    }

    public SetRemoveQueryStringConfigResponse setRemoveQueryStringConfig(SetRemoveQueryStringConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRemoveQueryStringConfigWithOptions(request, runtime);
    }

    public SetReqAuthConfigResponse setReqAuthConfigWithOptions(SetReqAuthConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthRemoteDesc", request.authRemoteDesc);
        query.put("AuthType", request.authType);
        query.put("DomainName", request.domainName);
        query.put("Key1", request.key1);
        query.put("Key2", request.key2);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("TimeOut", request.timeOut);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetReqAuthConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetReqAuthConfigResponse());
    }

    public SetReqAuthConfigResponse setReqAuthConfig(SetReqAuthConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setReqAuthConfigWithOptions(request, runtime);
    }

    public SetReqHeaderConfigResponse setReqHeaderConfigWithOptions(SetReqHeaderConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigId", request.configId);
        query.put("DomainName", request.domainName);
        query.put("Key", request.key);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        query.put("Value", request.value);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetReqHeaderConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetReqHeaderConfigResponse());
    }

    public SetReqHeaderConfigResponse setReqHeaderConfig(SetReqHeaderConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setReqHeaderConfigWithOptions(request, runtime);
    }

    public SetSourceHostConfigResponse setSourceHostConfigWithOptions(SetSourceHostConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackSrcDomain", request.backSrcDomain);
        query.put("DomainName", request.domainName);
        query.put("Enable", request.enable);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSourceHostConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSourceHostConfigResponse());
    }

    public SetSourceHostConfigResponse setSourceHostConfig(SetSourceHostConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setSourceHostConfigWithOptions(request, runtime);
    }

    public SetUserGreenManagerConfigResponse setUserGreenManagerConfigWithOptions(SetUserGreenManagerConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("Quota", request.quota);
        query.put("Ratio", request.ratio);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserGreenManagerConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserGreenManagerConfigResponse());
    }

    public SetUserGreenManagerConfigResponse setUserGreenManagerConfig(SetUserGreenManagerConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setUserGreenManagerConfigWithOptions(request, runtime);
    }

    public SetWaitingRoomConfigResponse setWaitingRoomConfigWithOptions(SetWaitingRoomConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllowPct", request.allowPct);
        query.put("DomainName", request.domainName);
        query.put("GapTime", request.gapTime);
        query.put("MaxTimeWait", request.maxTimeWait);
        query.put("OwnerId", request.ownerId);
        query.put("WaitUri", request.waitUri);
        query.put("WaitUrl", request.waitUrl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWaitingRoomConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWaitingRoomConfigResponse());
    }

    public SetWaitingRoomConfigResponse setWaitingRoomConfig(SetWaitingRoomConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setWaitingRoomConfigWithOptions(request, runtime);
    }

    public StartCdnDomainResponse startCdnDomainWithOptions(StartCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCdnDomainResponse());
    }

    public StartCdnDomainResponse startCdnDomain(StartCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCdnDomainWithOptions(request, runtime);
    }

    public StopCdnDomainResponse stopCdnDomainWithOptions(StopCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCdnDomainResponse());
    }

    public StopCdnDomainResponse stopCdnDomain(StopCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopCdnDomainWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateCdnDeliverTaskResponse updateCdnDeliverTaskWithOptions(UpdateCdnDeliverTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCdnDeliverTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCdnDeliverTaskResponse());
    }

    public UpdateCdnDeliverTaskResponse updateCdnDeliverTask(UpdateCdnDeliverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCdnDeliverTaskWithOptions(request, runtime);
    }

    public UpdateCdnSubTaskResponse updateCdnSubTaskWithOptions(UpdateCdnSubTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCdnSubTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCdnSubTaskResponse());
    }

    public UpdateCdnSubTaskResponse updateCdnSubTask(UpdateCdnSubTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCdnSubTaskWithOptions(request, runtime);
    }

    public UpdateFCTriggerResponse updateFCTriggerWithOptions(UpdateFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("TriggerARN", request.triggerARN);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFCTriggerResponse());
    }

    public UpdateFCTriggerResponse updateFCTrigger(UpdateFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFCTriggerWithOptions(request, runtime);
    }

    public VerifyDomainOwnerResponse verifyDomainOwnerWithOptions(VerifyDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("OwnerId", request.ownerId);
        query.put("VerifyType", request.verifyType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDomainOwner"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDomainOwnerResponse());
    }

    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyDomainOwnerWithOptions(request, runtime);
    }
}
