// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714;

import com.aliyun.tea.*;
import com.aliyun.cloudapi20160714.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "apigateway.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-beijing", "apigateway.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "apigateway.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "apigateway.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "apigateway.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "apigateway.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "apigateway.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "apigateway.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-heyuan", "apigateway.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "apigateway.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "apigateway.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "apigateway.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "apigateway.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "apigateway.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "apigateway.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "apigateway.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "apigateway.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "apigateway.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "apigateway.ap-southeast-7.aliyuncs.com"),
            new TeaPair("us-east-1", "apigateway.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "apigateway.us-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "apigateway.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "apigateway.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "apigateway.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "apigateway.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "apigateway.me-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "apigateway.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "apigateway.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "apigateway.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "apigateway.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "apigateway.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-edge-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-fujian", "apigateway.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "apigateway.cn-shanghai-inner.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-wuhan", "apigateway.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "apigateway.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "apigateway.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "apigateway.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Unpublishes a specified API from a specified runtime environment.
     *
     * @description *   This operation is intended for API providers and is the opposite of DeployApi.
     * *   An API can be unpublished from a specified runtime environment in under 5 seconds.
     * *   An unpublished API cannot be called in the specified runtime environment.
     *
     * @param request AbolishApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbolishApiResponse
     */
    public AbolishApiResponse abolishApiWithOptions(AbolishApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbolishApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbolishApiResponse());
    }

    /**
     * @summary Unpublishes a specified API from a specified runtime environment.
     *
     * @description *   This operation is intended for API providers and is the opposite of DeployApi.
     * *   An API can be unpublished from a specified runtime environment in under 5 seconds.
     * *   An unpublished API cannot be called in the specified runtime environment.
     *
     * @param request AbolishApiRequest
     * @return AbolishApiResponse
     */
    public AbolishApiResponse abolishApi(AbolishApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishApiWithOptions(request, runtime);
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated instances. Adds an IP address entry to the access control polocy of an instance.
     *
     * @param request AddAccessControlListEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAccessControlListEntryResponse
     */
    public AddAccessControlListEntryResponse addAccessControlListEntryWithOptions(AddAccessControlListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntrys)) {
            query.put("AclEntrys", request.aclEntrys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAccessControlListEntry"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAccessControlListEntryResponse());
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated instances. Adds an IP address entry to the access control polocy of an instance.
     *
     * @param request AddAccessControlListEntryRequest
     * @return AddAccessControlListEntryResponse
     */
    public AddAccessControlListEntryResponse addAccessControlListEntry(AddAccessControlListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAccessControlListEntryWithOptions(request, runtime);
    }

    /**
     * @summary Adds a policy to an existing ACL.
     *
     * @description When you call this operation, note that:
     * *   This operation is intended for API providers.
     * *   An added policy immediately takes effect on all APIs that are bound to the access control list (ACL).
     * *   A maximum of 100 policies can be added to an ACL.
     *
     * @param request AddIpControlPolicyItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIpControlPolicyItemResponse
     */
    public AddIpControlPolicyItemResponse addIpControlPolicyItemWithOptions(AddIpControlPolicyItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrIp)) {
            query.put("CidrIp", request.cidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpControlPolicyItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpControlPolicyItemResponse());
    }

    /**
     * @summary Adds a policy to an existing ACL.
     *
     * @description When you call this operation, note that:
     * *   This operation is intended for API providers.
     * *   An added policy immediately takes effect on all APIs that are bound to the access control list (ACL).
     * *   A maximum of 100 policies can be added to an ACL.
     *
     * @param request AddIpControlPolicyItemRequest
     * @return AddIpControlPolicyItemResponse
     */
    public AddIpControlPolicyItemResponse addIpControlPolicyItem(AddIpControlPolicyItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIpControlPolicyItemWithOptions(request, runtime);
    }

    /**
     * @summary Adds a custom special policy to a specified throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   If the input SpecialKey already exists, the previous configuration is overwritten. Use caution when calling this operation.
     * *   Special throttling policies must be added to an existing throttling policy, and can take effect on all the APIs to which the throttling policy is bound.
     *
     * @param request AddTrafficSpecialControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTrafficSpecialControlResponse
     */
    public AddTrafficSpecialControlResponse addTrafficSpecialControlWithOptions(AddTrafficSpecialControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialKey)) {
            query.put("SpecialKey", request.specialKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialType)) {
            query.put("SpecialType", request.specialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficValue)) {
            query.put("TrafficValue", request.trafficValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTrafficSpecialControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTrafficSpecialControlResponse());
    }

    /**
     * @summary Adds a custom special policy to a specified throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   If the input SpecialKey already exists, the previous configuration is overwritten. Use caution when calling this operation.
     * *   Special throttling policies must be added to an existing throttling policy, and can take effect on all the APIs to which the throttling policy is bound.
     *
     * @param request AddTrafficSpecialControlRequest
     * @return AddTrafficSpecialControlResponse
     */
    public AddTrafficSpecialControlResponse addTrafficSpecialControl(AddTrafficSpecialControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTrafficSpecialControlWithOptions(request, runtime);
    }

    /**
     * @summary Attaches APIs to an API product. If the API product does not exist, the system automatically creates the API product.
     *
     * @param request AttachApiProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachApiProductResponse
     */
    public AttachApiProductResponse attachApiProductWithOptions(AttachApiProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductId)) {
            query.put("ApiProductId", request.apiProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apis)) {
            query.put("Apis", request.apis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachApiProduct"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachApiProductResponse());
    }

    /**
     * @summary Attaches APIs to an API product. If the API product does not exist, the system automatically creates the API product.
     *
     * @param request AttachApiProductRequest
     * @return AttachApiProductResponse
     */
    public AttachApiProductResponse attachApiProduct(AttachApiProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachApiProductWithOptions(request, runtime);
    }

    /**
     * @summary Binds a plug-in to an API.
     *
     * @description *   This operation is intended for API providers.
     * *   You can only bind plug-ins to published APIs.
     * *   The plug-in takes effect immediately after it is bound to an API.
     * *   If you bind a different plug-in to an API, this plug-in takes effect immediately.
     *
     * @param request AttachPluginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachPluginResponse
     */
    public AttachPluginResponse attachPluginWithOptions(AttachPluginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachPlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachPluginResponse());
    }

    /**
     * @summary Binds a plug-in to an API.
     *
     * @description *   This operation is intended for API providers.
     * *   You can only bind plug-ins to published APIs.
     * *   The plug-in takes effect immediately after it is bound to an API.
     * *   If you bind a different plug-in to an API, this plug-in takes effect immediately.
     *
     * @param request AttachPluginRequest
     * @return AttachPluginResponse
     */
    public AttachPluginResponse attachPlugin(AttachPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachPluginWithOptions(request, runtime);
    }

    /**
     * @summary Unpublishes multiple published APIs at a time.
     *
     * @param request BatchAbolishApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAbolishApisResponse
     */
    public BatchAbolishApisResponse batchAbolishApisWithOptions(BatchAbolishApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAbolishApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAbolishApisResponse());
    }

    /**
     * @summary Unpublishes multiple published APIs at a time.
     *
     * @param request BatchAbolishApisRequest
     * @return BatchAbolishApisResponse
     */
    public BatchAbolishApisResponse batchAbolishApis(BatchAbolishApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAbolishApisWithOptions(request, runtime);
    }

    /**
     * @summary Publishes multiple APIs at a time.
     *
     * @param request BatchDeployApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeployApisResponse
     */
    public BatchDeployApisResponse batchDeployApisWithOptions(BatchDeployApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeployApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeployApisResponse());
    }

    /**
     * @summary Publishes multiple APIs at a time.
     *
     * @param request BatchDeployApisRequest
     * @return BatchDeployApisResponse
     */
    public BatchDeployApisResponse batchDeployApis(BatchDeployApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeployApisWithOptions(request, runtime);
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated instances. Creates an Access Control List (ACL). Each user is allowed to create five ACLs in each region.
     *
     * @param request CreateAccessControlListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessControlListResponse
     */
    public CreateAccessControlListResponse createAccessControlListWithOptions(CreateAccessControlListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessControlList"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessControlListResponse());
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated instances. Creates an Access Control List (ACL). Each user is allowed to create five ACLs in each region.
     *
     * @param request CreateAccessControlListRequest
     * @return CreateAccessControlListResponse
     */
    public CreateAccessControlListResponse createAccessControlList(CreateAccessControlListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessControlListWithOptions(request, runtime);
    }

    /**
     * @summary Creates an API.
     *
     * @description *   This operation is intended for API providers.
     * *   The name of an API must be unique within an API group.
     * *   A request path must be unique within an API group.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request CreateApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiResponse
     */
    public CreateApiResponse createApiWithOptions(CreateApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowSignatureMethod)) {
            query.put("AllowSignatureMethod", request.allowSignatureMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCodeAuthType)) {
            query.put("AppCodeAuthType", request.appCodeAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendEnable)) {
            query.put("BackendEnable", request.backendEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableInternet)) {
            query.put("DisableInternet", request.disableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceNonceCheck)) {
            query.put("ForceNonceCheck", request.forceNonceCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openIdConnectConfig)) {
            query.put("OpenIdConnectConfig", request.openIdConnectConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestConfig)) {
            query.put("RequestConfig", request.requestConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultBodyModel)) {
            query.put("ResultBodyModel", request.resultBodyModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            query.put("ResultType", request.resultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConfig)) {
            query.put("ServiceConfig", request.serviceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webSocketApiType)) {
            query.put("WebSocketApiType", request.webSocketApiType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.constantParameters)) {
            body.put("ConstantParameters", request.constantParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCodeSamples)) {
            body.put("ErrorCodeSamples", request.errorCodeSamples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failResultSample)) {
            body.put("FailResultSample", request.failResultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestParameters)) {
            body.put("RequestParameters", request.requestParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultDescriptions)) {
            body.put("ResultDescriptions", request.resultDescriptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultSample)) {
            body.put("ResultSample", request.resultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParametersMap)) {
            body.put("ServiceParametersMap", request.serviceParametersMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemParameters)) {
            body.put("SystemParameters", request.systemParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiResponse());
    }

    /**
     * @summary Creates an API.
     *
     * @description *   This operation is intended for API providers.
     * *   The name of an API must be unique within an API group.
     * *   A request path must be unique within an API group.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request CreateApiRequest
     * @return CreateApiResponse
     */
    public CreateApiResponse createApi(CreateApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiWithOptions(request, runtime);
    }

    /**
     * @param request CreateApiGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiGroupResponse
     */
    public CreateApiGroupResponse createApiGroupWithOptions(CreateApiGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basePath)) {
            query.put("BasePath", request.basePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiGroupResponse());
    }

    /**
     * @param request CreateApiGroupRequest
     * @return CreateApiGroupResponse
     */
    public CreateApiGroupResponse createApiGroup(CreateApiGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiGroupWithOptions(request, runtime);
    }

    /**
     * @summary Adds a variable to an environment.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request CreateApiStageVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiStageVariableResponse
     */
    public CreateApiStageVariableResponse createApiStageVariableWithOptions(CreateApiStageVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageId)) {
            query.put("StageId", request.stageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageRouteModel)) {
            query.put("StageRouteModel", request.stageRouteModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportRoute)) {
            query.put("SupportRoute", request.supportRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableName)) {
            query.put("VariableName", request.variableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableValue)) {
            query.put("VariableValue", request.variableValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiStageVariable"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiStageVariableResponse());
    }

    /**
     * @summary Adds a variable to an environment.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request CreateApiStageVariableRequest
     * @return CreateApiStageVariableResponse
     */
    public CreateApiStageVariableResponse createApiStageVariable(CreateApiStageVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiStageVariableWithOptions(request, runtime);
    }

    /**
     * @summary Creates an application for calling APIs in API Gateway.
     *
     * @description *   This operation is intended for API callers.
     * *   Each application has a key-value pair which is used for identity verification when you call an API.
     * *   An application must be authorized to call an API.
     * *   Each application has only one key-value pair, which can be reset if the pair is leaked.
     * *   A maximum of 1,000 applications can be created for each Alibaba Cloud account.
     * *   You can call this operation up to 50 times per second per account.
     *
     * @param request CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("AppSecret", request.appSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * @summary Creates an application for calling APIs in API Gateway.
     *
     * @description *   This operation is intended for API callers.
     * *   Each application has a key-value pair which is used for identity verification when you call an API.
     * *   An application must be authorized to call an API.
     * *   Each application has only one key-value pair, which can be reset if the pair is leaked.
     * *   A maximum of 1,000 applications can be created for each Alibaba Cloud account.
     * *   You can call this operation up to 50 times per second per account.
     *
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * @summary 创建新的AppCode
     *
     * @param request CreateAppCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppCodeResponse
     */
    public CreateAppCodeResponse createAppCodeWithOptions(CreateAppCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppCode"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppCodeResponse());
    }

    /**
     * @summary 创建新的AppCode
     *
     * @param request CreateAppCodeRequest
     * @return CreateAppCodeResponse
     */
    public CreateAppCodeResponse createAppCode(CreateAppCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppCodeWithOptions(request, runtime);
    }

    /**
     * @summary 创建新的AK、SK
     *
     * @param request CreateAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppKeyResponse
     */
    public CreateAppKeyResponse createAppKeyWithOptions(CreateAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("AppSecret", request.appSecret);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppKey"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppKeyResponse());
    }

    /**
     * @summary 创建新的AK、SK
     *
     * @param request CreateAppKeyRequest
     * @return CreateAppKeyResponse
     */
    public CreateAppKeyResponse createAppKey(CreateAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppKeyWithOptions(request, runtime);
    }

    /**
     * @summary 创建后端服务
     *
     * @param request CreateBackendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackendResponse
     */
    public CreateBackendResponse createBackendWithOptions(CreateBackendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendName)) {
            query.put("BackendName", request.backendName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendType)) {
            query.put("BackendType", request.backendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEventBridgeServiceLinkedRole)) {
            query.put("CreateEventBridgeServiceLinkedRole", request.createEventBridgeServiceLinkedRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createSlr)) {
            query.put("CreateSlr", request.createSlr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackend"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackendResponse());
    }

    /**
     * @summary 创建后端服务
     *
     * @param request CreateBackendRequest
     * @return CreateBackendResponse
     */
    public CreateBackendResponse createBackend(CreateBackendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackendWithOptions(request, runtime);
    }

    /**
     * @summary 创建后端服务在环境上的配置
     *
     * @param request CreateBackendModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackendModelResponse
     */
    public CreateBackendModelResponse createBackendModelWithOptions(CreateBackendModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendModelData)) {
            query.put("BackendModelData", request.backendModelData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendType)) {
            query.put("BackendType", request.backendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackendModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackendModelResponse());
    }

    /**
     * @summary 创建后端服务在环境上的配置
     *
     * @param request CreateBackendModelRequest
     * @return CreateBackendModelResponse
     */
    public CreateBackendModelResponse createBackendModel(CreateBackendModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackendModelWithOptions(request, runtime);
    }

    /**
     * @summary Creates a custom dataset.
     *
     * @param request CreateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetType)) {
            query.put("DatasetType", request.datasetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataset"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetResponse());
    }

    /**
     * @summary Creates a custom dataset.
     *
     * @param request CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    /**
     * @summary 创建自定义数据集条目
     *
     * @param request CreateDatasetItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetItemResponse
     */
    public CreateDatasetItemResponse createDatasetItemWithOptions(CreateDatasetItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatasetItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetItemResponse());
    }

    /**
     * @summary 创建自定义数据集条目
     *
     * @param request CreateDatasetItemRequest
     * @return CreateDatasetItemResponse
     */
    public CreateDatasetItemResponse createDatasetItem(CreateDatasetItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasetItemWithOptions(request, runtime);
    }

    /**
     * @summary 创建网关实例
     *
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsPolicy)) {
            query.put("HttpsPolicy", request.httpsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCidr)) {
            query.put("InstanceCidr", request.instanceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpcId)) {
            query.put("UserVpcId", request.userVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneVSwitchSecurityGroup)) {
            query.put("ZoneVSwitchSecurityGroup", request.zoneVSwitchSecurityGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * @summary 创建网关实例
     *
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * @param request CreateIntranetDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntranetDomainResponse
     */
    public CreateIntranetDomainResponse createIntranetDomainWithOptions(CreateIntranetDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntranetDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntranetDomainResponse());
    }

    /**
     * @param request CreateIntranetDomainRequest
     * @return CreateIntranetDomainResponse
     */
    public CreateIntranetDomainResponse createIntranetDomain(CreateIntranetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIntranetDomainWithOptions(request, runtime);
    }

    /**
     * @summary Creates an access control list (ACL) in a region.
     *
     * @description *   This operation is intended for API providers.
     * *   An ACL must be bound to an API to take effect. After an ACL is bound to an API, the ACL takes effect on the API immediately.
     * *   You can add policies to an ACL when you create the ACL.
     * *   If an ACL does not have any policy, the ACL is ineffective.
     *
     * @param request CreateIpControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpControlResponse
     */
    public CreateIpControlResponse createIpControlWithOptions(CreateIpControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlName)) {
            query.put("IpControlName", request.ipControlName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlPolicys)) {
            query.put("IpControlPolicys", request.ipControlPolicys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlType)) {
            query.put("IpControlType", request.ipControlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpControlResponse());
    }

    /**
     * @summary Creates an access control list (ACL) in a region.
     *
     * @description *   This operation is intended for API providers.
     * *   An ACL must be bound to an API to take effect. After an ACL is bound to an API, the ACL takes effect on the API immediately.
     * *   You can add policies to an ACL when you create the ACL.
     * *   If an ACL does not have any policy, the ACL is ineffective.
     *
     * @param request CreateIpControlRequest
     * @return CreateIpControlResponse
     */
    public CreateIpControlResponse createIpControl(CreateIpControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpControlWithOptions(request, runtime);
    }

    /**
     * @param request CreateLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogConfigResponse
     */
    public CreateLogConfigResponse createLogConfigWithOptions(CreateLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            query.put("SlsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            query.put("SlsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogConfigResponse());
    }

    /**
     * @param request CreateLogConfigRequest
     * @return CreateLogConfigResponse
     */
    public CreateLogConfigResponse createLogConfig(CreateLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogConfigWithOptions(request, runtime);
    }

    /**
     * @summary Creates a model for an API group.
     *
     * @description *   For more information about the model definition, see [JSON Schema Draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04?spm=a2c4g.11186623.2.10.2e977ff7p4BpQd).
     * *   JSON Schema supports only element attributes of the Object type.
     *
     * @param request CreateModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelResponse
     */
    public CreateModelResponse createModelWithOptions(CreateModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelResponse());
    }

    /**
     * @summary Creates a model for an API group.
     *
     * @description *   For more information about the model definition, see [JSON Schema Draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04?spm=a2c4g.11186623.2.10.2e977ff7p4BpQd).
     * *   JSON Schema supports only element attributes of the Object type.
     *
     * @param request CreateModelRequest
     * @return CreateModelResponse
     */
    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelWithOptions(request, runtime);
    }

    /**
     * @summary Enables CloudMonitor alerting for a specified API group.
     *
     * @param request CreateMonitorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorGroupResponse
     */
    public CreateMonitorGroupResponse createMonitorGroupWithOptions(CreateMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auth)) {
            query.put("Auth", request.auth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawMonitorGroupId)) {
            query.put("RawMonitorGroupId", request.rawMonitorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupResponse());
    }

    /**
     * @summary Enables CloudMonitor alerting for a specified API group.
     *
     * @param request CreateMonitorGroupRequest
     * @return CreateMonitorGroupResponse
     */
    public CreateMonitorGroupResponse createMonitorGroup(CreateMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a plug-in.
     *
     * @description *   This operation is intended for API providers.
     * *   The number of plug-ins of the same type that each user can create is limited. Different limits apply to different plug-in types.
     * *   The plug-in definitions for advanced features are restricted.
     * *   Plug-ins must be bound to APIs to take effect. After a plug-in is bound, it takes effect on that API immediately.
     *
     * @param request CreatePluginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePluginResponse
     */
    public CreatePluginResponse createPluginWithOptions(CreatePluginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginData)) {
            query.put("PluginData", request.pluginData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginName)) {
            query.put("PluginName", request.pluginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginType)) {
            query.put("PluginType", request.pluginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePluginResponse());
    }

    /**
     * @summary Creates a plug-in.
     *
     * @description *   This operation is intended for API providers.
     * *   The number of plug-ins of the same type that each user can create is limited. Different limits apply to different plug-in types.
     * *   The plug-in definitions for advanced features are restricted.
     * *   Plug-ins must be bound to APIs to take effect. After a plug-in is bound, it takes effect on that API immediately.
     *
     * @param request CreatePluginRequest
     * @return CreatePluginResponse
     */
    public CreatePluginResponse createPlugin(CreatePluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPluginWithOptions(request, runtime);
    }

    /**
     * @summary Creates a backend signature key.
     *
     * @description *   This API is intended for API providers.
     * *   The API operation only creates a key policy. You must call the binding operation to bind the key to an API.
     * *   After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request CreateSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSignatureResponse
     */
    public CreateSignatureResponse createSignatureWithOptions(CreateSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureKey)) {
            query.put("SignatureKey", request.signatureKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureName)) {
            query.put("SignatureName", request.signatureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureSecret)) {
            query.put("SignatureSecret", request.signatureSecret);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSignatureResponse());
    }

    /**
     * @summary Creates a backend signature key.
     *
     * @description *   This API is intended for API providers.
     * *   The API operation only creates a key policy. You must call the binding operation to bind the key to an API.
     * *   After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request CreateSignatureRequest
     * @return CreateSignatureResponse
     */
    public CreateSignatureResponse createSignature(CreateSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSignatureWithOptions(request, runtime);
    }

    /**
     * @summary Creates a custom throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request CreateTrafficControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrafficControlResponse
     */
    public CreateTrafficControlResponse createTrafficControlWithOptions(CreateTrafficControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDefault)) {
            query.put("ApiDefault", request.apiDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appDefault)) {
            query.put("AppDefault", request.appDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlName)) {
            query.put("TrafficControlName", request.trafficControlName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlUnit)) {
            query.put("TrafficControlUnit", request.trafficControlUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDefault)) {
            query.put("UserDefault", request.userDefault);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficControlResponse());
    }

    /**
     * @summary Creates a custom throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request CreateTrafficControlRequest
     * @return CreateTrafficControlResponse
     */
    public CreateTrafficControlResponse createTrafficControl(CreateTrafficControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrafficControlWithOptions(request, runtime);
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated instances. Deletes an access control policy.
     *
     * @param request DeleteAccessControlListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessControlListResponse
     */
    public DeleteAccessControlListResponse deleteAccessControlListWithOptions(DeleteAccessControlListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessControlList"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessControlListResponse());
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated instances. Deletes an access control policy.
     *
     * @param request DeleteAccessControlListRequest
     * @return DeleteAccessControlListResponse
     */
    public DeleteAccessControlListResponse deleteAccessControlList(DeleteAccessControlListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessControlListWithOptions(request, runtime);
    }

    /**
     * @summary Deletes all custom special policies of a specified throttling policy.
     *
     * @description *   This API is intended for API providers.
     *
     * @param request DeleteAllTrafficSpecialControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAllTrafficSpecialControlResponse
     */
    public DeleteAllTrafficSpecialControlResponse deleteAllTrafficSpecialControlWithOptions(DeleteAllTrafficSpecialControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAllTrafficSpecialControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAllTrafficSpecialControlResponse());
    }

    /**
     * @summary Deletes all custom special policies of a specified throttling policy.
     *
     * @description *   This API is intended for API providers.
     *
     * @param request DeleteAllTrafficSpecialControlRequest
     * @return DeleteAllTrafficSpecialControlResponse
     */
    public DeleteAllTrafficSpecialControlResponse deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAllTrafficSpecialControlWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an API.
     *
     * @description *   This operation is intended for API providers and cannot be undone after it is complete.
     * *   An API that is running in the runtime environment must be unpublished before you can delete the API.****
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiResponse
     */
    public DeleteApiResponse deleteApiWithOptions(DeleteApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiResponse());
    }

    /**
     * @summary Deletes an API.
     *
     * @description *   This operation is intended for API providers and cannot be undone after it is complete.
     * *   An API that is running in the runtime environment must be unpublished before you can delete the API.****
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteApiRequest
     * @return DeleteApiResponse
     */
    public DeleteApiResponse deleteApi(DeleteApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an API group.
     *
     * @description *   This operation is intended for API providers.
     * *   An API group that contains APIs cannot be deleted. To delete the API group, you must first delete its APIs.
     * *   After an API group is deleted, the second-level domain name bound to the API group is automatically invalidated.
     * *   If the specified API group does not exist, a success response is returned.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteApiGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiGroupResponse
     */
    public DeleteApiGroupResponse deleteApiGroupWithOptions(DeleteApiGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiGroupResponse());
    }

    /**
     * @summary Deletes an API group.
     *
     * @description *   This operation is intended for API providers.
     * *   An API group that contains APIs cannot be deleted. To delete the API group, you must first delete its APIs.
     * *   After an API group is deleted, the second-level domain name bound to the API group is automatically invalidated.
     * *   If the specified API group does not exist, a success response is returned.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteApiGroupRequest
     * @return DeleteApiGroupResponse
     */
    public DeleteApiGroupResponse deleteApiGroup(DeleteApiGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an API product. Deleting an API product causes the association between APIs and the deleted API product to be deleted as well. Exercise caution when you delete an API product. If any API in the API product is associated with an application, the API product fails to be deleted.
     *
     * @param request DeleteApiProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiProductResponse
     */
    public DeleteApiProductResponse deleteApiProductWithOptions(DeleteApiProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductId)) {
            query.put("ApiProductId", request.apiProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiProduct"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiProductResponse());
    }

    /**
     * @summary Deletes an API product. Deleting an API product causes the association between APIs and the deleted API product to be deleted as well. Exercise caution when you delete an API product. If any API in the API product is associated with an application, the API product fails to be deleted.
     *
     * @param request DeleteApiProductRequest
     * @return DeleteApiProductResponse
     */
    public DeleteApiProductResponse deleteApiProduct(DeleteApiProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiProductWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a specified variable in a specified environment.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DeleteApiStageVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiStageVariableResponse
     */
    public DeleteApiStageVariableResponse deleteApiStageVariableWithOptions(DeleteApiStageVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageId)) {
            query.put("StageId", request.stageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableName)) {
            query.put("VariableName", request.variableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiStageVariable"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiStageVariableResponse());
    }

    /**
     * @summary Deletes a specified variable in a specified environment.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DeleteApiStageVariableRequest
     * @return DeleteApiStageVariableResponse
     */
    public DeleteApiStageVariableResponse deleteApiStageVariable(DeleteApiStageVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiStageVariableWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an application.
     *
     * @description *   This operation is intended for API callers.
     * *   After an application is deleted, the application and its API authorization cannot be restored.
     * *   You can call this operation up to 50 times per second per account.
     *
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    /**
     * @summary Deletes an application.
     *
     * @description *   This operation is intended for API callers.
     * *   After an application is deleted, the application and its API authorization cannot be restored.
     * *   You can call this operation up to 50 times per second per account.
     *
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * @summary 删除新的AppCode
     *
     * @param request DeleteAppCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppCodeResponse
     */
    public DeleteAppCodeResponse deleteAppCodeWithOptions(DeleteAppCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppCode"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppCodeResponse());
    }

    /**
     * @summary 删除新的AppCode
     *
     * @param request DeleteAppCodeRequest
     * @return DeleteAppCodeResponse
     */
    public DeleteAppCodeResponse deleteAppCode(DeleteAppCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppCodeWithOptions(request, runtime);
    }

    /**
     * @summary 删除新的AppKey
     *
     * @param request DeleteAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppKeyResponse
     */
    public DeleteAppKeyResponse deleteAppKeyWithOptions(DeleteAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppKey"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppKeyResponse());
    }

    /**
     * @summary 删除新的AppKey
     *
     * @param request DeleteAppKeyRequest
     * @return DeleteAppKeyResponse
     */
    public DeleteAppKeyResponse deleteAppKey(DeleteAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppKeyWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a backend service.
     *
     * @param request DeleteBackendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackendResponse
     */
    public DeleteBackendResponse deleteBackendWithOptions(DeleteBackendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackend"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackendResponse());
    }

    /**
     * @summary Deletes a backend service.
     *
     * @param request DeleteBackendRequest
     * @return DeleteBackendResponse
     */
    public DeleteBackendResponse deleteBackend(DeleteBackendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackendWithOptions(request, runtime);
    }

    /**
     * @summary Deletes the definition of a backend service in an environment. After the definition is deleted, the API that uses the backend service and is published to this environment will be unpublished.
     *
     * @param request DeleteBackendModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackendModelResponse
     */
    public DeleteBackendModelResponse deleteBackendModelWithOptions(DeleteBackendModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendModelId)) {
            query.put("BackendModelId", request.backendModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackendModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackendModelResponse());
    }

    /**
     * @summary Deletes the definition of a backend service in an environment. After the definition is deleted, the API that uses the backend service and is published to this environment will be unpublished.
     *
     * @param request DeleteBackendModelRequest
     * @return DeleteBackendModelResponse
     */
    public DeleteBackendModelResponse deleteBackendModel(DeleteBackendModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackendModelWithOptions(request, runtime);
    }

    /**
     * @summary 删除自定义数据集
     *
     * @param request DeleteDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDatasetWithOptions(DeleteDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataset"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetResponse());
    }

    /**
     * @summary 删除自定义数据集
     *
     * @param request DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasetWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a data entry from a custom dataset.
     *
     * @param request DeleteDatasetItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetItemResponse
     */
    public DeleteDatasetItemResponse deleteDatasetItemWithOptions(DeleteDatasetItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetItemId)) {
            query.put("DatasetItemId", request.datasetItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatasetItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetItemResponse());
    }

    /**
     * @summary Deletes a data entry from a custom dataset.
     *
     * @param request DeleteDatasetItemRequest
     * @return DeleteDatasetItemResponse
     */
    public DeleteDatasetItemResponse deleteDatasetItem(DeleteDatasetItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasetItemWithOptions(request, runtime);
    }

    /**
     * @summary Unbinds a custom domain name from a specified API group.
     *
     * @description *   This operation is intended for API providers.
     * *   If the specified domain name does not exist, a successful response will still appear.
     * *   Unbinding a domain name from an API group will affect access to the APIs in the group. Exercise caution when using this operation.
     *
     * @param request DeleteDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * @summary Unbinds a custom domain name from a specified API group.
     *
     * @description *   This operation is intended for API providers.
     * *   If the specified domain name does not exist, a successful response will still appear.
     * *   Unbinding a domain name from an API group will affect access to the APIs in the group. Exercise caution when using this operation.
     *
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * @summary Deletes the SSL certificate of a specified domain name. This operation is intended for API providers. If the SSL certificate does not exist, a success response is still returned. If the specified API group does not exist, the InvalidGroupId.NotFound error is returned. Access over HTTPS is not supported after the SSL certificate is deleted. Exercise caution when using this API operation.
     *
     * @param request DeleteDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainCertificateResponse
     */
    public DeleteDomainCertificateResponse deleteDomainCertificateWithOptions(DeleteDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainCertificate"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainCertificateResponse());
    }

    /**
     * @summary Deletes the SSL certificate of a specified domain name. This operation is intended for API providers. If the SSL certificate does not exist, a success response is still returned. If the specified API group does not exist, the InvalidGroupId.NotFound error is returned. Access over HTTPS is not supported after the SSL certificate is deleted. Exercise caution when using this API operation.
     *
     * @param request DeleteDomainCertificateRequest
     * @return DeleteDomainCertificateResponse
     */
    public DeleteDomainCertificateResponse deleteDomainCertificate(DeleteDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainCertificateWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an API Gateway instance.
     *
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * @summary Deletes an API Gateway instance.
     *
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     * *   If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.
     * *   If you call this operation on an ACL that does not exist, a success message is returned.
     *
     * @param request DeleteIpControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpControlResponse
     */
    public DeleteIpControlResponse deleteIpControlWithOptions(DeleteIpControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpControlResponse());
    }

    /**
     * @summary Deletes an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     * *   If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.
     * *   If you call this operation on an ACL that does not exist, a success message is returned.
     *
     * @param request DeleteIpControlRequest
     * @return DeleteIpControlResponse
     */
    public DeleteIpControlResponse deleteIpControl(DeleteIpControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpControlWithOptions(request, runtime);
    }

    /**
     * @summary Delete the specified log configuration.
     *
     * @param request DeleteLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogConfigResponse
     */
    public DeleteLogConfigResponse deleteLogConfigWithOptions(DeleteLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogConfigResponse());
    }

    /**
     * @summary Delete the specified log configuration.
     *
     * @param request DeleteLogConfigRequest
     * @return DeleteLogConfigResponse
     */
    public DeleteLogConfigResponse deleteLogConfig(DeleteLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogConfigWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a model from Model Management for an API group.
     *
     * @param request DeleteModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    /**
     * @summary Deletes a model from Model Management for an API group.
     *
     * @param request DeleteModelRequest
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a CloudMonitor application group corresponding to an API group.
     *
     * @param request DeleteMonitorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorGroupResponse
     */
    public DeleteMonitorGroupResponse deleteMonitorGroupWithOptions(DeleteMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawMonitorGroupId)) {
            query.put("RawMonitorGroupId", request.rawMonitorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorGroupResponse());
    }

    /**
     * @summary Deletes a CloudMonitor application group corresponding to an API group.
     *
     * @param request DeleteMonitorGroupRequest
     * @return DeleteMonitorGroupResponse
     */
    public DeleteMonitorGroupResponse deleteMonitorGroup(DeleteMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a plug-in.
     *
     * @description *   This operation is intended for API providers.
     * *   You must first unbind the plug-in from the API. Otherwise, an error is reported when you delete the plug-in.
     *
     * @param request DeletePluginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePluginResponse
     */
    public DeletePluginResponse deletePluginWithOptions(DeletePluginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePluginResponse());
    }

    /**
     * @summary Deletes a plug-in.
     *
     * @description *   This operation is intended for API providers.
     * *   You must first unbind the plug-in from the API. Otherwise, an error is reported when you delete the plug-in.
     *
     * @param request DeletePluginRequest
     * @return DeletePluginResponse
     */
    public DeletePluginResponse deletePlugin(DeletePluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePluginWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a backend signature key.
     *
     * @description *   This API is intended for API providers.
     * *   This API operation deletes an existing backend signature key.
     * *   You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSignatureResponse
     */
    public DeleteSignatureResponse deleteSignatureWithOptions(DeleteSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSignatureResponse());
    }

    /**
     * @summary Deletes a backend signature key.
     *
     * @description *   This API is intended for API providers.
     * *   This API operation deletes an existing backend signature key.
     * *   You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteSignatureRequest
     * @return DeleteSignatureResponse
     */
    public DeleteSignatureResponse deleteSignature(DeleteSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSignatureWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a custom throttling policy and the special throttling rules in the policy.
     *
     * @description *   This API is intended for API providers.
     * *   If the throttling policy you want to delete is bound to APIs, you need to unbind the policy first. Otherwise, an error is reported when you delete the policy.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteTrafficControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrafficControlResponse
     */
    public DeleteTrafficControlResponse deleteTrafficControlWithOptions(DeleteTrafficControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficControlResponse());
    }

    /**
     * @summary Deletes a custom throttling policy and the special throttling rules in the policy.
     *
     * @description *   This API is intended for API providers.
     * *   If the throttling policy you want to delete is bound to APIs, you need to unbind the policy first. Otherwise, an error is reported when you delete the policy.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeleteTrafficControlRequest
     * @return DeleteTrafficControlResponse
     */
    public DeleteTrafficControlResponse deleteTrafficControl(DeleteTrafficControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTrafficControlWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a custom special throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   You can obtain the input parameters required in this operation by calling other APIs.
     *
     * @param request DeleteTrafficSpecialControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrafficSpecialControlResponse
     */
    public DeleteTrafficSpecialControlResponse deleteTrafficSpecialControlWithOptions(DeleteTrafficSpecialControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialKey)) {
            query.put("SpecialKey", request.specialKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialType)) {
            query.put("SpecialType", request.specialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficSpecialControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficSpecialControlResponse());
    }

    /**
     * @summary Deletes a custom special throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   You can obtain the input parameters required in this operation by calling other APIs.
     *
     * @param request DeleteTrafficSpecialControlRequest
     * @return DeleteTrafficSpecialControlResponse
     */
    public DeleteTrafficSpecialControlResponse deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTrafficSpecialControlWithOptions(request, runtime);
    }

    /**
     * @summary Publishes an API to an environment.
     *
     * @description *   This operation is intended for API providers. Only the API that you have defined and published to a runtime environment can be called.
     * *   An API is published to a cluster in under 5 seconds.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeployApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployApiResponse
     */
    public DeployApiResponse deployApiWithOptions(DeployApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployApiResponse());
    }

    /**
     * @summary Publishes an API to an environment.
     *
     * @description *   This operation is intended for API providers. Only the API that you have defined and published to a runtime environment can be called.
     * *   An API is published to a cluster in under 5 seconds.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request DeployApiRequest
     * @return DeployApiResponse
     */
    public DeployApiResponse deployApi(DeployApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployApiWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAbolishApiTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAbolishApiTaskResponse
     */
    public DescribeAbolishApiTaskResponse describeAbolishApiTaskWithOptions(DescribeAbolishApiTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationUid)) {
            query.put("OperationUid", request.operationUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAbolishApiTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAbolishApiTaskResponse());
    }

    /**
     * @param request DescribeAbolishApiTaskRequest
     * @return DescribeAbolishApiTaskResponse
     */
    public DescribeAbolishApiTaskResponse describeAbolishApiTask(DescribeAbolishApiTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAbolishApiTaskWithOptions(request, runtime);
    }

    /**
     * @summary This feature provides instance-level access control for dedicated instances. Queries the details of an access control policy.
     *
     * @param request DescribeAccessControlListAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessControlListAttributeResponse
     */
    public DescribeAccessControlListAttributeResponse describeAccessControlListAttributeWithOptions(DescribeAccessControlListAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessControlListAttribute"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessControlListAttributeResponse());
    }

    /**
     * @summary This feature provides instance-level access control for dedicated instances. Queries the details of an access control policy.
     *
     * @param request DescribeAccessControlListAttributeRequest
     * @return DescribeAccessControlListAttributeResponse
     */
    public DescribeAccessControlListAttributeResponse describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessControlListAttributeWithOptions(request, runtime);
    }

    /**
     * @summary This feature provides instance-level access control for dedicated instances. Queries access control policies.
     *
     * @param request DescribeAccessControlListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessControlListsResponse
     */
    public DescribeAccessControlListsResponse describeAccessControlListsWithOptions(DescribeAccessControlListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessControlLists"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessControlListsResponse());
    }

    /**
     * @summary This feature provides instance-level access control for dedicated instances. Queries access control policies.
     *
     * @param request DescribeAccessControlListsRequest
     * @return DescribeAccessControlListsResponse
     */
    public DescribeAccessControlListsResponse describeAccessControlLists(DescribeAccessControlListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessControlListsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the definition of an API.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DescribeApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiResponse
     */
    public DescribeApiResponse describeApiWithOptions(DescribeApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiResponse());
    }

    /**
     * @summary Queries the definition of an API.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DescribeApiRequest
     * @return DescribeApiResponse
     */
    public DescribeApiResponse describeApi(DescribeApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiWithOptions(request, runtime);
    }

    /**
     * @summary Queries the documentation of an API.
     *
     * @description *   For API callers, the specified API must be a public or authorized private API that has been published to a runtime environment.
     * *   When you call this operation as an API caller, the service information, parameter definitions, and other details of the API you specify are returned.
     * *   When you call this operation as an API provider, the definition of the specified API running in the specified runtime environment is returned. The returned definition takes effect in the runtime environment, and may be different from the definition of the API you modify.
     * *   Before you call this operation as an API provider, ensure that the API to be queried is a public one or that your application has been authorized to call the API, because authentication on API callers is required.
     *
     * @param request DescribeApiDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiDocResponse
     */
    public DescribeApiDocResponse describeApiDocWithOptions(DescribeApiDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiDoc"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiDocResponse());
    }

    /**
     * @summary Queries the documentation of an API.
     *
     * @description *   For API callers, the specified API must be a public or authorized private API that has been published to a runtime environment.
     * *   When you call this operation as an API caller, the service information, parameter definitions, and other details of the API you specify are returned.
     * *   When you call this operation as an API provider, the definition of the specified API running in the specified runtime environment is returned. The returned definition takes effect in the runtime environment, and may be different from the definition of the API you modify.
     * *   Before you call this operation as an API provider, ensure that the API to be queried is a public one or that your application has been authorized to call the API, because authentication on API callers is required.
     *
     * @param request DescribeApiDocRequest
     * @return DescribeApiDocResponse
     */
    public DescribeApiDocResponse describeApiDoc(DescribeApiDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiDocWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to query details about an API group, including the automatically assigned second-level domain name, custom domain name, and SSL certificate.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DescribeApiGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiGroupResponse
     */
    public DescribeApiGroupResponse describeApiGroupWithOptions(DescribeApiGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupResponse());
    }

    /**
     * @summary You can call this operation to query details about an API group, including the automatically assigned second-level domain name, custom domain name, and SSL certificate.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DescribeApiGroupRequest
     * @return DescribeApiGroupResponse
     */
    public DescribeApiGroupResponse describeApiGroup(DescribeApiGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the VPC whitelist that is allowed to access an API group.
     *
     * @param request DescribeApiGroupVpcWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiGroupVpcWhitelistResponse
     */
    public DescribeApiGroupVpcWhitelistResponse describeApiGroupVpcWhitelistWithOptions(DescribeApiGroupVpcWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroupVpcWhitelist"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupVpcWhitelistResponse());
    }

    /**
     * @summary Queries the VPC whitelist that is allowed to access an API group.
     *
     * @param request DescribeApiGroupVpcWhitelistRequest
     * @return DescribeApiGroupVpcWhitelistResponse
     */
    public DescribeApiGroupVpcWhitelistResponse describeApiGroupVpcWhitelist(DescribeApiGroupVpcWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiGroupVpcWhitelistWithOptions(request, runtime);
    }

    /**
     * @summary Queries existing API groups and their basic information.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DescribeApiGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiGroupsResponse
     */
    public DescribeApiGroupsResponse describeApiGroupsWithOptions(DescribeApiGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableTagAuth)) {
            query.put("EnableTagAuth", request.enableTagAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroups"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupsResponse());
    }

    /**
     * @summary Queries existing API groups and their basic information.
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     */
    public DescribeApiGroupsResponse describeApiGroups(DescribeApiGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the historical versions of a specified API.
     *
     * @description *   This operation is intended for API providers. Only APIs that have been published have historical version records.
     * *   This operation allows you to obtain the historical versions of an API. This operation is always called by other operations.
     *
     * @param request DescribeApiHistoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiHistoriesResponse
     */
    public DescribeApiHistoriesResponse describeApiHistoriesWithOptions(DescribeApiHistoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiHistories"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiHistoriesResponse());
    }

    /**
     * @summary Queries the historical versions of a specified API.
     *
     * @description *   This operation is intended for API providers. Only APIs that have been published have historical version records.
     * *   This operation allows you to obtain the historical versions of an API. This operation is always called by other operations.
     *
     * @param request DescribeApiHistoriesRequest
     * @return DescribeApiHistoriesResponse
     */
    public DescribeApiHistoriesResponse describeApiHistories(DescribeApiHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiHistoriesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a specified historical version of a specified API definition.
     *
     * @description Queries the details of a specified historical version of a specified API definition.
     * *   This API is intended for API providers.
     * *   API Gateway records the time and definition of an API every time the API is published. You can use the version number obtained from other operations to query definition details at a certain publication.
     *
     * @param request DescribeApiHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiHistoryResponse
     */
    public DescribeApiHistoryResponse describeApiHistoryWithOptions(DescribeApiHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyVersion)) {
            query.put("HistoryVersion", request.historyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiHistory"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiHistoryResponse());
    }

    /**
     * @summary Queries the details of a specified historical version of a specified API definition.
     *
     * @description Queries the details of a specified historical version of a specified API definition.
     * *   This API is intended for API providers.
     * *   API Gateway records the time and definition of an API every time the API is published. You can use the version number obtained from other operations to query definition details at a certain publication.
     *
     * @param request DescribeApiHistoryRequest
     * @return DescribeApiHistoryResponse
     */
    public DescribeApiHistoryResponse describeApiHistory(DescribeApiHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiHistoryWithOptions(request, runtime);
    }

    /**
     * @summary Queries the access control lists (ACLs) that are bound to all the APIs in an API group in a specified environment.
     *
     * @description *   This operation is intended for API callers.
     * *   If an optional parameter is not specified, all results are returned on separate pages.
     * ·
     *
     * @param request DescribeApiIpControlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiIpControlsResponse
     */
    public DescribeApiIpControlsResponse describeApiIpControlsWithOptions(DescribeApiIpControlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiIpControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiIpControlsResponse());
    }

    /**
     * @summary Queries the access control lists (ACLs) that are bound to all the APIs in an API group in a specified environment.
     *
     * @description *   This operation is intended for API callers.
     * *   If an optional parameter is not specified, all results are returned on separate pages.
     * ·
     *
     * @param request DescribeApiIpControlsRequest
     * @return DescribeApiIpControlsResponse
     */
    public DescribeApiIpControlsResponse describeApiIpControls(DescribeApiIpControlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiIpControlsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the response time statistics of an API.
     *
     * @description You can call this operation to query the latency metrics in milliseconds for a specified API.
     * *   This API is intended for API providers.
     * *   Only statistics for API calls made in the release environment are collected by default.
     *
     * @param request DescribeApiLatencyDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiLatencyDataResponse
     */
    public DescribeApiLatencyDataResponse describeApiLatencyDataWithOptions(DescribeApiLatencyDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiLatencyData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiLatencyDataResponse());
    }

    /**
     * @summary Queries the response time statistics of an API.
     *
     * @description You can call this operation to query the latency metrics in milliseconds for a specified API.
     * *   This API is intended for API providers.
     * *   Only statistics for API calls made in the release environment are collected by default.
     *
     * @param request DescribeApiLatencyDataRequest
     * @return DescribeApiLatencyDataResponse
     */
    public DescribeApiLatencyDataResponse describeApiLatencyData(DescribeApiLatencyDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiLatencyDataWithOptions(request, runtime);
    }

    /**
     * @summary Queries the Alibaba Cloud Marketplace attributes of an API.
     *
     * @param request DescribeApiMarketAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiMarketAttributesResponse
     */
    public DescribeApiMarketAttributesResponse describeApiMarketAttributesWithOptions(DescribeApiMarketAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiMarketAttributes"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiMarketAttributesResponse());
    }

    /**
     * @summary Queries the Alibaba Cloud Marketplace attributes of an API.
     *
     * @param request DescribeApiMarketAttributesRequest
     * @return DescribeApiMarketAttributesResponse
     */
    public DescribeApiMarketAttributesResponse describeApiMarketAttributes(DescribeApiMarketAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiMarketAttributesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the attached APIs of an API product.
     *
     * @param request DescribeApiProductApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiProductApisResponse
     */
    public DescribeApiProductApisResponse describeApiProductApisWithOptions(DescribeApiProductApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductId)) {
            query.put("ApiProductId", request.apiProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiProductApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiProductApisResponse());
    }

    /**
     * @summary Queries the attached APIs of an API product.
     *
     * @param request DescribeApiProductApisRequest
     * @return DescribeApiProductApisResponse
     */
    public DescribeApiProductApisResponse describeApiProductApis(DescribeApiProductApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiProductApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries API products by application.
     *
     * @param request DescribeApiProductsByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiProductsByAppResponse
     */
    public DescribeApiProductsByAppResponse describeApiProductsByAppWithOptions(DescribeApiProductsByAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiProductsByApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiProductsByAppResponse());
    }

    /**
     * @summary Queries API products by application.
     *
     * @param request DescribeApiProductsByAppRequest
     * @return DescribeApiProductsByAppResponse
     */
    public DescribeApiProductsByAppResponse describeApiProductsByApp(DescribeApiProductsByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiProductsByAppWithOptions(request, runtime);
    }

    /**
     * @summary Queries the QPS statistics of an API.
     *
     * @description *   This API is intended for API providers.
     * *   Only statistics for API calls made in the release environment are collected by default.
     *
     * @param request DescribeApiQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiQpsDataResponse
     */
    public DescribeApiQpsDataResponse describeApiQpsDataWithOptions(DescribeApiQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiQpsData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiQpsDataResponse());
    }

    /**
     * @summary Queries the QPS statistics of an API.
     *
     * @description *   This API is intended for API providers.
     * *   Only statistics for API calls made in the release environment are collected by default.
     *
     * @param request DescribeApiQpsDataRequest
     * @return DescribeApiQpsDataResponse
     */
    public DescribeApiQpsDataResponse describeApiQpsData(DescribeApiQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiQpsDataWithOptions(request, runtime);
    }

    /**
     * @summary Queries the backend signature keys that are bound to the APIs of a specified API group in a specified environment.
     *
     * @description *   This API is intended for API providers.
     * *   The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.
     *
     * @param request DescribeApiSignaturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiSignaturesResponse
     */
    public DescribeApiSignaturesResponse describeApiSignaturesWithOptions(DescribeApiSignaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiSignatures"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiSignaturesResponse());
    }

    /**
     * @summary Queries the backend signature keys that are bound to the APIs of a specified API group in a specified environment.
     *
     * @description *   This API is intended for API providers.
     * *   The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.
     *
     * @param request DescribeApiSignaturesRequest
     * @return DescribeApiSignaturesResponse
     */
    public DescribeApiSignaturesResponse describeApiSignatures(DescribeApiSignaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiSignaturesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the throttling policies bound to all members of an API group in a specified environment.
     *
     * @description *   This API is intended for API providers.
     * *   The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.
     *
     * @param request DescribeApiTrafficControlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiTrafficControlsResponse
     */
    public DescribeApiTrafficControlsResponse describeApiTrafficControlsWithOptions(DescribeApiTrafficControlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiTrafficControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiTrafficControlsResponse());
    }

    /**
     * @summary Queries the throttling policies bound to all members of an API group in a specified environment.
     *
     * @description *   This API is intended for API providers.
     * *   The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.
     *
     * @param request DescribeApiTrafficControlsRequest
     * @return DescribeApiTrafficControlsResponse
     */
    public DescribeApiTrafficControlsResponse describeApiTrafficControls(DescribeApiTrafficControlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiTrafficControlsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the statistics on the traffic of an API.
     *
     * @description *   This API is intended for API providers.
     * *   Only statistics for API calls made in the release environment are collected by default.
     *
     * @param request DescribeApiTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiTrafficDataResponse
     */
    public DescribeApiTrafficDataResponse describeApiTrafficDataWithOptions(DescribeApiTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiTrafficData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiTrafficDataResponse());
    }

    /**
     * @summary Queries the statistics on the traffic of an API.
     *
     * @description *   This API is intended for API providers.
     * *   Only statistics for API calls made in the release environment are collected by default.
     *
     * @param request DescribeApiTrafficDataRequest
     * @return DescribeApiTrafficDataResponse
     */
    public DescribeApiTrafficDataResponse describeApiTrafficData(DescribeApiTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiTrafficDataWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of APIs that are being defined.
     *
     * @description *   This operation is intended for API callers.
     * *   This operation returns a list of all APIs that are being defined. The basic information about these APIs is also returned in the list.
     * *   This operation returns all APIs that are being edited, regardless of their environments. The returned definitions may be different from the definitions in the environments.
     *
     * @param request DescribeApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisResponse
     */
    public DescribeApisResponse describeApisWithOptions(DescribeApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiMethod)) {
            query.put("ApiMethod", request.apiMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPath)) {
            query.put("ApiPath", request.apiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTagAuth)) {
            query.put("EnableTagAuth", request.enableTagAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unDeployed)) {
            query.put("UnDeployed", request.unDeployed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisResponse());
    }

    /**
     * @summary Queries a list of APIs that are being defined.
     *
     * @description *   This operation is intended for API callers.
     * *   This operation returns a list of all APIs that are being defined. The basic information about these APIs is also returned in the list.
     * *   This operation returns all APIs that are being edited, regardless of their environments. The returned definitions may be different from the definitions in the environments.
     *
     * @param request DescribeApisRequest
     * @return DescribeApisResponse
     */
    public DescribeApisResponse describeApis(DescribeApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisWithOptions(request, runtime);
    }

    /**
     * @param request DescribeApisByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisByAppResponse
     */
    public DescribeApisByAppResponse describeApisByAppWithOptions(DescribeApisByAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiUid)) {
            query.put("ApiUid", request.apiUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByAppResponse());
    }

    /**
     * @param request DescribeApisByAppRequest
     * @return DescribeApisByAppResponse
     */
    public DescribeApisByAppResponse describeApisByApp(DescribeApisByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisByAppWithOptions(request, runtime);
    }

    /**
     * @summary Queries APIs in the draft or published state that are created by using a specified backend service.
     *
     * @param request DescribeApisByBackendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisByBackendResponse
     */
    public DescribeApisByBackendResponse describeApisByBackendWithOptions(DescribeApisByBackendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByBackend"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByBackendResponse());
    }

    /**
     * @summary Queries APIs in the draft or published state that are created by using a specified backend service.
     *
     * @param request DescribeApisByBackendRequest
     * @return DescribeApisByBackendResponse
     */
    public DescribeApisByBackendResponse describeApisByBackend(DescribeApisByBackendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisByBackendWithOptions(request, runtime);
    }

    /**
     * @summary Queries the APIs that are bound to an access control list (ACL).
     *
     * @description *   This operation is intended for API callers.
     * *   You can specify PageNumber to obtain the result on the specified page.
     *
     * @param request DescribeApisByIpControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisByIpControlResponse
     */
    public DescribeApisByIpControlResponse describeApisByIpControlWithOptions(DescribeApisByIpControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByIpControlResponse());
    }

    /**
     * @summary Queries the APIs that are bound to an access control list (ACL).
     *
     * @description *   This operation is intended for API callers.
     * *   You can specify PageNumber to obtain the result on the specified page.
     *
     * @param request DescribeApisByIpControlRequest
     * @return DescribeApisByIpControlResponse
     */
    public DescribeApisByIpControlResponse describeApisByIpControl(DescribeApisByIpControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisByIpControlWithOptions(request, runtime);
    }

    /**
     * @summary Queries the APIs to which a specified backend signature key is bound.
     *
     * @description *   This API is intended for API providers.
     * *   The results are returned on separate pages. You can specify PageNumber to obtain the result on the specified page.
     *
     * @param request DescribeApisBySignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisBySignatureResponse
     */
    public DescribeApisBySignatureResponse describeApisBySignatureWithOptions(DescribeApisBySignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisBySignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisBySignatureResponse());
    }

    /**
     * @summary Queries the APIs to which a specified backend signature key is bound.
     *
     * @description *   This API is intended for API providers.
     * *   The results are returned on separate pages. You can specify PageNumber to obtain the result on the specified page.
     *
     * @param request DescribeApisBySignatureRequest
     * @return DescribeApisBySignatureResponse
     */
    public DescribeApisBySignatureResponse describeApisBySignature(DescribeApisBySignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisBySignatureWithOptions(request, runtime);
    }

    /**
     * @summary Queries the APIs to which a specified throttling policy is bound.
     *
     * @description *   This API is intended for API providers.
     * *   You can specify PageNumber to obtain the result on the specified page.
     *
     * @param request DescribeApisByTrafficControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisByTrafficControlResponse
     */
    public DescribeApisByTrafficControlResponse describeApisByTrafficControlWithOptions(DescribeApisByTrafficControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByTrafficControlResponse());
    }

    /**
     * @summary Queries the APIs to which a specified throttling policy is bound.
     *
     * @description *   This API is intended for API providers.
     * *   You can specify PageNumber to obtain the result on the specified page.
     *
     * @param request DescribeApisByTrafficControlRequest
     * @return DescribeApisByTrafficControlResponse
     */
    public DescribeApisByTrafficControlResponse describeApisByTrafficControl(DescribeApisByTrafficControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisByTrafficControlWithOptions(request, runtime);
    }

    /**
     * @param request DescribeApisByVpcAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisByVpcAccessResponse
     */
    public DescribeApisByVpcAccessResponse describeApisByVpcAccessWithOptions(DescribeApisByVpcAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcName)) {
            query.put("VpcName", request.vpcName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByVpcAccess"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByVpcAccessResponse());
    }

    /**
     * @param request DescribeApisByVpcAccessRequest
     * @return DescribeApisByVpcAccessResponse
     */
    public DescribeApisByVpcAccessResponse describeApisByVpcAccess(DescribeApisByVpcAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisByVpcAccessWithOptions(request, runtime);
    }

    /**
     * @summary Queries APIs by application. The environment information is also returned.
     *
     * @param request DescribeApisWithStageNameIntegratedByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisWithStageNameIntegratedByAppResponse
     */
    public DescribeApisWithStageNameIntegratedByAppResponse describeApisWithStageNameIntegratedByAppWithOptions(DescribeApisWithStageNameIntegratedByAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiUid)) {
            query.put("ApiUid", request.apiUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisWithStageNameIntegratedByApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisWithStageNameIntegratedByAppResponse());
    }

    /**
     * @summary Queries APIs by application. The environment information is also returned.
     *
     * @param request DescribeApisWithStageNameIntegratedByAppRequest
     * @return DescribeApisWithStageNameIntegratedByAppResponse
     */
    public DescribeApisWithStageNameIntegratedByAppResponse describeApisWithStageNameIntegratedByApp(DescribeApisWithStageNameIntegratedByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisWithStageNameIntegratedByAppWithOptions(request, runtime);
    }

    /**
     * @summary Queries the apps that can be authorized.
     *
     * @param request DescribeAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppResponse
     */
    public DescribeAppResponse describeAppWithOptions(DescribeAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppResponse());
    }

    /**
     * @summary Queries the apps that can be authorized.
     *
     * @param request DescribeAppRequest
     * @return DescribeAppResponse
     */
    public DescribeAppResponse describeApp(DescribeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppWithOptions(request, runtime);
    }

    /**
     * @summary Queries apps and their basic information.
     *
     * @description *   This operation is intended for API callers.
     * *   AppId is optional.
     *
     * @param request DescribeAppAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppAttributesResponse
     */
    public DescribeAppAttributesResponse describeAppAttributesWithOptions(DescribeAppAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTagAuth)) {
            query.put("EnableTagAuth", request.enableTagAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppAttributes"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppAttributesResponse());
    }

    /**
     * @summary Queries apps and their basic information.
     *
     * @description *   This operation is intended for API callers.
     * *   AppId is optional.
     *
     * @param request DescribeAppAttributesRequest
     * @return DescribeAppAttributesResponse
     */
    public DescribeAppAttributesResponse describeAppAttributes(DescribeAppAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppAttributesWithOptions(request, runtime);
    }

    /**
     * @summary 查询APP的密钥信息
     *
     * @param request DescribeAppSecuritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppSecuritiesResponse
     */
    public DescribeAppSecuritiesResponse describeAppSecuritiesWithOptions(DescribeAppSecuritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppSecurities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppSecuritiesResponse());
    }

    /**
     * @summary 查询APP的密钥信息
     *
     * @param request DescribeAppSecuritiesRequest
     * @return DescribeAppSecuritiesResponse
     */
    public DescribeAppSecuritiesResponse describeAppSecurities(DescribeAppSecuritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppSecuritiesWithOptions(request, runtime);
    }

    /**
     * @summary This key is used for authentication when an API call is made.
     *
     * @description *   This operation is intended for API callers.
     *
     * @param request DescribeAppSecurityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppSecurityResponse
     */
    public DescribeAppSecurityResponse describeAppSecurityWithOptions(DescribeAppSecurityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppSecurity"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppSecurityResponse());
    }

    /**
     * @summary This key is used for authentication when an API call is made.
     *
     * @description *   This operation is intended for API callers.
     *
     * @param request DescribeAppSecurityRequest
     * @return DescribeAppSecurityResponse
     */
    public DescribeAppSecurityResponse describeAppSecurity(DescribeAppSecurityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppSecurityWithOptions(request, runtime);
    }

    /**
     * @summary Queries the apps. App information is returned only to the app owner.
     *
     * @description *   This API is intended for API providers.
     * *   API providers can use the app IDs or their Apsara Stack tenant accounts to query app information.
     * *   Each provider can call this operation for a maximum of 200 times every day in a region.
     *
     * @param request DescribeAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appOwner)) {
            query.put("AppOwner", request.appOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    /**
     * @summary Queries the apps. App information is returned only to the app owner.
     *
     * @description *   This API is intended for API providers.
     * *   API providers can use the app IDs or their Apsara Stack tenant accounts to query app information.
     * *   Each provider can call this operation for a maximum of 200 times every day in a region.
     *
     * @param request DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    /**
     * @summary Queries authorized applications by API product.
     *
     * @param request DescribeAppsByApiProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsByApiProductResponse
     */
    public DescribeAppsByApiProductResponse describeAppsByApiProductWithOptions(DescribeAppsByApiProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductId)) {
            query.put("ApiProductId", request.apiProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppsByApiProduct"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsByApiProductResponse());
    }

    /**
     * @summary Queries authorized applications by API product.
     *
     * @param request DescribeAppsByApiProductRequest
     * @return DescribeAppsByApiProductResponse
     */
    public DescribeAppsByApiProductResponse describeAppsByApiProduct(DescribeAppsByApiProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsByApiProductWithOptions(request, runtime);
    }

    /**
     * @summary Queries the authorized APIs of a specified APP.
     *
     * @description *   This operation is intended for API callers.
     * *   The specified application can call all APIs included in the responses.
     *
     * @param request DescribeAuthorizedApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthorizedApisResponse
     */
    public DescribeAuthorizedApisResponse describeAuthorizedApisWithOptions(DescribeAuthorizedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthorizedApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthorizedApisResponse());
    }

    /**
     * @summary Queries the authorized APIs of a specified APP.
     *
     * @description *   This operation is intended for API callers.
     * *   The specified application can call all APIs included in the responses.
     *
     * @param request DescribeAuthorizedApisRequest
     * @return DescribeAuthorizedApisResponse
     */
    public DescribeAuthorizedApisResponse describeAuthorizedApis(DescribeAuthorizedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthorizedApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries the current apps.
     *
     * @description *   This operation is intended for API providers.
     * *   All applications included in the responses have access to the specified API.
     *
     * @param request DescribeAuthorizedAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthorizedAppsResponse
     */
    public DescribeAuthorizedAppsResponse describeAuthorizedAppsWithOptions(DescribeAuthorizedAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appOwnerId)) {
            query.put("AppOwnerId", request.appOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthorizedApps"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthorizedAppsResponse());
    }

    /**
     * @summary Queries the current apps.
     *
     * @description *   This operation is intended for API providers.
     * *   All applications included in the responses have access to the specified API.
     *
     * @param request DescribeAuthorizedAppsRequest
     * @return DescribeAuthorizedAppsResponse
     */
    public DescribeAuthorizedAppsResponse describeAuthorizedApps(DescribeAuthorizedAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthorizedAppsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a backend service and its URL configured for each environment.
     *
     * @param request DescribeBackendInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackendInfoResponse
     */
    public DescribeBackendInfoResponse describeBackendInfoWithOptions(DescribeBackendInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackendInfo"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackendInfoResponse());
    }

    /**
     * @summary Queries the information about a backend service and its URL configured for each environment.
     *
     * @param request DescribeBackendInfoRequest
     * @return DescribeBackendInfoResponse
     */
    public DescribeBackendInfoResponse describeBackendInfo(DescribeBackendInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackendInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries backend services. You can filter backend services by backend service name and backend service type.
     *
     * @param request DescribeBackendListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackendListResponse
     */
    public DescribeBackendListResponse describeBackendListWithOptions(DescribeBackendListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendName)) {
            query.put("BackendName", request.backendName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendType)) {
            query.put("BackendType", request.backendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackendList"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackendListResponse());
    }

    /**
     * @summary Queries backend services. You can filter backend services by backend service name and backend service type.
     *
     * @param request DescribeBackendListRequest
     * @return DescribeBackendListResponse
     */
    public DescribeBackendListResponse describeBackendList(DescribeBackendListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackendListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a single dataset.
     *
     * @param request DescribeDatasetInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatasetInfoResponse
     */
    public DescribeDatasetInfoResponse describeDatasetInfoWithOptions(DescribeDatasetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatasetInfo"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatasetInfoResponse());
    }

    /**
     * @summary Queries the information about a single dataset.
     *
     * @param request DescribeDatasetInfoRequest
     * @return DescribeDatasetInfoResponse
     */
    public DescribeDatasetInfoResponse describeDatasetInfo(DescribeDatasetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatasetInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries a data entry in a custom dataset.
     *
     * @param request DescribeDatasetItemInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatasetItemInfoResponse
     */
    public DescribeDatasetItemInfoResponse describeDatasetItemInfoWithOptions(DescribeDatasetItemInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetItemId)) {
            query.put("DatasetItemId", request.datasetItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatasetItemInfo"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatasetItemInfoResponse());
    }

    /**
     * @summary Queries a data entry in a custom dataset.
     *
     * @param request DescribeDatasetItemInfoRequest
     * @return DescribeDatasetItemInfoResponse
     */
    public DescribeDatasetItemInfoResponse describeDatasetItemInfo(DescribeDatasetItemInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatasetItemInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the data entries of a custom dataset.
     *
     * @param request DescribeDatasetItemListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatasetItemListResponse
     */
    public DescribeDatasetItemListResponse describeDatasetItemListWithOptions(DescribeDatasetItemListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetItemIds)) {
            query.put("DatasetItemIds", request.datasetItemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatasetItemList"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatasetItemListResponse());
    }

    /**
     * @summary Queries the data entries of a custom dataset.
     *
     * @param request DescribeDatasetItemListRequest
     * @return DescribeDatasetItemListResponse
     */
    public DescribeDatasetItemListResponse describeDatasetItemList(DescribeDatasetItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatasetItemListWithOptions(request, runtime);
    }

    /**
     * @summary Queries custom datasets.
     *
     * @param request DescribeDatasetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatasetListResponse
     */
    public DescribeDatasetListResponse describeDatasetListWithOptions(DescribeDatasetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetIds)) {
            query.put("DatasetIds", request.datasetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatasetList"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatasetListResponse());
    }

    /**
     * @summary Queries custom datasets.
     *
     * @param request DescribeDatasetListRequest
     * @return DescribeDatasetListResponse
     */
    public DescribeDatasetListResponse describeDatasetList(DescribeDatasetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatasetListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the progress of an asynchronous API publishing task.
     *
     * @param request DescribeDeployApiTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeployApiTaskResponse
     */
    public DescribeDeployApiTaskResponse describeDeployApiTaskWithOptions(DescribeDeployApiTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationUid)) {
            query.put("OperationUid", request.operationUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployApiTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployApiTaskResponse());
    }

    /**
     * @summary Queries the progress of an asynchronous API publishing task.
     *
     * @param request DescribeDeployApiTaskRequest
     * @return DescribeDeployApiTaskResponse
     */
    public DescribeDeployApiTaskResponse describeDeployApiTask(DescribeDeployApiTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeployApiTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries the definition of an API that takes effect in an environment. The definition may differ from the definition being edited.
     *
     * @param request DescribeDeployedApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeployedApiResponse
     */
    public DescribeDeployedApiResponse describeDeployedApiWithOptions(DescribeDeployedApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployedApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployedApiResponse());
    }

    /**
     * @summary Queries the definition of an API that takes effect in an environment. The definition may differ from the definition being edited.
     *
     * @param request DescribeDeployedApiRequest
     * @return DescribeDeployedApiResponse
     */
    public DescribeDeployedApiResponse describeDeployedApi(DescribeDeployedApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeployedApiWithOptions(request, runtime);
    }

    /**
     * @summary Queries the APIs that are published to and running in an environment.
     *
     * @description *   This operation is intended for API callers.
     *
     * @param request DescribeDeployedApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeployedApisResponse
     */
    public DescribeDeployedApisResponse describeDeployedApisWithOptions(DescribeDeployedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiMethod)) {
            query.put("ApiMethod", request.apiMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPath)) {
            query.put("ApiPath", request.apiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTagAuth)) {
            query.put("EnableTagAuth", request.enableTagAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployedApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployedApisResponse());
    }

    /**
     * @summary Queries the APIs that are published to and running in an environment.
     *
     * @description *   This operation is intended for API callers.
     *
     * @param request DescribeDeployedApisRequest
     * @return DescribeDeployedApisResponse
     */
    public DescribeDeployedApisResponse describeDeployedApis(DescribeDeployedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeployedApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a bound custom domain name, including the system assigned second-level domain name, custom domain name, and SSL certificate.
     *
     * @param request DescribeDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainResponse
     */
    public DescribeDomainResponse describeDomainWithOptions(DescribeDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResponse());
    }

    /**
     * @summary Queries the details about a bound custom domain name, including the system assigned second-level domain name, custom domain name, and SSL certificate.
     *
     * @param request DescribeDomainRequest
     * @return DescribeDomainResponse
     */
    public DescribeDomainResponse describeDomain(DescribeDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainWithOptions(request, runtime);
    }

    /**
     * @summary Queries the average latency of an API group in an environment.
     *
     * @param request DescribeGroupLatencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupLatencyResponse
     */
    public DescribeGroupLatencyResponse describeGroupLatencyWithOptions(DescribeGroupLatencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupLatency"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupLatencyResponse());
    }

    /**
     * @summary Queries the average latency of an API group in an environment.
     *
     * @param request DescribeGroupLatencyRequest
     * @return DescribeGroupLatencyResponse
     */
    public DescribeGroupLatencyResponse describeGroupLatency(DescribeGroupLatencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupLatencyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the statistics on the number of requests directed to an API group within a period of time.
     *
     * @param request DescribeGroupQpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupQpsResponse
     */
    public DescribeGroupQpsResponse describeGroupQpsWithOptions(DescribeGroupQpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupQps"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupQpsResponse());
    }

    /**
     * @summary Queries the statistics on the number of requests directed to an API group within a period of time.
     *
     * @param request DescribeGroupQpsRequest
     * @return DescribeGroupQpsResponse
     */
    public DescribeGroupQpsResponse describeGroupQps(DescribeGroupQpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupQpsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the traffic of an API group.
     *
     * @param request DescribeGroupTrafficRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupTrafficResponse
     */
    public DescribeGroupTrafficResponse describeGroupTrafficWithOptions(DescribeGroupTrafficRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupTraffic"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupTrafficResponse());
    }

    /**
     * @summary Queries the traffic of an API group.
     *
     * @param request DescribeGroupTrafficRequest
     * @return DescribeGroupTrafficResponse
     */
    public DescribeGroupTrafficResponse describeGroupTraffic(DescribeGroupTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupTrafficWithOptions(request, runtime);
    }

    /**
     * @param request DescribeHistoryApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHistoryApisResponse
     */
    public DescribeHistoryApisResponse describeHistoryApisWithOptions(DescribeHistoryApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHistoryApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHistoryApisResponse());
    }

    /**
     * @param request DescribeHistoryApisRequest
     * @return DescribeHistoryApisResponse
     */
    public DescribeHistoryApisResponse describeHistoryApis(DescribeHistoryApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHistoryApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries the result of an OAS API import task.
     *
     * @param request DescribeImportOASTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImportOASTaskResponse
     */
    public DescribeImportOASTaskResponse describeImportOASTaskWithOptions(DescribeImportOASTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImportOASTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImportOASTaskResponse());
    }

    /**
     * @summary Queries the result of an OAS API import task.
     *
     * @param request DescribeImportOASTaskRequest
     * @return DescribeImportOASTaskResponse
     */
    public DescribeImportOASTaskResponse describeImportOASTask(DescribeImportOASTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImportOASTaskWithOptions(request, runtime);
    }

    /**
     * @summary 查询专享实例集群的详情
     *
     * @param request DescribeInstanceClusterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceClusterInfoResponse
     */
    public DescribeInstanceClusterInfoResponse describeInstanceClusterInfoWithOptions(DescribeInstanceClusterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceClusterName)) {
            query.put("InstanceClusterName", request.instanceClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceClusterInfo"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceClusterInfoResponse());
    }

    /**
     * @summary 查询专享实例集群的详情
     *
     * @param request DescribeInstanceClusterInfoRequest
     * @return DescribeInstanceClusterInfoResponse
     */
    public DescribeInstanceClusterInfoResponse describeInstanceClusterInfo(DescribeInstanceClusterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceClusterInfoWithOptions(request, runtime);
    }

    /**
     * @summary 查询专享实例集群列表
     *
     * @param request DescribeInstanceClusterListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceClusterListResponse
     */
    public DescribeInstanceClusterListResponse describeInstanceClusterListWithOptions(DescribeInstanceClusterListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceClusterId)) {
            query.put("InstanceClusterId", request.instanceClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClusterName)) {
            query.put("InstanceClusterName", request.instanceClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceClusterList"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceClusterListResponse());
    }

    /**
     * @summary 查询专享实例集群列表
     *
     * @param request DescribeInstanceClusterListRequest
     * @return DescribeInstanceClusterListResponse
     */
    public DescribeInstanceClusterListResponse describeInstanceClusterList(DescribeInstanceClusterListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceClusterListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of lost connections to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceDropConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDropConnectionsResponse
     */
    public DescribeInstanceDropConnectionsResponse describeInstanceDropConnectionsWithOptions(DescribeInstanceDropConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sbcName)) {
            query.put("SbcName", request.sbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceDropConnections"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDropConnectionsResponse());
    }

    /**
     * @summary Queries the number of lost connections to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceDropConnectionsRequest
     * @return DescribeInstanceDropConnectionsResponse
     */
    public DescribeInstanceDropConnectionsResponse describeInstanceDropConnections(DescribeInstanceDropConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDropConnectionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of dropped packets within a period of time.
     *
     * @param request DescribeInstanceDropPacketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDropPacketResponse
     */
    public DescribeInstanceDropPacketResponse describeInstanceDropPacketWithOptions(DescribeInstanceDropPacketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sbcName)) {
            query.put("SbcName", request.sbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceDropPacket"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDropPacketResponse());
    }

    /**
     * @summary Queries the number of dropped packets within a period of time.
     *
     * @param request DescribeInstanceDropPacketRequest
     * @return DescribeInstanceDropPacketResponse
     */
    public DescribeInstanceDropPacketResponse describeInstanceDropPacket(DescribeInstanceDropPacketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDropPacketWithOptions(request, runtime);
    }

    /**
     * @summary Queries the distribution of HTTP status codes of requests to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceHttpCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceHttpCodeResponse
     */
    public DescribeInstanceHttpCodeResponse describeInstanceHttpCodeWithOptions(DescribeInstanceHttpCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceHttpCode"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceHttpCodeResponse());
    }

    /**
     * @summary Queries the distribution of HTTP status codes of requests to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceHttpCodeRequest
     * @return DescribeInstanceHttpCodeResponse
     */
    public DescribeInstanceHttpCodeResponse describeInstanceHttpCode(DescribeInstanceHttpCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceHttpCodeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the average latency of a dedicated instance over a period of time.
     *
     * @param request DescribeInstanceLatencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceLatencyResponse
     */
    public DescribeInstanceLatencyResponse describeInstanceLatencyWithOptions(DescribeInstanceLatencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceLatency"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceLatencyResponse());
    }

    /**
     * @summary Queries the average latency of a dedicated instance over a period of time.
     *
     * @param request DescribeInstanceLatencyRequest
     * @return DescribeInstanceLatencyResponse
     */
    public DescribeInstanceLatencyResponse describeInstanceLatency(DescribeInstanceLatencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceLatencyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of new connections to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceNewConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceNewConnectionsResponse
     */
    public DescribeInstanceNewConnectionsResponse describeInstanceNewConnectionsWithOptions(DescribeInstanceNewConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sbcName)) {
            query.put("SbcName", request.sbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceNewConnections"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceNewConnectionsResponse());
    }

    /**
     * @summary Queries the number of new connections to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceNewConnectionsRequest
     * @return DescribeInstanceNewConnectionsResponse
     */
    public DescribeInstanceNewConnectionsResponse describeInstanceNewConnections(DescribeInstanceNewConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceNewConnectionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the numbers of inbound and outbound packets of a dedicated instance within a period of time.
     *
     * @param request DescribeInstancePacketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancePacketsResponse
     */
    public DescribeInstancePacketsResponse describeInstancePacketsWithOptions(DescribeInstancePacketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sbcName)) {
            query.put("SbcName", request.sbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstancePackets"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancePacketsResponse());
    }

    /**
     * @summary Queries the numbers of inbound and outbound packets of a dedicated instance within a period of time.
     *
     * @param request DescribeInstancePacketsRequest
     * @return DescribeInstancePacketsResponse
     */
    public DescribeInstancePacketsResponse describeInstancePackets(DescribeInstancePacketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancePacketsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of requests to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceQpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceQpsResponse
     */
    public DescribeInstanceQpsResponse describeInstanceQpsWithOptions(DescribeInstanceQpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceQps"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceQpsResponse());
    }

    /**
     * @summary Queries the number of requests to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceQpsRequest
     * @return DescribeInstanceQpsResponse
     */
    public DescribeInstanceQpsResponse describeInstanceQps(DescribeInstanceQpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceQpsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of concurrent connections to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceSlbConnectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSlbConnectResponse
     */
    public DescribeInstanceSlbConnectResponse describeInstanceSlbConnectWithOptions(DescribeInstanceSlbConnectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sbcName)) {
            query.put("SbcName", request.sbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSlbConnect"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSlbConnectResponse());
    }

    /**
     * @summary Queries the number of concurrent connections to a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceSlbConnectRequest
     * @return DescribeInstanceSlbConnectResponse
     */
    public DescribeInstanceSlbConnectResponse describeInstanceSlbConnect(DescribeInstanceSlbConnectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSlbConnectWithOptions(request, runtime);
    }

    /**
     * @summary Queries the request traffic and response traffic of a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceTrafficRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceTrafficResponse
     */
    public DescribeInstanceTrafficResponse describeInstanceTrafficWithOptions(DescribeInstanceTrafficRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTraffic"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTrafficResponse());
    }

    /**
     * @summary Queries the request traffic and response traffic of a dedicated instance within a period of time.
     *
     * @param request DescribeInstanceTrafficRequest
     * @return DescribeInstanceTrafficResponse
     */
    public DescribeInstanceTrafficResponse describeInstanceTraffic(DescribeInstanceTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTrafficWithOptions(request, runtime);
    }

    /**
     * @summary 查询实例信息
     *
     * @param request DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableTagAuthorization)) {
            query.put("EnableTagAuthorization", request.enableTagAuthorization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * @summary 查询实例信息
     *
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the rule entries of an IP address-based traffic control policy.
     *
     * @description *   This operation is intended for API providers.
     * *   You can filter the query results by policy ID.
     *
     * @param request DescribeIpControlPolicyItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpControlPolicyItemsResponse
     */
    public DescribeIpControlPolicyItemsResponse describeIpControlPolicyItemsWithOptions(DescribeIpControlPolicyItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyItemId)) {
            query.put("PolicyItemId", request.policyItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpControlPolicyItems"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpControlPolicyItemsResponse());
    }

    /**
     * @summary Queries the rule entries of an IP address-based traffic control policy.
     *
     * @description *   This operation is intended for API providers.
     * *   You can filter the query results by policy ID.
     *
     * @param request DescribeIpControlPolicyItemsRequest
     * @return DescribeIpControlPolicyItemsResponse
     */
    public DescribeIpControlPolicyItemsResponse describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpControlPolicyItemsWithOptions(request, runtime);
    }

    /**
     * @summary Queries custom access control lists (ACLs) on separate pages.
     *
     * @description *   This operation is intended for API providers.
     * *   This operation is used to query the ACLs in a region. Region is a system parameter.
     * *   You can filter the query results by ACL ID, name, or type.
     * *   This operation cannot be used to query specific policies. If you want to query specific policies, call the [DescribeIpControlPolicyItems](~~DescribeIpControlPolicyItems~~) operation.
     *
     * @param request DescribeIpControlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpControlsResponse
     */
    public DescribeIpControlsResponse describeIpControlsWithOptions(DescribeIpControlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlName)) {
            query.put("IpControlName", request.ipControlName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlType)) {
            query.put("IpControlType", request.ipControlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpControlsResponse());
    }

    /**
     * @summary Queries custom access control lists (ACLs) on separate pages.
     *
     * @description *   This operation is intended for API providers.
     * *   This operation is used to query the ACLs in a region. Region is a system parameter.
     * *   You can filter the query results by ACL ID, name, or type.
     * *   This operation cannot be used to query specific policies. If you want to query specific policies, call the [DescribeIpControlPolicyItems](~~DescribeIpControlPolicyItems~~) operation.
     *
     * @param request DescribeIpControlsRequest
     * @return DescribeIpControlsResponse
     */
    public DescribeIpControlsResponse describeIpControls(DescribeIpControlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpControlsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogConfigResponse
     */
    public DescribeLogConfigResponse describeLogConfigWithOptions(DescribeLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogConfigResponse());
    }

    /**
     * @param request DescribeLogConfigRequest
     * @return DescribeLogConfigResponse
     */
    public DescribeLogConfigResponse describeLogConfig(DescribeLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of remaining ordered relationships for a purchaser.
     *
     * @param request DescribeMarketRemainsQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMarketRemainsQuotaResponse
     */
    public DescribeMarketRemainsQuotaResponse describeMarketRemainsQuotaWithOptions(DescribeMarketRemainsQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMarketRemainsQuota"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMarketRemainsQuotaResponse());
    }

    /**
     * @summary Queries the number of remaining ordered relationships for a purchaser.
     *
     * @param request DescribeMarketRemainsQuotaRequest
     * @return DescribeMarketRemainsQuotaResponse
     */
    public DescribeMarketRemainsQuotaResponse describeMarketRemainsQuota(DescribeMarketRemainsQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMarketRemainsQuotaWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the created models of an API group.
     *
     * @description *   Fuzzy queries are supported.
     *
     * @param request DescribeModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModelsResponse
     */
    public DescribeModelsResponse describeModelsWithOptions(DescribeModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModels"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelsResponse());
    }

    /**
     * @summary Obtains the created models of an API group.
     *
     * @description *   Fuzzy queries are supported.
     *
     * @param request DescribeModelsRequest
     * @return DescribeModelsResponse
     */
    public DescribeModelsResponse describeModels(DescribeModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelsWithOptions(request, runtime);
    }

    /**
     * @summary 根据查询查询绑定的API列表
     *
     * @param request DescribePluginApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePluginApisResponse
     */
    public DescribePluginApisResponse describePluginApisWithOptions(DescribePluginApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginApisResponse());
    }

    /**
     * @summary 根据查询查询绑定的API列表
     *
     * @param request DescribePluginApisRequest
     * @return DescribePluginApisResponse
     */
    public DescribePluginApisResponse describePluginApis(DescribePluginApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePluginApisWithOptions(request, runtime);
    }

    /**
     * @param request DescribePluginSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePluginSchemasResponse
     */
    public DescribePluginSchemasResponse describePluginSchemasWithOptions(DescribePluginSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginSchemas"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginSchemasResponse());
    }

    /**
     * @param request DescribePluginSchemasRequest
     * @return DescribePluginSchemasResponse
     */
    public DescribePluginSchemasResponse describePluginSchemas(DescribePluginSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePluginSchemasWithOptions(request, runtime);
    }

    /**
     * @param request DescribePluginTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePluginTemplatesResponse
     */
    public DescribePluginTemplatesResponse describePluginTemplatesWithOptions(DescribePluginTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginName)) {
            query.put("PluginName", request.pluginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginTemplates"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginTemplatesResponse());
    }

    /**
     * @param request DescribePluginTemplatesRequest
     * @return DescribePluginTemplatesResponse
     */
    public DescribePluginTemplatesResponse describePluginTemplates(DescribePluginTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePluginTemplatesWithOptions(request, runtime);
    }

    /**
     * @summary Queries API Gateway plug-ins and the details of the plug-ins.
     *
     * @description *   This operation supports pagination.
     * *   This operation allows you to query plug-ins by business type.
     * *   This operation allows you to query plug-ins by ID.
     * *   This operation allows you to query plug-ins by name.
     *
     * @param request DescribePluginsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePluginsResponse
     */
    public DescribePluginsResponse describePluginsWithOptions(DescribePluginsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginName)) {
            query.put("PluginName", request.pluginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginType)) {
            query.put("PluginType", request.pluginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlugins"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginsResponse());
    }

    /**
     * @summary Queries API Gateway plug-ins and the details of the plug-ins.
     *
     * @description *   This operation supports pagination.
     * *   This operation allows you to query plug-ins by business type.
     * *   This operation allows you to query plug-ins by ID.
     * *   This operation allows you to query plug-ins by name.
     *
     * @param request DescribePluginsRequest
     * @return DescribePluginsResponse
     */
    public DescribePluginsResponse describePlugins(DescribePluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePluginsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the plug-ins that are bound to a running API in an environment.
     *
     * @description *   This operation is intended for API callers.
     * *   This operation supports pagination.
     *
     * @param request DescribePluginsByApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePluginsByApiResponse
     */
    public DescribePluginsByApiResponse describePluginsByApiWithOptions(DescribePluginsByApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginsByApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginsByApiResponse());
    }

    /**
     * @summary Queries the plug-ins that are bound to a running API in an environment.
     *
     * @description *   This operation is intended for API callers.
     * *   This operation supports pagination.
     *
     * @param request DescribePluginsByApiRequest
     * @return DescribePluginsByApiResponse
     */
    public DescribePluginsByApiResponse describePluginsByApi(DescribePluginsByApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePluginsByApiWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about an API group purchased from Alibaba Cloud Marketplace.
     *
     * @param request DescribePurchasedApiGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurchasedApiGroupResponse
     */
    public DescribePurchasedApiGroupResponse describePurchasedApiGroupWithOptions(DescribePurchasedApiGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedApiGroupResponse());
    }

    /**
     * @summary Queries the details about an API group purchased from Alibaba Cloud Marketplace.
     *
     * @param request DescribePurchasedApiGroupRequest
     * @return DescribePurchasedApiGroupResponse
     */
    public DescribePurchasedApiGroupResponse describePurchasedApiGroup(DescribePurchasedApiGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedApiGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries API groups that are purchased from Alibaba Cloud Marketplace.
     *
     * @param request DescribePurchasedApiGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurchasedApiGroupsResponse
     */
    public DescribePurchasedApiGroupsResponse describePurchasedApiGroupsWithOptions(DescribePurchasedApiGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedApiGroups"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedApiGroupsResponse());
    }

    /**
     * @summary Queries API groups that are purchased from Alibaba Cloud Marketplace.
     *
     * @param request DescribePurchasedApiGroupsRequest
     * @return DescribePurchasedApiGroupsResponse
     */
    public DescribePurchasedApiGroupsResponse describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedApiGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries APIs that are purchased from Alibaba Cloud Marketplace.
     *
     * @param request DescribePurchasedApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurchasedApisResponse
     */
    public DescribePurchasedApisResponse describePurchasedApisWithOptions(DescribePurchasedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedApisResponse());
    }

    /**
     * @summary Queries APIs that are purchased from Alibaba Cloud Marketplace.
     *
     * @param request DescribePurchasedApisRequest
     * @return DescribePurchasedApisResponse
     */
    public DescribePurchasedApisResponse describePurchasedApis(DescribePurchasedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries the Alibaba Cloud regions that are supported by API Gateway.
     *
     * @description This operation queries regions in which API Gateway is available.
     * *   This operation is intended for API providers and callers.
     *
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * @summary Queries the Alibaba Cloud regions that are supported by API Gateway.
     *
     * @description This operation queries regions in which API Gateway is available.
     * *   This operation is intended for API providers and callers.
     *
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries backend signature keys.
     *
     * @description *   This API is intended for API providers.
     * *   This operation is used to query the backend signature keys in a Region. Region is a system parameter.
     *
     * @param request DescribeSignaturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSignaturesResponse
     */
    public DescribeSignaturesResponse describeSignaturesWithOptions(DescribeSignaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureName)) {
            query.put("SignatureName", request.signatureName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSignatures"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSignaturesResponse());
    }

    /**
     * @summary Queries backend signature keys.
     *
     * @description *   This API is intended for API providers.
     * *   This operation is used to query the backend signature keys in a Region. Region is a system parameter.
     *
     * @param request DescribeSignaturesRequest
     * @return DescribeSignaturesResponse
     */
    public DescribeSignaturesResponse describeSignatures(DescribeSignaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSignaturesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the backend signature keys that are bound to a specified API.
     *
     * @description *   This API is intended for API providers.
     *
     * @param request DescribeSignaturesByApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSignaturesByApiResponse
     */
    public DescribeSignaturesByApiResponse describeSignaturesByApiWithOptions(DescribeSignaturesByApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSignaturesByApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSignaturesByApiResponse());
    }

    /**
     * @summary Queries the backend signature keys that are bound to a specified API.
     *
     * @description *   This API is intended for API providers.
     *
     * @param request DescribeSignaturesByApiRequest
     * @return DescribeSignaturesByApiResponse
     */
    public DescribeSignaturesByApiResponse describeSignaturesByApi(DescribeSignaturesByApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSignaturesByApiWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of API Gateway resources in a region.
     *
     * @param request DescribeSummaryDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSummaryDataResponse
     */
    public DescribeSummaryDataResponse describeSummaryDataWithOptions(DescribeSummaryDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSummaryData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSummaryDataResponse());
    }

    /**
     * @summary Queries the number of API Gateway resources in a region.
     *
     * @param request DescribeSummaryDataRequest
     * @return DescribeSummaryDataResponse
     */
    public DescribeSummaryDataResponse describeSummaryData(DescribeSummaryDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSummaryDataWithOptions(request, runtime);
    }

    /**
     * @summary Queries the common parameters supported by the system.
     *
     * @description *   This API is intended for API callers.
     * *   The response of this API contains the system parameters that are optional in API definitions.
     *
     * @param request DescribeSystemParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemParametersResponse
     */
    public DescribeSystemParametersResponse describeSystemParametersWithOptions(DescribeSystemParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemParameters"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemParametersResponse());
    }

    /**
     * @summary Queries the common parameters supported by the system.
     *
     * @description *   This API is intended for API callers.
     * *   The response of this API contains the system parameters that are optional in API definitions.
     *
     * @param request DescribeSystemParametersRequest
     * @return DescribeSystemParametersResponse
     */
    public DescribeSystemParametersResponse describeSystemParameters(DescribeSystemParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemParametersWithOptions(request, runtime);
    }

    /**
     * @summary Queries custom throttling policies and their details. Conditional queries are supported.
     *
     * @description *   This API is intended for API providers.
     * *   This API can be used to query all existing throttling policies (including special throttling policies) and their details.
     * *   You can specify query conditions. For example, you can query the throttling policies bound to a specified API or in a specified environment.
     *
     * @param request DescribeTrafficControlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrafficControlsResponse
     */
    public DescribeTrafficControlsResponse describeTrafficControlsWithOptions(DescribeTrafficControlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlName)) {
            query.put("TrafficControlName", request.trafficControlName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrafficControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrafficControlsResponse());
    }

    /**
     * @summary Queries custom throttling policies and their details. Conditional queries are supported.
     *
     * @description *   This API is intended for API providers.
     * *   This API can be used to query all existing throttling policies (including special throttling policies) and their details.
     * *   You can specify query conditions. For example, you can query the throttling policies bound to a specified API or in a specified environment.
     *
     * @param request DescribeTrafficControlsRequest
     * @return DescribeTrafficControlsResponse
     */
    public DescribeTrafficControlsResponse describeTrafficControls(DescribeTrafficControlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrafficControlsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the throttling policy that is bound to a specific API.
     *
     * @description *   This API is intended for API providers.
     *
     * @param request DescribeTrafficControlsByApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrafficControlsByApiResponse
     */
    public DescribeTrafficControlsByApiResponse describeTrafficControlsByApiWithOptions(DescribeTrafficControlsByApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrafficControlsByApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrafficControlsByApiResponse());
    }

    /**
     * @summary Queries the throttling policy that is bound to a specific API.
     *
     * @description *   This API is intended for API providers.
     *
     * @param request DescribeTrafficControlsByApiRequest
     * @return DescribeTrafficControlsByApiResponse
     */
    public DescribeTrafficControlsByApiResponse describeTrafficControlsByApi(DescribeTrafficControlsByApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrafficControlsByApiWithOptions(request, runtime);
    }

    /**
     * @summary 查询批量更新API后端元定结果
     *
     * @param request DescribeUpdateBackendTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUpdateBackendTaskResponse
     */
    public DescribeUpdateBackendTaskResponse describeUpdateBackendTaskWithOptions(DescribeUpdateBackendTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationUid)) {
            query.put("OperationUid", request.operationUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUpdateBackendTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUpdateBackendTaskResponse());
    }

    /**
     * @summary 查询批量更新API后端元定结果
     *
     * @param request DescribeUpdateBackendTaskRequest
     * @return DescribeUpdateBackendTaskResponse
     */
    public DescribeUpdateBackendTaskResponse describeUpdateBackendTask(DescribeUpdateBackendTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpdateBackendTaskWithOptions(request, runtime);
    }

    /**
     * @param request DescribeUpdateVpcInfoTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUpdateVpcInfoTaskResponse
     */
    public DescribeUpdateVpcInfoTaskResponse describeUpdateVpcInfoTaskWithOptions(DescribeUpdateVpcInfoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationUid)) {
            query.put("OperationUid", request.operationUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUpdateVpcInfoTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUpdateVpcInfoTaskResponse());
    }

    /**
     * @param request DescribeUpdateVpcInfoTaskRequest
     * @return DescribeUpdateVpcInfoTaskResponse
     */
    public DescribeUpdateVpcInfoTaskResponse describeUpdateVpcInfoTask(DescribeUpdateVpcInfoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpdateVpcInfoTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries VPC access authorizations.
     *
     * @param request DescribeVpcAccessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcAccessesResponse
     */
    public DescribeVpcAccessesResponse describeVpcAccessesWithOptions(DescribeVpcAccessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accurateQuery)) {
            query.put("AccurateQuery", request.accurateQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcAccessId)) {
            query.put("VpcAccessId", request.vpcAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcAccesses"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcAccessesResponse());
    }

    /**
     * @summary Queries VPC access authorizations.
     *
     * @param request DescribeVpcAccessesRequest
     * @return DescribeVpcAccessesResponse
     */
    public DescribeVpcAccessesResponse describeVpcAccesses(DescribeVpcAccessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcAccessesWithOptions(request, runtime);
    }

    /**
     * @summary Queries zones in a region.
     *
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * @summary Queries zones in a region.
     *
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * @summary Detaches APIs from an API product.
     *
     * @param request DetachApiProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachApiProductResponse
     */
    public DetachApiProductResponse detachApiProductWithOptions(DetachApiProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductId)) {
            query.put("ApiProductId", request.apiProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apis)) {
            query.put("Apis", request.apis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachApiProduct"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachApiProductResponse());
    }

    /**
     * @summary Detaches APIs from an API product.
     *
     * @param request DetachApiProductRequest
     * @return DetachApiProductResponse
     */
    public DetachApiProductResponse detachApiProduct(DetachApiProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachApiProductWithOptions(request, runtime);
    }

    /**
     * @summary 解绑插件
     *
     * @param request DetachPluginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachPluginResponse
     */
    public DetachPluginResponse detachPluginWithOptions(DetachPluginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachPlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachPluginResponse());
    }

    /**
     * @summary 解绑插件
     *
     * @param request DetachPluginRequest
     * @return DetachPluginResponse
     */
    public DetachPluginResponse detachPlugin(DetachPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachPluginWithOptions(request, runtime);
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated API Gateway instances. Disables access control on an instance.
     *
     * @param request DisableInstanceAccessControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableInstanceAccessControlResponse
     */
    public DisableInstanceAccessControlResponse disableInstanceAccessControlWithOptions(DisableInstanceAccessControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableInstanceAccessControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableInstanceAccessControlResponse());
    }

    /**
     * @summary This feature provides instance-level access control capabilities for dedicated API Gateway instances. Disables access control on an instance.
     *
     * @param request DisableInstanceAccessControlRequest
     * @return DisableInstanceAccessControlResponse
     */
    public DisableInstanceAccessControlResponse disableInstanceAccessControl(DisableInstanceAccessControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInstanceAccessControlWithOptions(request, runtime);
    }

    /**
     * @summary Checks the syntax before Swagger-compliant data is imported.
     *
     * @param tmpReq DryRunSwaggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DryRunSwaggerResponse
     */
    public DryRunSwaggerResponse dryRunSwaggerWithOptions(DryRunSwaggerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DryRunSwaggerShrinkRequest request = new DryRunSwaggerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.globalCondition)) {
            request.globalConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.globalCondition, "GlobalCondition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            query.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalConditionShrink)) {
            query.put("GlobalCondition", request.globalConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DryRunSwagger"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DryRunSwaggerResponse());
    }

    /**
     * @summary Checks the syntax before Swagger-compliant data is imported.
     *
     * @param request DryRunSwaggerRequest
     * @return DryRunSwaggerResponse
     */
    public DryRunSwaggerResponse dryRunSwagger(DryRunSwaggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dryRunSwaggerWithOptions(request, runtime);
    }

    /**
     * @summary 开启实例的访问控制
     *
     * @param request EnableInstanceAccessControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInstanceAccessControlResponse
     */
    public EnableInstanceAccessControlResponse enableInstanceAccessControlWithOptions(EnableInstanceAccessControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInstanceAccessControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInstanceAccessControlResponse());
    }

    /**
     * @summary 开启实例的访问控制
     *
     * @param request EnableInstanceAccessControlRequest
     * @return EnableInstanceAccessControlResponse
     */
    public EnableInstanceAccessControlResponse enableInstanceAccessControl(EnableInstanceAccessControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstanceAccessControlWithOptions(request, runtime);
    }

    /**
     * @summary Imports APIs based on the OAS standard.
     *
     * @param request ImportOASRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportOASResponse
     */
    public ImportOASResponse importOASWithOptions(ImportOASRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendName)) {
            query.put("BackendName", request.backendName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreWarning)) {
            query.put("IgnoreWarning", request.ignoreWarning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OASVersion)) {
            query.put("OASVersion", request.OASVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestMode)) {
            query.put("RequestMode", request.requestMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipDryRun)) {
            query.put("SkipDryRun", request.skipDryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportOAS"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportOASResponse());
    }

    /**
     * @summary Imports APIs based on the OAS standard.
     *
     * @param request ImportOASRequest
     * @return ImportOASResponse
     */
    public ImportOASResponse importOAS(ImportOASRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importOASWithOptions(request, runtime);
    }

    /**
     * @summary Creates an API by importing Swagger-compliant data.
     *
     * @description *   Alibaba Cloud supports extensions based on Swagger 2.0.
     * *   Alibaba Cloud supports Swagger configuration files in JSON and YAML formats.
     *
     * @param tmpReq ImportSwaggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportSwaggerResponse
     */
    public ImportSwaggerResponse importSwaggerWithOptions(ImportSwaggerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportSwaggerShrinkRequest request = new ImportSwaggerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.globalCondition)) {
            request.globalConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.globalCondition, "GlobalCondition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            query.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalConditionShrink)) {
            query.put("GlobalCondition", request.globalConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportSwagger"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportSwaggerResponse());
    }

    /**
     * @summary Creates an API by importing Swagger-compliant data.
     *
     * @description *   Alibaba Cloud supports extensions based on Swagger 2.0.
     * *   Alibaba Cloud supports Swagger configuration files in JSON and YAML formats.
     *
     * @param request ImportSwaggerRequest
     * @return ImportSwaggerResponse
     */
    public ImportSwaggerResponse importSwagger(ImportSwaggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importSwaggerWithOptions(request, runtime);
    }

    /**
     * @summary Queries the visible resource tags.
     *
     * @description *   The Tag.N.Key and Tag.N.Value parameters constitute a key-value pair.
     * *   ResourceId.N must meet all the key-value pairs that are entered. If you enter multiple key-value pairs, resources that contain the specified key-value pairs are returned.
     * *   This operation is used to query resource tags based on conditions. If no relationship matches the conditions, an empty list is returned.
     * *   You can query both user tags and visible system tags.
     * *   In addition to the required parameters, you can also specify ResourceId.N to query the visible resource tags of a specified resource in a region.
     * *   You can also specify Tag.N.Key to query the visible keys of a specified key in a region.
     * *   At least one of ResourceId.N, Tag.N.Key, and Tag.N.Value exists.
     * *   You can query tags of the same type or different types in a single operation.
     * *   You can query all your user types and visible system tags.
     *
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * @summary Queries the visible resource tags.
     *
     * @description *   The Tag.N.Key and Tag.N.Value parameters constitute a key-value pair.
     * *   ResourceId.N must meet all the key-value pairs that are entered. If you enter multiple key-value pairs, resources that contain the specified key-value pairs are returned.
     * *   This operation is used to query resource tags based on conditions. If no relationship matches the conditions, an empty list is returned.
     * *   You can query both user tags and visible system tags.
     * *   In addition to the required parameters, you can also specify ResourceId.N to query the visible resource tags of a specified resource in a region.
     * *   You can also specify Tag.N.Key to query the visible keys of a specified key in a region.
     * *   At least one of ResourceId.N, Tag.N.Key, and Tag.N.Value exists.
     * *   You can query tags of the same type or different types in a single operation.
     * *   You can query all your user types and visible system tags.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the definition of an API.
     *
     * @description **This operation is intended for API providers.**
     * *   This API operation requires a full update. Updates of partial parameters are not supported.
     * *   When you modify an API name, make sure that the name of each API within the same group is unique.
     * *   When you modify the request path, make sure that each request path within the same group is unique.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifyApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiResponse
     */
    public ModifyApiResponse modifyApiWithOptions(ModifyApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowSignatureMethod)) {
            query.put("AllowSignatureMethod", request.allowSignatureMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCodeAuthType)) {
            query.put("AppCodeAuthType", request.appCodeAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendEnable)) {
            query.put("BackendEnable", request.backendEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableInternet)) {
            query.put("DisableInternet", request.disableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceNonceCheck)) {
            query.put("ForceNonceCheck", request.forceNonceCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openIdConnectConfig)) {
            query.put("OpenIdConnectConfig", request.openIdConnectConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestConfig)) {
            query.put("RequestConfig", request.requestConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultBodyModel)) {
            query.put("ResultBodyModel", request.resultBodyModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            query.put("ResultType", request.resultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConfig)) {
            query.put("ServiceConfig", request.serviceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webSocketApiType)) {
            query.put("WebSocketApiType", request.webSocketApiType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.constantParameters)) {
            body.put("ConstantParameters", request.constantParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCodeSamples)) {
            body.put("ErrorCodeSamples", request.errorCodeSamples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failResultSample)) {
            body.put("FailResultSample", request.failResultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestParameters)) {
            body.put("RequestParameters", request.requestParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultDescriptions)) {
            body.put("ResultDescriptions", request.resultDescriptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultSample)) {
            body.put("ResultSample", request.resultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParametersMap)) {
            body.put("ServiceParametersMap", request.serviceParametersMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemParameters)) {
            body.put("SystemParameters", request.systemParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiResponse());
    }

    /**
     * @summary Modifies the definition of an API.
     *
     * @description **This operation is intended for API providers.**
     * *   This API operation requires a full update. Updates of partial parameters are not supported.
     * *   When you modify an API name, make sure that the name of each API within the same group is unique.
     * *   When you modify the request path, make sure that each request path within the same group is unique.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifyApiRequest
     * @return ModifyApiResponse
     */
    public ModifyApiResponse modifyApi(ModifyApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the draft definition of an API. This operation is different from the ModifyApi operation. This operation does not require all information about the API. You need to only specify the parameters that you want to modify. For example, if you want to change the authentication method of the API from Anonymous to APP, you specify APP as the value of AuthType and do not need to configure other parameters.
     *
     * @param request ModifyApiConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiConfigurationResponse
     */
    public ModifyApiConfigurationResponse modifyApiConfigurationWithOptions(ModifyApiConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowSignatureMethod)) {
            query.put("AllowSignatureMethod", request.allowSignatureMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCodeAuthType)) {
            query.put("AppCodeAuthType", request.appCodeAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendName)) {
            query.put("BackendName", request.backendName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyFormat)) {
            query.put("BodyFormat", request.bodyFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyModel)) {
            query.put("BodyModel", request.bodyModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentTypeCategory)) {
            query.put("ContentTypeCategory", request.contentTypeCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentTypeValue)) {
            query.put("ContentTypeValue", request.contentTypeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableInternet)) {
            query.put("DisableInternet", request.disableInternet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCodeSamples)) {
            query.put("ErrorCodeSamples", request.errorCodeSamples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failResultSample)) {
            query.put("FailResultSample", request.failResultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceNonceCheck)) {
            query.put("ForceNonceCheck", request.forceNonceCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionComputeConfig)) {
            query.put("FunctionComputeConfig", request.functionComputeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpConfig)) {
            query.put("HttpConfig", request.httpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mockConfig)) {
            query.put("MockConfig", request.mockConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossConfig)) {
            query.put("OssConfig", request.ossConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postBodyDescription)) {
            query.put("PostBodyDescription", request.postBodyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestHttpMethod)) {
            query.put("RequestHttpMethod", request.requestHttpMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestMode)) {
            query.put("RequestMode", request.requestMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestParameters)) {
            query.put("RequestParameters", request.requestParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPath)) {
            query.put("RequestPath", request.requestPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestProtocol)) {
            query.put("RequestProtocol", request.requestProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultSample)) {
            query.put("ResultSample", request.resultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            query.put("ResultType", request.resultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParametersMap)) {
            query.put("ServiceParametersMap", request.serviceParametersMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceProtocol)) {
            query.put("ServiceProtocol", request.serviceProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTimeout)) {
            query.put("ServiceTimeout", request.serviceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBackendService)) {
            query.put("UseBackendService", request.useBackendService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcConfig)) {
            query.put("VpcConfig", request.vpcConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiConfiguration"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiConfigurationResponse());
    }

    /**
     * @summary Modifies the draft definition of an API. This operation is different from the ModifyApi operation. This operation does not require all information about the API. You need to only specify the parameters that you want to modify. For example, if you want to change the authentication method of the API from Anonymous to APP, you specify APP as the value of AuthType and do not need to configure other parameters.
     *
     * @param request ModifyApiConfigurationRequest
     * @return ModifyApiConfigurationResponse
     */
    public ModifyApiConfigurationResponse modifyApiConfiguration(ModifyApiConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the name, description, or basepath of an existing API group.
     *
     * @description *   This operation is intended for API providers.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifyApiGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiGroupResponse
     */
    public ModifyApiGroupResponse modifyApiGroupWithOptions(ModifyApiGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basePath)) {
            query.put("BasePath", request.basePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compatibleFlags)) {
            query.put("CompatibleFlags", request.compatibleFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customTraceConfig)) {
            query.put("CustomTraceConfig", request.customTraceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerConfigs)) {
            query.put("CustomerConfigs", request.customerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDomain)) {
            query.put("DefaultDomain", request.defaultDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passthroughHeaders)) {
            query.put("PassthroughHeaders", request.passthroughHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpcPattern)) {
            query.put("RpcPattern", request.rpcPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportSSE)) {
            query.put("SupportSSE", request.supportSSE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userLogConfig)) {
            query.put("UserLogConfig", request.userLogConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiGroupResponse());
    }

    /**
     * @summary Modifies the name, description, or basepath of an existing API group.
     *
     * @description *   This operation is intended for API providers.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifyApiGroupRequest
     * @return ModifyApiGroupResponse
     */
    public ModifyApiGroupResponse modifyApiGroup(ModifyApiGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiGroupWithOptions(request, runtime);
    }

    /**
     * @param request ModifyApiGroupInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiGroupInstanceResponse
     */
    public ModifyApiGroupInstanceResponse modifyApiGroupInstanceWithOptions(ModifyApiGroupInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiGroupInstance"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiGroupInstanceResponse());
    }

    /**
     * @param request ModifyApiGroupInstanceRequest
     * @return ModifyApiGroupInstanceResponse
     */
    public ModifyApiGroupInstanceResponse modifyApiGroupInstance(ModifyApiGroupInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiGroupInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the network policy of an API group.
     *
     * @param request ModifyApiGroupNetworkPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiGroupNetworkPolicyResponse
     */
    public ModifyApiGroupNetworkPolicyResponse modifyApiGroupNetworkPolicyWithOptions(ModifyApiGroupNetworkPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsPolicy)) {
            query.put("HttpsPolicy", request.httpsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerDomainEnable)) {
            query.put("InnerDomainEnable", request.innerDomainEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetEnable)) {
            query.put("InternetEnable", request.internetEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetIPV6Enable)) {
            query.put("InternetIPV6Enable", request.internetIPV6Enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIntranetEnable)) {
            query.put("VpcIntranetEnable", request.vpcIntranetEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcSlbIntranetEnable)) {
            query.put("VpcSlbIntranetEnable", request.vpcSlbIntranetEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiGroupNetworkPolicy"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiGroupNetworkPolicyResponse());
    }

    /**
     * @summary Modifies the network policy of an API group.
     *
     * @param request ModifyApiGroupNetworkPolicyRequest
     * @return ModifyApiGroupNetworkPolicyResponse
     */
    public ModifyApiGroupNetworkPolicyResponse modifyApiGroupNetworkPolicy(ModifyApiGroupNetworkPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiGroupNetworkPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the VPC whitelist of an API group.
     *
     * @param request ModifyApiGroupVpcWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiGroupVpcWhitelistResponse
     */
    public ModifyApiGroupVpcWhitelistResponse modifyApiGroupVpcWhitelistWithOptions(ModifyApiGroupVpcWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIds)) {
            query.put("VpcIds", request.vpcIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiGroupVpcWhitelist"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiGroupVpcWhitelistResponse());
    }

    /**
     * @summary Modifies the VPC whitelist of an API group.
     *
     * @param request ModifyApiGroupVpcWhitelistRequest
     * @return ModifyApiGroupVpcWhitelistResponse
     */
    public ModifyApiGroupVpcWhitelistResponse modifyApiGroupVpcWhitelist(ModifyApiGroupVpcWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiGroupVpcWhitelistWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a specified application.
     *
     * @description *   This operation is intended for API callers.
     * *   **AppName** or **Description** can be modified. If these parameters are not specified, no modifications are made and the operation will directly return a success response.
     * *   You can call this operation up to 50 times per second per account.
     *
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
    }

    /**
     * @summary Modifies a specified application.
     *
     * @description *   This operation is intended for API callers.
     * *   **AppName** or **Description** can be modified. If these parameters are not specified, no modifications are made and the operation will directly return a success response.
     * *   You can call this operation up to 50 times per second per account.
     *
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * @summary 修改后端服务
     *
     * @param request ModifyBackendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackendResponse
     */
    public ModifyBackendResponse modifyBackendWithOptions(ModifyBackendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendName)) {
            query.put("BackendName", request.backendName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendType)) {
            query.put("BackendType", request.backendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackend"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackendResponse());
    }

    /**
     * @summary 修改后端服务
     *
     * @param request ModifyBackendRequest
     * @return ModifyBackendResponse
     */
    public ModifyBackendResponse modifyBackend(ModifyBackendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackendWithOptions(request, runtime);
    }

    /**
     * @summary 修改后端服务在环境上的定义
     *
     * @param request ModifyBackendModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackendModelResponse
     */
    public ModifyBackendModelResponse modifyBackendModelWithOptions(ModifyBackendModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendId)) {
            query.put("BackendId", request.backendId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendModelData)) {
            query.put("BackendModelData", request.backendModelData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendModelId)) {
            query.put("BackendModelId", request.backendModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendType)) {
            query.put("BackendType", request.backendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackendModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackendModelResponse());
    }

    /**
     * @summary 修改后端服务在环境上的定义
     *
     * @param request ModifyBackendModelRequest
     * @return ModifyBackendModelResponse
     */
    public ModifyBackendModelResponse modifyBackendModel(ModifyBackendModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackendModelWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the name of a custom dataset.
     *
     * @param request ModifyDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatasetResponse
     */
    public ModifyDatasetResponse modifyDatasetWithOptions(ModifyDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataset"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatasetResponse());
    }

    /**
     * @summary Modifies the name of a custom dataset.
     *
     * @param request ModifyDatasetRequest
     * @return ModifyDatasetResponse
     */
    public ModifyDatasetResponse modifyDataset(ModifyDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatasetWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the expiration time and description of a data entry in a custom dataset.
     *
     * @param request ModifyDatasetItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatasetItemResponse
     */
    public ModifyDatasetItemResponse modifyDatasetItemWithOptions(ModifyDatasetItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetItemId)) {
            query.put("DatasetItemId", request.datasetItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatasetItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatasetItemResponse());
    }

    /**
     * @summary Modifies the expiration time and description of a data entry in a custom dataset.
     *
     * @param request ModifyDatasetItemRequest
     * @return ModifyDatasetItemResponse
     */
    public ModifyDatasetItemResponse modifyDatasetItem(ModifyDatasetItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatasetItemWithOptions(request, runtime);
    }

    /**
     * @summary 修改API网关实例属性
     *
     * @param tmpReq ModifyInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceAttributeShrinkRequest request = new ModifyInstanceAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toConnectVpcIpBlock)) {
            request.toConnectVpcIpBlockShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toConnectVpcIpBlock, "ToConnectVpcIpBlock", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteVpcIpBlock)) {
            query.put("DeleteVpcIpBlock", request.deleteVpcIpBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressIpv6Enable)) {
            query.put("EgressIpv6Enable", request.egressIpv6Enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsPolicy)) {
            query.put("HttpsPolicy", request.httpsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPV6Enabled)) {
            query.put("IPV6Enabled", request.IPV6Enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSegments)) {
            query.put("IntranetSegments", request.intranetSegments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainEndTime)) {
            query.put("MaintainEndTime", request.maintainEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainStartTime)) {
            query.put("MaintainStartTime", request.maintainStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toConnectVpcIpBlockShrink)) {
            query.put("ToConnectVpcIpBlock", request.toConnectVpcIpBlockShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcSlbIntranetEnable)) {
            query.put("VpcSlbIntranetEnable", request.vpcSlbIntranetEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    /**
     * @summary 修改API网关实例属性
     *
     * @param request ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Upgrades or downgrades the configurations of an API Gateway instance.
     *
     * @param request ModifyInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceSpecResponse
     */
    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyAction)) {
            query.put("ModifyAction", request.modifyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipWaitSwitch)) {
            query.put("SkipWaitSwitch", request.skipWaitSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSpec"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSpecResponse());
    }

    /**
     * @summary Upgrades or downgrades the configurations of an API Gateway instance.
     *
     * @param request ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the VPC domain name policy of an API group.
     *
     * @param request ModifyIntranetDomainPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIntranetDomainPolicyResponse
     */
    public ModifyIntranetDomainPolicyResponse modifyIntranetDomainPolicyWithOptions(ModifyIntranetDomainPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIntranetEnable)) {
            query.put("VpcIntranetEnable", request.vpcIntranetEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIntranetDomainPolicy"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIntranetDomainPolicyResponse());
    }

    /**
     * @summary Modifies the VPC domain name policy of an API group.
     *
     * @param request ModifyIntranetDomainPolicyRequest
     * @return ModifyIntranetDomainPolicyResponse
     */
    public ModifyIntranetDomainPolicyResponse modifyIntranetDomainPolicy(ModifyIntranetDomainPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIntranetDomainPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     * *   This operation allows you to modify only the name and description of an ACL. You cannot modify the type of the ACL.
     *
     * @param request ModifyIpControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIpControlResponse
     */
    public ModifyIpControlResponse modifyIpControlWithOptions(ModifyIpControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlName)) {
            query.put("IpControlName", request.ipControlName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpControlResponse());
    }

    /**
     * @summary Modifies an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     * *   This operation allows you to modify only the name and description of an ACL. You cannot modify the type of the ACL.
     *
     * @param request ModifyIpControlRequest
     * @return ModifyIpControlResponse
     */
    public ModifyIpControlResponse modifyIpControl(ModifyIpControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpControlWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a policy in an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     * *   The modification immediately takes effect on all the APIs that are bound to the policy.
     * *   This operation causes a full modification of the content of a policy.
     *
     * @param request ModifyIpControlPolicyItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIpControlPolicyItemResponse
     */
    public ModifyIpControlPolicyItemResponse modifyIpControlPolicyItemWithOptions(ModifyIpControlPolicyItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrIp)) {
            query.put("CidrIp", request.cidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyItemId)) {
            query.put("PolicyItemId", request.policyItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpControlPolicyItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpControlPolicyItemResponse());
    }

    /**
     * @summary Modifies a policy in an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     * *   The modification immediately takes effect on all the APIs that are bound to the policy.
     * *   This operation causes a full modification of the content of a policy.
     *
     * @param request ModifyIpControlPolicyItemRequest
     * @return ModifyIpControlPolicyItemResponse
     */
    public ModifyIpControlPolicyItemResponse modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpControlPolicyItemWithOptions(request, runtime);
    }

    /**
     * @param request ModifyLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLogConfigResponse
     */
    public ModifyLogConfigResponse modifyLogConfigWithOptions(ModifyLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            query.put("SlsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            query.put("SlsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLogConfigResponse());
    }

    /**
     * @param request ModifyLogConfigRequest
     * @return ModifyLogConfigResponse
     */
    public ModifyLogConfigResponse modifyLogConfig(ModifyLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLogConfigWithOptions(request, runtime);
    }

    /**
     * @summary Updates the model of an API group.
     *
     * @param request ModifyModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyModelResponse
     */
    public ModifyModelResponse modifyModelWithOptions(ModifyModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newModelName)) {
            query.put("NewModelName", request.newModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyModelResponse());
    }

    /**
     * @summary Updates the model of an API group.
     *
     * @param request ModifyModelRequest
     * @return ModifyModelResponse
     */
    public ModifyModelResponse modifyModel(ModifyModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyModelWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the information of a plug-in.
     *
     * @description *   This operation is intended for API providers.
     * *   The name of the plug-in must be unique.
     *
     * @param request ModifyPluginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPluginResponse
     */
    public ModifyPluginResponse modifyPluginWithOptions(ModifyPluginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginData)) {
            query.put("PluginData", request.pluginData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginName)) {
            query.put("PluginName", request.pluginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPluginResponse());
    }

    /**
     * @summary Modifies the information of a plug-in.
     *
     * @description *   This operation is intended for API providers.
     * *   The name of the plug-in must be unique.
     *
     * @param request ModifyPluginRequest
     * @return ModifyPluginResponse
     */
    public ModifyPluginResponse modifyPlugin(ModifyPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPluginWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a backend signature key.
     *
     * @description *   This API is intended for API providers.
     * *   This API operation modifies the name, Key value, and Secret value of an existing signature key.
     * *   Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifySignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySignatureResponse
     */
    public ModifySignatureResponse modifySignatureWithOptions(ModifySignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureKey)) {
            query.put("SignatureKey", request.signatureKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureName)) {
            query.put("SignatureName", request.signatureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureSecret)) {
            query.put("SignatureSecret", request.signatureSecret);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySignatureResponse());
    }

    /**
     * @summary Modifies a backend signature key.
     *
     * @description *   This API is intended for API providers.
     * *   This API operation modifies the name, Key value, and Secret value of an existing signature key.
     * *   Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifySignatureRequest
     * @return ModifySignatureResponse
     */
    public ModifySignatureResponse modifySignature(ModifySignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySignatureWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the settings of a custom throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   The modifications take effect on the bound APIs instantly.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifyTrafficControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTrafficControlResponse
     */
    public ModifyTrafficControlResponse modifyTrafficControlWithOptions(ModifyTrafficControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDefault)) {
            query.put("ApiDefault", request.apiDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appDefault)) {
            query.put("AppDefault", request.appDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlName)) {
            query.put("TrafficControlName", request.trafficControlName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlUnit)) {
            query.put("TrafficControlUnit", request.trafficControlUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDefault)) {
            query.put("UserDefault", request.userDefault);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrafficControlResponse());
    }

    /**
     * @summary Modifies the settings of a custom throttling policy.
     *
     * @description *   This API is intended for API providers.
     * *   The modifications take effect on the bound APIs instantly.
     * *   The QPS limit on this operation is 50 per user.
     *
     * @param request ModifyTrafficControlRequest
     * @return ModifyTrafficControlResponse
     */
    public ModifyTrafficControlResponse modifyTrafficControl(ModifyTrafficControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrafficControlWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a virtual private cloud (VPC) authorization and updates the metadata of the API associated with the VPC authorization.
     *
     * @param request ModifyVpcAccessAndUpdateApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcAccessAndUpdateApisResponse
     */
    public ModifyVpcAccessAndUpdateApisResponse modifyVpcAccessAndUpdateApisWithOptions(ModifyVpcAccessAndUpdateApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needBatchWork)) {
            query.put("NeedBatchWork", request.needBatchWork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refresh)) {
            query.put("Refresh", request.refresh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcTargetHostName)) {
            query.put("VpcTargetHostName", request.vpcTargetHostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcAccessAndUpdateApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcAccessAndUpdateApisResponse());
    }

    /**
     * @summary Modifies a virtual private cloud (VPC) authorization and updates the metadata of the API associated with the VPC authorization.
     *
     * @param request ModifyVpcAccessAndUpdateApisRequest
     * @return ModifyVpcAccessAndUpdateApisResponse
     */
    public ModifyVpcAccessAndUpdateApisResponse modifyVpcAccessAndUpdateApis(ModifyVpcAccessAndUpdateApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcAccessAndUpdateApisWithOptions(request, runtime);
    }

    /**
     * @param request OpenApiGatewayServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenApiGatewayServiceResponse
     */
    public OpenApiGatewayServiceResponse openApiGatewayServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenApiGatewayService"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenApiGatewayServiceResponse());
    }

    /**
     * @return OpenApiGatewayServiceResponse
     */
    public OpenApiGatewayServiceResponse openApiGatewayService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openApiGatewayServiceWithOptions(runtime);
    }

    /**
     * @summary Queries the request logs of a user.
     *
     * @param request QueryRequestLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRequestLogsResponse
     */
    public QueryRequestLogsResponse queryRequestLogsWithOptions(QueryRequestLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestLogId)) {
            query.put("RequestLogId", request.requestLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRequestLogs"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRequestLogsResponse());
    }

    /**
     * @summary Queries the request logs of a user.
     *
     * @param request QueryRequestLogsRequest
     * @return QueryRequestLogsResponse
     */
    public QueryRequestLogsResponse queryRequestLogs(QueryRequestLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRequestLogsWithOptions(request, runtime);
    }

    /**
     * @summary Reactivates a custom domain name whose validity status is Abnormal.
     *
     * @description *   This operation is intended for API providers.
     * *   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.
     * *   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.
     * *   You can call this operation to reactivate the domain name to resume normal access.
     *
     * @param request ReactivateDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReactivateDomainResponse
     */
    public ReactivateDomainResponse reactivateDomainWithOptions(ReactivateDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReactivateDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReactivateDomainResponse());
    }

    /**
     * @summary Reactivates a custom domain name whose validity status is Abnormal.
     *
     * @description *   This operation is intended for API providers.
     * *   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.
     * *   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.
     * *   You can call this operation to reactivate the domain name to resume normal access.
     *
     * @param request ReactivateDomainRequest
     * @return ReactivateDomainResponse
     */
    public ReactivateDomainResponse reactivateDomain(ReactivateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reactivateDomainWithOptions(request, runtime);
    }

    /**
     * @summary 删除访问控制策略中IP条目
     *
     * @param request RemoveAccessControlListEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAccessControlListEntryResponse
     */
    public RemoveAccessControlListEntryResponse removeAccessControlListEntryWithOptions(RemoveAccessControlListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntrys)) {
            query.put("AclEntrys", request.aclEntrys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAccessControlListEntry"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAccessControlListEntryResponse());
    }

    /**
     * @summary 删除访问控制策略中IP条目
     *
     * @param request RemoveAccessControlListEntryRequest
     * @return RemoveAccessControlListEntryResponse
     */
    public RemoveAccessControlListEntryResponse removeAccessControlListEntry(RemoveAccessControlListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAccessControlListEntryWithOptions(request, runtime);
    }

    /**
     * @summary Revokes permissions on API products from an application.
     *
     * @param tmpReq RemoveApiProductsAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveApiProductsAuthoritiesResponse
     */
    public RemoveApiProductsAuthoritiesResponse removeApiProductsAuthoritiesWithOptions(RemoveApiProductsAuthoritiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveApiProductsAuthoritiesShrinkRequest request = new RemoveApiProductsAuthoritiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiProductIds)) {
            request.apiProductIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiProductIds, "ApiProductIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductIdsShrink)) {
            query.put("ApiProductIds", request.apiProductIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApiProductsAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApiProductsAuthoritiesResponse());
    }

    /**
     * @summary Revokes permissions on API products from an application.
     *
     * @param request RemoveApiProductsAuthoritiesRequest
     * @return RemoveApiProductsAuthoritiesResponse
     */
    public RemoveApiProductsAuthoritiesResponse removeApiProductsAuthorities(RemoveApiProductsAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApiProductsAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the access permissions on multiple APIs from a specified application.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.
     *
     * @param request RemoveApisAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveApisAuthoritiesResponse
     */
    public RemoveApisAuthoritiesResponse removeApisAuthoritiesWithOptions(RemoveApisAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApisAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApisAuthoritiesResponse());
    }

    /**
     * @summary Revokes the access permissions on multiple APIs from a specified application.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.
     *
     * @param request RemoveApisAuthoritiesRequest
     * @return RemoveApisAuthoritiesResponse
     */
    public RemoveApisAuthoritiesResponse removeApisAuthorities(RemoveApisAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApisAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the access permissions on a specified API from multiple applications. In this case, multiple applications map to a single API.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.
     *
     * @param request RemoveAppsAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAppsAuthoritiesResponse
     */
    public RemoveAppsAuthoritiesResponse removeAppsAuthoritiesWithOptions(RemoveAppsAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAppsAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAppsAuthoritiesResponse());
    }

    /**
     * @summary Revokes the access permissions on a specified API from multiple applications. In this case, multiple applications map to a single API.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.
     *
     * @param request RemoveAppsAuthoritiesRequest
     * @return RemoveAppsAuthoritiesResponse
     */
    public RemoveAppsAuthoritiesResponse removeAppsAuthorities(RemoveAppsAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAppsAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary Unbinds an API from an access control list (ACL).
     *
     * @description *   This operation is intended for API callers.
     * *   The unbinding takes effect immediately. After the API is unbound from the ACL, the corresponding environment does not have any IP address access control in place for the API.
     *
     * @param request RemoveIpControlApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveIpControlApisResponse
     */
    public RemoveIpControlApisResponse removeIpControlApisWithOptions(RemoveIpControlApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIpControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIpControlApisResponse());
    }

    /**
     * @summary Unbinds an API from an access control list (ACL).
     *
     * @description *   This operation is intended for API callers.
     * *   The unbinding takes effect immediately. After the API is unbound from the ACL, the corresponding environment does not have any IP address access control in place for the API.
     *
     * @param request RemoveIpControlApisRequest
     * @return RemoveIpControlApisResponse
     */
    public RemoveIpControlApisResponse removeIpControlApis(RemoveIpControlApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeIpControlApisWithOptions(request, runtime);
    }

    /**
     * @summary Removes one or more policies from an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request RemoveIpControlPolicyItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveIpControlPolicyItemResponse
     */
    public RemoveIpControlPolicyItemResponse removeIpControlPolicyItemWithOptions(RemoveIpControlPolicyItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyItemIds)) {
            query.put("PolicyItemIds", request.policyItemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIpControlPolicyItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIpControlPolicyItemResponse());
    }

    /**
     * @summary Removes one or more policies from an access control list (ACL).
     *
     * @description *   This operation is intended for API providers.
     *
     * @param request RemoveIpControlPolicyItemRequest
     * @return RemoveIpControlPolicyItemResponse
     */
    public RemoveIpControlPolicyItemResponse removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeIpControlPolicyItemWithOptions(request, runtime);
    }

    /**
     * @summary Unbinds a backend signature key from APIs.
     *
     * @description *   This API is intended for API providers.
     * *   The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.
     *
     * @param request RemoveSignatureApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSignatureApisResponse
     */
    public RemoveSignatureApisResponse removeSignatureApisWithOptions(RemoveSignatureApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSignatureApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSignatureApisResponse());
    }

    /**
     * @summary Unbinds a backend signature key from APIs.
     *
     * @description *   This API is intended for API providers.
     * *   The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.
     *
     * @param request RemoveSignatureApisRequest
     * @return RemoveSignatureApisResponse
     */
    public RemoveSignatureApisResponse removeSignatureApis(RemoveSignatureApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSignatureApisWithOptions(request, runtime);
    }

    /**
     * @summary Unbinds a specified throttling policy from APIs.
     *
     * @description *   This API is intended for API providers.
     * *   This API allows you to unbind a specified throttling policy from up to 100 APIs at a time.
     *
     * @param request RemoveTrafficControlApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTrafficControlApisResponse
     */
    public RemoveTrafficControlApisResponse removeTrafficControlApisWithOptions(RemoveTrafficControlApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTrafficControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTrafficControlApisResponse());
    }

    /**
     * @summary Unbinds a specified throttling policy from APIs.
     *
     * @description *   This API is intended for API providers.
     * *   This API allows you to unbind a specified throttling policy from up to 100 APIs at a time.
     *
     * @param request RemoveTrafficControlApisRequest
     * @return RemoveTrafficControlApisResponse
     */
    public RemoveTrafficControlApisResponse removeTrafficControlApis(RemoveTrafficControlApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTrafficControlApisWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a VPC authorization without unpublishing the associated APIs.
     *
     * @description *   This API is intended for API providers.
     * *   Revokes the permissions of API Gateway to access your VPC instance.
     * >  Deleting an authorization affects the associated API. Before you delete the authorization, make sure that it is not used by the API.
     *
     * @param request RemoveVpcAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveVpcAccessResponse
     */
    public RemoveVpcAccessResponse removeVpcAccessWithOptions(RemoveVpcAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needBatchWork)) {
            query.put("NeedBatchWork", request.needBatchWork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVpcAccess"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVpcAccessResponse());
    }

    /**
     * @summary Deletes a VPC authorization without unpublishing the associated APIs.
     *
     * @description *   This API is intended for API providers.
     * *   Revokes the permissions of API Gateway to access your VPC instance.
     * >  Deleting an authorization affects the associated API. Before you delete the authorization, make sure that it is not used by the API.
     *
     * @param request RemoveVpcAccessRequest
     * @return RemoveVpcAccessResponse
     */
    public RemoveVpcAccessResponse removeVpcAccess(RemoveVpcAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVpcAccessWithOptions(request, runtime);
    }

    /**
     * @param request RemoveVpcAccessAndAbolishApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveVpcAccessAndAbolishApisResponse
     */
    public RemoveVpcAccessAndAbolishApisResponse removeVpcAccessAndAbolishApisWithOptions(RemoveVpcAccessAndAbolishApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needBatchWork)) {
            query.put("NeedBatchWork", request.needBatchWork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVpcAccessAndAbolishApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVpcAccessAndAbolishApisResponse());
    }

    /**
     * @param request RemoveVpcAccessAndAbolishApisRequest
     * @return RemoveVpcAccessAndAbolishApisResponse
     */
    public RemoveVpcAccessAndAbolishApisResponse removeVpcAccessAndAbolishApis(RemoveVpcAccessAndAbolishApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVpcAccessAndAbolishApisWithOptions(request, runtime);
    }

    /**
     * @summary Resets the AppCode of an app.
     *
     * @param request ResetAppCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAppCodeResponse
     */
    public ResetAppCodeResponse resetAppCodeWithOptions(ResetAppCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAppCode)) {
            query.put("NewAppCode", request.newAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAppCode"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAppCodeResponse());
    }

    /**
     * @summary Resets the AppCode of an app.
     *
     * @param request ResetAppCodeRequest
     * @return ResetAppCodeResponse
     */
    public ResetAppCodeResponse resetAppCode(ResetAppCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAppCodeWithOptions(request, runtime);
    }

    /**
     * @summary Resets the key of an application.
     *
     * @description *   This operation is intended for API callers.
     * *   A new secret is automatically generated after you have called this operation. This secret cannot be customized.
     * *   The results returned by this operation do not contain the application secret. You can obtain the secret by calling DescribeAppSecurity.
     *
     * @param request ResetAppSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAppSecretResponse
     */
    public ResetAppSecretResponse resetAppSecretWithOptions(ResetAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAppKey)) {
            query.put("NewAppKey", request.newAppKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAppSecret)) {
            query.put("NewAppSecret", request.newAppSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAppSecret"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAppSecretResponse());
    }

    /**
     * @summary Resets the key of an application.
     *
     * @description *   This operation is intended for API callers.
     * *   A new secret is automatically generated after you have called this operation. This secret cannot be customized.
     * *   The results returned by this operation do not contain the application secret. You can obtain the secret by calling DescribeAppSecurity.
     *
     * @param request ResetAppSecretRequest
     * @return ResetAppSecretResponse
     */
    public ResetAppSecretResponse resetAppSecret(ResetAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAppSecretWithOptions(request, runtime);
    }

    /**
     * @param request SdkGenerateByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdkGenerateByAppResponse
     */
    public SdkGenerateByAppResponse sdkGenerateByAppWithOptions(SdkGenerateByAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdkGenerateByApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdkGenerateByAppResponse());
    }

    /**
     * @param request SdkGenerateByAppRequest
     * @return SdkGenerateByAppResponse
     */
    public SdkGenerateByAppResponse sdkGenerateByApp(SdkGenerateByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdkGenerateByAppWithOptions(request, runtime);
    }

    /**
     * @summary 生成与App关联的API的SDK
     *
     * @param request SdkGenerateByAppForRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdkGenerateByAppForRegionResponse
     */
    public SdkGenerateByAppForRegionResponse sdkGenerateByAppForRegionWithOptions(SdkGenerateByAppForRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdkGenerateByAppForRegion"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdkGenerateByAppForRegionResponse());
    }

    /**
     * @summary 生成与App关联的API的SDK
     *
     * @param request SdkGenerateByAppForRegionRequest
     * @return SdkGenerateByAppForRegionResponse
     */
    public SdkGenerateByAppForRegionResponse sdkGenerateByAppForRegion(SdkGenerateByAppForRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdkGenerateByAppForRegionWithOptions(request, runtime);
    }

    /**
     * @param request SdkGenerateByGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdkGenerateByGroupResponse
     */
    public SdkGenerateByGroupResponse sdkGenerateByGroupWithOptions(SdkGenerateByGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdkGenerateByGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdkGenerateByGroupResponse());
    }

    /**
     * @param request SdkGenerateByGroupRequest
     * @return SdkGenerateByGroupResponse
     */
    public SdkGenerateByGroupResponse sdkGenerateByGroup(SdkGenerateByGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdkGenerateByGroupWithOptions(request, runtime);
    }

    /**
     * @summary 修改访问控制策略的名称
     *
     * @param request SetAccessControlListAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAccessControlListAttributeResponse
     */
    public SetAccessControlListAttributeResponse setAccessControlListAttributeWithOptions(SetAccessControlListAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAccessControlListAttribute"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAccessControlListAttributeResponse());
    }

    /**
     * @summary 修改访问控制策略的名称
     *
     * @param request SetAccessControlListAttributeRequest
     * @return SetAccessControlListAttributeResponse
     */
    public SetAccessControlListAttributeResponse setAccessControlListAttribute(SetAccessControlListAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAccessControlListAttributeWithOptions(request, runtime);
    }

    /**
     * @summary 给多个API产品添加APP授权
     *
     * @param tmpReq SetApiProductsAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApiProductsAuthoritiesResponse
     */
    public SetApiProductsAuthoritiesResponse setApiProductsAuthoritiesWithOptions(SetApiProductsAuthoritiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetApiProductsAuthoritiesShrinkRequest request = new SetApiProductsAuthoritiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiProductIds)) {
            request.apiProductIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiProductIds, "ApiProductIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductIdsShrink)) {
            query.put("ApiProductIds", request.apiProductIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authValidTime)) {
            query.put("AuthValidTime", request.authValidTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApiProductsAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApiProductsAuthoritiesResponse());
    }

    /**
     * @summary 给多个API产品添加APP授权
     *
     * @param request SetApiProductsAuthoritiesRequest
     * @return SetApiProductsAuthoritiesResponse
     */
    public SetApiProductsAuthoritiesResponse setApiProductsAuthorities(SetApiProductsAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApiProductsAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary Authorizes a specified application to call multiple APIs.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   API providers can authorize any apps to call their APIs.
     * *   API callers can authorize their own apps to call the APIs that they have purchased.
     *
     * @param request SetApisAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApisAuthoritiesResponse
     */
    public SetApisAuthoritiesResponse setApisAuthoritiesWithOptions(SetApisAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authValidTime)) {
            query.put("AuthValidTime", request.authValidTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApisAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApisAuthoritiesResponse());
    }

    /**
     * @summary Authorizes a specified application to call multiple APIs.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   API providers can authorize any apps to call their APIs.
     * *   API callers can authorize their own apps to call the APIs that they have purchased.
     *
     * @param request SetApisAuthoritiesRequest
     * @return SetApisAuthoritiesResponse
     */
    public SetApisAuthoritiesResponse setApisAuthorities(SetApisAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApisAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary 将多个APP授权给API产品
     *
     * @param request SetAppsAuthToApiProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAppsAuthToApiProductResponse
     */
    public SetAppsAuthToApiProductResponse setAppsAuthToApiProductWithOptions(SetAppsAuthToApiProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProductId)) {
            query.put("ApiProductId", request.apiProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authValidTime)) {
            query.put("AuthValidTime", request.authValidTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAppsAuthToApiProduct"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAppsAuthToApiProductResponse());
    }

    /**
     * @summary 将多个APP授权给API产品
     *
     * @param request SetAppsAuthToApiProductRequest
     * @return SetAppsAuthToApiProductResponse
     */
    public SetAppsAuthToApiProductResponse setAppsAuthToApiProduct(SetAppsAuthToApiProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAppsAuthToApiProductWithOptions(request, runtime);
    }

    /**
     * @summary Grants access permissions on a specified API to multiple applications.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   API providers can authorize any apps to call their APIs.
     * *   API callers can authorize their own apps to call the APIs that they have purchased.
     *
     * @param request SetAppsAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAppsAuthoritiesResponse
     */
    public SetAppsAuthoritiesResponse setAppsAuthoritiesWithOptions(SetAppsAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authValidTime)) {
            query.put("AuthValidTime", request.authValidTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAppsAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAppsAuthoritiesResponse());
    }

    /**
     * @summary Grants access permissions on a specified API to multiple applications.
     *
     * @description *   This operation is intended for API providers and callers.
     * *   API providers can authorize any apps to call their APIs.
     * *   API callers can authorize their own apps to call the APIs that they have purchased.
     *
     * @param request SetAppsAuthoritiesRequest
     * @return SetAppsAuthoritiesResponse
     */
    public SetAppsAuthoritiesResponse setAppsAuthorities(SetAppsAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAppsAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary Binds a custom domain name to a specified API group.
     *
     * @param request SetDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainResponse
     */
    public SetDomainResponse setDomainWithOptions(SetDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindStageName)) {
            query.put("BindStageName", request.bindStageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customDomainType)) {
            query.put("CustomDomainType", request.customDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isForce)) {
            query.put("IsForce", request.isForce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHttpRedirectToHttps)) {
            query.put("IsHttpRedirectToHttps", request.isHttpRedirectToHttps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainResponse());
    }

    /**
     * @summary Binds a custom domain name to a specified API group.
     *
     * @param request SetDomainRequest
     * @return SetDomainResponse
     */
    public SetDomainResponse setDomain(SetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainWithOptions(request, runtime);
    }

    /**
     * @summary Uploads an SSL certificate for a custom domain name.
     *
     * @description *   This operation is intended for API providers.
     * *   The SSL certificate must match the custom domain name.
     * *   After the SSL certificate is bound, HTTPS-based API services become available.
     *
     * @param request SetDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainCertificateResponse
     */
    public SetDomainCertificateResponse setDomainCertificateWithOptions(SetDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertificateBody)) {
            query.put("CaCertificateBody", request.caCertificateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateBody)) {
            query.put("CertificateBody", request.certificateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateName)) {
            query.put("CertificateName", request.certificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificatePrivateKey)) {
            query.put("CertificatePrivateKey", request.certificatePrivateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sslVerifyDepth)) {
            query.put("SslVerifyDepth", request.sslVerifyDepth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainCertificate"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainCertificateResponse());
    }

    /**
     * @summary Uploads an SSL certificate for a custom domain name.
     *
     * @description *   This operation is intended for API providers.
     * *   The SSL certificate must match the custom domain name.
     * *   After the SSL certificate is bound, HTTPS-based API services become available.
     *
     * @param request SetDomainCertificateRequest
     * @return SetDomainCertificateResponse
     */
    public SetDomainCertificateResponse setDomainCertificate(SetDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainCertificateWithOptions(request, runtime);
    }

    /**
     * @summary Enables or disables WebSocket for a custom domain name.
     *
     * @param request SetDomainWebSocketStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainWebSocketStatusResponse
     */
    public SetDomainWebSocketStatusResponse setDomainWebSocketStatusWithOptions(SetDomainWebSocketStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionValue)) {
            query.put("ActionValue", request.actionValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.WSSEnable)) {
            query.put("WSSEnable", request.WSSEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainWebSocketStatus"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainWebSocketStatusResponse());
    }

    /**
     * @summary Enables or disables WebSocket for a custom domain name.
     *
     * @param request SetDomainWebSocketStatusRequest
     * @return SetDomainWebSocketStatusResponse
     */
    public SetDomainWebSocketStatusResponse setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainWebSocketStatusWithOptions(request, runtime);
    }

    /**
     * @param request SetGroupAuthAppCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetGroupAuthAppCodeResponse
     */
    public SetGroupAuthAppCodeResponse setGroupAuthAppCodeWithOptions(SetGroupAuthAppCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authAppCode)) {
            query.put("AuthAppCode", request.authAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGroupAuthAppCode"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGroupAuthAppCodeResponse());
    }

    /**
     * @param request SetGroupAuthAppCodeRequest
     * @return SetGroupAuthAppCodeResponse
     */
    public SetGroupAuthAppCodeResponse setGroupAuthAppCode(SetGroupAuthAppCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGroupAuthAppCodeWithOptions(request, runtime);
    }

    /**
     * @summary Creates a binding relationship between specified access control lists (ACLs) and APIs.
     *
     * @description *   This operation is intended for API callers.
     * *   A maximum of 100 APIs can be bound at a time.
     *
     * @param request SetIpControlApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIpControlApisResponse
     */
    public SetIpControlApisResponse setIpControlApisWithOptions(SetIpControlApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipControlId)) {
            query.put("IpControlId", request.ipControlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIpControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIpControlApisResponse());
    }

    /**
     * @summary Creates a binding relationship between specified access control lists (ACLs) and APIs.
     *
     * @description *   This operation is intended for API callers.
     * *   A maximum of 100 APIs can be bound at a time.
     *
     * @param request SetIpControlApisRequest
     * @return SetIpControlApisResponse
     */
    public SetIpControlApisResponse setIpControlApis(SetIpControlApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIpControlApisWithOptions(request, runtime);
    }

    /**
     * @summary Binds a signature key to APIs.
     *
     * @description *   This API is intended for API providers.
     * *   This operation allows you to bind a signature key to an API. You can bind signature keys for up to 100 APIs at a time.
     *
     * @param request SetSignatureApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSignatureApisResponse
     */
    public SetSignatureApisResponse setSignatureApisWithOptions(SetSignatureApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureId)) {
            query.put("SignatureId", request.signatureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSignatureApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSignatureApisResponse());
    }

    /**
     * @summary Binds a signature key to APIs.
     *
     * @description *   This API is intended for API providers.
     * *   This operation allows you to bind a signature key to an API. You can bind signature keys for up to 100 APIs at a time.
     *
     * @param request SetSignatureApisRequest
     * @return SetSignatureApisResponse
     */
    public SetSignatureApisResponse setSignatureApis(SetSignatureApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSignatureApisWithOptions(request, runtime);
    }

    /**
     * @summary Binds a throttling policy to APIs.
     *
     * @description *   This API is intended for API providers.
     * *   This API allows you to bind a specific throttling policy to up to 100 APIs at a time.
     *
     * @param request SetTrafficControlApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetTrafficControlApisResponse
     */
    public SetTrafficControlApisResponse setTrafficControlApisWithOptions(SetTrafficControlApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiIds)) {
            query.put("ApiIds", request.apiIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlId)) {
            query.put("TrafficControlId", request.trafficControlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTrafficControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTrafficControlApisResponse());
    }

    /**
     * @summary Binds a throttling policy to APIs.
     *
     * @description *   This API is intended for API providers.
     * *   This API allows you to bind a specific throttling policy to up to 100 APIs at a time.
     *
     * @param request SetTrafficControlApisRequest
     * @return SetTrafficControlApisResponse
     */
    public SetTrafficControlApisResponse setTrafficControlApis(SetTrafficControlApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTrafficControlApisWithOptions(request, runtime);
    }

    /**
     * @summary Creates a virtual private cloud (VPC) access authorization and enables reverse access.
     *
     * @description * This operation is intended for API providers.
     * * This operation is used to authorize API Gateway to access your VPC instance.
     *
     * @param request SetVpcAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetVpcAccessResponse
     */
    public SetVpcAccessResponse setVpcAccessWithOptions(SetVpcAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcTargetHostName)) {
            query.put("VpcTargetHostName", request.vpcTargetHostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetVpcAccess"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVpcAccessResponse());
    }

    /**
     * @summary Creates a virtual private cloud (VPC) access authorization and enables reverse access.
     *
     * @description * This operation is intended for API providers.
     * * This operation is used to authorize API Gateway to access your VPC instance.
     *
     * @param request SetVpcAccessRequest
     * @return SetVpcAccessResponse
     */
    public SetVpcAccessResponse setVpcAccess(SetVpcAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVpcAccessWithOptions(request, runtime);
    }

    /**
     * @summary Specifies a wildcard domain name template for a bound custom domain name.
     *
     * @param request SetWildcardDomainPatternsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWildcardDomainPatternsResponse
     */
    public SetWildcardDomainPatternsResponse setWildcardDomainPatternsWithOptions(SetWildcardDomainPatternsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wildcardDomainPatterns)) {
            query.put("WildcardDomainPatterns", request.wildcardDomainPatterns);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWildcardDomainPatterns"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWildcardDomainPatternsResponse());
    }

    /**
     * @summary Specifies a wildcard domain name template for a bound custom domain name.
     *
     * @param request SetWildcardDomainPatternsRequest
     * @return SetWildcardDomainPatternsResponse
     */
    public SetWildcardDomainPatternsResponse setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWildcardDomainPatternsWithOptions(request, runtime);
    }

    /**
     * @summary Switches the definition of an API in a specified runtime environment to a historical version.
     *
     * @description *   This API is intended for API providers.
     * *   The historical version can be obtained by calling the **DescribeHistoryApis** operation.
     * *   Only APIs that have been published more than once have historical versions.
     * *   This operation can only be performed on running APIs. Exercise caution when you perform this operation because the operation cannot be undone. The operation takes up to 5 seconds.
     * *   The switch operation is essentially a publish operation. A reason for this operation must be provided.
     *
     * @param request SwitchApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchApiResponse
     */
    public SwitchApiResponse switchApiWithOptions(SwitchApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyVersion)) {
            query.put("HistoryVersion", request.historyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageName)) {
            query.put("StageName", request.stageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchApiResponse());
    }

    /**
     * @summary Switches the definition of an API in a specified runtime environment to a historical version.
     *
     * @description *   This API is intended for API providers.
     * *   The historical version can be obtained by calling the **DescribeHistoryApis** operation.
     * *   Only APIs that have been published more than once have historical versions.
     * *   This operation can only be performed on running APIs. Exercise caution when you perform this operation because the operation cannot be undone. The operation takes up to 5 seconds.
     * *   The switch operation is essentially a publish operation. A reason for this operation must be provided.
     *
     * @param request SwitchApiRequest
     * @return SwitchApiResponse
     */
    public SwitchApiResponse switchApi(SwitchApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchApiWithOptions(request, runtime);
    }

    /**
     * @summary Creates a tag-resource relationship.
     *
     * @description *   All tags (key-value pairs) are applied to all resources of a specified ResourceId, with each resource specified as ResourceId.N.
     * *   Tag.N is a resource tag consisting of a key-value pair: Tag.N.Key and Tag.N.Value.
     * *   If you call this operation to tag multiple resources simultaneously, either all or none of the resources will be tagged.
     * *   If you specify Tag.1.Value in addition to required parameters, you must also specify Tag.1.Key. Otherwise, an InvalidParameter.TagKey error is reported. A tag that has a value must have the corresponding key, but the key can be an empty string.
     * *   If a tag with the same key has been bound to a resource, the new tag will overwrite the existing one.
     *
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * @summary Creates a tag-resource relationship.
     *
     * @description *   All tags (key-value pairs) are applied to all resources of a specified ResourceId, with each resource specified as ResourceId.N.
     * *   Tag.N is a resource tag consisting of a key-value pair: Tag.N.Key and Tag.N.Value.
     * *   If you call this operation to tag multiple resources simultaneously, either all or none of the resources will be tagged.
     * *   If you specify Tag.1.Value in addition to required parameters, you must also specify Tag.1.Key. Otherwise, an InvalidParameter.TagKey error is reported. A tag that has a value must have the corresponding key, but the key can be an empty string.
     * *   If a tag with the same key has been bound to a resource, the new tag will overwrite the existing one.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Removes tags from resources.
     *
     * @description *   If you call this operation to untag multiple resources simultaneously, either all or none of the resources will be untagged.
     * *   If you specify resource IDs without specifying tag keys and set the All parameter to true, all tags bound to the specified resources will be deleted. If a resource does not have any tags, the request is not processed but a success is returned.
     * *   If you specify resource IDs without specifying tag keys and set the All parameter to false, the request is not processed but a success is returned.
     * *   When tag keys are specified, the All parameter is invalid.
     * *   When multiple resources and key-value pairs are specified, the specified tags bound to the resources are deleted.
     *
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * @summary Removes tags from resources.
     *
     * @description *   If you call this operation to untag multiple resources simultaneously, either all or none of the resources will be untagged.
     * *   If you specify resource IDs without specifying tag keys and set the All parameter to true, all tags bound to the specified resources will be deleted. If a resource does not have any tags, the request is not processed but a success is returned.
     * *   If you specify resource IDs without specifying tag keys and set the All parameter to false, the request is not processed but a success is returned.
     * *   When tag keys are specified, the All parameter is invalid.
     * *   When multiple resources and key-value pairs are specified, the specified tags bound to the resources are deleted.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Tests the network connectivity between an API Gateway instance and a port on an Elastic Compute Service (ECS) or Server Load Balance (SLB) instance in a virtual private cloud (VPC) access authorization.
     *
     * @param request ValidateVpcConnectivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateVpcConnectivityResponse
     */
    public ValidateVpcConnectivityResponse validateVpcConnectivityWithOptions(ValidateVpcConnectivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcAccessId)) {
            query.put("VpcAccessId", request.vpcAccessId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateVpcConnectivity"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateVpcConnectivityResponse());
    }

    /**
     * @summary Tests the network connectivity between an API Gateway instance and a port on an Elastic Compute Service (ECS) or Server Load Balance (SLB) instance in a virtual private cloud (VPC) access authorization.
     *
     * @param request ValidateVpcConnectivityRequest
     * @return ValidateVpcConnectivityResponse
     */
    public ValidateVpcConnectivityResponse validateVpcConnectivity(ValidateVpcConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateVpcConnectivityWithOptions(request, runtime);
    }
}
