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

    /**
     * <b>summary</b> : 
     * <p>Binds a custom domain name to a private gateway.</p>
     * 
     * @param tmpReq AttachGatewayDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachGatewayDomainResponse
     */
    public AttachGatewayDomainResponse attachGatewayDomainWithOptions(String ClusterId, String GatewayId, AttachGatewayDomainRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachGatewayDomainShrinkRequest request = new AttachGatewayDomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customDomain)) {
            request.customDomainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customDomain, "CustomDomain", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customDomainShrink)) {
            query.put("CustomDomain", request.customDomainShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachGatewayDomain"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/domain/attach"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachGatewayDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a custom domain name to a private gateway.</p>
     * 
     * @param request AttachGatewayDomainRequest
     * @return AttachGatewayDomainResponse
     */
    public AttachGatewayDomainResponse attachGatewayDomain(String ClusterId, String GatewayId, AttachGatewayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachGatewayDomainWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clones a service.</p>
     * 
     * @param tmpReq CloneServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneServiceResponse
     */
    public CloneServiceResponse cloneServiceWithOptions(String ClusterId, String ServiceName, CloneServiceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CloneServiceShrinkRequest request = new CloneServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labels)) {
            request.labelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labels, "Labels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelsShrink)) {
            query.put("Labels", request.labelsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneService"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clones a service.</p>
     * 
     * @param request CloneServiceRequest
     * @return CloneServiceResponse
     */
    public CloneServiceResponse cloneService(String ClusterId, String ServiceName, CloneServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Commits the Worker0 container in the custom container service and deploys the container as a new image.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommitServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Commits the Worker0 container in the custom container service and deploys the container as a new image.</p>
     * @return CommitServiceResponse
     */
    public CommitServiceResponse commitService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commitServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL) for a private gateway. The IP CIDR blocks added to the ACL can access the private gateway.</p>
     * 
     * @param tmpReq CreateAclPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAclPolicyResponse
     */
    public CreateAclPolicyResponse createAclPolicyWithOptions(String ClusterId, String GatewayId, CreateAclPolicyRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAclPolicyShrinkRequest request = new CreateAclPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aclPolicyList)) {
            request.aclPolicyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aclPolicyList, "AclPolicyList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclPolicyListShrink)) {
            query.put("AclPolicyList", request.aclPolicyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAclPolicy"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/acl_policy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAclPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL) for a private gateway. The IP CIDR blocks added to the ACL can access the private gateway.</p>
     * 
     * @param request CreateAclPolicyRequest
     * @return CreateAclPolicyResponse
     */
    public CreateAclPolicyResponse createAclPolicy(String ClusterId, String GatewayId, CreateAclPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAclPolicyWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application service to obtain the inference capabilities of large models.</p>
     * 
     * @param request CreateAppServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates an application service to obtain the inference capabilities of large models.</p>
     * 
     * @param request CreateAppServiceRequest
     * @return CreateAppServiceResponse
     */
    public CreateAppServiceResponse createAppService(CreateAppServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a stress testing task.</p>
     * 
     * @param request CreateBenchmarkTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBenchmarkTaskResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a stress testing task.</p>
     * 
     * @param request CreateBenchmarkTaskRequest
     * @return CreateBenchmarkTaskResponse
     */
    public CreateBenchmarkTaskResponse createBenchmarkTask(CreateBenchmarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBenchmarkTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建故障注入任务</p>
     * 
     * @param request CreateFaultInjectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFaultInjectionResponse
     */
    public CreateFaultInjectionResponse createFaultInjectionWithOptions(String ClusterId, String ServiceName, String InstanceName, CreateFaultInjectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faultArgs)) {
            body.put("FaultArgs", request.faultArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultType)) {
            body.put("FaultType", request.faultType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFaultInjection"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/faults"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFaultInjectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建故障注入任务</p>
     * 
     * @param request CreateFaultInjectionRequest
     * @return CreateFaultInjectionResponse
     */
    public CreateFaultInjectionResponse createFaultInjection(String ClusterId, String ServiceName, String InstanceName, CreateFaultInjectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFaultInjectionWithOptions(ClusterId, ServiceName, InstanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a gateway.</p>
     * 
     * @param request CreateGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayResponse
     */
    public CreateGatewayResponse createGatewayWithOptions(CreateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewal)) {
            body.put("AutoRenewal", request.autoRenewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternet)) {
            body.put("EnableInternet", request.enableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIntranet)) {
            body.put("EnableIntranet", request.enableIntranet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            body.put("Replicas", request.replicas);
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

    /**
     * <b>summary</b> : 
     * <p>Creates a gateway.</p>
     * 
     * @param request CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    public CreateGatewayResponse createGateway(CreateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an internal endpoint of a private gateway.</p>
     * 
     * @param request CreateGatewayIntranetLinkedVpcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayIntranetLinkedVpcResponse
     */
    public CreateGatewayIntranetLinkedVpcResponse createGatewayIntranetLinkedVpcWithOptions(String ClusterId, String GatewayId, CreateGatewayIntranetLinkedVpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthoritativeDns)) {
            query.put("EnableAuthoritativeDns", request.enableAuthoritativeDns);
        }

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

    /**
     * <b>summary</b> : 
     * <p>Creates an internal endpoint of a private gateway.</p>
     * 
     * @param request CreateGatewayIntranetLinkedVpcRequest
     * @return CreateGatewayIntranetLinkedVpcResponse
     */
    public CreateGatewayIntranetLinkedVpcResponse createGatewayIntranetLinkedVpc(String ClusterId, String GatewayId, CreateGatewayIntranetLinkedVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayIntranetLinkedVpcWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a VPC peering connection on an internal endpoint of a gateway.</p>
     * 
     * @param tmpReq CreateGatewayIntranetLinkedVpcPeerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayIntranetLinkedVpcPeerResponse
     */
    public CreateGatewayIntranetLinkedVpcPeerResponse createGatewayIntranetLinkedVpcPeerWithOptions(String ClusterId, String GatewayId, CreateGatewayIntranetLinkedVpcPeerRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateGatewayIntranetLinkedVpcPeerShrinkRequest request = new CreateGatewayIntranetLinkedVpcPeerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.peerVpcs)) {
            request.peerVpcsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.peerVpcs, "PeerVpcs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcsShrink)) {
            query.put("PeerVpcs", request.peerVpcsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayIntranetLinkedVpcPeer"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_endpoint_linked_vpc_peer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayIntranetLinkedVpcPeerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a VPC peering connection on an internal endpoint of a gateway.</p>
     * 
     * @param request CreateGatewayIntranetLinkedVpcPeerRequest
     * @return CreateGatewayIntranetLinkedVpcPeerResponse
     */
    public CreateGatewayIntranetLinkedVpcPeerResponse createGatewayIntranetLinkedVpcPeer(String ClusterId, String GatewayId, CreateGatewayIntranetLinkedVpcPeerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayIntranetLinkedVpcPeerWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/144261.html">billing</a> of Elastic Algorithm Service (EAS).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("ResourceName", request.resourceName);
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

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/144261.html">billing</a> of Elastic Algorithm Service (EAS).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates instances in a dedicated resource group.</p>
     * 
     * @param request CreateResourceInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceInstancesResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
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

    /**
     * <b>summary</b> : 
     * <p>Creates instances in a dedicated resource group.</p>
     * 
     * @param request CreateResourceInstancesRequest
     * @return CreateResourceInstancesResponse
     */
    public CreateResourceInstancesResponse createResourceInstances(String ClusterId, String ResourceId, CreateResourceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the LogShipper feature of Log Service for a resource group.</p>
     * 
     * @param request CreateResourceLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceLogResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables the LogShipper feature of Log Service for a resource group.</p>
     * 
     * @param request CreateResourceLogRequest
     * @return CreateResourceLogResponse
     */
    public CreateResourceLogResponse createResourceLog(String ClusterId, String ResourceId, CreateResourceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceLogWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/144261.html">billing</a> of Elastic Algorithm Service (EAS).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model service in Elastic Algorithm Service (EAS).</p>
     * 
     * @param tmpReq CreateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceResponse
     */
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

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/144261.html">billing</a> of Elastic Algorithm Service (EAS).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model service in Elastic Algorithm Service (EAS).</p>
     * 
     * @param request CreateServiceRequest
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Autoscaler feature and creates an Autoscaler controller for a service.</p>
     * 
     * @param request CreateServiceAutoScalerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceAutoScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables the Autoscaler feature and creates an Autoscaler controller for a service.</p>
     * 
     * @param request CreateServiceAutoScalerRequest
     * @return CreateServiceAutoScalerResponse
     */
    public CreateServiceAutoScalerResponse createServiceAutoScaler(String ClusterId, String ServiceName, CreateServiceAutoScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceAutoScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Cron Horizontal Pod Autoscaler (CronHPA) feature for a service.</p>
     * 
     * @param request CreateServiceCronScalerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceCronScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables the Cron Horizontal Pod Autoscaler (CronHPA) feature for a service.</p>
     * 
     * @param request CreateServiceCronScalerRequest
     * @return CreateServiceCronScalerResponse
     */
    public CreateServiceCronScalerResponse createServiceCronScaler(String ClusterId, String ServiceName, CreateServiceCronScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceCronScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the traffic mirroring feature for a service. After the feature is enabled, requests received by the service can be mirrored to another service.</p>
     * 
     * @param request CreateServiceMirrorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceMirrorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables the traffic mirroring feature for a service. After the feature is enabled, requests received by the service can be mirrored to another service.</p>
     * 
     * @param request CreateServiceMirrorRequest
     * @return CreateServiceMirrorResponse
     */
    public CreateServiceMirrorResponse createServiceMirror(String ClusterId, String ServiceName, CreateServiceMirrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceMirrorWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual resource group.</p>
     * 
     * @param request CreateVirtualResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualResourceResponse
     */
    public CreateVirtualResourceResponse createVirtualResourceWithOptions(CreateVirtualResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableSpotProtectionPeriod)) {
            body.put("DisableSpotProtectionPeriod", request.disableSpotProtectionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualResourceName)) {
            body.put("VirtualResourceName", request.virtualResourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/virtualresources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual resource group.</p>
     * 
     * @param request CreateVirtualResourceRequest
     * @return CreateVirtualResourceResponse
     */
    public CreateVirtualResourceResponse createVirtualResource(CreateVirtualResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVirtualResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control list (ACL) for a private gateway. The IP CIDR block that is deleted from the ACL cannot access the private gateway.</p>
     * 
     * @param tmpReq DeleteAclPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAclPolicyResponse
     */
    public DeleteAclPolicyResponse deleteAclPolicyWithOptions(String ClusterId, String GatewayId, DeleteAclPolicyRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAclPolicyShrinkRequest request = new DeleteAclPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aclPolicyList)) {
            request.aclPolicyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aclPolicyList, "AclPolicyList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclPolicyListShrink)) {
            query.put("AclPolicyList", request.aclPolicyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAclPolicy"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/acl_policy"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAclPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control list (ACL) for a private gateway. The IP CIDR block that is deleted from the ACL cannot access the private gateway.</p>
     * 
     * @param request DeleteAclPolicyRequest
     * @return DeleteAclPolicyResponse
     */
    public DeleteAclPolicyResponse deleteAclPolicy(String ClusterId, String GatewayId, DeleteAclPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAclPolicyWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a stress testing task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBenchmarkTaskResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a stress testing task.</p>
     * @return DeleteBenchmarkTaskResponse
     */
    public DeleteBenchmarkTaskResponse deleteBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除故障注入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaultInjectionResponse
     */
    public DeleteFaultInjectionResponse deleteFaultInjectionWithOptions(String ClusterId, String ServiceName, String InstanceName, String FaultType, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaultInjection"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/faults/" + com.aliyun.openapiutil.Client.getEncodeParam(FaultType) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaultInjectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除故障注入任务</p>
     * @return DeleteFaultInjectionResponse
     */
    public DeleteFaultInjectionResponse deleteFaultInjection(String ClusterId, String ServiceName, String InstanceName, String FaultType) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFaultInjectionWithOptions(ClusterId, ServiceName, InstanceName, FaultType, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a private gateway.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a private gateway.</p>
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGateway(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除网关内网访问端点</p>
     * 
     * @param request DeleteGatewayIntranetLinkedVpcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayIntranetLinkedVpcResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>删除网关内网访问端点</p>
     * 
     * @param request DeleteGatewayIntranetLinkedVpcRequest
     * @return DeleteGatewayIntranetLinkedVpcResponse
     */
    public DeleteGatewayIntranetLinkedVpcResponse deleteGatewayIntranetLinkedVpc(String ClusterId, String GatewayId, DeleteGatewayIntranetLinkedVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayIntranetLinkedVpcWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a VPC peering connection from an internal endpoint of a gateway.</p>
     * 
     * @param tmpReq DeleteGatewayIntranetLinkedVpcPeerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayIntranetLinkedVpcPeerResponse
     */
    public DeleteGatewayIntranetLinkedVpcPeerResponse deleteGatewayIntranetLinkedVpcPeerWithOptions(String ClusterId, String GatewayId, DeleteGatewayIntranetLinkedVpcPeerRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteGatewayIntranetLinkedVpcPeerShrinkRequest request = new DeleteGatewayIntranetLinkedVpcPeerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.peerVpcs)) {
            request.peerVpcsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.peerVpcs, "PeerVpcs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcsShrink)) {
            query.put("PeerVpcs", request.peerVpcsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayIntranetLinkedVpcPeer"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_endpoint_linked_vpc_peer"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayIntranetLinkedVpcPeerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a VPC peering connection from an internal endpoint of a gateway.</p>
     * 
     * @param request DeleteGatewayIntranetLinkedVpcPeerRequest
     * @return DeleteGatewayIntranetLinkedVpcPeerResponse
     */
    public DeleteGatewayIntranetLinkedVpcPeerResponse deleteGatewayIntranetLinkedVpcPeer(String ClusterId, String GatewayId, DeleteGatewayIntranetLinkedVpcPeerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayIntranetLinkedVpcPeerWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource group that contains no resources or instances.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource group that contains no resources or instances.</p>
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the virtual private cloud (VPC) direct connection feature for a dedicated resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceDLinkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Disables the virtual private cloud (VPC) direct connection feature for a dedicated resource group.</p>
     * @return DeleteResourceDLinkResponse
     */
    public DeleteResourceDLinkResponse deleteResourceDLink(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceDLinkWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the tags of an instance in a resource group.</p>
     * 
     * @param tmpReq DeleteResourceInstanceLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceInstanceLabelResponse
     */
    public DeleteResourceInstanceLabelResponse deleteResourceInstanceLabelWithOptions(String ClusterId, String ResourceId, DeleteResourceInstanceLabelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteResourceInstanceLabelShrinkRequest request = new DeleteResourceInstanceLabelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelKeys)) {
            request.labelKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelKeys, "LabelKeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allInstances)) {
            query.put("AllInstances", request.allInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelKeysShrink)) {
            query.put("LabelKeys", request.labelKeysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceInstanceLabel"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/label"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceInstanceLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the tags of an instance in a resource group.</p>
     * 
     * @param request DeleteResourceInstanceLabelRequest
     * @return DeleteResourceInstanceLabelResponse
     */
    public DeleteResourceInstanceLabelResponse deleteResourceInstanceLabel(String ClusterId, String ResourceId, DeleteResourceInstanceLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceInstanceLabelWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes instances in a dedicated resource group. You can delete only pay-as-you-go instances as a regular user.</p>
     * 
     * @param request DeleteResourceInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceInstancesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes instances in a dedicated resource group. You can delete only pay-as-you-go instances as a regular user.</p>
     * 
     * @param request DeleteResourceInstancesRequest
     * @return DeleteResourceInstancesResponse
     */
    public DeleteResourceInstancesResponse deleteResourceInstances(String ClusterId, String ResourceId, DeleteResourceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the LogShipper feature of Log Service for a dedicated resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceLogResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Disables the LogShipper feature of Log Service for a dedicated resource group.</p>
     * @return DeleteResourceLogResponse
     */
    public DeleteResourceLogResponse deleteResourceLog(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceLogWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the existing Autoscaler controller and disables the Autoscaler feature for a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceAutoScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes the existing Autoscaler controller and disables the Autoscaler feature for a service.</p>
     * @return DeleteServiceAutoScalerResponse
     */
    public DeleteServiceAutoScalerResponse deleteServiceAutoScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceAutoScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the Cronscaler feature for a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceCronScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Disables the Cronscaler feature for a service.</p>
     * @return DeleteServiceCronScalerResponse
     */
    public DeleteServiceCronScalerResponse deleteServiceCronScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceCronScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts the instances of a service.</p>
     * 
     * @param request DeleteServiceInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceInstancesResponse
     */
    public DeleteServiceInstancesResponse deleteServiceInstancesWithOptions(String ClusterId, String ServiceName, DeleteServiceInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.container)) {
            query.put("Container", request.container);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReplica)) {
            query.put("IsReplica", request.isReplica);
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

    /**
     * <b>summary</b> : 
     * <p>Restarts the instances of a service.</p>
     * 
     * @param request DeleteServiceInstancesRequest
     * @return DeleteServiceInstancesResponse
     */
    public DeleteServiceInstancesResponse deleteServiceInstances(String ClusterId, String ServiceName, DeleteServiceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceInstancesWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes existing service tags.</p>
     * 
     * @param tmpReq DeleteServiceLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceLabelResponse
     */
    public DeleteServiceLabelResponse deleteServiceLabelWithOptions(String ClusterId, String ServiceName, DeleteServiceLabelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteServiceLabelShrinkRequest request = new DeleteServiceLabelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelKeys)) {
            request.labelKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelKeys, "LabelKeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelKeysShrink)) {
            query.put("LabelKeys", request.labelKeysShrink);
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

    /**
     * <b>summary</b> : 
     * <p>Deletes existing service tags.</p>
     * 
     * @param request DeleteServiceLabelRequest
     * @return DeleteServiceLabelResponse
     */
    public DeleteServiceLabelResponse deleteServiceLabel(String ClusterId, String ServiceName, DeleteServiceLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceLabelWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the traffic mirroring feature for a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceMirrorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Disables the traffic mirroring feature for a service.</p>
     * @return DeleteServiceMirrorResponse
     */
    public DeleteServiceMirrorResponse deleteServiceMirror(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceMirrorWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual resource group that contains no resources or instances.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualResourceResponse
     */
    public DeleteVirtualResourceResponse deleteVirtualResourceWithOptions(String ClusterId, String VirtualResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/virtualresources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(VirtualResourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual resource group that contains no resources or instances.</p>
     * @return DeleteVirtualResourceResponse
     */
    public DeleteVirtualResourceResponse deleteVirtualResource(String ClusterId, String VirtualResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVirtualResourceWithOptions(ClusterId, VirtualResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about the configurations of a stress testing task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBenchmarkTaskResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries details about the configurations of a stress testing task.</p>
     * @return DescribeBenchmarkTaskResponse
     */
    public DescribeBenchmarkTaskResponse describeBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the report of a stress testing task.</p>
     * 
     * @param request DescribeBenchmarkTaskReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBenchmarkTaskReportResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the report of a stress testing task.</p>
     * 
     * @param request DescribeBenchmarkTaskReportRequest
     * @return DescribeBenchmarkTaskReportResponse
     */
    public DescribeBenchmarkTaskReportResponse describeBenchmarkTaskReport(String ClusterId, String TaskName, DescribeBenchmarkTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBenchmarkTaskReportWithOptions(ClusterId, TaskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a private gateway.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGatewayResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a private gateway.</p>
     * @return DescribeGatewayResponse
     */
    public DescribeGatewayResponse describeGateway(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGatewayWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a service group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a service group.</p>
     * @return DescribeGroupResponse
     */
    public DescribeGroupResponse describeGroup(String ClusterId, String GroupName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGroupWithOptions(ClusterId, GroupName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of endpoints of service groups.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupEndpointsResponse
     */
    public DescribeGroupEndpointsResponse describeGroupEndpointsWithOptions(String ClusterId, String GroupName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupEndpoints"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupName) + "/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of endpoints of service groups.</p>
     * @return DescribeGroupEndpointsResponse
     */
    public DescribeGroupEndpointsResponse describeGroupEndpoints(String ClusterId, String GroupName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGroupEndpointsWithOptions(ClusterId, GroupName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instance types for an available instance in a shared resource group.</p>
     * 
     * @param tmpReq DescribeMachineSpecRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMachineSpecResponse
     */
    public DescribeMachineSpecResponse describeMachineSpecWithOptions(DescribeMachineSpecRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeMachineSpecShrinkRequest request = new DescribeMachineSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceTypes)) {
            request.instanceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceTypes, "InstanceTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypesShrink)) {
            query.put("InstanceTypes", request.instanceTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMachineSpec"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/public/instance_types"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMachineSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instance types for an available instance in a shared resource group.</p>
     * 
     * @param request DescribeMachineSpecRequest
     * @return DescribeMachineSpecResponse
     */
    public DescribeMachineSpecResponse describeMachineSpec(DescribeMachineSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeMachineSpecWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a resource group.</p>
     * @return DescribeResourceResponse
     */
    public DescribeResourceResponse describeResource(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed configurations about a virtual private cloud (VPC) direct connection of a dedicated resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceDLinkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries detailed configurations about a virtual private cloud (VPC) direct connection of a dedicated resource group.</p>
     * @return DescribeResourceDLinkResponse
     */
    public DescribeResourceDLinkResponse describeResourceDLink(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceDLinkWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about the LogShipper configurations of Log Service for a dedicated resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceLogResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details about the LogShipper configurations of Log Service for a dedicated resource group.</p>
     * @return DescribeResourceLogResponse
     */
    public DescribeResourceLogResponse describeResourceLog(String ClusterId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceLogWithOptions(ClusterId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details about a service.</p>
     * @return DescribeServiceResponse
     */
    public DescribeServiceResponse describeService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the Autoscaler configurations of a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceAutoScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about the Autoscaler configurations of a service.</p>
     * @return DescribeServiceAutoScalerResponse
     */
    public DescribeServiceAutoScalerResponse describeServiceAutoScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceAutoScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Cron Horizontal Pod Autoscaler (CronHPA) configurations of a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceCronScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the Cron Horizontal Pod Autoscaler (CronHPA) configurations of a service.</p>
     * @return DescribeServiceCronScalerResponse
     */
    public DescribeServiceCronScalerResponse describeServiceCronScaler(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceCronScalerWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostics details of a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceDiagnosisResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostics details of a service.</p>
     * @return DescribeServiceDiagnosisResponse
     */
    public DescribeServiceDiagnosisResponse describeServiceDiagnosis(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceDiagnosisWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of service endpoints.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceEndpointsResponse
     */
    public DescribeServiceEndpointsResponse describeServiceEndpointsWithOptions(String ClusterId, String ServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceEndpoints"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of service endpoints.</p>
     * @return DescribeServiceEndpointsResponse
     */
    public DescribeServiceEndpointsResponse describeServiceEndpoints(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceEndpointsWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about recent service deployment events.</p>
     * 
     * @param request DescribeServiceEventRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceEventResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about recent service deployment events.</p>
     * 
     * @param request DescribeServiceEventRequest
     * @return DescribeServiceEventResponse
     */
    public DescribeServiceEventResponse describeServiceEvent(String ClusterId, String ServiceName, DescribeServiceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceEventWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostics details of an instance that runs Elastic Algorithm Service (EAS).</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceInstanceDiagnosisResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostics details of an instance that runs Elastic Algorithm Service (EAS).</p>
     * @return DescribeServiceInstanceDiagnosisResponse
     */
    public DescribeServiceInstanceDiagnosisResponse describeServiceInstanceDiagnosis(String ClusterId, String ServiceName, String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceInstanceDiagnosisWithOptions(ClusterId, ServiceName, InstanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the logs of a service.</p>
     * 
     * @param request DescribeServiceLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceLogResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the logs of a service.</p>
     * 
     * @param request DescribeServiceLogRequest
     * @return DescribeServiceLogResponse
     */
    public DescribeServiceLogResponse describeServiceLog(String ClusterId, String ServiceName, DescribeServiceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceLogWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about the traffic mirroring settings of a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMirrorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries details about the traffic mirroring settings of a service.</p>
     * @return DescribeServiceMirrorResponse
     */
    public DescribeServiceMirrorResponse describeServiceMirror(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceMirrorWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the logon-free URL of the service.</p>
     * 
     * @param request DescribeServiceSignedUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceSignedUrlResponse
     */
    public DescribeServiceSignedUrlResponse describeServiceSignedUrlWithOptions(String ClusterId, String ServiceName, DescribeServiceSignedUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expire)) {
            query.put("Expire", request.expire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internal)) {
            query.put("Internal", request.internal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceSignedUrl"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/signed_url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceSignedUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the logon-free URL of the service.</p>
     * 
     * @param request DescribeServiceSignedUrlRequest
     * @return DescribeServiceSignedUrlResponse
     */
    public DescribeServiceSignedUrlResponse describeServiceSignedUrl(String ClusterId, String ServiceName, DescribeServiceSignedUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeServiceSignedUrlWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical prices of preemptible instances. For more information about preemptible instances, see Create and use preemptible instances.</p>
     * 
     * @param request DescribeSpotDiscountHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSpotDiscountHistoryResponse
     */
    public DescribeSpotDiscountHistoryResponse describeSpotDiscountHistoryWithOptions(DescribeSpotDiscountHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProtect)) {
            query.put("IsProtect", request.isProtect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSpotDiscountHistory"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/public/spot_discount"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSpotDiscountHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical prices of preemptible instances. For more information about preemptible instances, see Create and use preemptible instances.</p>
     * 
     * @param request DescribeSpotDiscountHistoryRequest
     * @return DescribeSpotDiscountHistoryResponse
     */
    public DescribeSpotDiscountHistoryResponse describeSpotDiscountHistory(DescribeSpotDiscountHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSpotDiscountHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Views the details of a virtual resource group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualResourceResponse
     */
    public DescribeVirtualResourceResponse describeVirtualResourceWithOptions(String ClusterId, String VirtualResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/virtualresources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(VirtualResourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Views the details of a virtual resource group.</p>
     * @return DescribeVirtualResourceResponse
     */
    public DescribeVirtualResourceResponse describeVirtualResource(String ClusterId, String VirtualResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeVirtualResourceWithOptions(ClusterId, VirtualResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a custom domain name from a private gateway.</p>
     * 
     * @param tmpReq DetachGatewayDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachGatewayDomainResponse
     */
    public DetachGatewayDomainResponse detachGatewayDomainWithOptions(String ClusterId, String GatewayId, DetachGatewayDomainRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachGatewayDomainShrinkRequest request = new DetachGatewayDomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customDomain)) {
            request.customDomainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customDomain, "CustomDomain", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customDomainShrink)) {
            query.put("CustomDomain", request.customDomainShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachGatewayDomain"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/domain/detach"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachGatewayDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a custom domain name from a private gateway.</p>
     * 
     * @param request DetachGatewayDomainRequest
     * @return DetachGatewayDomainResponse
     */
    public DetachGatewayDomainResponse detachGatewayDomain(String ClusterId, String GatewayId, DetachGatewayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detachGatewayDomainWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Switches a container service to development mode or exits development mode.</p>
     * 
     * @param request DevelopServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DevelopServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Switches a container service to development mode or exits development mode.</p>
     * 
     * @param request DevelopServiceRequest
     * @return DevelopServiceResponse
     */
    public DevelopServiceResponse developService(String ClusterId, String ServiceName, DevelopServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.developServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control lists (ACLs) created for a private gateway.</p>
     * 
     * @param request ListAclPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAclPolicyResponse
     */
    public ListAclPolicyResponse listAclPolicyWithOptions(String ClusterId, String GatewayId, ListAclPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAclPolicy"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/acl_policy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control lists (ACLs) created for a private gateway.</p>
     * 
     * @param request ListAclPolicyRequest
     * @return ListAclPolicyResponse
     */
    public ListAclPolicyResponse listAclPolicy(String ClusterId, String GatewayId, ListAclPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAclPolicyWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of stress testing tasks that are created by the current user.</p>
     * 
     * @param request ListBenchmarkTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBenchmarkTaskResponse
     */
    public ListBenchmarkTaskResponse listBenchmarkTaskWithOptions(ListBenchmarkTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestMethod)) {
            query.put("RequestMethod", request.requestMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of stress testing tasks that are created by the current user.</p>
     * 
     * @param request ListBenchmarkTaskRequest
     * @return ListBenchmarkTaskResponse
     */
    public ListBenchmarkTaskResponse listBenchmarkTask(ListBenchmarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBenchmarkTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of private gateways.</p>
     * 
     * @param tmpReq ListGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayResponse
     */
    public ListGatewayResponse listGatewayWithOptions(ListGatewayRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayShrinkRequest request = new ListGatewayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.label)) {
            request.labelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.label, "Label", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayName)) {
            query.put("GatewayName", request.gatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("GatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetEnabled)) {
            query.put("InternetEnabled", request.internetEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGateway"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of private gateways.</p>
     * 
     * @param request ListGatewayRequest
     * @return ListGatewayResponse
     */
    public ListGatewayResponse listGateway(ListGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom domain names of a private gateway.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayDomainsResponse
     */
    public ListGatewayDomainsResponse listGatewayDomainsWithOptions(String ClusterId, String GatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayDomains"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom domain names of a private gateway.</p>
     * @return ListGatewayDomainsResponse
     */
    public ListGatewayDomainsResponse listGatewayDomains(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayDomainsWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the internal endpoints of a private gateway.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayIntranetLinkedVpcResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the internal endpoints of a private gateway.</p>
     * @return ListGatewayIntranetLinkedVpcResponse
     */
    public ListGatewayIntranetLinkedVpcResponse listGatewayIntranetLinkedVpc(String ClusterId, String GatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayIntranetLinkedVpcWithOptions(ClusterId, GatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of all VPC peering connections on internal endpoint of a gateway.</p>
     * 
     * @param request ListGatewayIntranetLinkedVpcPeerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayIntranetLinkedVpcPeerResponse
     */
    public ListGatewayIntranetLinkedVpcPeerResponse listGatewayIntranetLinkedVpcPeerWithOptions(String ClusterId, String GatewayId, ListGatewayIntranetLinkedVpcPeerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayIntranetLinkedVpcPeer"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_endpoint_linked_vpc_peer"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayIntranetLinkedVpcPeerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of all VPC peering connections on internal endpoint of a gateway.</p>
     * 
     * @param request ListGatewayIntranetLinkedVpcPeerRequest
     * @return ListGatewayIntranetLinkedVpcPeerResponse
     */
    public ListGatewayIntranetLinkedVpcPeerResponse listGatewayIntranetLinkedVpcPeer(String ClusterId, String GatewayId, ListGatewayIntranetLinkedVpcPeerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayIntranetLinkedVpcPeerWithOptions(ClusterId, GatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the zones supported by a gateway within an intranet.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayIntranetSupportedZoneResponse
     */
    public ListGatewayIntranetSupportedZoneResponse listGatewayIntranetSupportedZoneWithOptions(String GatewayId, String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayIntranetSupportedZone"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GatewayId) + "/intranet_supported_zone"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayIntranetSupportedZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the zones supported by a gateway within an intranet.</p>
     * @return ListGatewayIntranetSupportedZoneResponse
     */
    public ListGatewayIntranetSupportedZoneResponse listGatewayIntranetSupportedZone(String GatewayId, String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayIntranetSupportedZoneWithOptions(GatewayId, ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries created service groups.</p>
     * 
     * @param request ListGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMode)) {
            query.put("TrafficMode", request.trafficMode);
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

    /**
     * <b>summary</b> : 
     * <p>Queries created service groups.</p>
     * 
     * @param request ListGroupsRequest
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workers in a resource group.</p>
     * 
     * @param request ListResourceInstanceWorkerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceInstanceWorkerResponse
     */
    public ListResourceInstanceWorkerResponse listResourceInstanceWorkerWithOptions(String ClusterId, String ResourceId, String InstanceName, ListResourceInstanceWorkerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ready)) {
            query.put("Ready", request.ready);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerName)) {
            query.put("WorkerName", request.workerName);
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workers in a resource group.</p>
     * 
     * @param request ListResourceInstanceWorkerRequest
     * @return ListResourceInstanceWorkerResponse
     */
    public ListResourceInstanceWorkerResponse listResourceInstanceWorker(String ClusterId, String ResourceId, String InstanceName, ListResourceInstanceWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceInstanceWorkerWithOptions(ClusterId, ResourceId, InstanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances in a dedicated resource group.</p>
     * 
     * @param tmpReq ListResourceInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstancesWithOptions(String ClusterId, String ResourceId, ListResourceInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceInstancesShrinkRequest request = new ListResourceInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.label)) {
            request.labelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.label, "Label", "json");
        }

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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances in a dedicated resource group.</p>
     * 
     * @param request ListResourceInstancesRequest
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(String ClusterId, String ResourceId, ListResourceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceInstancesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services that are deployed in the dedicated resource group.</p>
     * 
     * @deprecated OpenAPI ListResourceServices is deprecated
     * 
     * @param request ListResourceServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceServicesResponse
     */
    @Deprecated
    // Deprecated
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services that are deployed in the dedicated resource group.</p>
     * 
     * @deprecated OpenAPI ListResourceServices is deprecated
     * 
     * @param request ListResourceServicesRequest
     * @return ListResourceServicesResponse
     */
    @Deprecated
    // Deprecated
    public ListResourceServicesResponse listResourceServices(String ClusterId, String ResourceId, ListResourceServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceServicesWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of dedicated resource groups for the current user.</p>
     * 
     * @param request ListResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceStatus)) {
            query.put("ResourceStatus", request.resourceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of dedicated resource groups for the current user.</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the containers of a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceContainersResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the containers of a service.</p>
     * @return ListServiceContainersResponse
     */
    public ListServiceContainersResponse listServiceContainers(String ClusterId, String ServiceName, String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceContainersWithOptions(ClusterId, ServiceName, InstanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取故障注入信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstanceFaultInjectionInfoResponse
     */
    public ListServiceInstanceFaultInjectionInfoResponse listServiceInstanceFaultInjectionInfoWithOptions(String ClusterId, String ServiceName, String InstanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstanceFaultInjectionInfo"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/faults"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstanceFaultInjectionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取故障注入信息</p>
     * @return ListServiceInstanceFaultInjectionInfoResponse
     */
    public ListServiceInstanceFaultInjectionInfoResponse listServiceInstanceFaultInjectionInfo(String ClusterId, String ServiceName, String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceInstanceFaultInjectionInfoWithOptions(ClusterId, ServiceName, InstanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances of a service.</p>
     * 
     * @param request ListServiceInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstancesResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.listReplica)) {
            query.put("ListReplica", request.listReplica);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            query.put("MemberType", request.memberType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.replicaName)) {
            query.put("ReplicaName", request.replicaName);
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

    /**
     * <b>summary</b> : 
     * <p>Queries instances of a service.</p>
     * 
     * @param request ListServiceInstancesRequest
     * @return ListServiceInstancesResponse
     */
    public ListServiceInstancesResponse listServiceInstances(String ClusterId, String ServiceName, ListServiceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceInstancesWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the historical versions of a service.</p>
     * 
     * @param request ListServiceVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceVersionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the historical versions of a service.</p>
     * 
     * @param request ListServiceVersionsRequest
     * @return ListServiceVersionsResponse
     */
    public ListServiceVersionsResponse listServiceVersions(String ClusterId, String ServiceName, ListServiceVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceVersionsWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists services.</p>
     * 
     * @param tmpReq ListServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
    public ListServicesResponse listServicesWithOptions(ListServicesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListServicesShrinkRequest request = new ListServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.label)) {
            request.labelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.label, "Label", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoscalerEnabled)) {
            query.put("AutoscalerEnabled", request.autoscalerEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronscalerEnabled)) {
            query.put("CronscalerEnabled", request.cronscalerEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gateway)) {
            query.put("Gateway", request.gateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeNoWorkspace)) {
            query.put("IncludeNoWorkspace", request.includeNoWorkspace);
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

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAliasName)) {
            query.put("ResourceAliasName", request.resourceAliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceBurstable)) {
            query.put("ResourceBurstable", request.resourceBurstable);
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

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficState)) {
            query.put("TrafficState", request.trafficState);
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

    /**
     * <b>summary</b> : 
     * <p>Lists services.</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tenant plug-ins.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantAddonsResponse
     */
    public ListTenantAddonsResponse listTenantAddonsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantAddons"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/tenantaddons"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tenant plug-ins.</p>
     * @return ListTenantAddonsResponse
     */
    public ListTenantAddonsResponse listTenantAddons() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTenantAddonsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of virtual resource groups for the current user.</p>
     * 
     * @param request ListVirtualResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirtualResourceResponse
     */
    public ListVirtualResourceResponse listVirtualResourceWithOptions(ListVirtualResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.virtualResourceId)) {
            query.put("VirtualResourceId", request.virtualResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualResourceName)) {
            query.put("VirtualResourceName", request.virtualResourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirtualResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/virtualresources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of virtual resource groups for the current user.</p>
     * 
     * @param request ListVirtualResourceRequest
     * @return ListVirtualResourceResponse
     */
    public ListVirtualResourceResponse listVirtualResource(ListVirtualResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVirtualResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates resource group instances.</p>
     * 
     * @param request MigrateResourceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateResourceInstanceResponse
     */
    public MigrateResourceInstanceResponse migrateResourceInstanceWithOptions(String ClusterId, String ResourceId, MigrateResourceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destResourceId)) {
            body.put("DestResourceId", request.destResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrateToHybrid)) {
            body.put("MigrateToHybrid", request.migrateToHybrid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateResourceInstance"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/instances/migrate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateResourceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates resource group instances.</p>
     * 
     * @param request MigrateResourceInstanceRequest
     * @return MigrateResourceInstanceResponse
     */
    public MigrateResourceInstanceResponse migrateResourceInstance(String ClusterId, String ResourceId, MigrateResourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateResourceInstanceWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets tenant configurations.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReinstallTenantAddonResponse
     */
    public ReinstallTenantAddonResponse reinstallTenantAddonWithOptions(String ClusterId, String TenantAddonName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReinstallTenantAddon"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/tenantaddons/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantAddonName) + "/reinstall"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReinstallTenantAddonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets tenant configurations.</p>
     * @return ReinstallTenantAddonResponse
     */
    public ReinstallTenantAddonResponse reinstallTenantAddon(String ClusterId, String TenantAddonName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinstallTenantAddonWithOptions(ClusterId, TenantAddonName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Switch the traffic state or weight of the service.</p>
     * 
     * @param request ReleaseServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Switch the traffic state or weight of the service.</p>
     * 
     * @param request ReleaseServiceRequest
     * @return ReleaseServiceResponse
     */
    public ReleaseServiceResponse releaseService(String ClusterId, String ServiceName, ReleaseServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Restarts a service.</p>
     * @return RestartServiceResponse
     */
    public RestartServiceResponse restartService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a stress testing task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartBenchmarkTaskResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Starts a stress testing task.</p>
     * @return StartBenchmarkTaskResponse
     */
    public StartBenchmarkTaskResponse startBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Starts a service.</p>
     * @return StartServiceResponse
     */
    public StartServiceResponse startService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a stress testing task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopBenchmarkTaskResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Stops a stress testing task.</p>
     * @return StopBenchmarkTaskResponse
     */
    public StopBenchmarkTaskResponse stopBenchmarkTask(String ClusterId, String TaskName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopBenchmarkTaskWithOptions(ClusterId, TaskName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a running service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Stops a running service.</p>
     * @return StopServiceResponse
     */
    public StopServiceResponse stopService(String ClusterId, String ServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopServiceWithOptions(ClusterId, ServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an application service.</p>
     * 
     * @param request UpdateAppServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates an application service.</p>
     * 
     * @param request UpdateAppServiceRequest
     * @return UpdateAppServiceResponse
     */
    public UpdateAppServiceResponse updateAppService(String ClusterId, String ServiceName, UpdateAppServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a stress testing task.</p>
     * 
     * @param request UpdateBenchmarkTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBenchmarkTaskResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates a stress testing task.</p>
     * 
     * @param request UpdateBenchmarkTaskRequest
     * @return UpdateBenchmarkTaskResponse
     */
    public UpdateBenchmarkTaskResponse updateBenchmarkTask(String ClusterId, String TaskName, UpdateBenchmarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBenchmarkTaskWithOptions(ClusterId, TaskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update a private gateway.</p>
     * 
     * @param request UpdateGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayResponse
     */
    public UpdateGatewayResponse updateGatewayWithOptions(String GatewayId, String ClusterId, UpdateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableInternet)) {
            body.put("EnableInternet", request.enableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIntranet)) {
            body.put("EnableIntranet", request.enableIntranet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSLRedirection)) {
            body.put("EnableSSLRedirection", request.enableSSLRedirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            body.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            body.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            body.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
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

    /**
     * <b>summary</b> : 
     * <p>Update a private gateway.</p>
     * 
     * @param request UpdateGatewayRequest
     * @return UpdateGatewayResponse
     */
    public UpdateGatewayResponse updateGateway(String GatewayId, String ClusterId, UpdateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayWithOptions(GatewayId, ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the specific fields of a service group.</p>
     * 
     * @param request UpdateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(String ClusterId, String GroupName, UpdateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trafficMode)) {
            body.put("TrafficMode", request.trafficMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the specific fields of a service group.</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(String ClusterId, String GroupName, UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(ClusterId, GroupName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a dedicated resource group. Only the name of a dedicated resource group can be updated.</p>
     * 
     * @param request UpdateResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a dedicated resource group. Only the name of a dedicated resource group can be updated.</p>
     * 
     * @param request UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(String ClusterId, String ResourceId, UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a virtual private cloud (VPC) direct connection for a dedicated resource group.</p>
     * 
     * @param request UpdateResourceDLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceDLinkResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a virtual private cloud (VPC) direct connection for a dedicated resource group.</p>
     * 
     * @param request UpdateResourceDLinkRequest
     * @return UpdateResourceDLinkResponse
     */
    public UpdateResourceDLinkResponse updateResourceDLink(String ClusterId, String ResourceId, UpdateResourceDLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceDLinkWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the service scheduling status of an instance in a dedicated resource group.</p>
     * 
     * @param request UpdateResourceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceInstanceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the service scheduling status of an instance in a dedicated resource group.</p>
     * 
     * @param request UpdateResourceInstanceRequest
     * @return UpdateResourceInstanceResponse
     */
    public UpdateResourceInstanceResponse updateResourceInstance(String ClusterId, String ResourceId, String InstanceId, UpdateResourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceInstanceWithOptions(ClusterId, ResourceId, InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the tag of an instance in a resource group.</p>
     * 
     * @param tmpReq UpdateResourceInstanceLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceInstanceLabelResponse
     */
    public UpdateResourceInstanceLabelResponse updateResourceInstanceLabelWithOptions(String ClusterId, String ResourceId, UpdateResourceInstanceLabelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateResourceInstanceLabelShrinkRequest request = new UpdateResourceInstanceLabelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allInstances)) {
            query.put("AllInstances", request.allInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceInstanceLabel"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/label"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceInstanceLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the tag of an instance in a resource group.</p>
     * 
     * @param request UpdateResourceInstanceLabelRequest
     * @return UpdateResourceInstanceLabelResponse
     */
    public UpdateResourceInstanceLabelResponse updateResourceInstanceLabel(String ClusterId, String ResourceId, UpdateResourceInstanceLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceInstanceLabelWithOptions(ClusterId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a model or processor of a service. If only the metadata.instance field is updated, manual scaling can be performed.</p>
     * 
     * @param request UpdateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateServiceWithOptions(String ClusterId, String ServiceName, UpdateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberToUpdate)) {
            query.put("MemberToUpdate", request.memberToUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            query.put("UpdateType", request.updateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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

    /**
     * <b>summary</b> : 
     * <p>Updates a model or processor of a service. If only the metadata.instance field is updated, manual scaling can be performed.</p>
     * 
     * @param request UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(String ClusterId, String ServiceName, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Autoscaler configurations of a service.</p>
     * 
     * @param request UpdateServiceAutoScalerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceAutoScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the Autoscaler configurations of a service.</p>
     * 
     * @param request UpdateServiceAutoScalerRequest
     * @return UpdateServiceAutoScalerResponse
     */
    public UpdateServiceAutoScalerResponse updateServiceAutoScaler(String ClusterId, String ServiceName, UpdateServiceAutoScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceAutoScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Cron Horizontal Pod Autoscaler (CronHPA) settings of a service.</p>
     * 
     * @param request UpdateServiceCronScalerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceCronScalerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the Cron Horizontal Pod Autoscaler (CronHPA) settings of a service.</p>
     * 
     * @param request UpdateServiceCronScalerRequest
     * @return UpdateServiceCronScalerResponse
     */
    public UpdateServiceCronScalerResponse updateServiceCronScaler(String ClusterId, String ServiceName, UpdateServiceCronScalerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceCronScalerWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates attributes of service instances. Only isolation can be performed for service instances.</p>
     * 
     * @param request UpdateServiceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceInstanceResponse
     */
    public UpdateServiceInstanceResponse updateServiceInstanceWithOptions(String ClusterId, String ServiceName, String InstanceName, UpdateServiceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isReplica)) {
            query.put("IsReplica", request.isReplica);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detach)) {
            body.put("Detach", request.detach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hibernate)) {
            body.put("Hibernate", request.hibernate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolate)) {
            body.put("Isolate", request.isolate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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

    /**
     * <b>summary</b> : 
     * <p>Updates attributes of service instances. Only isolation can be performed for service instances.</p>
     * 
     * @param request UpdateServiceInstanceRequest
     * @return UpdateServiceInstanceResponse
     */
    public UpdateServiceInstanceResponse updateServiceInstance(String ClusterId, String ServiceName, String InstanceName, UpdateServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceInstanceWithOptions(ClusterId, ServiceName, InstanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds service tags or updates existing service tags.</p>
     * 
     * @param request UpdateServiceLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceLabelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds service tags or updates existing service tags.</p>
     * 
     * @param request UpdateServiceLabelRequest
     * @return UpdateServiceLabelResponse
     */
    public UpdateServiceLabelResponse updateServiceLabel(String ClusterId, String ServiceName, UpdateServiceLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceLabelWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the traffic mirroring configurations of a service.</p>
     * 
     * @param request UpdateServiceMirrorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceMirrorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the traffic mirroring configurations of a service.</p>
     * 
     * @param request UpdateServiceMirrorRequest
     * @return UpdateServiceMirrorResponse
     */
    public UpdateServiceMirrorResponse updateServiceMirror(String ClusterId, String ServiceName, UpdateServiceMirrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceMirrorWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the safety lock of a service to minimize misoperations on the service.</p>
     * 
     * @param request UpdateServiceSafetyLockRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceSafetyLockResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the safety lock of a service to minimize misoperations on the service.</p>
     * 
     * @param request UpdateServiceSafetyLockRequest
     * @return UpdateServiceSafetyLockResponse
     */
    public UpdateServiceSafetyLockResponse updateServiceSafetyLock(String ClusterId, String ServiceName, UpdateServiceSafetyLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceSafetyLockWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the version of a service or rolls back the service to a specific version.</p>
     * 
     * @param request UpdateServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceVersionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the version of a service or rolls back the service to a specific version.</p>
     * 
     * @param request UpdateServiceVersionRequest
     * @return UpdateServiceVersionResponse
     */
    public UpdateServiceVersionResponse updateServiceVersion(String ClusterId, String ServiceName, UpdateServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceVersionWithOptions(ClusterId, ServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a virtual resource group.</p>
     * 
     * @param request UpdateVirtualResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVirtualResourceResponse
     */
    public UpdateVirtualResourceResponse updateVirtualResourceWithOptions(String ClusterId, String VirtualResourceId, UpdateVirtualResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableSpotProtectionPeriod)) {
            body.put("DisableSpotProtectionPeriod", request.disableSpotProtectionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualResourceName)) {
            body.put("VirtualResourceName", request.virtualResourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVirtualResource"),
            new TeaPair("version", "2021-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/virtualresources/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(VirtualResourceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirtualResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a virtual resource group.</p>
     * 
     * @param request UpdateVirtualResourceRequest
     * @return UpdateVirtualResourceResponse
     */
    public UpdateVirtualResourceResponse updateVirtualResource(String ClusterId, String VirtualResourceId, UpdateVirtualResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVirtualResourceWithOptions(ClusterId, VirtualResourceId, request, headers, runtime);
    }
}
