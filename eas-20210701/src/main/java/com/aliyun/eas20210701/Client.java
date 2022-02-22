// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701;

import com.aliyun.tea.*;
import com.aliyun.eas20210701.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "pai-eas.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai-eas.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai-eas.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "pai-eas.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai-eas.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai-eas.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai-eas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai-eas.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-west-1", "pai-eas.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "pai-eas.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai-eas.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai-eas.ap-south-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "pai-eas.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "pai-eas.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "eas.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "eas.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "eas.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "eas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "eas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "eas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "eas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "eas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "pai-eas.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-edge-1", "eas.aliyuncs.com"),
            new TeaPair("cn-fujian", "eas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "eas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "eas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "eas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "eas.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "eas.aliyuncs.com"),
            new TeaPair("cn-qingdao", "eas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "eas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "eas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "eas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "eas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "eas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "eas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "eas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "eas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "eas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "eas.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "eas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "eas.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "eas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "eas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "eas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "eas.aliyuncs.com"),
            new TeaPair("eu-west-1", "eas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "eas.aliyuncs.com"),
            new TeaPair("me-east-1", "eas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "eas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(request, headers, runtime);
    }

    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewal)) {
            body.put("AutoRenewal", request.autoRenewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceCount)) {
            body.put("EcsInstanceCount", request.ecsInstanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceType)) {
            body.put("EcsInstanceType", request.ecsInstanceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    public CreateResourceInstancesResponse createResourceInstances(String ClusterId, String ResourceId, CreateResourceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public CreateResourceInstancesResponse createResourceInstancesWithOptions(String ClusterId, String ResourceId, CreateResourceInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewal)) {
            body.put("AutoRenewal", request.autoRenewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceCount)) {
            body.put("EcsInstanceCount", request.ecsInstanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceType)) {
            body.put("EcsInstanceType", request.ecsInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceInstancesResponse());
    }

    public CreateResourceLogResponse createResourceLog(String ClusterId, String ResourceId, CreateResourceLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceLogWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public CreateResourceLogResponse createResourceLogWithOptions(String ClusterId, String ResourceId, CreateResourceLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            body.put("LogStore", request.logStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/log"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceLogResponse());
    }

    public CreateRoleResponse createRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(headers, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    public CreateServiceAutoScalerResponse createServiceAutoScaler(String ClusterId, String ServiceName, CreateServiceAutoScalerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceAutoScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public CreateServiceAutoScalerResponse createServiceAutoScalerWithOptions(String ClusterId, String ServiceName, CreateServiceAutoScalerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.max)) {
            body.put("Max", request.max);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.min)) {
            body.put("Min", request.min);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.strategies))) {
            body.put("Strategies", request.strategies);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/autoscaler"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceAutoScalerResponse());
    }

    public CreateServiceCronScalerResponse createServiceCronScaler(String ClusterId, String ServiceName, CreateServiceCronScalerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceCronScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public CreateServiceCronScalerResponse createServiceCronScalerWithOptions(String ClusterId, String ServiceName, CreateServiceCronScalerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeDates)) {
            body.put("ExcludeDates", request.excludeDates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleJobs)) {
            body.put("ScaleJobs", request.scaleJobs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/cronscaler"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceCronScalerResponse());
    }

    public CreateServiceMirrorResponse createServiceMirror(String ClusterId, String ServiceName, CreateServiceMirrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceMirrorWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public CreateServiceMirrorResponse createServiceMirrorWithOptions(String ClusterId, String ServiceName, CreateServiceMirrorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            body.put("Ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/mirror"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceMirrorResponse());
    }

    public DeleteResourceResponse deleteResource(String ClusterId, String ResourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DeleteResourceResponse deleteResourceWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    public DeleteResourceDLinkResponse deleteResourceDLink(String ClusterId, String ResourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceDLinkWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DeleteResourceDLinkResponse deleteResourceDLinkWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceDLink"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/dlink"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceDLinkResponse());
    }

    public DeleteResourceInstancesResponse deleteResourceInstances(String ClusterId, String ResourceId, DeleteResourceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public DeleteResourceInstancesResponse deleteResourceInstancesWithOptions(String ClusterId, String ResourceId, DeleteResourceInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allFailed)) {
            query.put("AllFailed", request.allFailed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/instances"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceInstancesResponse());
    }

    public DeleteResourceLogResponse deleteResourceLog(String ClusterId, String ResourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceLogWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DeleteResourceLogResponse deleteResourceLogWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/log"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceLogResponse());
    }

    public DeleteServiceResponse deleteService(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceAutoScalerResponse deleteServiceAutoScaler(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceAutoScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceAutoScalerResponse deleteServiceAutoScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/autoscaler"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceAutoScalerResponse());
    }

    public DeleteServiceCronScalerResponse deleteServiceCronScaler(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceCronScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceCronScalerResponse deleteServiceCronScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/cronscaler"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceCronScalerResponse());
    }

    public DeleteServiceInstancesResponse deleteServiceInstances(String ClusterId, String ServiceName, DeleteServiceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceInstancesWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DeleteServiceInstancesResponse deleteServiceInstancesWithOptions(String ClusterId, String ServiceName, DeleteServiceInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/instances"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceInstancesResponse());
    }

    public DeleteServiceMirrorResponse deleteServiceMirror(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceMirrorWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceMirrorResponse deleteServiceMirrorWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/mirror"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceMirrorResponse());
    }

    public DescribeResourceResponse describeResource(String ClusterId, String ResourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DescribeResourceResponse describeResourceWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceResponse());
    }

    public DescribeResourceDLinkResponse describeResourceDLink(String ClusterId, String ResourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceDLinkWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DescribeResourceDLinkResponse describeResourceDLinkWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceDLink"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/dlink"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceDLinkResponse());
    }

    public DescribeResourceLogResponse describeResourceLog(String ClusterId, String ResourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceLogWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DescribeResourceLogResponse describeResourceLogWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceLogResponse());
    }

    public DescribeRoleResponse describeRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRoleWithOptions(headers, runtime);
    }

    public DescribeRoleResponse describeRoleWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRole"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/role"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoleResponse());
    }

    public DescribeServiceResponse describeService(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceResponse describeServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceResponse());
    }

    public DescribeServiceAutoScalerResponse describeServiceAutoScaler(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceAutoScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceAutoScalerResponse describeServiceAutoScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/autoscaler"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceAutoScalerResponse());
    }

    public DescribeServiceCronScalerResponse describeServiceCronScaler(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceCronScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceCronScalerResponse describeServiceCronScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/cronscaler"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceCronScalerResponse());
    }

    public DescribeServiceLogResponse describeServiceLog(String ClusterId, String ServiceName, DescribeServiceLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceLogWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DescribeServiceLogResponse describeServiceLogWithOptions(String ClusterId, String ServiceName, DescribeServiceLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceLogResponse());
    }

    public DescribeServiceMirrorResponse describeServiceMirror(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceMirrorWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceMirrorResponse describeServiceMirrorWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/mirror"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMirrorResponse());
    }

    public ListResourceInstanceWorkerResponse listResourceInstanceWorker(String ClusterId, String ResourceId, String InstanceName, ListResourceInstanceWorkerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceInstanceWorkerWithOptions(ClusterId, ResourceId, InstanceName, request, headers, runtime);
    }

    public ListResourceInstanceWorkerResponse listResourceInstanceWorkerWithOptions(String ClusterId, String ResourceId, String InstanceName, ListResourceInstanceWorkerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        InstanceName = com.aliyun.openapiutil.Client.getEncodeParam(InstanceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceInstanceWorker"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/instance/" + InstanceName + "/workers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceInstanceWorkerResponse());
    }

    public ListResourceInstancesResponse listResourceInstances(String ClusterId, String ResourceId, ListResourceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public ListResourceInstancesResponse listResourceInstancesWithOptions(String ClusterId, String ResourceId, ListResourceInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceInstancesResponse());
    }

    public ListResourceServicesResponse listResourceServices(String ClusterId, String ResourceId, ListResourceServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceServicesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public ListResourceServicesResponse listResourceServicesWithOptions(String ClusterId, String ResourceId, ListResourceServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceServices"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceServicesResponse());
    }

    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(request, headers, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    public ListServiceInstancesResponse listServiceInstances(String ClusterId, String ServiceName, ListServiceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceInstancesWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public ListServiceInstancesResponse listServiceInstancesWithOptions(String ClusterId, String ServiceName, ListServiceInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstancesResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    public ReleaseServiceResponse releaseService(String ClusterId, String ServiceName, ReleaseServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public ReleaseServiceResponse releaseServiceWithOptions(String ClusterId, String ServiceName, ReleaseServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            body.put("Weight", request.weight);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/release"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseServiceResponse());
    }

    public StartServiceResponse startService(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public StartServiceResponse startServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartServiceResponse());
    }

    public StopServiceResponse stopService(String ClusterId, String ServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public StopServiceResponse stopServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopServiceResponse());
    }

    public UpdateResourceResponse updateResource(String ClusterId, String ResourceId, UpdateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public UpdateResourceResponse updateResourceWithOptions(String ClusterId, String ResourceId, UpdateResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("ResourceName", request.resourceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    public UpdateResourceDLinkResponse updateResourceDLink(String ClusterId, String ResourceId, UpdateResourceDLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceDLinkWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public UpdateResourceDLinkResponse updateResourceDLinkWithOptions(String ClusterId, String ResourceId, UpdateResourceDLinkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ResourceId = com.aliyun.openapiutil.Client.getEncodeParam(ResourceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCIDRs)) {
            body.put("DestinationCIDRs", request.destinationCIDRs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdList)) {
            body.put("VSwitchIdList", request.vSwitchIdList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceDLink"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + ClusterId + "/" + ResourceId + "/dlink"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceDLinkResponse());
    }

    public UpdateServiceResponse updateService(String ClusterId, String ServiceName, UpdateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(String ClusterId, String ServiceName, UpdateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    public UpdateServiceAutoScalerResponse updateServiceAutoScaler(String ClusterId, String ServiceName, UpdateServiceAutoScalerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceAutoScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceAutoScalerResponse updateServiceAutoScalerWithOptions(String ClusterId, String ServiceName, UpdateServiceAutoScalerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.max)) {
            body.put("Max", request.max);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.min)) {
            body.put("Min", request.min);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.strategies))) {
            body.put("Strategies", request.strategies);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/autoscaler"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceAutoScalerResponse());
    }

    public UpdateServiceCronScalerResponse updateServiceCronScaler(String ClusterId, String ServiceName, UpdateServiceCronScalerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceCronScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceCronScalerResponse updateServiceCronScalerWithOptions(String ClusterId, String ServiceName, UpdateServiceCronScalerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeDates)) {
            body.put("ExcludeDates", request.excludeDates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleJobs)) {
            body.put("ScaleJobs", request.scaleJobs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/cronscaler"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceCronScalerResponse());
    }

    public UpdateServiceMirrorResponse updateServiceMirror(String ClusterId, String ServiceName, UpdateServiceMirrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceMirrorWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceMirrorResponse updateServiceMirrorWithOptions(String ClusterId, String ServiceName, UpdateServiceMirrorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            body.put("Ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/mirror"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceMirrorResponse());
    }

    public UpdateServiceVersionResponse updateServiceVersion(String ClusterId, String ServiceName, UpdateServiceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceVersionWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceVersionResponse updateServiceVersionWithOptions(String ClusterId, String ServiceName, UpdateServiceVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        ServiceName = com.aliyun.openapiutil.Client.getEncodeParam(ServiceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceVersion"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + ClusterId + "/" + ServiceName + "/version"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceVersionResponse());
    }
}
