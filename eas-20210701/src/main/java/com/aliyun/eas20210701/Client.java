// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701;

import com.aliyun.tea.*;
import com.aliyun.eas20210701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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
            new TeaPair("us-east-1", "pai-eas.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "pai-eas.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai-eas.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai-eas.ap-south-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "pai-eas.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "pai-eas.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "pai-eas.cn-chengdu.aliyuncs.com")
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

    public CommitServiceResponse commitServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/commit"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitServiceResponse());
    }

    public CommitServiceResponse commitService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commitServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public CreateAppServiceResponse createAppServiceWithOptions(CreateAppServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            body.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSpec)) {
            body.put("ServiceSpec", request.serviceSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/app_services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppServiceResponse());
    }

    public CreateAppServiceResponse createAppService(CreateAppServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppServiceWithOptions(request, headers, runtime);
    }

    public CreateBenchmarkTaskResponse createBenchmarkTaskWithOptions(CreateBenchmarkTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBenchmarkTaskResponse());
    }

    public CreateBenchmarkTaskResponse createBenchmarkTask(CreateBenchmarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBenchmarkTaskWithOptions(request, headers, runtime);
    }

    public CreateGatewayResponse createGatewayWithOptions(CreateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableInternet)) {
            body.put("EnableInternet", request.enableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIntranet)) {
            body.put("EnableIntranet", request.enableIntranet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGateway"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayResponse());
    }

    public CreateGatewayResponse createGateway(CreateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayWithOptions(request, headers, runtime);
    }

    public CreateGatewayIntranetLinkedVpcResponse createGatewayIntranetLinkedVpcWithOptions(String ClusterId, String GatewayId, CreateGatewayIntranetLinkedVpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayIntranetLinkedVpc"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_endpoint_linked_vpc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayIntranetLinkedVpcResponse());
    }

    public CreateGatewayIntranetLinkedVpcResponse createGatewayIntranetLinkedVpc(String ClusterId, String GatewayId, CreateGatewayIntranetLinkedVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayIntranetLinkedVpcWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfManagedResourceOptions)) {
            body.put("SelfManagedResourceOptions", request.selfManagedResourceOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            body.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zone)) {
            body.put("Zone", request.zone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(request, headers, runtime);
    }

    public CreateResourceInstancesResponse createResourceInstancesWithOptions(String ClusterId, String ResourceId, CreateResourceInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            body.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zone)) {
            body.put("Zone", request.zone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceInstancesResponse());
    }

    public CreateResourceInstancesResponse createResourceInstances(String ClusterId, String ResourceId, CreateResourceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public CreateResourceLogResponse createResourceLogWithOptions(String ClusterId, String ResourceId, CreateResourceLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            body.put("LogStore", request.logStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/log"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceLogResponse());
    }

    public CreateResourceLogResponse createResourceLog(String ClusterId, String ResourceId, CreateResourceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceLogWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateServiceShrinkRequest request = new CreateServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labels)) {
            request.labelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labels, "Labels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.develop)) {
            query.put("Develop", request.develop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsShrink)) {
            query.put("Labels", request.labelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceAutoScalerResponse createServiceAutoScalerWithOptions(String ClusterId, String ServiceName, CreateServiceAutoScalerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.behavior)) {
            body.put("behavior", request.behavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.max)) {
            body.put("max", request.max);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.min)) {
            body.put("min", request.min);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStrategies)) {
            body.put("scaleStrategies", request.scaleStrategies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/autoscaler"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceAutoScalerResponse());
    }

    public CreateServiceAutoScalerResponse createServiceAutoScaler(String ClusterId, String ServiceName, CreateServiceAutoScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceAutoScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public CreateServiceCronScalerResponse createServiceCronScalerWithOptions(String ClusterId, String ServiceName, CreateServiceCronScalerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeDates)) {
            body.put("ExcludeDates", request.excludeDates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleJobs)) {
            body.put("ScaleJobs", request.scaleJobs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/cronscaler"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceCronScalerResponse());
    }

    public CreateServiceCronScalerResponse createServiceCronScaler(String ClusterId, String ServiceName, CreateServiceCronScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceCronScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public CreateServiceMirrorResponse createServiceMirrorWithOptions(String ClusterId, String ServiceName, CreateServiceMirrorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            body.put("Ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/mirror"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceMirrorResponse());
    }

    public CreateServiceMirrorResponse createServiceMirror(String ClusterId, String ServiceName, CreateServiceMirrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceMirrorWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DeleteBenchmarkTaskResponse deleteBenchmarkTaskWithOptions(String ClusterId, String TaskName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBenchmarkTaskResponse());
    }

    public DeleteBenchmarkTaskResponse deleteBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    public DeleteGatewayResponse deleteGatewayWithOptions(String ClusterId, String GatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    public DeleteGatewayResponse deleteGateway(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    public DeleteGatewayIntranetLinkedVpcResponse deleteGatewayIntranetLinkedVpcWithOptions(String ClusterId, String GatewayId, DeleteGatewayIntranetLinkedVpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayIntranetLinkedVpc"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_endpoint_linked_vpc"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayIntranetLinkedVpcResponse());
    }

    public DeleteGatewayIntranetLinkedVpcResponse deleteGatewayIntranetLinkedVpc(String ClusterId, String GatewayId, DeleteGatewayIntranetLinkedVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayIntranetLinkedVpcWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    public DeleteResourceResponse deleteResourceWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    public DeleteResourceResponse deleteResource(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DeleteResourceDLinkResponse deleteResourceDLinkWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceDLink"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/dlink"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceDLinkResponse());
    }

    public DeleteResourceDLinkResponse deleteResourceDLink(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceDLinkWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DeleteResourceInstancesResponse deleteResourceInstancesWithOptions(String ClusterId, String ResourceId, DeleteResourceInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allFailed)) {
            query.put("AllFailed", request.allFailed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/instances"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceInstancesResponse());
    }

    public DeleteResourceInstancesResponse deleteResourceInstances(String ClusterId, String ResourceId, DeleteResourceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public DeleteResourceLogResponse deleteResourceLogWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/log"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceLogResponse());
    }

    public DeleteResourceLogResponse deleteResourceLog(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceLogWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceResponse deleteService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceAutoScalerResponse deleteServiceAutoScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/autoscaler"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceAutoScalerResponse());
    }

    public DeleteServiceAutoScalerResponse deleteServiceAutoScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceAutoScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceCronScalerResponse deleteServiceCronScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/cronscaler"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceCronScalerResponse());
    }

    public DeleteServiceCronScalerResponse deleteServiceCronScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceCronScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DeleteServiceInstancesResponse deleteServiceInstancesWithOptions(String ClusterId, String ServiceName, DeleteServiceInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.container)) {
            query.put("Container", request.container);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softRestart)) {
            query.put("SoftRestart", request.softRestart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceInstancesResponse());
    }

    public DeleteServiceInstancesResponse deleteServiceInstances(String ClusterId, String ServiceName, DeleteServiceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceInstancesWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DeleteServiceLabelResponse deleteServiceLabelWithOptions(String ClusterId, String ServiceName, DeleteServiceLabelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteServiceLabelShrinkRequest request = new DeleteServiceLabelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceLabel"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/label"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceLabelResponse());
    }

    public DeleteServiceLabelResponse deleteServiceLabel(String ClusterId, String ServiceName, DeleteServiceLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceLabelWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DeleteServiceMirrorResponse deleteServiceMirrorWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/mirror"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceMirrorResponse());
    }

    public DeleteServiceMirrorResponse deleteServiceMirror(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceMirrorWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeBenchmarkTaskResponse describeBenchmarkTaskWithOptions(String ClusterId, String TaskName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBenchmarkTaskResponse());
    }

    public DescribeBenchmarkTaskResponse describeBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    public DescribeBenchmarkTaskReportResponse describeBenchmarkTaskReportWithOptions(String ClusterId, String TaskName, DescribeBenchmarkTaskReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBenchmarkTaskReport"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskName) + "/report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBenchmarkTaskReportResponse());
    }

    public DescribeBenchmarkTaskReportResponse describeBenchmarkTaskReport(String ClusterId, String TaskName, DescribeBenchmarkTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBenchmarkTaskReportWithOptions(ClusterId, TaskName, request, headers, runtime);
    }

    public DescribeGatewayResponse describeGatewayWithOptions(String ClusterId, String GatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGateway"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayResponse());
    }

    public DescribeGatewayResponse describeGateway(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGatewayWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    public DescribeGroupResponse describeGroupWithOptions(String ClusterId, String GroupName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroup"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupResponse());
    }

    public DescribeGroupResponse describeGroup(String ClusterId, String GroupName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGroupWithOptions(ClusterId, GroupName, headers, runtime);
    }

    public DescribeResourceResponse describeResourceWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceResponse());
    }

    public DescribeResourceResponse describeResource(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DescribeResourceDLinkResponse describeResourceDLinkWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceDLink"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/dlink"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceDLinkResponse());
    }

    public DescribeResourceDLinkResponse describeResourceDLink(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceDLinkWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DescribeResourceLogResponse describeResourceLogWithOptions(String ClusterId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceLogResponse());
    }

    public DescribeResourceLogResponse describeResourceLog(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceLogWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    public DescribeServiceResponse describeServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceResponse());
    }

    public DescribeServiceResponse describeService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceAutoScalerResponse describeServiceAutoScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/autoscaler"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceAutoScalerResponse());
    }

    public DescribeServiceAutoScalerResponse describeServiceAutoScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceAutoScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceCronScalerResponse describeServiceCronScalerWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/cronscaler"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceCronScalerResponse());
    }

    public DescribeServiceCronScalerResponse describeServiceCronScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceCronScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceDiagnosisResponse describeServiceDiagnosisWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceDiagnosis"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/diagnosis"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceDiagnosisResponse());
    }

    public DescribeServiceDiagnosisResponse describeServiceDiagnosis(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceDiagnosisWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DescribeServiceEventResponse describeServiceEventWithOptions(String ClusterId, String ServiceName, DescribeServiceEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceEvent"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceEventResponse());
    }

    public DescribeServiceEventResponse describeServiceEvent(String ClusterId, String ServiceName, DescribeServiceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceEventWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DescribeServiceInstanceDiagnosisResponse describeServiceInstanceDiagnosisWithOptions(String ClusterId, String ServiceName, String InstanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceInstanceDiagnosis"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/diagnosis"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceInstanceDiagnosisResponse());
    }

    public DescribeServiceInstanceDiagnosisResponse describeServiceInstanceDiagnosis(String ClusterId, String ServiceName, String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceInstanceDiagnosisWithOptions(ClusterId, ServiceName, InstanceName, headers, runtime);
    }

    public DescribeServiceLogResponse describeServiceLogWithOptions(String ClusterId, String ServiceName, DescribeServiceLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerName)) {
            query.put("ContainerName", request.containerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.previous)) {
            query.put("Previous", request.previous);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceLog"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceLogResponse());
    }

    public DescribeServiceLogResponse describeServiceLog(String ClusterId, String ServiceName, DescribeServiceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceLogWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public DescribeServiceMirrorResponse describeServiceMirrorWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/mirror"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMirrorResponse());
    }

    public DescribeServiceMirrorResponse describeServiceMirror(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceMirrorWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public DevelopServiceResponse developServiceWithOptions(String ClusterId, String ServiceName, DevelopServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exit)) {
            query.put("Exit", request.exit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DevelopService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/develop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DevelopServiceResponse());
    }

    public DevelopServiceResponse developService(String ClusterId, String ServiceName, DevelopServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.developServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public ListBenchmarkTaskResponse listBenchmarkTaskWithOptions(ListBenchmarkTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBenchmarkTaskResponse());
    }

    public ListBenchmarkTaskResponse listBenchmarkTask(ListBenchmarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBenchmarkTaskWithOptions(request, headers, runtime);
    }

    public ListGatewayIntranetLinkedVpcResponse listGatewayIntranetLinkedVpcWithOptions(String ClusterId, String GatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayIntranetLinkedVpc"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_endpoint_linked_vpc"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayIntranetLinkedVpcResponse());
    }

    public ListGatewayIntranetLinkedVpcResponse listGatewayIntranetLinkedVpc(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayIntranetLinkedVpcWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsResponse());
    }

    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupsWithOptions(request, headers, runtime);
    }

    public ListResourceInstanceWorkerResponse listResourceInstanceWorkerWithOptions(String ClusterId, String ResourceId, String InstanceName, ListResourceInstanceWorkerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceInstanceWorker"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/workers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceInstanceWorkerResponse());
    }

    public ListResourceInstanceWorkerResponse listResourceInstanceWorker(String ClusterId, String ResourceId, String InstanceName, ListResourceInstanceWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceInstanceWorkerWithOptions(ClusterId, ResourceId, InstanceName, request, headers, runtime);
    }

    public ListResourceInstancesResponse listResourceInstancesWithOptions(String ClusterId, String ResourceId, ListResourceInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIP)) {
            query.put("InstanceIP", request.instanceIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceInstancesResponse());
    }

    public ListResourceInstancesResponse listResourceInstances(String ClusterId, String ResourceId, ListResourceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public ListResourceServicesResponse listResourceServicesWithOptions(String ClusterId, String ResourceId, ListResourceServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceServices"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceServicesResponse());
    }

    public ListResourceServicesResponse listResourceServices(String ClusterId, String ResourceId, ListResourceServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceServicesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(request, headers, runtime);
    }

    public ListServiceContainersResponse listServiceContainersWithOptions(String ClusterId, String ServiceName, String InstanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceContainers"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/containers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceContainersResponse());
    }

    public ListServiceContainersResponse listServiceContainers(String ClusterId, String ServiceName, String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceContainersWithOptions(ClusterId, ServiceName, InstanceName, headers, runtime);
    }

    public ListServiceInstancesResponse listServiceInstancesWithOptions(String ClusterId, String ServiceName, ListServiceInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostIP)) {
            query.put("HostIP", request.hostIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIP)) {
            query.put("InstanceIP", request.instanceIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSpot)) {
            query.put("IsSpot", request.isSpot);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstances"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstancesResponse());
    }

    public ListServiceInstancesResponse listServiceInstances(String ClusterId, String ServiceName, ListServiceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceInstancesWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public ListServiceVersionsResponse listServiceVersionsWithOptions(String ClusterId, String ServiceName, ListServiceVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceVersions"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceVersionsResponse());
    }

    public ListServiceVersionsResponse listServiceVersions(String ClusterId, String ServiceName, ListServiceVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceVersionsWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListServicesShrinkRequest request = new ListServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.label)) {
            request.labelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.label, "Label", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelShrink)) {
            query.put("Label", request.labelShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.parentServiceUid)) {
            query.put("ParentServiceUid", request.parentServiceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            query.put("ServiceStatus", request.serviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceUid)) {
            query.put("ServiceUid", request.serviceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ReleaseServiceResponse releaseServiceWithOptions(String ClusterId, String ServiceName, ReleaseServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trafficState)) {
            body.put("TrafficState", request.trafficState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            body.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/release"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseServiceResponse());
    }

    public ReleaseServiceResponse releaseService(String ClusterId, String ServiceName, ReleaseServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public RestartServiceResponse restartServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/restart"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartServiceResponse());
    }

    public RestartServiceResponse restartService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public StartBenchmarkTaskResponse startBenchmarkTaskWithOptions(String ClusterId, String TaskName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskName) + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartBenchmarkTaskResponse());
    }

    public StartBenchmarkTaskResponse startBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    public StartServiceResponse startServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartServiceResponse());
    }

    public StartServiceResponse startService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public StopBenchmarkTaskResponse stopBenchmarkTaskWithOptions(String ClusterId, String TaskName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskName) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopBenchmarkTaskResponse());
    }

    public StopBenchmarkTaskResponse stopBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    public StopServiceResponse stopServiceWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopServiceResponse());
    }

    public StopServiceResponse stopService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    public UpdateAppServiceResponse updateAppServiceWithOptions(String ClusterId, String ServiceName, UpdateAppServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            body.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSpec)) {
            body.put("ServiceSpec", request.serviceSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/app_services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppServiceResponse());
    }

    public UpdateAppServiceResponse updateAppService(String ClusterId, String ServiceName, UpdateAppServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateBenchmarkTaskResponse updateBenchmarkTaskWithOptions(String ClusterId, String TaskName, UpdateBenchmarkTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBenchmarkTask"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/benchmark-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBenchmarkTaskResponse());
    }

    public UpdateBenchmarkTaskResponse updateBenchmarkTask(String ClusterId, String TaskName, UpdateBenchmarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBenchmarkTaskWithOptions(ClusterId, TaskName, request, headers, runtime);
    }

    public UpdateGatewayResponse updateGatewayWithOptions(String GatewayId, String ClusterId, UpdateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableInternet)) {
            body.put("EnableInternet", request.enableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIntranet)) {
            body.put("EnableIntranet", request.enableIntranet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGateway"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayResponse());
    }

    public UpdateGatewayResponse updateGateway(String GatewayId, String ClusterId, UpdateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayWithOptions(GatewayId, ClusterId, request, headers, runtime);
    }

    public UpdateResourceResponse updateResourceWithOptions(String ClusterId, String ResourceId, UpdateResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfManagedResourceOptions)) {
            body.put("SelfManagedResourceOptions", request.selfManagedResourceOptions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    public UpdateResourceResponse updateResource(String ClusterId, String ResourceId, UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public UpdateResourceDLinkResponse updateResourceDLinkWithOptions(String ClusterId, String ResourceId, UpdateResourceDLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceDLink"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/dlink"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceDLinkResponse());
    }

    public UpdateResourceDLinkResponse updateResourceDLink(String ClusterId, String ResourceId, UpdateResourceDLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceDLinkWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    public UpdateResourceInstanceResponse updateResourceInstanceWithOptions(String ClusterId, String ResourceId, String InstanceId, UpdateResourceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("Action", request.action);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceInstance"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceInstanceResponse());
    }

    public UpdateResourceInstanceResponse updateResourceInstance(String ClusterId, String ResourceId, String InstanceId, UpdateResourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceInstanceWithOptions(ClusterId, ResourceId, InstanceId, request, headers, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(String ClusterId, String ServiceName, UpdateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    public UpdateServiceResponse updateService(String ClusterId, String ServiceName, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceAutoScalerResponse updateServiceAutoScalerWithOptions(String ClusterId, String ServiceName, UpdateServiceAutoScalerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.behavior)) {
            body.put("behavior", request.behavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.max)) {
            body.put("max", request.max);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.min)) {
            body.put("min", request.min);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStrategies)) {
            body.put("scaleStrategies", request.scaleStrategies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceAutoScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/autoscaler"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceAutoScalerResponse());
    }

    public UpdateServiceAutoScalerResponse updateServiceAutoScaler(String ClusterId, String ServiceName, UpdateServiceAutoScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceAutoScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceCronScalerResponse updateServiceCronScalerWithOptions(String ClusterId, String ServiceName, UpdateServiceCronScalerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeDates)) {
            body.put("ExcludeDates", request.excludeDates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleJobs)) {
            body.put("ScaleJobs", request.scaleJobs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceCronScaler"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/cronscaler"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceCronScalerResponse());
    }

    public UpdateServiceCronScalerResponse updateServiceCronScaler(String ClusterId, String ServiceName, UpdateServiceCronScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceCronScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceInstanceResponse updateServiceInstanceWithOptions(String ClusterId, String ServiceName, String InstanceName, UpdateServiceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolate)) {
            body.put("Isolate", request.isolate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceInstance"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceInstanceResponse());
    }

    public UpdateServiceInstanceResponse updateServiceInstance(String ClusterId, String ServiceName, String InstanceName, UpdateServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceInstanceWithOptions(ClusterId, ServiceName, InstanceName, request, headers, runtime);
    }

    public UpdateServiceLabelResponse updateServiceLabelWithOptions(String ClusterId, String ServiceName, UpdateServiceLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceLabel"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/label"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceLabelResponse());
    }

    public UpdateServiceLabelResponse updateServiceLabel(String ClusterId, String ServiceName, UpdateServiceLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceLabelWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceMirrorResponse updateServiceMirrorWithOptions(String ClusterId, String ServiceName, UpdateServiceMirrorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            body.put("Ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceMirror"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/mirror"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceMirrorResponse());
    }

    public UpdateServiceMirrorResponse updateServiceMirror(String ClusterId, String ServiceName, UpdateServiceMirrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceMirrorWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceSafetyLockResponse updateServiceSafetyLockWithOptions(String ClusterId, String ServiceName, UpdateServiceSafetyLockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lock)) {
            body.put("Lock", request.lock);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceSafetyLock"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/lock"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceSafetyLockResponse());
    }

    public UpdateServiceSafetyLockResponse updateServiceSafetyLock(String ClusterId, String ServiceName, UpdateServiceSafetyLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceSafetyLockWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    public UpdateServiceVersionResponse updateServiceVersionWithOptions(String ClusterId, String ServiceName, UpdateServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceVersion"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/version"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceVersionResponse());
    }

    public UpdateServiceVersionResponse updateServiceVersion(String ClusterId, String ServiceName, UpdateServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceVersionWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }
}
