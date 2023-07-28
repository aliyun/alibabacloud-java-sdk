// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115;

import com.aliyun.tea.*;
import com.aliyun.dcdn20180115.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dcdn.aliyuncs.com"),
            new TeaPair("ap-south-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dcdn.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-fujian", "dcdn.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dcdn.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dcdn.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dcdn.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dcdn.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-central-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-west-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dcdn.aliyuncs.com"),
            new TeaPair("me-east-1", "dcdn.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dcdn.aliyuncs.com"),
            new TeaPair("us-east-1", "dcdn.aliyuncs.com"),
            new TeaPair("us-west-1", "dcdn.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dcdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * > 
      * *   Dynamic Content Delivery Network (DCDN) is activated.
      * *   Internet content provider (ICP) filing is complete for the accelerated domain name.
      * *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request AddDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddDcdnDomainResponse
     */
    public AddDcdnDomainResponse addDcdnDomainWithOptions(AddDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDcdnDomainResponse());
    }

    /**
      * > 
      * *   Dynamic Content Delivery Network (DCDN) is activated.
      * *   Internet content provider (ICP) filing is complete for the accelerated domain name.
      * *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request AddDcdnDomainRequest
      * @return AddDcdnDomainResponse
     */
    public AddDcdnDomainResponse addDcdnDomain(AddDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDcdnDomainWithOptions(request, runtime);
    }

    /**
      * > 
      * *   Make sure that the IPA service is activated before you add a domain name to accelerate.
      * *   Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.
      * *   You can call this operation up to 10 times per second per user.
      *
      * @param request AddDcdnIpaDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AddDcdnIpaDomainResponse
     */
    public AddDcdnIpaDomainResponse addDcdnIpaDomainWithOptions(AddDcdnIpaDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDcdnIpaDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDcdnIpaDomainResponse());
    }

    /**
      * > 
      * *   Make sure that the IPA service is activated before you add a domain name to accelerate.
      * *   Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.
      * *   You can call this operation up to 10 times per second per user.
      *
      * @param request AddDcdnIpaDomainRequest
      * @return AddDcdnIpaDomainResponse
     */
    public AddDcdnIpaDomainResponse addDcdnIpaDomain(AddDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
      * **Prerequisites**:
      * *   The [DCDN service is activated](~~64926~~).
      * *   Internet content provider (ICP) filing is complete for the accelerated domain names.
      * > 
      * *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request BatchAddDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchAddDcdnDomainResponse
     */
    public BatchAddDcdnDomainResponse batchAddDcdnDomainWithOptions(BatchAddDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddDcdnDomainResponse());
    }

    /**
      * **Prerequisites**:
      * *   The [DCDN service is activated](~~64926~~).
      * *   Internet content provider (ICP) filing is complete for the accelerated domain names.
      * > 
      * *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request BatchAddDcdnDomainRequest
      * @return BatchAddDcdnDomainResponse
     */
    public BatchAddDcdnDomainResponse batchAddDcdnDomain(BatchAddDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAddDcdnDomainWithOptions(request, runtime);
    }

    /**
      * The ID of the request.
      *
      * @param request BatchCreateDcdnWafRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchCreateDcdnWafRulesResponse
     */
    public BatchCreateDcdnWafRulesResponse batchCreateDcdnWafRulesWithOptions(BatchCreateDcdnWafRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfigs)) {
            body.put("RuleConfigs", request.ruleConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateDcdnWafRules"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateDcdnWafRulesResponse());
    }

    /**
      * The ID of the request.
      *
      * @param request BatchCreateDcdnWafRulesRequest
      * @return BatchCreateDcdnWafRulesResponse
     */
    public BatchCreateDcdnWafRulesResponse batchCreateDcdnWafRules(BatchCreateDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateDcdnWafRulesWithOptions(request, runtime);
    }

    /**
      * > - You can specify up to 50 domain names in each request.
      * > - You can call this operation up to 30 times per second per account.
      *
      * @param request BatchDeleteDcdnDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchDeleteDcdnDomainConfigsResponse
     */
    public BatchDeleteDcdnDomainConfigsResponse batchDeleteDcdnDomainConfigsWithOptions(BatchDeleteDcdnDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDcdnDomainConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDcdnDomainConfigsResponse());
    }

    /**
      * > - You can specify up to 50 domain names in each request.
      * > - You can call this operation up to 30 times per second per account.
      *
      * @param request BatchDeleteDcdnDomainConfigsRequest
      * @return BatchDeleteDcdnDomainConfigsResponse
     */
    public BatchDeleteDcdnDomainConfigsResponse batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDcdnDomainConfigsWithOptions(request, runtime);
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request BatchDeleteDcdnWafRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchDeleteDcdnWafRulesResponse
     */
    public BatchDeleteDcdnWafRulesResponse batchDeleteDcdnWafRulesWithOptions(BatchDeleteDcdnWafRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            body.put("RuleIds", request.ruleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDcdnWafRules"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDcdnWafRulesResponse());
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request BatchDeleteDcdnWafRulesRequest
      * @return BatchDeleteDcdnWafRulesResponse
     */
    public BatchDeleteDcdnWafRulesResponse batchDeleteDcdnWafRules(BatchDeleteDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDcdnWafRulesWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request BatchModifyDcdnWafRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchModifyDcdnWafRulesResponse
     */
    public BatchModifyDcdnWafRulesResponse batchModifyDcdnWafRulesWithOptions(BatchModifyDcdnWafRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfigs)) {
            body.put("RuleConfigs", request.ruleConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchModifyDcdnWafRules"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchModifyDcdnWafRulesResponse());
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request BatchModifyDcdnWafRulesRequest
      * @return BatchModifyDcdnWafRulesResponse
     */
    public BatchModifyDcdnWafRulesResponse batchModifyDcdnWafRules(BatchModifyDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchModifyDcdnWafRulesWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request BatchSetDcdnDomainCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchSetDcdnDomainCertificateResponse
     */
    public BatchSetDcdnDomainCertificateResponse batchSetDcdnDomainCertificateWithOptions(BatchSetDcdnDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetDcdnDomainCertificate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetDcdnDomainCertificateResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request BatchSetDcdnDomainCertificateRequest
      * @return BatchSetDcdnDomainCertificateResponse
     */
    public BatchSetDcdnDomainCertificateResponse batchSetDcdnDomainCertificate(BatchSetDcdnDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnDomainCertificateWithOptions(request, runtime);
    }

    /**
      * > * You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,)
      * > * You can call this operation up to 30 times per second per account.
      *
      * @param request BatchSetDcdnDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchSetDcdnDomainConfigsResponse
     */
    public BatchSetDcdnDomainConfigsResponse batchSetDcdnDomainConfigsWithOptions(BatchSetDcdnDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetDcdnDomainConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetDcdnDomainConfigsResponse());
    }

    /**
      * > * You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,)
      * > * You can call this operation up to 30 times per second per account.
      *
      * @param request BatchSetDcdnDomainConfigsRequest
      * @return BatchSetDcdnDomainConfigsResponse
     */
    public BatchSetDcdnDomainConfigsResponse batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnDomainConfigsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request BatchSetDcdnIpaDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchSetDcdnIpaDomainConfigsResponse
     */
    public BatchSetDcdnIpaDomainConfigsResponse batchSetDcdnIpaDomainConfigsWithOptions(BatchSetDcdnIpaDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetDcdnIpaDomainConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetDcdnIpaDomainConfigsResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request BatchSetDcdnIpaDomainConfigsRequest
      * @return BatchSetDcdnIpaDomainConfigsResponse
     */
    public BatchSetDcdnIpaDomainConfigsResponse batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnIpaDomainConfigsWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request BatchSetDcdnWafDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchSetDcdnWafDomainConfigsResponse
     */
    public BatchSetDcdnWafDomainConfigsResponse batchSetDcdnWafDomainConfigsWithOptions(BatchSetDcdnWafDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIpTag)) {
            body.put("ClientIpTag", request.clientIpTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseStatus)) {
            body.put("DefenseStatus", request.defenseStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            body.put("DomainNames", request.domainNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetDcdnWafDomainConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetDcdnWafDomainConfigsResponse());
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request BatchSetDcdnWafDomainConfigsRequest
      * @return BatchSetDcdnWafDomainConfigsResponse
     */
    public BatchSetDcdnWafDomainConfigsResponse batchSetDcdnWafDomainConfigs(BatchSetDcdnWafDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnWafDomainConfigsWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request BatchStartDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchStartDcdnDomainResponse
     */
    public BatchStartDcdnDomainResponse batchStartDcdnDomainWithOptions(BatchStartDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartDcdnDomainResponse());
    }

    /**
      * > 
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request BatchStartDcdnDomainRequest
      * @return BatchStartDcdnDomainResponse
     */
    public BatchStartDcdnDomainResponse batchStartDcdnDomain(BatchStartDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartDcdnDomainWithOptions(request, runtime);
    }

    /**
      * > 
      * *   After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request BatchStopDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchStopDcdnDomainResponse
     */
    public BatchStopDcdnDomainResponse batchStopDcdnDomainWithOptions(BatchStopDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopDcdnDomainResponse());
    }

    /**
      * > 
      * *   After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request BatchStopDcdnDomainRequest
      * @return BatchStopDcdnDomainResponse
     */
    public BatchStopDcdnDomainResponse batchStopDcdnDomain(BatchStopDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopDcdnDomainWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request CheckDcdnProjectExistRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CheckDcdnProjectExistResponse
     */
    public CheckDcdnProjectExistResponse checkDcdnProjectExistWithOptions(CheckDcdnProjectExistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDcdnProjectExist"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDcdnProjectExistResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request CheckDcdnProjectExistRequest
      * @return CheckDcdnProjectExistResponse
     */
    public CheckDcdnProjectExistResponse checkDcdnProjectExist(CheckDcdnProjectExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDcdnProjectExistWithOptions(request, runtime);
    }

    /**
      * >  The call frequency of the API is no more than 100 queries per second.
      *
      * @param request CommitStagingRoutineCodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CommitStagingRoutineCodeResponse
     */
    public CommitStagingRoutineCodeResponse commitStagingRoutineCodeWithOptions(CommitStagingRoutineCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitStagingRoutineCode"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitStagingRoutineCodeResponse());
    }

    /**
      * >  The call frequency of the API is no more than 100 queries per second.
      *
      * @param request CommitStagingRoutineCodeRequest
      * @return CommitStagingRoutineCodeResponse
     */
    public CommitStagingRoutineCodeResponse commitStagingRoutineCode(CommitStagingRoutineCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitStagingRoutineCodeWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request CreateDcdnDeliverTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDcdnDeliverTaskResponse
     */
    public CreateDcdnDeliverTaskResponse createDcdnDeliverTaskWithOptions(CreateDcdnDeliverTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliver)) {
            body.put("Deliver", request.deliver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reports)) {
            body.put("Reports", request.reports);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("Schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDcdnDeliverTask"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDcdnDeliverTaskResponse());
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request CreateDcdnDeliverTaskRequest
      * @return CreateDcdnDeliverTaskResponse
     */
    public CreateDcdnDeliverTaskResponse createDcdnDeliverTask(CreateDcdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnDeliverTaskWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request CreateDcdnSLSRealTimeLogDeliveryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDcdnSLSRealTimeLogDeliveryResponse
     */
    public CreateDcdnSLSRealTimeLogDeliveryResponse createDcdnSLSRealTimeLogDeliveryWithOptions(CreateDcdnSLSRealTimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCenter)) {
            body.put("DataCenter", request.dataCenter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSLogStore)) {
            body.put("SLSLogStore", request.SLSLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSProject)) {
            body.put("SLSProject", request.SLSProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSRegion)) {
            body.put("SLSRegion", request.SLSRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingRate)) {
            body.put("SamplingRate", request.samplingRate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDcdnSLSRealTimeLogDelivery"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDcdnSLSRealTimeLogDeliveryResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request CreateDcdnSLSRealTimeLogDeliveryRequest
      * @return CreateDcdnSLSRealTimeLogDeliveryResponse
     */
    public CreateDcdnSLSRealTimeLogDeliveryResponse createDcdnSLSRealTimeLogDelivery(CreateDcdnSLSRealTimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnSLSRealTimeLogDeliveryWithOptions(request, runtime);
    }

    /**
      * > 
      * *   This operation allows you to customize an operations report for a specific domain name. You can view the statistics about the domain name in the report.
      * *   You can call this operation up to three times per second per account.
      *
      * @param request CreateDcdnSubTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDcdnSubTaskResponse
     */
    public CreateDcdnSubTaskResponse createDcdnSubTaskWithOptions(CreateDcdnSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportIds)) {
            body.put("ReportIds", request.reportIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDcdnSubTask"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDcdnSubTaskResponse());
    }

    /**
      * > 
      * *   This operation allows you to customize an operations report for a specific domain name. You can view the statistics about the domain name in the report.
      * *   You can call this operation up to three times per second per account.
      *
      * @param request CreateDcdnSubTaskRequest
      * @return CreateDcdnSubTaskResponse
     */
    public CreateDcdnSubTaskResponse createDcdnSubTask(CreateDcdnSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnSubTaskWithOptions(request, runtime);
    }

    /**
      * *   You can call this operation up to 20 times per second per user.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
      * @param request CreateDcdnWafPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDcdnWafPolicyResponse
     */
    public CreateDcdnWafPolicyResponse createDcdnWafPolicyWithOptions(CreateDcdnWafPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            body.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyStatus)) {
            body.put("PolicyStatus", request.policyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDcdnWafPolicy"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDcdnWafPolicyResponse());
    }

    /**
      * *   You can call this operation up to 20 times per second per user.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
      * @param request CreateDcdnWafPolicyRequest
      * @return CreateDcdnWafPolicyResponse
     */
    public CreateDcdnWafPolicyResponse createDcdnWafPolicy(CreateDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
      * > 
      * *   The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.
      * *   This operation creates a routine that contains only production and staging environments.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param tmpReq CreateRoutineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutineWithOptions(CreateRoutineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRoutineShrinkRequest request = new CreateRoutineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.envConf)) {
            request.envConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.envConf, "EnvConf", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envConfShrink)) {
            body.put("EnvConf", request.envConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutine"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineResponse());
    }

    /**
      * > 
      * *   The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.
      * *   This operation creates a routine that contains only production and staging environments.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request CreateRoutineRequest
      * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutine(CreateRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
      * @param request CreateSlrAndSlsProjectRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateSlrAndSlsProjectResponse
     */
    public CreateSlrAndSlsProjectResponse createSlrAndSlsProjectWithOptions(CreateSlrAndSlsProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSlrAndSlsProject"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSlrAndSlsProjectResponse());
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
      * @param request CreateSlrAndSlsProjectRequest
      * @return CreateSlrAndSlsProjectResponse
     */
    public CreateSlrAndSlsProjectResponse createSlrAndSlsProject(CreateSlrAndSlsProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSlrAndSlsProjectWithOptions(request, runtime);
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 3.
      *
      * @param request DeleteDcdnDeliverTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnDeliverTaskResponse
     */
    public DeleteDcdnDeliverTaskResponse deleteDcdnDeliverTaskWithOptions(DeleteDcdnDeliverTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverId)) {
            query.put("DeliverId", request.deliverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnDeliverTask"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnDeliverTaskResponse());
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 3.
      *
      * @param request DeleteDcdnDeliverTaskRequest
      * @return DeleteDcdnDeliverTaskResponse
     */
    public DeleteDcdnDeliverTaskResponse deleteDcdnDeliverTask(DeleteDcdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnDeliverTaskWithOptions(request, runtime);
    }

    /**
      * > *   Before you delete your domain name, you must request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * > *   If you call the **DeleteDcdnDomain** operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the [StopDcdnDomain](~~130622~~) operation.
      * > *   The maximum number of times that each user can call this operation per second is 10.
      *
      * @param request DeleteDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnDomainResponse
     */
    public DeleteDcdnDomainResponse deleteDcdnDomainWithOptions(DeleteDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnDomainResponse());
    }

    /**
      * > *   Before you delete your domain name, you must request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * > *   If you call the **DeleteDcdnDomain** operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the [StopDcdnDomain](~~130622~~) operation.
      * > *   The maximum number of times that each user can call this operation per second is 10.
      *
      * @param request DeleteDcdnDomainRequest
      * @return DeleteDcdnDomainResponse
     */
    public DeleteDcdnDomainResponse deleteDcdnDomain(DeleteDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnDomainWithOptions(request, runtime);
    }

    /**
      * > 
      * *   Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * *   This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the **StopDcdnIpaDomain** operation.****
      * *   You can call this operation up to 10 times per second per account.
      *
      * @param request DeleteDcdnIpaDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnIpaDomainResponse
     */
    public DeleteDcdnIpaDomainResponse deleteDcdnIpaDomainWithOptions(DeleteDcdnIpaDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnIpaDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnIpaDomainResponse());
    }

    /**
      * > 
      * *   Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * *   This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the **StopDcdnIpaDomain** operation.****
      * *   You can call this operation up to 10 times per second per account.
      *
      * @param request DeleteDcdnIpaDomainRequest
      * @return DeleteDcdnIpaDomainResponse
     */
    public DeleteDcdnIpaDomainResponse deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DeleteDcdnIpaSpecificConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnIpaSpecificConfigResponse
     */
    public DeleteDcdnIpaSpecificConfigResponse deleteDcdnIpaSpecificConfigWithOptions(DeleteDcdnIpaSpecificConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnIpaSpecificConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnIpaSpecificConfigResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DeleteDcdnIpaSpecificConfigRequest
      * @return DeleteDcdnIpaSpecificConfigResponse
     */
    public DeleteDcdnIpaSpecificConfigResponse deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnIpaSpecificConfigWithOptions(request, runtime);
    }

    public DeleteDcdnKvResponse deleteDcdnKvWithOptions(DeleteDcdnKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnKv"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnKvResponse());
    }

    public DeleteDcdnKvResponse deleteDcdnKv(DeleteDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnKvWithOptions(request, runtime);
    }

    public DeleteDcdnKvNamespaceResponse deleteDcdnKvNamespaceWithOptions(DeleteDcdnKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnKvNamespace"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnKvNamespaceResponse());
    }

    public DeleteDcdnKvNamespaceResponse deleteDcdnKvNamespace(DeleteDcdnKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnKvNamespaceWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteDcdnRealTimeLogProjectRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnRealTimeLogProjectResponse
     */
    public DeleteDcdnRealTimeLogProjectResponse deleteDcdnRealTimeLogProjectWithOptions(DeleteDcdnRealTimeLogProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnRealTimeLogProject"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnRealTimeLogProjectResponse());
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteDcdnRealTimeLogProjectRequest
      * @return DeleteDcdnRealTimeLogProjectResponse
     */
    public DeleteDcdnRealTimeLogProjectResponse deleteDcdnRealTimeLogProject(DeleteDcdnRealTimeLogProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnRealTimeLogProjectWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DeleteDcdnSpecificConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnSpecificConfigResponse
     */
    public DeleteDcdnSpecificConfigResponse deleteDcdnSpecificConfigWithOptions(DeleteDcdnSpecificConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnSpecificConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnSpecificConfigResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DeleteDcdnSpecificConfigRequest
      * @return DeleteDcdnSpecificConfigResponse
     */
    public DeleteDcdnSpecificConfigResponse deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnSpecificConfigWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DeleteDcdnSpecificStagingConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnSpecificStagingConfigResponse
     */
    public DeleteDcdnSpecificStagingConfigResponse deleteDcdnSpecificStagingConfigWithOptions(DeleteDcdnSpecificStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnSpecificStagingConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnSpecificStagingConfigResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DeleteDcdnSpecificStagingConfigRequest
      * @return DeleteDcdnSpecificStagingConfigResponse
     */
    public DeleteDcdnSpecificStagingConfigResponse deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnSpecificStagingConfigWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 3 times per second per account.
      *
      * @param request DeleteDcdnSubTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnSubTaskResponse
     */
    public DeleteDcdnSubTaskResponse deleteDcdnSubTaskWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnSubTask"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnSubTaskResponse());
    }

    /**
      * > You can call this operation up to 3 times per second per account.
      *
      * @return DeleteDcdnSubTaskResponse
     */
    public DeleteDcdnSubTaskResponse deleteDcdnSubTask() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnSubTaskWithOptions(runtime);
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request DeleteDcdnWafPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDcdnWafPolicyResponse
     */
    public DeleteDcdnWafPolicyResponse deleteDcdnWafPolicyWithOptions(DeleteDcdnWafPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnWafPolicy"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnWafPolicyResponse());
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request DeleteDcdnWafPolicyRequest
      * @return DeleteDcdnWafPolicyResponse
     */
    public DeleteDcdnWafPolicyResponse deleteDcdnWafPolicy(DeleteDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteRoutineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutineWithOptions(DeleteRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutine"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteRoutineRequest
      * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutine(DeleteRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteRoutineCodeRevisionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteRoutineCodeRevisionResponse
     */
    public DeleteRoutineCodeRevisionResponse deleteRoutineCodeRevisionWithOptions(DeleteRoutineCodeRevisionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectCodeRevision)) {
            body.put("SelectCodeRevision", request.selectCodeRevision);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineCodeRevision"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineCodeRevisionResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteRoutineCodeRevisionRequest
      * @return DeleteRoutineCodeRevisionResponse
     */
    public DeleteRoutineCodeRevisionResponse deleteRoutineCodeRevision(DeleteRoutineCodeRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineCodeRevisionWithOptions(request, runtime);
    }

    /**
      * > 
      * *   This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param tmpReq DeleteRoutineConfEnvsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteRoutineConfEnvsResponse
     */
    public DeleteRoutineConfEnvsResponse deleteRoutineConfEnvsWithOptions(DeleteRoutineConfEnvsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRoutineConfEnvsShrinkRequest request = new DeleteRoutineConfEnvsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.envs)) {
            request.envsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.envs, "Envs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envsShrink)) {
            body.put("Envs", request.envsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineConfEnvs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineConfEnvsResponse());
    }

    /**
      * > 
      * *   This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DeleteRoutineConfEnvsRequest
      * @return DeleteRoutineConfEnvsResponse
     */
    public DeleteRoutineConfEnvsResponse deleteRoutineConfEnvs(DeleteRoutineConfEnvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineConfEnvsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnAclFieldsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnAclFieldsResponse
     */
    public DescribeDcdnAclFieldsResponse describeDcdnAclFieldsWithOptions(DescribeDcdnAclFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnAclFields"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnAclFieldsResponse());
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnAclFieldsRequest
      * @return DescribeDcdnAclFieldsResponse
     */
    public DescribeDcdnAclFieldsResponse describeDcdnAclFields(DescribeDcdnAclFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnAclFieldsWithOptions(request, runtime);
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
      * @param request DescribeDcdnBgpBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnBgpBpsDataResponse
     */
    public DescribeDcdnBgpBpsDataResponse describeDcdnBgpBpsDataWithOptions(DescribeDcdnBgpBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePort)) {
            query.put("DevicePort", request.devicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnBgpBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnBgpBpsDataResponse());
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
      * @param request DescribeDcdnBgpBpsDataRequest
      * @return DescribeDcdnBgpBpsDataResponse
     */
    public DescribeDcdnBgpBpsDataResponse describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnBgpBpsDataWithOptions(request, runtime);
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
      * @param request DescribeDcdnBgpTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnBgpTrafficDataResponse
     */
    public DescribeDcdnBgpTrafficDataResponse describeDcdnBgpTrafficDataWithOptions(DescribeDcdnBgpTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnBgpTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnBgpTrafficDataResponse());
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
      * @param request DescribeDcdnBgpTrafficDataRequest
      * @return DescribeDcdnBgpTrafficDataResponse
     */
    public DescribeDcdnBgpTrafficDataResponse describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnBgpTrafficDataWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnBlockedRegionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnBlockedRegionsResponse
     */
    public DescribeDcdnBlockedRegionsResponse describeDcdnBlockedRegionsWithOptions(DescribeDcdnBlockedRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnBlockedRegions"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnBlockedRegionsResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnBlockedRegionsRequest
      * @return DescribeDcdnBlockedRegionsResponse
     */
    public DescribeDcdnBlockedRegionsResponse describeDcdnBlockedRegions(DescribeDcdnBlockedRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnBlockedRegionsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnCertificateDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnCertificateDetailResponse
     */
    public DescribeDcdnCertificateDetailResponse describeDcdnCertificateDetailWithOptions(DescribeDcdnCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnCertificateDetail"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnCertificateDetailResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnCertificateDetailRequest
      * @return DescribeDcdnCertificateDetailResponse
     */
    public DescribeDcdnCertificateDetailResponse describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnCertificateDetailWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnCertificateListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnCertificateListResponse
     */
    public DescribeDcdnCertificateListResponse describeDcdnCertificateListWithOptions(DescribeDcdnCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnCertificateList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnCertificateListResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnCertificateListRequest
      * @return DescribeDcdnCertificateListResponse
     */
    public DescribeDcdnCertificateListResponse describeDcdnCertificateList(DescribeDcdnCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnCertificateListWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnDeletedDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDeletedDomainsResponse
     */
    public DescribeDcdnDeletedDomainsResponse describeDcdnDeletedDomainsWithOptions(DescribeDcdnDeletedDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDeletedDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDeletedDomainsResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnDeletedDomainsRequest
      * @return DescribeDcdnDeletedDomainsResponse
     */
    public DescribeDcdnDeletedDomainsResponse describeDcdnDeletedDomains(DescribeDcdnDeletedDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDeletedDomainsWithOptions(request, runtime);
    }

    /**
      * **
      * **You can call this operation up to three times per second.
      *
      * @param request DescribeDcdnDeliverListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDeliverListResponse
     */
    public DescribeDcdnDeliverListResponse describeDcdnDeliverListWithOptions(DescribeDcdnDeliverListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverId)) {
            query.put("DeliverId", request.deliverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDeliverList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDeliverListResponse());
    }

    /**
      * **
      * **You can call this operation up to three times per second.
      *
      * @param request DescribeDcdnDeliverListRequest
      * @return DescribeDcdnDeliverListResponse
     */
    public DescribeDcdnDeliverListResponse describeDcdnDeliverList(DescribeDcdnDeliverListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDeliverListWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainBpsDataResponse
     */
    public DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsDataWithOptions(DescribeDcdnDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainBpsDataResponse());
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainBpsDataRequest
      * @return DescribeDcdnDomainBpsDataResponse
     */
    public DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainBpsDataByLayerResponse describeDcdnDomainBpsDataByLayerWithOptions(DescribeDcdnDomainBpsDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainBpsDataByLayer"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainBpsDataByLayerResponse());
    }

    public DescribeDcdnDomainBpsDataByLayerResponse describeDcdnDomainBpsDataByLayer(DescribeDcdnDomainBpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainBpsDataByLayerWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainByCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainByCertificateResponse
     */
    public DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificateWithOptions(DescribeDcdnDomainByCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLStatus)) {
            query.put("SSLStatus", request.SSLStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainByCertificate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainByCertificateResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainByCertificateRequest
      * @return DescribeDcdnDomainByCertificateResponse
     */
    public DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainByCertificateWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.
      * *   You can query data collected over the last 30 days.
      * *   You can call this operation up to 50 times per second per user.
      *
      * @param request DescribeDcdnDomainCcActivityLogRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainCcActivityLogResponse
     */
    public DescribeDcdnDomainCcActivityLogResponse describeDcdnDomainCcActivityLogWithOptions(DescribeDcdnDomainCcActivityLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerObject)) {
            query.put("TriggerObject", request.triggerObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainCcActivityLog"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainCcActivityLogResponse());
    }

    /**
      * > 
      * *   If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.
      * *   You can query data collected over the last 30 days.
      * *   You can call this operation up to 50 times per second per user.
      *
      * @param request DescribeDcdnDomainCcActivityLogRequest
      * @return DescribeDcdnDomainCcActivityLogResponse
     */
    public DescribeDcdnDomainCcActivityLogResponse describeDcdnDomainCcActivityLog(DescribeDcdnDomainCcActivityLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainCcActivityLogWithOptions(request, runtime);
    }

    /**
      * The ID of the request.
      *
      * @param request DescribeDcdnDomainCertificateInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainCertificateInfoResponse
     */
    public DescribeDcdnDomainCertificateInfoResponse describeDcdnDomainCertificateInfoWithOptions(DescribeDcdnDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainCertificateInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainCertificateInfoResponse());
    }

    /**
      * The ID of the request.
      *
      * @param request DescribeDcdnDomainCertificateInfoRequest
      * @return DescribeDcdnDomainCertificateInfoResponse
     */
    public DescribeDcdnDomainCertificateInfoResponse describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 80 times per second per account.
      *
      * @param request DescribeDcdnDomainCnameRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainCnameResponse
     */
    public DescribeDcdnDomainCnameResponse describeDcdnDomainCnameWithOptions(DescribeDcdnDomainCnameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainCname"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainCnameResponse());
    }

    /**
      * > You can call this operation up to 80 times per second per account.
      *
      * @param request DescribeDcdnDomainCnameRequest
      * @return DescribeDcdnDomainCnameResponse
     */
    public DescribeDcdnDomainCnameResponse describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainCnameWithOptions(request, runtime);
    }

    /**
      * > 
      * *   You can query the configurations of one or more features in a request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainConfigsResponse
     */
    public DescribeDcdnDomainConfigsResponse describeDcdnDomainConfigsWithOptions(DescribeDcdnDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainConfigsResponse());
    }

    /**
      * > 
      * *   You can query the configurations of one or more features in a request.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnDomainConfigsRequest
      * @return DescribeDcdnDomainConfigsResponse
     */
    public DescribeDcdnDomainConfigsResponse describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainConfigsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnDomainDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainDetailResponse
     */
    public DescribeDcdnDomainDetailResponse describeDcdnDomainDetailWithOptions(DescribeDcdnDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainDetail"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainDetailResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnDomainDetailRequest
      * @return DescribeDcdnDomainDetailResponse
     */
    public DescribeDcdnDomainDetailResponse describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainDetailWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 100 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainHitRateDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainHitRateDataResponse
     */
    public DescribeDcdnDomainHitRateDataResponse describeDcdnDomainHitRateDataWithOptions(DescribeDcdnDomainHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainHitRateData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainHitRateDataResponse());
    }

    /**
      * #
      * *   You can call this operation up to 100 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainHitRateDataRequest
      * @return DescribeDcdnDomainHitRateDataResponse
     */
    public DescribeDcdnDomainHitRateDataResponse describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainHitRateDataWithOptions(request, runtime);
    }

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainHttpCodeDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainHttpCodeDataResponse
     */
    public DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeDataWithOptions(DescribeDcdnDomainHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainHttpCodeData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainHttpCodeDataResponse());
    }

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainHttpCodeDataRequest
      * @return DescribeDcdnDomainHttpCodeDataResponse
     */
    public DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainHttpCodeDataWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second per account.
      * *   You cannot query the distribution of HTTP status codes by IP protocol.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainHttpCodeDataByLayerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainHttpCodeDataByLayerResponse
     */
    public DescribeDcdnDomainHttpCodeDataByLayerResponse describeDcdnDomainHttpCodeDataByLayerWithOptions(DescribeDcdnDomainHttpCodeDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainHttpCodeDataByLayer"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainHttpCodeDataByLayerResponse());
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second per account.
      * *   You cannot query the distribution of HTTP status codes by IP protocol.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainHttpCodeDataByLayerRequest
      * @return DescribeDcdnDomainHttpCodeDataByLayerResponse
     */
    public DescribeDcdnDomainHttpCodeDataByLayerResponse describeDcdnDomainHttpCodeDataByLayer(DescribeDcdnDomainHttpCodeDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainHttpCodeDataByLayerWithOptions(request, runtime);
    }

    /**
      * > 
      * *   The bandwidth is measured in bit/s.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainIpaBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainIpaBpsDataResponse
     */
    public DescribeDcdnDomainIpaBpsDataResponse describeDcdnDomainIpaBpsDataWithOptions(DescribeDcdnDomainIpaBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixTimeGap)) {
            query.put("FixTimeGap", request.fixTimeGap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMerge)) {
            query.put("TimeMerge", request.timeMerge);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainIpaBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainIpaBpsDataResponse());
    }

    /**
      * > 
      * *   The bandwidth is measured in bit/s.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainIpaBpsDataRequest
      * @return DescribeDcdnDomainIpaBpsDataResponse
     */
    public DescribeDcdnDomainIpaBpsDataResponse describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIpaBpsDataWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.
      *
      * @param request DescribeDcdnDomainIpaConnDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainIpaConnDataResponse
     */
    public DescribeDcdnDomainIpaConnDataResponse describeDcdnDomainIpaConnDataWithOptions(DescribeDcdnDomainIpaConnDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitBy)) {
            query.put("SplitBy", request.splitBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainIpaConnData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainIpaConnDataResponse());
    }

    /**
      * #
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.
      *
      * @param request DescribeDcdnDomainIpaConnDataRequest
      * @return DescribeDcdnDomainIpaConnDataResponse
     */
    public DescribeDcdnDomainIpaConnDataResponse describeDcdnDomainIpaConnData(DescribeDcdnDomainIpaConnDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIpaConnDataWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   Unit: bytes.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainIpaTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainIpaTrafficDataResponse
     */
    public DescribeDcdnDomainIpaTrafficDataResponse describeDcdnDomainIpaTrafficDataWithOptions(DescribeDcdnDomainIpaTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixTimeGap)) {
            query.put("FixTimeGap", request.fixTimeGap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMerge)) {
            query.put("TimeMerge", request.timeMerge);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainIpaTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainIpaTrafficDataResponse());
    }

    /**
      * > 
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   Unit: bytes.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainIpaTrafficDataRequest
      * @return DescribeDcdnDomainIpaTrafficDataResponse
     */
    public DescribeDcdnDomainIpaTrafficDataResponse describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIpaTrafficDataWithOptions(request, runtime);
    }

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   If **StartTime** is set but **EndTime** is not set, the data within the hour that starts from **StartTime** is queried.
      * *   If **EndTime** is set but **StartTime** is not set, the data within the last hour that precedes **EndTime** is queried.
      * *   You can query data of a domain name or all domain names that belong to your account.
      * *   You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by **StartTime** and **EndTime**.
      *     *   **If the time range is shorter than or equal to one hour**, data is queried every minute.
      *     *   **If the time range is longer than 1 hour but shorter than or equal to three days**, data is queried every five minutes.
      *     *   **If the time range is longer than three days but shorter than or equal to seven days**, data is queried every hour.
      *
      * @param request DescribeDcdnDomainIspDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainIspDataResponse
     */
    public DescribeDcdnDomainIspDataResponse describeDcdnDomainIspDataWithOptions(DescribeDcdnDomainIspDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainIspData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainIspDataResponse());
    }

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   If **StartTime** is set but **EndTime** is not set, the data within the hour that starts from **StartTime** is queried.
      * *   If **EndTime** is set but **StartTime** is not set, the data within the last hour that precedes **EndTime** is queried.
      * *   You can query data of a domain name or all domain names that belong to your account.
      * *   You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by **StartTime** and **EndTime**.
      *     *   **If the time range is shorter than or equal to one hour**, data is queried every minute.
      *     *   **If the time range is longer than 1 hour but shorter than or equal to three days**, data is queried every five minutes.
      *     *   **If the time range is longer than three days but shorter than or equal to seven days**, data is queried every hour.
      *
      * @param request DescribeDcdnDomainIspDataRequest
      * @return DescribeDcdnDomainIspDataResponse
     */
    public DescribeDcdnDomainIspDataResponse describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIspDataWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If you specify neither the **StartTime** parameter nor the **EndTime** parameter, the data in the last 24 hours is returned. If you specify the **StartTime** and **EndTime** parameters, the data within the specified time range is returned.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainLogRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainLogResponse
     */
    public DescribeDcdnDomainLogResponse describeDcdnDomainLogWithOptions(DescribeDcdnDomainLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainLog"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainLogResponse());
    }

    /**
      * > 
      * *   If you specify neither the **StartTime** parameter nor the **EndTime** parameter, the data in the last 24 hours is returned. If you specify the **StartTime** and **EndTime** parameters, the data within the specified time range is returned.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainLogRequest
      * @return DescribeDcdnDomainLogResponse
     */
    public DescribeDcdnDomainLogResponse describeDcdnDomainLog(DescribeDcdnDomainLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainLogWithOptions(request, runtime);
    }

    /**
      * When you call this operation, take note of the following rules:
      * *   If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.
      * *   You can specify one or more accelerated domain names. Separate domain names with commas (,).
      * *   You can query data within the last 90 days.
      * *   The time range cannot exceed 1 hour.
      *
      * @param request DescribeDcdnDomainMultiUsageDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainMultiUsageDataResponse
     */
    public DescribeDcdnDomainMultiUsageDataResponse describeDcdnDomainMultiUsageDataWithOptions(DescribeDcdnDomainMultiUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainMultiUsageData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainMultiUsageDataResponse());
    }

    /**
      * When you call this operation, take note of the following rules:
      * *   If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.
      * *   You can specify one or more accelerated domain names. Separate domain names with commas (,).
      * *   You can query data within the last 90 days.
      * *   The time range cannot exceed 1 hour.
      *
      * @param request DescribeDcdnDomainMultiUsageDataRequest
      * @return DescribeDcdnDomainMultiUsageDataResponse
     */
    public DescribeDcdnDomainMultiUsageDataResponse describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainMultiUsageDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainOriginBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainOriginBpsDataResponse
     */
    public DescribeDcdnDomainOriginBpsDataResponse describeDcdnDomainOriginBpsDataWithOptions(DescribeDcdnDomainOriginBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainOriginBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainOriginBpsDataResponse());
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainOriginBpsDataRequest
      * @return DescribeDcdnDomainOriginBpsDataResponse
     */
    public DescribeDcdnDomainOriginBpsDataResponse describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainOriginBpsDataWithOptions(request, runtime);
    }

    /**
      * - You can call this operation up to 100 times per second per account.
      * - If you do not set the **StartTime** or **EndTime** parameters, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. 
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * | ---------------- | ---------------------------- | ------------------------- | ---------- |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      * | 1 day | 366 days | 366 days | 04:00 on the next day |
      *
      * @param request DescribeDcdnDomainOriginTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainOriginTrafficDataResponse
     */
    public DescribeDcdnDomainOriginTrafficDataResponse describeDcdnDomainOriginTrafficDataWithOptions(DescribeDcdnDomainOriginTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainOriginTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainOriginTrafficDataResponse());
    }

    /**
      * - You can call this operation up to 100 times per second per account.
      * - If you do not set the **StartTime** or **EndTime** parameters, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. 
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * | ---------------- | ---------------------------- | ------------------------- | ---------- |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      * | 1 day | 366 days | 366 days | 04:00 on the next day |
      *
      * @param request DescribeDcdnDomainOriginTrafficDataRequest
      * @return DescribeDcdnDomainOriginTrafficDataResponse
     */
    public DescribeDcdnDomainOriginTrafficDataResponse describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainOriginTrafficDataWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnDomainPropertyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainPropertyResponse
     */
    public DescribeDcdnDomainPropertyResponse describeDcdnDomainPropertyWithOptions(DescribeDcdnDomainPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainProperty"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainPropertyResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnDomainPropertyRequest
      * @return DescribeDcdnDomainPropertyResponse
     */
    public DescribeDcdnDomainPropertyResponse describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainPropertyWithOptions(request, runtime);
    }

    public DescribeDcdnDomainPvDataResponse describeDcdnDomainPvDataWithOptions(DescribeDcdnDomainPvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainPvData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainPvDataResponse());
    }

    public DescribeDcdnDomainPvDataResponse describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainPvDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainQpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainQpsDataResponse
     */
    public DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsDataWithOptions(DescribeDcdnDomainQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainQpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainQpsDataResponse());
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainQpsDataRequest
      * @return DescribeDcdnDomainQpsDataResponse
     */
    public DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainQpsDataWithOptions(request, runtime);
    }

    /**
      * - You can call this operation up to 20 times per second per account.
      * - If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. 
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * | ---------------- | ---------------------------- | ------------------------- | ---------- |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      * | 1 day | 366 days | 366 days | 04:00 on the next day |
      *
      * @param request DescribeDcdnDomainQpsDataByLayerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainQpsDataByLayerResponse
     */
    public DescribeDcdnDomainQpsDataByLayerResponse describeDcdnDomainQpsDataByLayerWithOptions(DescribeDcdnDomainQpsDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainQpsDataByLayer"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainQpsDataByLayerResponse());
    }

    /**
      * - You can call this operation up to 20 times per second per account.
      * - If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. 
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * | ---------------- | ---------------------------- | ------------------------- | ---------- |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      * | 1 day | 366 days | 366 days | 04:00 on the next day |
      *
      * @param request DescribeDcdnDomainQpsDataByLayerRequest
      * @return DescribeDcdnDomainQpsDataByLayerResponse
     */
    public DescribeDcdnDomainQpsDataByLayerResponse describeDcdnDomainQpsDataByLayer(DescribeDcdnDomainQpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainQpsDataByLayerWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse describeDcdnDomainRealTimeBpsDataWithOptions(DescribeDcdnDomainRealTimeBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeBpsDataResponse());
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * |----|------|-----|--------|
      * | 1 minute | 1 hour | 7 days | 5 minutes |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      *
      * @param request DescribeDcdnDomainRealTimeByteHitRateDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeByteHitRateDataResponse
     */
    public DescribeDcdnDomainRealTimeByteHitRateDataResponse describeDcdnDomainRealTimeByteHitRateDataWithOptions(DescribeDcdnDomainRealTimeByteHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeByteHitRateData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeByteHitRateDataResponse());
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * |----|------|-----|--------|
      * | 1 minute | 1 hour | 7 days | 5 minutes |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      *
      * @param request DescribeDcdnDomainRealTimeByteHitRateDataRequest
      * @return DescribeDcdnDomainRealTimeByteHitRateDataResponse
     */
    public DescribeDcdnDomainRealTimeByteHitRateDataResponse describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnDomainRealTimeDetailDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeDetailDataResponse
     */
    public DescribeDcdnDomainRealTimeDetailDataResponse describeDcdnDomainRealTimeDetailDataWithOptions(DescribeDcdnDomainRealTimeDetailDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeDetailData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeDetailDataResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnDomainRealTimeDetailDataRequest
      * @return DescribeDcdnDomainRealTimeDetailDataResponse
     */
    public DescribeDcdnDomainRealTimeDetailDataResponse describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeHttpCodeDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeHttpCodeDataResponse
     */
    public DescribeDcdnDomainRealTimeHttpCodeDataResponse describeDcdnDomainRealTimeHttpCodeDataWithOptions(DescribeDcdnDomainRealTimeHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeHttpCodeData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeHttpCodeDataResponse());
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeHttpCodeDataRequest
      * @return DescribeDcdnDomainRealTimeHttpCodeDataResponse
     */
    public DescribeDcdnDomainRealTimeHttpCodeDataResponse describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeQpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeQpsDataResponse
     */
    public DescribeDcdnDomainRealTimeQpsDataResponse describeDcdnDomainRealTimeQpsDataWithOptions(DescribeDcdnDomainRealTimeQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeQpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeQpsDataResponse());
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeQpsDataRequest
      * @return DescribeDcdnDomainRealTimeQpsDataResponse
     */
    public DescribeDcdnDomainRealTimeQpsDataResponse describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 10 times per second per account.
      * *   The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay. |Time granularity |Maximum time range per query |Historical data available|Data delay| |---------------|--------| |1 minute|1 hour|7 days|5 minutes| |5 minutes|3 days|93 days|15 minutes| |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeReqHitRateDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeReqHitRateDataResponse
     */
    public DescribeDcdnDomainRealTimeReqHitRateDataResponse describeDcdnDomainRealTimeReqHitRateDataWithOptions(DescribeDcdnDomainRealTimeReqHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeReqHitRateData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeReqHitRateDataResponse());
    }

    /**
      * #
      * *   You can call this operation up to 10 times per second per account.
      * *   The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay. |Time granularity |Maximum time range per query |Historical data available|Data delay| |---------------|--------| |1 minute|1 hour|7 days|5 minutes| |5 minutes|3 days|93 days|15 minutes| |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeReqHitRateDataRequest
      * @return DescribeDcdnDomainRealTimeReqHitRateDataResponse
     */
    public DescribeDcdnDomainRealTimeReqHitRateDataResponse describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay | 
      * |-----|-----|-----|--------| 
      * | 1 minute | 1 hour | 7 days | 5 minutes | 
      * | 5 minutes | 3 days | 93 days | 15 minutes | | 1 hour | 31 days | 186 days | 4 hours |
      *
      * @param request DescribeDcdnDomainRealTimeSrcBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeSrcBpsDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcBpsDataResponse describeDcdnDomainRealTimeSrcBpsDataWithOptions(DescribeDcdnDomainRealTimeSrcBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeSrcBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeSrcBpsDataResponse());
    }

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay | 
      * |-----|-----|-----|--------| 
      * | 1 minute | 1 hour | 7 days | 5 minutes | 
      * | 5 minutes | 3 days | 93 days | 15 minutes | | 1 hour | 31 days | 186 days | 4 hours |
      *
      * @param request DescribeDcdnDomainRealTimeSrcBpsDataRequest
      * @return DescribeDcdnDomainRealTimeSrcBpsDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcBpsDataResponse describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse describeDcdnDomainRealTimeSrcHttpCodeDataWithOptions(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeSrcHttpCodeData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse());
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest
      * @return DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcHttpCodeDataWithOptions(request, runtime);
    }

    /**
      * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeSrcTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeSrcTrafficDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse describeDcdnDomainRealTimeSrcTrafficDataWithOptions(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeSrcTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeSrcTrafficDataResponse());
    }

    /**
      * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeSrcTrafficDataRequest
      * @return DescribeDcdnDomainRealTimeSrcTrafficDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    /**
      * #
      * You can call this operation up to 50 times per second per user.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay. |Time granularity |Maximum time range per query |Historical data available|Data delay| |---------------|--------| |1 minute|1 hour|7 days|5 minutes| |5 minutes|3 days|93 days|15 minutes| |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRealTimeTrafficDataResponse
     */
    public DescribeDcdnDomainRealTimeTrafficDataResponse describeDcdnDomainRealTimeTrafficDataWithOptions(DescribeDcdnDomainRealTimeTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRealTimeTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRealTimeTrafficDataResponse());
    }

    /**
      * #
      * You can call this operation up to 50 times per second per user.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay. |Time granularity |Maximum time range per query |Historical data available|Data delay| |---------------|--------| |1 minute|1 hour|7 days|5 minutes| |5 minutes|3 days|93 days|15 minutes| |1 hour|31 days|186 days|4 hours|
      *
      * @param request DescribeDcdnDomainRealTimeTrafficDataRequest
      * @return DescribeDcdnDomainRealTimeTrafficDataResponse
     */
    public DescribeDcdnDomainRealTimeTrafficDataResponse describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainRegionDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainRegionDataResponse
     */
    public DescribeDcdnDomainRegionDataResponse describeDcdnDomainRegionDataWithOptions(DescribeDcdnDomainRegionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainRegionData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainRegionDataResponse());
    }

    /**
      * > 
      * *   If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnDomainRegionDataRequest
      * @return DescribeDcdnDomainRegionDataResponse
     */
    public DescribeDcdnDomainRegionDataResponse describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRegionDataWithOptions(request, runtime);
    }

    /**
      * The name of the accelerated domain.
      *
      * @param request DescribeDcdnDomainStagingConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainStagingConfigResponse
     */
    public DescribeDcdnDomainStagingConfigResponse describeDcdnDomainStagingConfigWithOptions(DescribeDcdnDomainStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainStagingConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainStagingConfigResponse());
    }

    /**
      * The name of the accelerated domain.
      *
      * @param request DescribeDcdnDomainStagingConfigRequest
      * @return DescribeDcdnDomainStagingConfigResponse
     */
    public DescribeDcdnDomainStagingConfigResponse describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainStagingConfigWithOptions(request, runtime);
    }

    /**
      * **Before you call this operation, take note of the following rules:**
      * *   If you do not set the StartTime parameter, the data on the previous day is queried.
      * *   You can specify only one domain name.
      *
      * @param request DescribeDcdnDomainTopReferVisitRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainTopReferVisitResponse
     */
    public DescribeDcdnDomainTopReferVisitResponse describeDcdnDomainTopReferVisitWithOptions(DescribeDcdnDomainTopReferVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainTopReferVisit"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainTopReferVisitResponse());
    }

    /**
      * **Before you call this operation, take note of the following rules:**
      * *   If you do not set the StartTime parameter, the data on the previous day is queried.
      * *   You can specify only one domain name.
      *
      * @param request DescribeDcdnDomainTopReferVisitRequest
      * @return DescribeDcdnDomainTopReferVisitResponse
     */
    public DescribeDcdnDomainTopReferVisitResponse describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainTopReferVisitWithOptions(request, runtime);
    }

    /**
      * > You can query data in the last seven days.
      *
      * @param request DescribeDcdnDomainTopUrlVisitRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainTopUrlVisitResponse
     */
    public DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisitWithOptions(DescribeDcdnDomainTopUrlVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainTopUrlVisit"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainTopUrlVisitResponse());
    }

    /**
      * > You can query data in the last seven days.
      *
      * @param request DescribeDcdnDomainTopUrlVisitRequest
      * @return DescribeDcdnDomainTopUrlVisitResponse
     */
    public DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainTopUrlVisitWithOptions(request, runtime);
    }

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainTrafficDataResponse
     */
    public DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficDataWithOptions(DescribeDcdnDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainTrafficDataResponse());
    }

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainTrafficDataRequest
      * @return DescribeDcdnDomainTrafficDataResponse
     */
    public DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainTrafficDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
      * **Time granularity**:
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainUsageDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainUsageDataResponse
     */
    public DescribeDcdnDomainUsageDataResponse describeDcdnDomainUsageDataWithOptions(DescribeDcdnDomainUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProtocol)) {
            query.put("DataProtocol", request.dataProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            query.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainUsageData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainUsageDataResponse());
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
      * **Time granularity**:
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainUsageDataRequest
      * @return DescribeDcdnDomainUsageDataResponse
     */
    public DescribeDcdnDomainUsageDataResponse describeDcdnDomainUsageData(DescribeDcdnDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainUsageDataWithOptions(request, runtime);
    }

    /**
      * ****
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.
      *
      * @param request DescribeDcdnDomainUvDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainUvDataResponse
     */
    public DescribeDcdnDomainUvDataResponse describeDcdnDomainUvDataWithOptions(DescribeDcdnDomainUvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainUvData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainUvDataResponse());
    }

    /**
      * ****
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.
      *
      * @param request DescribeDcdnDomainUvDataRequest
      * @return DescribeDcdnDomainUvDataResponse
     */
    public DescribeDcdnDomainUvDataResponse describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainUvDataWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 100 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainWebsocketBpsDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainWebsocketBpsDataResponse
     */
    public DescribeDcdnDomainWebsocketBpsDataResponse describeDcdnDomainWebsocketBpsDataWithOptions(DescribeDcdnDomainWebsocketBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainWebsocketBpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainWebsocketBpsDataResponse());
    }

    /**
      * #
      * *   You can call this operation up to 100 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainWebsocketBpsDataRequest
      * @return DescribeDcdnDomainWebsocketBpsDataResponse
     */
    public DescribeDcdnDomainWebsocketBpsDataResponse describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainWebsocketBpsDataWithOptions(request, runtime);
    }

    /**
      * #
      * You can call this operation up to 100 times per second per account.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainWebsocketHttpCodeDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainWebsocketHttpCodeDataResponse
     */
    public DescribeDcdnDomainWebsocketHttpCodeDataResponse describeDcdnDomainWebsocketHttpCodeDataWithOptions(DescribeDcdnDomainWebsocketHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainWebsocketHttpCodeData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainWebsocketHttpCodeDataResponse());
    }

    /**
      * #
      * You can call this operation up to 100 times per second per account.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
      * @param request DescribeDcdnDomainWebsocketHttpCodeDataRequest
      * @return DescribeDcdnDomainWebsocketHttpCodeDataResponse
     */
    public DescribeDcdnDomainWebsocketHttpCodeDataResponse describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainWebsocketHttpCodeDataWithOptions(request, runtime);
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainWebsocketTrafficDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnDomainWebsocketTrafficDataResponse
     */
    public DescribeDcdnDomainWebsocketTrafficDataResponse describeDcdnDomainWebsocketTrafficDataWithOptions(DescribeDcdnDomainWebsocketTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainWebsocketTrafficData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainWebsocketTrafficDataResponse());
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
      * @param request DescribeDcdnDomainWebsocketTrafficDataRequest
      * @return DescribeDcdnDomainWebsocketTrafficDataResponse
     */
    public DescribeDcdnDomainWebsocketTrafficDataResponse describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainWebsocketTrafficDataWithOptions(request, runtime);
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.
      *
      * @param request DescribeDcdnErUsageDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnErUsageDataResponse
     */
    public DescribeDcdnErUsageDataResponse describeDcdnErUsageDataWithOptions(DescribeDcdnErUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routineID)) {
            query.put("RoutineID", request.routineID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitBy)) {
            query.put("SplitBy", request.splitBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnErUsageData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnErUsageDataResponse());
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.
      *
      * @param request DescribeDcdnErUsageDataRequest
      * @return DescribeDcdnErUsageDataResponse
     */
    public DescribeDcdnErUsageDataResponse describeDcdnErUsageData(DescribeDcdnErUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnErUsageDataWithOptions(request, runtime);
    }

    /**
      * *   If you specify IP addresses or CIDR blocks, IP addresses that are effective and corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.
      * *   The results are written to OSS and returned as OSS URLs. The OSS objects are in the format of `IP address-Corresponding expiration time`. The expiration time is in the yyyy-MM-dd HH:mm:ss format.
      * *   You can share URLs of OSS objects with others. The shared URLs are valid for three days.
      *
      * @param request DescribeDcdnFullDomainsBlockIPConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnFullDomainsBlockIPConfigResponse
     */
    public DescribeDcdnFullDomainsBlockIPConfigResponse describeDcdnFullDomainsBlockIPConfigWithOptions(DescribeDcdnFullDomainsBlockIPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnFullDomainsBlockIPConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnFullDomainsBlockIPConfigResponse());
    }

    /**
      * *   If you specify IP addresses or CIDR blocks, IP addresses that are effective and corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.
      * *   The results are written to OSS and returned as OSS URLs. The OSS objects are in the format of `IP address-Corresponding expiration time`. The expiration time is in the yyyy-MM-dd HH:mm:ss format.
      * *   You can share URLs of OSS objects with others. The shared URLs are valid for three days.
      *
      * @param request DescribeDcdnFullDomainsBlockIPConfigRequest
      * @return DescribeDcdnFullDomainsBlockIPConfigResponse
     */
    public DescribeDcdnFullDomainsBlockIPConfigResponse describeDcdnFullDomainsBlockIPConfig(DescribeDcdnFullDomainsBlockIPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnFullDomainsBlockIPConfigWithOptions(request, runtime);
    }

    /**
      * *   For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.
      * *   If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.
      * *   The maximum time range to query is 90 days.
      * *   If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.
      *
      * @param request DescribeDcdnFullDomainsBlockIPHistoryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnFullDomainsBlockIPHistoryResponse
     */
    public DescribeDcdnFullDomainsBlockIPHistoryResponse describeDcdnFullDomainsBlockIPHistoryWithOptions(DescribeDcdnFullDomainsBlockIPHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPList)) {
            body.put("IPList", request.IPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnFullDomainsBlockIPHistory"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnFullDomainsBlockIPHistoryResponse());
    }

    /**
      * *   For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.
      * *   If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.
      * *   The maximum time range to query is 90 days.
      * *   If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.
      *
      * @param request DescribeDcdnFullDomainsBlockIPHistoryRequest
      * @return DescribeDcdnFullDomainsBlockIPHistoryResponse
     */
    public DescribeDcdnFullDomainsBlockIPHistoryResponse describeDcdnFullDomainsBlockIPHistory(DescribeDcdnFullDomainsBlockIPHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnFullDomainsBlockIPHistoryWithOptions(request, runtime);
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 100.
      *
      * @param request DescribeDcdnHttpsDomainListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnHttpsDomainListResponse
     */
    public DescribeDcdnHttpsDomainListResponse describeDcdnHttpsDomainListWithOptions(DescribeDcdnHttpsDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnHttpsDomainList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnHttpsDomainListResponse());
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 100.
      *
      * @param request DescribeDcdnHttpsDomainListRequest
      * @return DescribeDcdnHttpsDomainListResponse
     */
    public DescribeDcdnHttpsDomainListResponse describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnHttpsDomainListWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnIpInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnIpInfoResponse
     */
    public DescribeDcdnIpInfoResponse describeDcdnIpInfoWithOptions(DescribeDcdnIpInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnIpInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnIpInfoResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnIpInfoRequest
      * @return DescribeDcdnIpInfoResponse
     */
    public DescribeDcdnIpInfoResponse describeDcdnIpInfo(DescribeDcdnIpInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpInfoWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnIpaDomainConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnIpaDomainConfigsResponse
     */
    public DescribeDcdnIpaDomainConfigsResponse describeDcdnIpaDomainConfigsWithOptions(DescribeDcdnIpaDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnIpaDomainConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnIpaDomainConfigsResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnIpaDomainConfigsRequest
      * @return DescribeDcdnIpaDomainConfigsResponse
     */
    public DescribeDcdnIpaDomainConfigsResponse describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaDomainConfigsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnIpaDomainDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnIpaDomainDetailResponse
     */
    public DescribeDcdnIpaDomainDetailResponse describeDcdnIpaDomainDetailWithOptions(DescribeDcdnIpaDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnIpaDomainDetail"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnIpaDomainDetailResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnIpaDomainDetailRequest
      * @return DescribeDcdnIpaDomainDetailResponse
     */
    public DescribeDcdnIpaDomainDetailResponse describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaDomainDetailWithOptions(request, runtime);
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
      * @param request DescribeDcdnIpaServiceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnIpaServiceResponse
     */
    public DescribeDcdnIpaServiceResponse describeDcdnIpaServiceWithOptions(DescribeDcdnIpaServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnIpaService"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnIpaServiceResponse());
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
      * @param request DescribeDcdnIpaServiceRequest
      * @return DescribeDcdnIpaServiceResponse
     */
    public DescribeDcdnIpaServiceResponse describeDcdnIpaService(DescribeDcdnIpaServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaServiceWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnIpaUserDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnIpaUserDomainsResponse
     */
    public DescribeDcdnIpaUserDomainsResponse describeDcdnIpaUserDomainsWithOptions(DescribeDcdnIpaUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkDomainShow)) {
            query.put("CheckDomainShow", request.checkDomainShow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainSearchType)) {
            query.put("DomainSearchType", request.domainSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainStatus)) {
            query.put("DomainStatus", request.domainStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.funcFilter)) {
            query.put("FuncFilter", request.funcFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.funcId)) {
            query.put("FuncId", request.funcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnIpaUserDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnIpaUserDomainsResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnIpaUserDomainsRequest
      * @return DescribeDcdnIpaUserDomainsResponse
     */
    public DescribeDcdnIpaUserDomainsResponse describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaUserDomainsWithOptions(request, runtime);
    }

    public DescribeDcdnKvAccountResponse describeDcdnKvAccountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnKvAccount"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnKvAccountResponse());
    }

    public DescribeDcdnKvAccountResponse describeDcdnKvAccount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnKvAccountWithOptions(runtime);
    }

    public DescribeDcdnKvAccountStatusResponse describeDcdnKvAccountStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnKvAccountStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnKvAccountStatusResponse());
    }

    public DescribeDcdnKvAccountStatusResponse describeDcdnKvAccountStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnKvAccountStatusWithOptions(runtime);
    }

    public DescribeDcdnKvNamespaceResponse describeDcdnKvNamespaceWithOptions(DescribeDcdnKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnKvNamespace"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnKvNamespaceResponse());
    }

    public DescribeDcdnKvNamespaceResponse describeDcdnKvNamespace(DescribeDcdnKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnKvNamespaceWithOptions(request, runtime);
    }

    public DescribeDcdnL2IpsResponse describeDcdnL2IpsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnL2Ips"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnL2IpsResponse());
    }

    public DescribeDcdnL2IpsResponse describeDcdnL2Ips() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnL2IpsWithOptions(runtime);
    }

    public DescribeDcdnL2VipsResponse describeDcdnL2VipsWithOptions(DescribeDcdnL2VipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnL2Vips"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnL2VipsResponse());
    }

    public DescribeDcdnL2VipsResponse describeDcdnL2Vips(DescribeDcdnL2VipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnL2VipsWithOptions(request, runtime);
    }

    /**
      * >  You can call this API operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnRealTimeDeliveryFieldRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnRealTimeDeliveryFieldResponse
     */
    public DescribeDcdnRealTimeDeliveryFieldResponse describeDcdnRealTimeDeliveryFieldWithOptions(DescribeDcdnRealTimeDeliveryFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnRealTimeDeliveryField"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnRealTimeDeliveryFieldResponse());
    }

    /**
      * >  You can call this API operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnRealTimeDeliveryFieldRequest
      * @return DescribeDcdnRealTimeDeliveryFieldResponse
     */
    public DescribeDcdnRealTimeDeliveryFieldResponse describeDcdnRealTimeDeliveryField(DescribeDcdnRealTimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRealTimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
      * > * You can call the **RefreshDcdnObjectCaches** operation to refresh content and call the **PreloadDcdnObjectCaches** operation to prefetch content.
      * > *   You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnRefreshQuotaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnRefreshQuotaResponse
     */
    public DescribeDcdnRefreshQuotaResponse describeDcdnRefreshQuotaWithOptions(DescribeDcdnRefreshQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnRefreshQuota"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnRefreshQuotaResponse());
    }

    /**
      * > * You can call the **RefreshDcdnObjectCaches** operation to refresh content and call the **PreloadDcdnObjectCaches** operation to prefetch content.
      * > *   You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnRefreshQuotaRequest
      * @return DescribeDcdnRefreshQuotaResponse
     */
    public DescribeDcdnRefreshQuotaResponse describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRefreshQuotaWithOptions(request, runtime);
    }

    /**
      * > 
      * *   You can query data within the last three days.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnRefreshTaskByIdRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnRefreshTaskByIdResponse
     */
    public DescribeDcdnRefreshTaskByIdResponse describeDcdnRefreshTaskByIdWithOptions(DescribeDcdnRefreshTaskByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnRefreshTaskById"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnRefreshTaskByIdResponse());
    }

    /**
      * > 
      * *   You can query data within the last three days.
      * *   You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnRefreshTaskByIdRequest
      * @return DescribeDcdnRefreshTaskByIdResponse
     */
    public DescribeDcdnRefreshTaskByIdResponse describeDcdnRefreshTaskById(DescribeDcdnRefreshTaskByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRefreshTaskByIdWithOptions(request, runtime);
    }

    /**
      * > 
      * *   You can query the refresh or prefetch tasks by ID or URL.
      * *   You can set both **TaskId** and **ObjectPath** in a request. If you do not set **TaskId** or **ObjectPath**, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.
      * *   If you specify **DomainName** or **Status**, you must also specify **ObjectType**.
      * *   You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnRefreshTasksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnRefreshTasksResponse
     */
    public DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasksWithOptions(DescribeDcdnRefreshTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnRefreshTasks"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnRefreshTasksResponse());
    }

    /**
      * > 
      * *   You can query the refresh or prefetch tasks by ID or URL.
      * *   You can set both **TaskId** and **ObjectPath** in a request. If you do not set **TaskId** or **ObjectPath**, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.
      * *   If you specify **DomainName** or **Status**, you must also specify **ObjectType**.
      * *   You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnRefreshTasksRequest
      * @return DescribeDcdnRefreshTasksResponse
     */
    public DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRefreshTasksWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnRegionAndIspRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnRegionAndIspResponse
     */
    public DescribeDcdnRegionAndIspResponse describeDcdnRegionAndIspWithOptions(DescribeDcdnRegionAndIspRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnRegionAndIsp"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnRegionAndIspResponse());
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnRegionAndIspRequest
      * @return DescribeDcdnRegionAndIspResponse
     */
    public DescribeDcdnRegionAndIspResponse describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRegionAndIspWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnReportResponse
     */
    public DescribeDcdnReportResponse describeDcdnReportWithOptions(DescribeDcdnReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpCode)) {
            query.put("HttpCode", request.httpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOverseas)) {
            query.put("IsOverseas", request.isOverseas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnReport"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnReportResponse());
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnReportRequest
      * @return DescribeDcdnReportResponse
     */
    public DescribeDcdnReportResponse describeDcdnReport(DescribeDcdnReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnReportWithOptions(request, runtime);
    }

    /**
      * > * This operation queries the metadata of all operations reports. The statistics in the reports are not returned.
      * > * You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnReportListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnReportListResponse
     */
    public DescribeDcdnReportListResponse describeDcdnReportListWithOptions(DescribeDcdnReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnReportList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnReportListResponse());
    }

    /**
      * > * This operation queries the metadata of all operations reports. The statistics in the reports are not returned.
      * > * You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnReportListRequest
      * @return DescribeDcdnReportListResponse
     */
    public DescribeDcdnReportListResponse describeDcdnReportList(DescribeDcdnReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnReportListWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnSLSRealtimeLogDeliveryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnSLSRealtimeLogDeliveryResponse
     */
    public DescribeDcdnSLSRealtimeLogDeliveryResponse describeDcdnSLSRealtimeLogDeliveryWithOptions(DescribeDcdnSLSRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSLSRealtimeLogDelivery"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSLSRealtimeLogDeliveryResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnSLSRealtimeLogDeliveryRequest
      * @return DescribeDcdnSLSRealtimeLogDeliveryResponse
     */
    public DescribeDcdnSLSRealtimeLogDeliveryResponse describeDcdnSLSRealtimeLogDelivery(DescribeDcdnSLSRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSLSRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnSMCertificateDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnSMCertificateDetailResponse
     */
    public DescribeDcdnSMCertificateDetailResponse describeDcdnSMCertificateDetailWithOptions(DescribeDcdnSMCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSMCertificateDetail"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSMCertificateDetailResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnSMCertificateDetailRequest
      * @return DescribeDcdnSMCertificateDetailResponse
     */
    public DescribeDcdnSMCertificateDetailResponse describeDcdnSMCertificateDetail(DescribeDcdnSMCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSMCertificateDetailWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnSMCertificateListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnSMCertificateListResponse
     */
    public DescribeDcdnSMCertificateListResponse describeDcdnSMCertificateListWithOptions(DescribeDcdnSMCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSMCertificateList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSMCertificateListResponse());
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnSMCertificateListRequest
      * @return DescribeDcdnSMCertificateListResponse
     */
    public DescribeDcdnSMCertificateListResponse describeDcdnSMCertificateList(DescribeDcdnSMCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSMCertificateListWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnSecFuncInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnSecFuncInfoResponse
     */
    public DescribeDcdnSecFuncInfoResponse describeDcdnSecFuncInfoWithOptions(DescribeDcdnSecFuncInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secFuncType)) {
            query.put("SecFuncType", request.secFuncType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSecFuncInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSecFuncInfoResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnSecFuncInfoRequest
      * @return DescribeDcdnSecFuncInfoResponse
     */
    public DescribeDcdnSecFuncInfoResponse describeDcdnSecFuncInfo(DescribeDcdnSecFuncInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSecFuncInfoWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnSecSpecInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnSecSpecInfoResponse
     */
    public DescribeDcdnSecSpecInfoResponse describeDcdnSecSpecInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSecSpecInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSecSpecInfoResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @return DescribeDcdnSecSpecInfoResponse
     */
    public DescribeDcdnSecSpecInfoResponse describeDcdnSecSpecInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSecSpecInfoWithOptions(runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnServiceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnServiceResponse
     */
    public DescribeDcdnServiceResponse describeDcdnServiceWithOptions(DescribeDcdnServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnService"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnServiceResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnServiceRequest
      * @return DescribeDcdnServiceResponse
     */
    public DescribeDcdnServiceResponse describeDcdnService(DescribeDcdnServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnServiceWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnStagingIpRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnStagingIpResponse
     */
    public DescribeDcdnStagingIpResponse describeDcdnStagingIpWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnStagingIp"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnStagingIpResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @return DescribeDcdnStagingIpResponse
     */
    public DescribeDcdnStagingIpResponse describeDcdnStagingIp() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnStagingIpWithOptions(runtime);
    }

    /**
      * > 
      * *   By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.
      * *   You can call this operation up to three times per second per account.
      *
      * @param request DescribeDcdnSubListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnSubListResponse
     */
    public DescribeDcdnSubListResponse describeDcdnSubListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSubList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSubListResponse());
    }

    /**
      * > 
      * *   By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.
      * *   You can call this operation up to three times per second per account.
      *
      * @return DescribeDcdnSubListResponse
     */
    public DescribeDcdnSubListResponse describeDcdnSubList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSubListWithOptions(runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnTagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnTagResourcesResponse
     */
    public DescribeDcdnTagResourcesResponse describeDcdnTagResourcesWithOptions(DescribeDcdnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DescribeDcdnTagResources"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnTagResourcesResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request DescribeDcdnTagResourcesRequest
      * @return DescribeDcdnTagResourcesResponse
     */
    public DescribeDcdnTagResourcesResponse describeDcdnTagResources(DescribeDcdnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnTagResourcesWithOptions(request, runtime);
    }

    /**
      * \\*\\*Before you call this operation, pay attention to the following considerations:\\*\\* If you do not specify the StartTime and EndTime parameters, the data within the current month is queried by default. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      *
      * @param request DescribeDcdnTopDomainsByFlowRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnTopDomainsByFlowResponse
     */
    public DescribeDcdnTopDomainsByFlowResponse describeDcdnTopDomainsByFlowWithOptions(DescribeDcdnTopDomainsByFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnTopDomainsByFlow"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnTopDomainsByFlowResponse());
    }

    /**
      * \\*\\*Before you call this operation, pay attention to the following considerations:\\*\\* If you do not specify the StartTime and EndTime parameters, the data within the current month is queried by default. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      *
      * @param request DescribeDcdnTopDomainsByFlowRequest
      * @return DescribeDcdnTopDomainsByFlowResponse
     */
    public DescribeDcdnTopDomainsByFlowResponse describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnTopDomainsByFlowWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserBillHistoryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserBillHistoryResponse
     */
    public DescribeDcdnUserBillHistoryResponse describeDcdnUserBillHistoryWithOptions(DescribeDcdnUserBillHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserBillHistory"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserBillHistoryResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserBillHistoryRequest
      * @return DescribeDcdnUserBillHistoryResponse
     */
    public DescribeDcdnUserBillHistoryResponse describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserBillHistoryWithOptions(request, runtime);
    }

    public DescribeDcdnUserBillTypeResponse describeDcdnUserBillTypeWithOptions(DescribeDcdnUserBillTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserBillType"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserBillTypeResponse());
    }

    public DescribeDcdnUserBillTypeResponse describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserBillTypeWithOptions(request, runtime);
    }

    /**
      * # Usage notes
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserCertificateExpireCountRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserCertificateExpireCountResponse
     */
    public DescribeDcdnUserCertificateExpireCountResponse describeDcdnUserCertificateExpireCountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserCertificateExpireCount"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserCertificateExpireCountResponse());
    }

    /**
      * # Usage notes
      * > You can call this operation up to 100 times per second per account.
      *
      * @return DescribeDcdnUserCertificateExpireCountResponse
     */
    public DescribeDcdnUserCertificateExpireCountResponse describeDcdnUserCertificateExpireCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserCertificateExpireCountWithOptions(runtime);
    }

    /**
      * You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnUserConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserConfigsResponse
     */
    public DescribeDcdnUserConfigsResponse describeDcdnUserConfigsWithOptions(DescribeDcdnUserConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserConfigs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserConfigsResponse());
    }

    /**
      * You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeDcdnUserConfigsRequest
      * @return DescribeDcdnUserConfigsResponse
     */
    public DescribeDcdnUserConfigsResponse describeDcdnUserConfigs(DescribeDcdnUserConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserConfigsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 80 times per second per account.
      *
      * @param request DescribeDcdnUserDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserDomainsResponse
     */
    public DescribeDcdnUserDomainsResponse describeDcdnUserDomainsWithOptions(DescribeDcdnUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            query.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeStartTime)) {
            query.put("ChangeStartTime", request.changeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkDomainShow)) {
            query.put("CheckDomainShow", request.checkDomainShow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainSearchType)) {
            query.put("DomainSearchType", request.domainSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainStatus)) {
            query.put("DomainStatus", request.domainStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("action", "DescribeDcdnUserDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserDomainsResponse());
    }

    /**
      * > You can call this operation up to 80 times per second per account.
      *
      * @param request DescribeDcdnUserDomainsRequest
      * @return DescribeDcdnUserDomainsResponse
     */
    public DescribeDcdnUserDomainsResponse describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserDomainsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserDomainsByFuncRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserDomainsByFuncResponse
     */
    public DescribeDcdnUserDomainsByFuncResponse describeDcdnUserDomainsByFuncWithOptions(DescribeDcdnUserDomainsByFuncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.funcFilter)) {
            query.put("FuncFilter", request.funcFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.funcId)) {
            query.put("FuncId", request.funcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserDomainsByFunc"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserDomainsByFuncResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserDomainsByFuncRequest
      * @return DescribeDcdnUserDomainsByFuncResponse
     */
    public DescribeDcdnUserDomainsByFuncResponse describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserDomainsByFuncWithOptions(request, runtime);
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request DescribeDcdnUserQuotaRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserQuotaResponse
     */
    public DescribeDcdnUserQuotaResponse describeDcdnUserQuotaWithOptions(DescribeDcdnUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserQuota"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserQuotaResponse());
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request DescribeDcdnUserQuotaRequest
      * @return DescribeDcdnUserQuotaResponse
     */
    public DescribeDcdnUserQuotaResponse describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserQuotaWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserRealTimeDeliveryFieldRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserRealTimeDeliveryFieldResponse
     */
    public DescribeDcdnUserRealTimeDeliveryFieldResponse describeDcdnUserRealTimeDeliveryFieldWithOptions(DescribeDcdnUserRealTimeDeliveryFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserRealTimeDeliveryField"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserRealTimeDeliveryFieldResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserRealTimeDeliveryFieldRequest
      * @return DescribeDcdnUserRealTimeDeliveryFieldResponse
     */
    public DescribeDcdnUserRealTimeDeliveryFieldResponse describeDcdnUserRealTimeDeliveryField(DescribeDcdnUserRealTimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserRealTimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request DescribeDcdnUserResourcePackageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserResourcePackageResponse
     */
    public DescribeDcdnUserResourcePackageResponse describeDcdnUserResourcePackageWithOptions(DescribeDcdnUserResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserResourcePackage"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserResourcePackageResponse());
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request DescribeDcdnUserResourcePackageRequest
      * @return DescribeDcdnUserResourcePackageResponse
     */
    public DescribeDcdnUserResourcePackageResponse describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserResourcePackageWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnUserSecDropRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserSecDropResponse
     */
    public DescribeDcdnUserSecDropResponse describeDcdnUserSecDropWithOptions(DescribeDcdnUserSecDropRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secFunc)) {
            query.put("SecFunc", request.secFunc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserSecDrop"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserSecDropResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnUserSecDropRequest
      * @return DescribeDcdnUserSecDropResponse
     */
    public DescribeDcdnUserSecDropResponse describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserSecDropWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnUserSecDropByMinuteRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserSecDropByMinuteResponse
     */
    public DescribeDcdnUserSecDropByMinuteResponse describeDcdnUserSecDropByMinuteWithOptions(DescribeDcdnUserSecDropByMinuteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.object)) {
            query.put("Object", request.object);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secFunc)) {
            query.put("SecFunc", request.secFunc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserSecDropByMinute"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserSecDropByMinuteResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnUserSecDropByMinuteRequest
      * @return DescribeDcdnUserSecDropByMinuteResponse
     */
    public DescribeDcdnUserSecDropByMinuteResponse describeDcdnUserSecDropByMinute(DescribeDcdnUserSecDropByMinuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserSecDropByMinuteWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnUserTagsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnUserTagsResponse
     */
    public DescribeDcdnUserTagsResponse describeDcdnUserTagsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserTags"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserTagsResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @return DescribeDcdnUserTagsResponse
     */
    public DescribeDcdnUserTagsResponse describeDcdnUserTags() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserTagsWithOptions(runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnVerifyContentRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnVerifyContentResponse
     */
    public DescribeDcdnVerifyContentResponse describeDcdnVerifyContentWithOptions(DescribeDcdnVerifyContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnVerifyContent"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnVerifyContentResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnVerifyContentRequest
      * @return DescribeDcdnVerifyContentResponse
     */
    public DescribeDcdnVerifyContentResponse describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnVerifyContentWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnWafDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafDomainResponse
     */
    public DescribeDcdnWafDomainResponse describeDcdnWafDomainWithOptions(DescribeDcdnWafDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafDomainResponse());
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
      * @param request DescribeDcdnWafDomainRequest
      * @return DescribeDcdnWafDomainResponse
     */
    public DescribeDcdnWafDomainResponse describeDcdnWafDomain(DescribeDcdnWafDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDomainWithOptions(request, runtime);
    }

    /**
      * # Usage notes
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafDomainDetailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafDomainDetailResponse
     */
    public DescribeDcdnWafDomainDetailResponse describeDcdnWafDomainDetailWithOptions(DescribeDcdnWafDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafDomainDetail"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafDomainDetailResponse());
    }

    /**
      * # Usage notes
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafDomainDetailRequest
      * @return DescribeDcdnWafDomainDetailResponse
     */
    public DescribeDcdnWafDomainDetailResponse describeDcdnWafDomainDetail(DescribeDcdnWafDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDomainDetailWithOptions(request, runtime);
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafDomainsResponse
     */
    public DescribeDcdnWafDomainsResponse describeDcdnWafDomainsWithOptions(DescribeDcdnWafDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgs)) {
            query.put("QueryArgs", request.queryArgs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafDomainsResponse());
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafDomainsRequest
      * @return DescribeDcdnWafDomainsResponse
     */
    public DescribeDcdnWafDomainsResponse describeDcdnWafDomains(DescribeDcdnWafDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDomainsWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafFilterInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafFilterInfoResponse
     */
    public DescribeDcdnWafFilterInfoResponse describeDcdnWafFilterInfoWithOptions(DescribeDcdnWafFilterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScenes)) {
            query.put("DefenseScenes", request.defenseScenes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafFilterInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafFilterInfoResponse());
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafFilterInfoRequest
      * @return DescribeDcdnWafFilterInfoResponse
     */
    public DescribeDcdnWafFilterInfoResponse describeDcdnWafFilterInfo(DescribeDcdnWafFilterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafFilterInfoWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafGeoInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafGeoInfoResponse
     */
    public DescribeDcdnWafGeoInfoResponse describeDcdnWafGeoInfoWithOptions(DescribeDcdnWafGeoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafGeoInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafGeoInfoResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafGeoInfoRequest
      * @return DescribeDcdnWafGeoInfoResponse
     */
    public DescribeDcdnWafGeoInfoResponse describeDcdnWafGeoInfo(DescribeDcdnWafGeoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafGeoInfoWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   The log data is collected every hour.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnWafLogsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafLogsResponse
     */
    public DescribeDcdnWafLogsResponse describeDcdnWafLogsWithOptions(DescribeDcdnWafLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafLogs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafLogsResponse());
    }

    /**
      * > 
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   The log data is collected every hour.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeDcdnWafLogsRequest
      * @return DescribeDcdnWafLogsResponse
     */
    public DescribeDcdnWafLogsResponse describeDcdnWafLogs(DescribeDcdnWafLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafLogsWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafPoliciesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafPoliciesResponse
     */
    public DescribeDcdnWafPoliciesResponse describeDcdnWafPoliciesWithOptions(DescribeDcdnWafPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgs)) {
            query.put("QueryArgs", request.queryArgs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafPolicies"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafPoliciesResponse());
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafPoliciesRequest
      * @return DescribeDcdnWafPoliciesResponse
     */
    public DescribeDcdnWafPoliciesResponse describeDcdnWafPolicies(DescribeDcdnWafPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPoliciesWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafPolicyResponse
     */
    public DescribeDcdnWafPolicyResponse describeDcdnWafPolicyWithOptions(DescribeDcdnWafPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafPolicy"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafPolicyResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafPolicyRequest
      * @return DescribeDcdnWafPolicyResponse
     */
    public DescribeDcdnWafPolicyResponse describeDcdnWafPolicy(DescribeDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per user.
      *
      * @param request DescribeDcdnWafPolicyDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafPolicyDomainsResponse
     */
    public DescribeDcdnWafPolicyDomainsResponse describeDcdnWafPolicyDomainsWithOptions(DescribeDcdnWafPolicyDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafPolicyDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafPolicyDomainsResponse());
    }

    /**
      * You can call this operation up to 20 times per second per user.
      *
      * @param request DescribeDcdnWafPolicyDomainsRequest
      * @return DescribeDcdnWafPolicyDomainsResponse
     */
    public DescribeDcdnWafPolicyDomainsResponse describeDcdnWafPolicyDomains(DescribeDcdnWafPolicyDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPolicyDomainsWithOptions(request, runtime);
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafPolicyValidDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafPolicyValidDomainsResponse
     */
    public DescribeDcdnWafPolicyValidDomainsResponse describeDcdnWafPolicyValidDomainsWithOptions(DescribeDcdnWafPolicyValidDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameLike)) {
            query.put("DomainNameLike", request.domainNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafPolicyValidDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafPolicyValidDomainsResponse());
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafPolicyValidDomainsRequest
      * @return DescribeDcdnWafPolicyValidDomainsResponse
     */
    public DescribeDcdnWafPolicyValidDomainsResponse describeDcdnWafPolicyValidDomains(DescribeDcdnWafPolicyValidDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPolicyValidDomainsWithOptions(request, runtime);
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafRuleResponse
     */
    public DescribeDcdnWafRuleResponse describeDcdnWafRuleWithOptions(DescribeDcdnWafRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafRule"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafRuleResponse());
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafRuleRequest
      * @return DescribeDcdnWafRuleResponse
     */
    public DescribeDcdnWafRuleResponse describeDcdnWafRule(DescribeDcdnWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafRuleWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafRulesResponse
     */
    public DescribeDcdnWafRulesResponse describeDcdnWafRulesWithOptions(DescribeDcdnWafRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgs)) {
            query.put("QueryArgs", request.queryArgs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafRules"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafRulesResponse());
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafRulesRequest
      * @return DescribeDcdnWafRulesResponse
     */
    public DescribeDcdnWafRulesResponse describeDcdnWafRules(DescribeDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafRulesWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per user.
      *
      * @param request DescribeDcdnWafScenesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafScenesResponse
     */
    public DescribeDcdnWafScenesResponse describeDcdnWafScenesWithOptions(DescribeDcdnWafScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScenes)) {
            query.put("DefenseScenes", request.defenseScenes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafScenes"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafScenesResponse());
    }

    /**
      * You can call this operation up to 20 times per second per user.
      *
      * @param request DescribeDcdnWafScenesRequest
      * @return DescribeDcdnWafScenesResponse
     */
    public DescribeDcdnWafScenesResponse describeDcdnWafScenes(DescribeDcdnWafScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafScenesWithOptions(request, runtime);
    }

    /**
      * # Usage notes
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafServiceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafServiceResponse
     */
    public DescribeDcdnWafServiceResponse describeDcdnWafServiceWithOptions(DescribeDcdnWafServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafService"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafServiceResponse());
    }

    /**
      * # Usage notes
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafServiceRequest
      * @return DescribeDcdnWafServiceResponse
     */
    public DescribeDcdnWafServiceResponse describeDcdnWafService(DescribeDcdnWafServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafServiceWithOptions(request, runtime);
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnWafSpecInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafSpecInfoResponse
     */
    public DescribeDcdnWafSpecInfoResponse describeDcdnWafSpecInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafSpecInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafSpecInfoResponse());
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
      * @return DescribeDcdnWafSpecInfoResponse
     */
    public DescribeDcdnWafSpecInfoResponse describeDcdnWafSpecInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafSpecInfoWithOptions(runtime);
    }

    /**
      * >*   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.
      *
      * @param request DescribeDcdnWafUsageDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnWafUsageDataResponse
     */
    public DescribeDcdnWafUsageDataResponse describeDcdnWafUsageDataWithOptions(DescribeDcdnWafUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitBy)) {
            query.put("SplitBy", request.splitBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafUsageData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafUsageDataResponse());
    }

    /**
      * >*   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.
      *
      * @param request DescribeDcdnWafUsageDataRequest
      * @return DescribeDcdnWafUsageDataResponse
     */
    public DescribeDcdnWafUsageDataResponse describeDcdnWafUsageData(DescribeDcdnWafUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafUsageDataWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnsecServiceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDcdnsecServiceResponse
     */
    public DescribeDcdnsecServiceResponse describeDcdnsecServiceWithOptions(DescribeDcdnsecServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnsecService"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnsecServiceResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeDcdnsecServiceRequest
      * @return DescribeDcdnsecServiceResponse
     */
    public DescribeDcdnsecServiceResponse describeDcdnsecService(DescribeDcdnsecServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnsecServiceWithOptions(request, runtime);
    }

    public DescribeRDDomainConfigResponse describeRDDomainConfigWithOptions(DescribeRDDomainConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRDDomainConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRDDomainConfigResponse());
    }

    public DescribeRDDomainConfigResponse describeRDDomainConfig(DescribeRDDomainConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDDomainConfigWithOptions(request, runtime);
    }

    /**
      * A domain name can be in one of the following states:
      * *   online
      * *   offline
      * *   configuring
      * *   configure_failed
      * *   checking
      * *   check_failed
      *
      * @param request DescribeRDDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRDDomainsResponse
     */
    public DescribeRDDomainsResponse describeRDDomainsWithOptions(DescribeRDDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRDDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRDDomainsResponse());
    }

    /**
      * A domain name can be in one of the following states:
      * *   online
      * *   offline
      * *   configuring
      * *   configure_failed
      * *   checking
      * *   check_failed
      *
      * @param request DescribeRDDomainsRequest
      * @return DescribeRDDomainsResponse
     */
    public DescribeRDDomainsResponse describeRDDomains(DescribeRDDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDDomainsWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRoutineResponse
     */
    public DescribeRoutineResponse describeRoutineWithOptions(DescribeRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoutine"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoutineResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineRequest
      * @return DescribeRoutineResponse
     */
    public DescribeRoutineResponse describeRoutine(DescribeRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineCanaryEnvsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRoutineCanaryEnvsResponse
     */
    public DescribeRoutineCanaryEnvsResponse describeRoutineCanaryEnvsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoutineCanaryEnvs"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoutineCanaryEnvsResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @return DescribeRoutineCanaryEnvsResponse
     */
    public DescribeRoutineCanaryEnvsResponse describeRoutineCanaryEnvs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineCanaryEnvsWithOptions(runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineCodeRevisionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRoutineCodeRevisionResponse
     */
    public DescribeRoutineCodeRevisionResponse describeRoutineCodeRevisionWithOptions(DescribeRoutineCodeRevisionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectCodeRevision)) {
            body.put("SelectCodeRevision", request.selectCodeRevision);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoutineCodeRevision"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoutineCodeRevisionResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineCodeRevisionRequest
      * @return DescribeRoutineCodeRevisionResponse
     */
    public DescribeRoutineCodeRevisionResponse describeRoutineCodeRevision(DescribeRoutineCodeRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineCodeRevisionWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineSpecRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRoutineSpecResponse
     */
    public DescribeRoutineSpecResponse describeRoutineSpecWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoutineSpec"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoutineSpecResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @return DescribeRoutineSpecResponse
     */
    public DescribeRoutineSpecResponse describeRoutineSpec() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineSpecWithOptions(runtime);
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
      * @param request DescribeRoutineUserInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRoutineUserInfoResponse
     */
    public DescribeRoutineUserInfoResponse describeRoutineUserInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoutineUserInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoutineUserInfoResponse());
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
      * @return DescribeRoutineUserInfoResponse
     */
    public DescribeRoutineUserInfoResponse describeRoutineUserInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineUserInfoWithOptions(runtime);
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
      * @param request DescribeUserDcdnIpaStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeUserDcdnIpaStatusResponse
     */
    public DescribeUserDcdnIpaStatusResponse describeUserDcdnIpaStatusWithOptions(DescribeUserDcdnIpaStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserDcdnIpaStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserDcdnIpaStatusResponse());
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
      * @param request DescribeUserDcdnIpaStatusRequest
      * @return DescribeUserDcdnIpaStatusResponse
     */
    public DescribeUserDcdnIpaStatusResponse describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserDcdnIpaStatusWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeUserDcdnStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeUserDcdnStatusResponse
     */
    public DescribeUserDcdnStatusResponse describeUserDcdnStatusWithOptions(DescribeUserDcdnStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserDcdnStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserDcdnStatusResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeUserDcdnStatusRequest
      * @return DescribeUserDcdnStatusResponse
     */
    public DescribeUserDcdnStatusResponse describeUserDcdnStatus(DescribeUserDcdnStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserDcdnStatusWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeUserErStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeUserErStatusResponse
     */
    public DescribeUserErStatusResponse describeUserErStatusWithOptions(DescribeUserErStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserErStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserErStatusResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request DescribeUserErStatusRequest
      * @return DescribeUserErStatusResponse
     */
    public DescribeUserErStatusResponse describeUserErStatus(DescribeUserErStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserErStatusWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeUserLogserviceStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeUserLogserviceStatusResponse
     */
    public DescribeUserLogserviceStatusResponse describeUserLogserviceStatusWithOptions(DescribeUserLogserviceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserLogserviceStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserLogserviceStatusResponse());
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
      * @param request DescribeUserLogserviceStatusRequest
      * @return DescribeUserLogserviceStatusResponse
     */
    public DescribeUserLogserviceStatusResponse describeUserLogserviceStatus(DescribeUserLogserviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserLogserviceStatusWithOptions(request, runtime);
    }

    /**
      * > 
      * *   This operation modifies only the specified configurations. Other configurations remain unchanged.
      * *   If you want to delete a setting, delete the parameter value.
      * *   This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.
      * *   Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:
      *     *   Outside China: presetCanaryOverseas.
      *     *   In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param tmpReq EditRoutineConfRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return EditRoutineConfResponse
     */
    public EditRoutineConfResponse editRoutineConfWithOptions(EditRoutineConfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EditRoutineConfShrinkRequest request = new EditRoutineConfShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.envConf)) {
            request.envConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.envConf, "EnvConf", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envConfShrink)) {
            body.put("EnvConf", request.envConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditRoutineConf"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditRoutineConfResponse());
    }

    /**
      * > 
      * *   This operation modifies only the specified configurations. Other configurations remain unchanged.
      * *   If you want to delete a setting, delete the parameter value.
      * *   This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.
      * *   Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:
      *     *   Outside China: presetCanaryOverseas.
      *     *   In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request EditRoutineConfRequest
      * @return EditRoutineConfResponse
     */
    public EditRoutineConfResponse editRoutineConf(EditRoutineConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editRoutineConfWithOptions(request, runtime);
    }

    public GetDcdnKvResponse getDcdnKvWithOptions(GetDcdnKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDcdnKv"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDcdnKvResponse());
    }

    public GetDcdnKvResponse getDcdnKv(GetDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDcdnKvWithOptions(request, runtime);
    }

    public ListDcdnKvResponse listDcdnKvWithOptions(ListDcdnKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDcdnKv"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDcdnKvResponse());
    }

    public ListDcdnKvResponse listDcdnKv(ListDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDcdnKvWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request ListDcdnRealTimeDeliveryProjectRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDcdnRealTimeDeliveryProjectResponse
     */
    public ListDcdnRealTimeDeliveryProjectResponse listDcdnRealTimeDeliveryProjectWithOptions(ListDcdnRealTimeDeliveryProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDcdnRealTimeDeliveryProject"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDcdnRealTimeDeliveryProjectResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request ListDcdnRealTimeDeliveryProjectRequest
      * @return ListDcdnRealTimeDeliveryProjectResponse
     */
    public ListDcdnRealTimeDeliveryProjectResponse listDcdnRealTimeDeliveryProject(ListDcdnRealTimeDeliveryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDcdnRealTimeDeliveryProjectWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request ModifyDCdnDomainSchdmByPropertyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDCdnDomainSchdmByPropertyResponse
     */
    public ModifyDCdnDomainSchdmByPropertyResponse modifyDCdnDomainSchdmByPropertyWithOptions(ModifyDCdnDomainSchdmByPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.property)) {
            query.put("Property", request.property);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDCdnDomainSchdmByProperty"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDCdnDomainSchdmByPropertyResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request ModifyDCdnDomainSchdmByPropertyRequest
      * @return ModifyDCdnDomainSchdmByPropertyResponse
     */
    public ModifyDCdnDomainSchdmByPropertyResponse modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDCdnDomainSchdmByPropertyWithOptions(request, runtime);
    }

    public ModifyDcdnWafGroupResponse modifyDcdnWafGroupWithOptions(ModifyDcdnWafGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDcdnWafGroup"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDcdnWafGroupResponse());
    }

    public ModifyDcdnWafGroupResponse modifyDcdnWafGroup(ModifyDcdnWafGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafGroupWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request ModifyDcdnWafPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDcdnWafPolicyResponse
     */
    public ModifyDcdnWafPolicyResponse modifyDcdnWafPolicyWithOptions(ModifyDcdnWafPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyStatus)) {
            body.put("PolicyStatus", request.policyStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDcdnWafPolicy"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDcdnWafPolicyResponse());
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
      * @param request ModifyDcdnWafPolicyRequest
      * @return ModifyDcdnWafPolicyResponse
     */
    public ModifyDcdnWafPolicyResponse modifyDcdnWafPolicy(ModifyDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
      * @param request ModifyDcdnWafPolicyDomainsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDcdnWafPolicyDomainsResponse
     */
    public ModifyDcdnWafPolicyDomainsResponse modifyDcdnWafPolicyDomainsWithOptions(ModifyDcdnWafPolicyDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindDomains)) {
            body.put("BindDomains", request.bindDomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindDomains)) {
            body.put("UnbindDomains", request.unbindDomains);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDcdnWafPolicyDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDcdnWafPolicyDomainsResponse());
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
      * @param request ModifyDcdnWafPolicyDomainsRequest
      * @return ModifyDcdnWafPolicyDomainsResponse
     */
    public ModifyDcdnWafPolicyDomainsResponse modifyDcdnWafPolicyDomains(ModifyDcdnWafPolicyDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafPolicyDomainsWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      * *   You must configure at least one of the **RuleStatus**, **RuleName** and **RuleConfig** parameters.
      *
      * @param request ModifyDcdnWafRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDcdnWafRuleResponse
     */
    public ModifyDcdnWafRuleResponse modifyDcdnWafRuleWithOptions(ModifyDcdnWafRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            body.put("RuleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            body.put("RuleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDcdnWafRule"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDcdnWafRuleResponse());
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      * *   You must configure at least one of the **RuleStatus**, **RuleName** and **RuleConfig** parameters.
      *
      * @param request ModifyDcdnWafRuleRequest
      * @return ModifyDcdnWafRuleResponse
     */
    public ModifyDcdnWafRuleResponse modifyDcdnWafRule(ModifyDcdnWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafRuleWithOptions(request, runtime);
    }

    /**
      * > *   DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.
      * >*   You can call this operation up to 5 times per second per account.
      *
      * @param request OpenDcdnServiceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return OpenDcdnServiceResponse
     */
    public OpenDcdnServiceResponse openDcdnServiceWithOptions(OpenDcdnServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billType)) {
            query.put("BillType", request.billType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websocketBillType)) {
            query.put("WebsocketBillType", request.websocketBillType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenDcdnService"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenDcdnServiceResponse());
    }

    /**
      * > *   DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.
      * >*   You can call this operation up to 5 times per second per account.
      *
      * @param request OpenDcdnServiceRequest
      * @return OpenDcdnServiceResponse
     */
    public OpenDcdnServiceResponse openDcdnService(OpenDcdnServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openDcdnServiceWithOptions(request, runtime);
    }

    /**
      * #
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.
      * *   By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.
      * *   You can specify at most 100 URLs in each prefetch request.
      * *   The prefetch queue of each Alibaba Cloud account can contain up to 50,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.
      * *   You can call this operation up to 15 times per second per account.
      * # Usage notes
      * *   After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.
      * *   The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.
      * *   To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
      * @param request PreloadDcdnObjectCachesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PreloadDcdnObjectCachesResponse
     */
    public PreloadDcdnObjectCachesResponse preloadDcdnObjectCachesWithOptions(PreloadDcdnObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l2Preload)) {
            query.put("L2Preload", request.l2Preload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withHeader)) {
            query.put("WithHeader", request.withHeader);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadDcdnObjectCaches"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadDcdnObjectCachesResponse());
    }

    /**
      * #
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.
      * *   By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.
      * *   You can specify at most 100 URLs in each prefetch request.
      * *   The prefetch queue of each Alibaba Cloud account can contain up to 50,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.
      * *   You can call this operation up to 15 times per second per account.
      * # Usage notes
      * *   After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.
      * *   The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.
      * *   To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
      * @param request PreloadDcdnObjectCachesRequest
      * @return PreloadDcdnObjectCachesResponse
     */
    public PreloadDcdnObjectCachesResponse preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadDcdnObjectCachesWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request PublishDcdnStagingConfigToProductionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PublishDcdnStagingConfigToProductionResponse
     */
    public PublishDcdnStagingConfigToProductionResponse publishDcdnStagingConfigToProductionWithOptions(PublishDcdnStagingConfigToProductionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishDcdnStagingConfigToProduction"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishDcdnStagingConfigToProductionResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request PublishDcdnStagingConfigToProductionRequest
      * @return PublishDcdnStagingConfigToProductionResponse
     */
    public PublishDcdnStagingConfigToProductionResponse publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDcdnStagingConfigToProductionWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param tmpReq PublishRoutineCodeRevisionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PublishRoutineCodeRevisionResponse
     */
    public PublishRoutineCodeRevisionResponse publishRoutineCodeRevisionWithOptions(PublishRoutineCodeRevisionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishRoutineCodeRevisionShrinkRequest request = new PublishRoutineCodeRevisionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.envs)) {
            request.envsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.envs, "Envs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envsShrink)) {
            body.put("Envs", request.envsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectCodeRevision)) {
            body.put("SelectCodeRevision", request.selectCodeRevision);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRoutineCodeRevision"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRoutineCodeRevisionResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request PublishRoutineCodeRevisionRequest
      * @return PublishRoutineCodeRevisionResponse
     */
    public PublishRoutineCodeRevisionResponse publishRoutineCodeRevision(PublishRoutineCodeRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRoutineCodeRevisionWithOptions(request, runtime);
    }

    public PutDcdnKvResponse putDcdnKvWithOptions(PutDcdnKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTtl)) {
            query.put("ExpirationTtl", request.expirationTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDcdnKv"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDcdnKvResponse());
    }

    public PutDcdnKvResponse putDcdnKv(PutDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDcdnKvWithOptions(request, runtime);
    }

    public PutDcdnKvNamespaceResponse putDcdnKvNamespaceWithOptions(PutDcdnKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDcdnKvNamespace"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDcdnKvNamespaceResponse());
    }

    public PutDcdnKvNamespaceResponse putDcdnKvNamespace(PutDcdnKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDcdnKvNamespaceWithOptions(request, runtime);
    }

    /**
      * #
      * *   DCDN supports POST requests in which parameters are sent as a form.
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   By default, each Alibaba Cloud account can refresh content from a maximum of 10,000 URLs and 100 directories per day, including subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to request a quota increase. DCDN evaluates your application based on your workloads.
      * *   You can specify up to 1,000 URLs or 100 directories that you want to refresh in each request.
      * *   You can refresh up to 1,000 URLs per minute for each domain name.
      * *   You can call this operation up to 30 times per second per account.
      * # Precautions
      * *   After a refresh task is submitted and completed, your resources that are stored on DCDN POPs are removed. When a POP receives a request to your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on the POP. If you frequently run refresh tasks, more requests will be redirected back to the origin server for resources, which result in high bandwidth costs and undue pressure on the origin server.
      * *   A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.
      * *   If you want to use RAM users to refresh or prefetch resources, you need to obtain the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
      * @param request RefreshDcdnObjectCachesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RefreshDcdnObjectCachesResponse
     */
    public RefreshDcdnObjectCachesResponse refreshDcdnObjectCachesWithOptions(RefreshDcdnObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDcdnObjectCaches"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDcdnObjectCachesResponse());
    }

    /**
      * #
      * *   DCDN supports POST requests in which parameters are sent as a form.
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   By default, each Alibaba Cloud account can refresh content from a maximum of 10,000 URLs and 100 directories per day, including subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to request a quota increase. DCDN evaluates your application based on your workloads.
      * *   You can specify up to 1,000 URLs or 100 directories that you want to refresh in each request.
      * *   You can refresh up to 1,000 URLs per minute for each domain name.
      * *   You can call this operation up to 30 times per second per account.
      * # Precautions
      * *   After a refresh task is submitted and completed, your resources that are stored on DCDN POPs are removed. When a POP receives a request to your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on the POP. If you frequently run refresh tasks, more requests will be redirected back to the origin server for resources, which result in high bandwidth costs and undue pressure on the origin server.
      * *   A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.
      * *   If you want to use RAM users to refresh or prefetch resources, you need to obtain the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
      * @param request RefreshDcdnObjectCachesRequest
      * @return RefreshDcdnObjectCachesResponse
     */
    public RefreshDcdnObjectCachesResponse refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDcdnObjectCachesWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request RollbackDcdnStagingConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RollbackDcdnStagingConfigResponse
     */
    public RollbackDcdnStagingConfigResponse rollbackDcdnStagingConfigWithOptions(RollbackDcdnStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackDcdnStagingConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackDcdnStagingConfigResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request RollbackDcdnStagingConfigRequest
      * @return RollbackDcdnStagingConfigResponse
     */
    public RollbackDcdnStagingConfigResponse rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackDcdnStagingConfigWithOptions(request, runtime);
    }

    /**
      * @deprecated : SetDcdnDomainCertificate is deprecated, please use dcdn::2018-01-15::SetDcdnDomainSSLCertificate instead.
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnDomainCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDcdnDomainCertificateResponse
     */
    // Deprecated
    public SetDcdnDomainCertificateResponse setDcdnDomainCertificateWithOptions(SetDcdnDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSet)) {
            query.put("ForceSet", request.forceSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnDomainCertificate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnDomainCertificateResponse());
    }

    /**
      * @deprecated : SetDcdnDomainCertificate is deprecated, please use dcdn::2018-01-15::SetDcdnDomainSSLCertificate instead.
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnDomainCertificateRequest
      * @return SetDcdnDomainCertificateResponse
     */
    // Deprecated
    public SetDcdnDomainCertificateResponse setDcdnDomainCertificate(SetDcdnDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainCertificateWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnDomainSMCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDcdnDomainSMCertificateResponse
     */
    public SetDcdnDomainSMCertificateResponse setDcdnDomainSMCertificateWithOptions(SetDcdnDomainSMCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnDomainSMCertificate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnDomainSMCertificateResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnDomainSMCertificateRequest
      * @return SetDcdnDomainSMCertificateResponse
     */
    public SetDcdnDomainSMCertificateResponse setDcdnDomainSMCertificate(SetDcdnDomainSMCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainSMCertificateWithOptions(request, runtime);
    }

    public SetDcdnDomainSSLCertificateResponse setDcdnDomainSSLCertificateWithOptions(SetDcdnDomainSSLCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegion)) {
            query.put("CertRegion", request.certRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnDomainSSLCertificate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnDomainSSLCertificateResponse());
    }

    public SetDcdnDomainSSLCertificateResponse setDcdnDomainSSLCertificate(SetDcdnDomainSSLCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainSSLCertificateWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnDomainStagingConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDcdnDomainStagingConfigResponse
     */
    public SetDcdnDomainStagingConfigResponse setDcdnDomainStagingConfigWithOptions(SetDcdnDomainStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnDomainStagingConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnDomainStagingConfigResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnDomainStagingConfigRequest
      * @return SetDcdnDomainStagingConfigResponse
     */
    public SetDcdnDomainStagingConfigResponse setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainStagingConfigWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request SetDcdnFullDomainsBlockIPRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDcdnFullDomainsBlockIPResponse
     */
    public SetDcdnFullDomainsBlockIPResponse setDcdnFullDomainsBlockIPWithOptions(SetDcdnFullDomainsBlockIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockInterval)) {
            body.put("BlockInterval", request.blockInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPList)) {
            body.put("IPList", request.IPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            body.put("UpdateType", request.updateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnFullDomainsBlockIP"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnFullDomainsBlockIPResponse());
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
      * @param request SetDcdnFullDomainsBlockIPRequest
      * @return SetDcdnFullDomainsBlockIPResponse
     */
    public SetDcdnFullDomainsBlockIPResponse setDcdnFullDomainsBlockIP(SetDcdnFullDomainsBlockIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnFullDomainsBlockIPWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnUserConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDcdnUserConfigResponse
     */
    public SetDcdnUserConfigResponse setDcdnUserConfigWithOptions(SetDcdnUserConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            query.put("Configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionId)) {
            query.put("FunctionId", request.functionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnUserConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnUserConfigResponse());
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
      * @param request SetDcdnUserConfigRequest
      * @return SetDcdnUserConfigResponse
     */
    public SetDcdnUserConfigResponse setDcdnUserConfig(SetDcdnUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnUserConfigWithOptions(request, runtime);
    }

    /**
      * > 
      * *   Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param tmpReq SetRoutineSubdomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetRoutineSubdomainResponse
     */
    public SetRoutineSubdomainResponse setRoutineSubdomainWithOptions(SetRoutineSubdomainRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetRoutineSubdomainShrinkRequest request = new SetRoutineSubdomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subdomains)) {
            request.subdomainsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subdomains, "Subdomains", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subdomainsShrink)) {
            body.put("Subdomains", request.subdomainsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRoutineSubdomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRoutineSubdomainResponse());
    }

    /**
      * > 
      * *   Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request SetRoutineSubdomainRequest
      * @return SetRoutineSubdomainResponse
     */
    public SetRoutineSubdomainResponse setRoutineSubdomain(SetRoutineSubdomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRoutineSubdomainWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If an accelerated domain is in an invalid state or your account has an overdue payment, the accelerated domain cannot be enabled.
      * *   The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request StartDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartDcdnDomainResponse
     */
    public StartDcdnDomainResponse startDcdnDomainWithOptions(StartDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDcdnDomainResponse());
    }

    /**
      * > 
      * *   If an accelerated domain is in an invalid state or your account has an overdue payment, the accelerated domain cannot be enabled.
      * *   The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request StartDcdnDomainRequest
      * @return StartDcdnDomainResponse
     */
    public StartDcdnDomainResponse startDcdnDomain(StartDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDcdnDomainWithOptions(request, runtime);
    }

    /**
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can call this operation up to 20 times per second per account.
      *
      * @param request StartDcdnIpaDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartDcdnIpaDomainResponse
     */
    public StartDcdnIpaDomainResponse startDcdnIpaDomainWithOptions(StartDcdnIpaDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDcdnIpaDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDcdnIpaDomainResponse());
    }

    /**
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can call this operation up to 20 times per second per account.
      *
      * @param request StartDcdnIpaDomainRequest
      * @return StartDcdnIpaDomainResponse
     */
    public StartDcdnIpaDomainResponse startDcdnIpaDomain(StartDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
      * > 
      * *   After the accelerated domain is disabled, Dynamic Route for CDN retains its information and reroutes all the requests that are destined for the accelerated domain to the origin.
      * *   The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request StopDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopDcdnDomainResponse
     */
    public StopDcdnDomainResponse stopDcdnDomainWithOptions(StopDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDcdnDomainResponse());
    }

    /**
      * > 
      * *   After the accelerated domain is disabled, Dynamic Route for CDN retains its information and reroutes all the requests that are destined for the accelerated domain to the origin.
      * *   The maximum number of times that each user can call this operation per second is 30.
      *
      * @param request StopDcdnDomainRequest
      * @return StopDcdnDomainResponse
     */
    public StopDcdnDomainResponse stopDcdnDomain(StopDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDcdnDomainWithOptions(request, runtime);
    }

    /**
      * > 
      * *   If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.
      * *   You can call this operation up to 20 times per second per account.
      *
      * @param request StopDcdnIpaDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopDcdnIpaDomainResponse
     */
    public StopDcdnIpaDomainResponse stopDcdnIpaDomainWithOptions(StopDcdnIpaDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDcdnIpaDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDcdnIpaDomainResponse());
    }

    /**
      * > 
      * *   If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.
      * *   You can call this operation up to 20 times per second per account.
      *
      * @param request StopDcdnIpaDomainRequest
      * @return StopDcdnIpaDomainResponse
     */
    public StopDcdnIpaDomainResponse stopDcdnIpaDomain(StopDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request TagDcdnResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TagDcdnResourcesResponse
     */
    public TagDcdnResourcesResponse tagDcdnResourcesWithOptions(TagDcdnResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "TagDcdnResources"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagDcdnResourcesResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request TagDcdnResourcesRequest
      * @return TagDcdnResourcesResponse
     */
    public TagDcdnResourcesResponse tagDcdnResources(TagDcdnResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagDcdnResourcesWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request UntagDcdnResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UntagDcdnResourcesResponse
     */
    public UntagDcdnResourcesResponse untagDcdnResourcesWithOptions(UntagDcdnResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagDcdnResources"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagDcdnResourcesResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request UntagDcdnResourcesRequest
      * @return UntagDcdnResourcesResponse
     */
    public UntagDcdnResourcesResponse untagDcdnResources(UntagDcdnResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagDcdnResourcesWithOptions(request, runtime);
    }

    /**
      * The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.
      *
      * @param request UpdateDcdnDeliverTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDcdnDeliverTaskResponse
     */
    public UpdateDcdnDeliverTaskResponse updateDcdnDeliverTaskWithOptions(UpdateDcdnDeliverTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliver)) {
            body.put("Deliver", request.deliver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverId)) {
            body.put("DeliverId", request.deliverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reports)) {
            body.put("Reports", request.reports);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("Schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnDeliverTask"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnDeliverTaskResponse());
    }

    /**
      * The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.
      *
      * @param request UpdateDcdnDeliverTaskRequest
      * @return UpdateDcdnDeliverTaskResponse
     */
    public UpdateDcdnDeliverTaskResponse updateDcdnDeliverTask(UpdateDcdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnDeliverTaskWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
      * @param request UpdateDcdnDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDcdnDomainResponse
     */
    public UpdateDcdnDomainResponse updateDcdnDomainWithOptions(UpdateDcdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnDomainResponse());
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
      * @param request UpdateDcdnDomainRequest
      * @return UpdateDcdnDomainResponse
     */
    public UpdateDcdnDomainResponse updateDcdnDomain(UpdateDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnDomainWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to 20 times per second per account.
      *
      * @param request UpdateDcdnIpaDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDcdnIpaDomainResponse
     */
    public UpdateDcdnIpaDomainResponse updateDcdnIpaDomainWithOptions(UpdateDcdnIpaDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnIpaDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnIpaDomainResponse());
    }

    /**
      * >  You can call this operation up to 20 times per second per account.
      *
      * @param request UpdateDcdnIpaDomainRequest
      * @return UpdateDcdnIpaDomainResponse
     */
    public UpdateDcdnIpaDomainResponse updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request UpdateDcdnSLSRealtimeLogDeliveryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDcdnSLSRealtimeLogDeliveryResponse
     */
    public UpdateDcdnSLSRealtimeLogDeliveryResponse updateDcdnSLSRealtimeLogDeliveryWithOptions(UpdateDcdnSLSRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataCenter)) {
            body.put("DataCenter", request.dataCenter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSLogStore)) {
            body.put("SLSLogStore", request.SLSLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSProject)) {
            body.put("SLSProject", request.SLSProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSRegion)) {
            body.put("SLSRegion", request.SLSRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingRate)) {
            body.put("SamplingRate", request.samplingRate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnSLSRealtimeLogDelivery"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnSLSRealtimeLogDeliveryResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request UpdateDcdnSLSRealtimeLogDeliveryRequest
      * @return UpdateDcdnSLSRealtimeLogDeliveryResponse
     */
    public UpdateDcdnSLSRealtimeLogDeliveryResponse updateDcdnSLSRealtimeLogDelivery(UpdateDcdnSLSRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnSLSRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request UpdateDcdnSubTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDcdnSubTaskResponse
     */
    public UpdateDcdnSubTaskResponse updateDcdnSubTaskWithOptions(UpdateDcdnSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportIds)) {
            body.put("ReportIds", request.reportIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnSubTask"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnSubTaskResponse());
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
      * @param request UpdateDcdnSubTaskRequest
      * @return UpdateDcdnSubTaskResponse
     */
    public UpdateDcdnSubTaskResponse updateDcdnSubTask(UpdateDcdnSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnSubTaskWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request UpdateDcdnUserRealTimeDeliveryFieldRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDcdnUserRealTimeDeliveryFieldResponse
     */
    public UpdateDcdnUserRealTimeDeliveryFieldResponse updateDcdnUserRealTimeDeliveryFieldWithOptions(UpdateDcdnUserRealTimeDeliveryFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnUserRealTimeDeliveryField"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnUserRealTimeDeliveryFieldResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request UpdateDcdnUserRealTimeDeliveryFieldRequest
      * @return UpdateDcdnUserRealTimeDeliveryFieldResponse
     */
    public UpdateDcdnUserRealTimeDeliveryFieldResponse updateDcdnUserRealTimeDeliveryField(UpdateDcdnUserRealTimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnUserRealTimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
      * > 
      * *   Each time you submit code, a version of the code is generated. You can manage and publish code by version.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request UploadRoutineCodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UploadRoutineCodeResponse
     */
    public UploadRoutineCodeResponse uploadRoutineCodeWithOptions(UploadRoutineCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadRoutineCode"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadRoutineCodeResponse());
    }

    /**
      * > 
      * *   Each time you submit code, a version of the code is generated. You can manage and publish code by version.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request UploadRoutineCodeRequest
      * @return UploadRoutineCodeResponse
     */
    public UploadRoutineCodeResponse uploadRoutineCode(UploadRoutineCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadRoutineCodeWithOptions(request, runtime);
    }

    /**
      * > 
      * *   Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.
      * *   The code is automatically published to a staging environment.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request UploadStagingRoutineCodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UploadStagingRoutineCodeResponse
     */
    public UploadStagingRoutineCodeResponse uploadStagingRoutineCodeWithOptions(UploadStagingRoutineCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadStagingRoutineCode"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadStagingRoutineCodeResponse());
    }

    /**
      * > 
      * *   Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.
      * *   The code is automatically published to a staging environment.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
      * @param request UploadStagingRoutineCodeRequest
      * @return UploadStagingRoutineCodeResponse
     */
    public UploadStagingRoutineCodeResponse uploadStagingRoutineCode(UploadStagingRoutineCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadStagingRoutineCodeWithOptions(request, runtime);
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request VerifyDcdnDomainOwnerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return VerifyDcdnDomainOwnerResponse
     */
    public VerifyDcdnDomainOwnerResponse verifyDcdnDomainOwnerWithOptions(VerifyDcdnDomainOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDcdnDomainOwner"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDcdnDomainOwnerResponse());
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
      * @param request VerifyDcdnDomainOwnerRequest
      * @return VerifyDcdnDomainOwnerResponse
     */
    public VerifyDcdnDomainOwnerResponse verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyDcdnDomainOwnerWithOptions(request, runtime);
    }
}
