// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101;

import com.aliyun.tea.*;
import com.aliyun.ddoscoo20200101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "ddoscoo.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ddoscoo.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddoscoo", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddAutoCcBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAutoCcBlacklistResponse
     */
    public AddAutoCcBlacklistResponse addAutoCcBlacklistWithOptions(AddAutoCcBlacklistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blacklist)) {
            query.put("Blacklist", request.blacklist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAutoCcBlacklist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAutoCcBlacklistResponse());
    }

    /**
     * @param request AddAutoCcBlacklistRequest
     * @return AddAutoCcBlacklistResponse
     */
    public AddAutoCcBlacklistResponse addAutoCcBlacklist(AddAutoCcBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAutoCcBlacklistWithOptions(request, runtime);
    }

    /**
     * @param request AddAutoCcWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAutoCcWhitelistResponse
     */
    public AddAutoCcWhitelistResponse addAutoCcWhitelistWithOptions(AddAutoCcWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            query.put("Whitelist", request.whitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAutoCcWhitelist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAutoCcWhitelistResponse());
    }

    /**
     * @param request AddAutoCcWhitelistRequest
     * @return AddAutoCcWhitelistResponse
     */
    public AddAutoCcWhitelistResponse addAutoCcWhitelist(AddAutoCcWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAutoCcWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定证书</p>
     * 
     * @param request AssociateWebCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateWebCertResponse
     */
    public AssociateWebCertResponse associateWebCertWithOptions(AssociateWebCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cert)) {
            body.put("Cert", request.cert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            body.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            body.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            body.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegion)) {
            body.put("CertRegion", request.certRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateWebCert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateWebCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定证书</p>
     * 
     * @param request AssociateWebCertRequest
     * @return AssociateWebCertResponse
     */
    public AssociateWebCertResponse associateWebCert(AssociateWebCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateWebCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定场景策略生效对象</p>
     * 
     * @param request AttachSceneDefenseObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachSceneDefenseObjectResponse
     */
    public AttachSceneDefenseObjectResponse attachSceneDefenseObjectWithOptions(AttachSceneDefenseObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objects)) {
            query.put("Objects", request.objects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachSceneDefenseObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachSceneDefenseObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定场景策略生效对象</p>
     * 
     * @param request AttachSceneDefenseObjectRequest
     * @return AttachSceneDefenseObjectResponse
     */
    public AttachSceneDefenseObjectResponse attachSceneDefenseObject(AttachSceneDefenseObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachSceneDefenseObjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置安全概要属性</p>
     * 
     * @param request ConfigDomainSecurityProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigDomainSecurityProfileResponse
     */
    public ConfigDomainSecurityProfileResponse configDomainSecurityProfileWithOptions(ConfigDomainSecurityProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("Cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigDomainSecurityProfile"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigDomainSecurityProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置安全概要属性</p>
     * 
     * @param request ConfigDomainSecurityProfileRequest
     * @return ConfigDomainSecurityProfileResponse
     */
    public ConfigDomainSecurityProfileResponse configDomainSecurityProfile(ConfigDomainSecurityProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configDomainSecurityProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置全局模板规则</p>
     * 
     * @param request ConfigL7GlobalRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigL7GlobalRuleResponse
     */
    public ConfigL7GlobalRuleResponse configL7GlobalRuleWithOptions(ConfigL7GlobalRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAttr)) {
            query.put("RuleAttr", request.ruleAttr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigL7GlobalRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigL7GlobalRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置全局模板规则</p>
     * 
     * @param request ConfigL7GlobalRuleRequest
     * @return ConfigL7GlobalRuleResponse
     */
    public ConfigL7GlobalRuleResponse configL7GlobalRule(ConfigL7GlobalRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configL7GlobalRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置域名接入回源策略</p>
     * 
     * @param request ConfigL7RsPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigL7RsPolicyResponse
     */
    public ConfigL7RsPolicyResponse configL7RsPolicyWithOptions(ConfigL7RsPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamRetry)) {
            query.put("UpstreamRetry", request.upstreamRetry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigL7RsPolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigL7RsPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置域名接入回源策略</p>
     * 
     * @param request ConfigL7RsPolicyRequest
     * @return ConfigL7RsPolicyResponse
     */
    public ConfigL7RsPolicyResponse configL7RsPolicy(ConfigL7RsPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configL7RsPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置长连接</p>
     * 
     * @param request ConfigL7UsKeepaliveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigL7UsKeepaliveResponse
     */
    public ConfigL7UsKeepaliveResponse configL7UsKeepaliveWithOptions(ConfigL7UsKeepaliveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downstreamKeepalive)) {
            query.put("DownstreamKeepalive", request.downstreamKeepalive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamKeepalive)) {
            query.put("UpstreamKeepalive", request.upstreamKeepalive);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigL7UsKeepalive"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigL7UsKeepaliveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置长连接</p>
     * 
     * @param request ConfigL7UsKeepaliveRequest
     * @return ConfigL7UsKeepaliveResponse
     */
    public ConfigL7UsKeepaliveResponse configL7UsKeepalive(ConfigL7UsKeepaliveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configL7UsKeepaliveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>4层带宽限速 客户专用</p>
     * 
     * @param request ConfigLayer4RealLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigLayer4RealLimitResponse
     */
    public ConfigLayer4RealLimitResponse configLayer4RealLimitWithOptions(ConfigLayer4RealLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitValue)) {
            query.put("LimitValue", request.limitValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigLayer4RealLimit"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigLayer4RealLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>4层带宽限速 客户专用</p>
     * 
     * @param request ConfigLayer4RealLimitRequest
     * @return ConfigLayer4RealLimitResponse
     */
    public ConfigLayer4RealLimitResponse configLayer4RealLimit(ConfigLayer4RealLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configLayer4RealLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置端口接入备注</p>
     * 
     * @param request ConfigLayer4RemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigLayer4RemarkResponse
     */
    public ConfigLayer4RemarkResponse configLayer4RemarkWithOptions(ConfigLayer4RemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listeners)) {
            query.put("Listeners", request.listeners);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigLayer4Remark"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigLayer4RemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置端口接入备注</p>
     * 
     * @param request ConfigLayer4RemarkRequest
     * @return ConfigLayer4RemarkResponse
     */
    public ConfigLayer4RemarkResponse configLayer4Remark(ConfigLayer4RemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configLayer4RemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置端口接入回源主备模式</p>
     * 
     * @param request ConfigLayer4RuleBakModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigLayer4RuleBakModeResponse
     */
    public ConfigLayer4RuleBakModeResponse configLayer4RuleBakModeWithOptions(ConfigLayer4RuleBakModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bakMode)) {
            query.put("BakMode", request.bakMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listeners)) {
            query.put("Listeners", request.listeners);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigLayer4RuleBakMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigLayer4RuleBakModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置端口接入回源主备模式</p>
     * 
     * @param request ConfigLayer4RuleBakModeRequest
     * @return ConfigLayer4RuleBakModeResponse
     */
    public ConfigLayer4RuleBakModeResponse configLayer4RuleBakMode(ConfigLayer4RuleBakModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configLayer4RuleBakModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置端口接入策略</p>
     * 
     * @param request ConfigLayer4RulePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigLayer4RulePolicyResponse
     */
    public ConfigLayer4RulePolicyResponse configLayer4RulePolicyWithOptions(ConfigLayer4RulePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listeners)) {
            query.put("Listeners", request.listeners);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigLayer4RulePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigLayer4RulePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置端口接入策略</p>
     * 
     * @param request ConfigLayer4RulePolicyRequest
     * @return ConfigLayer4RulePolicyResponse
     */
    public ConfigLayer4RulePolicyResponse configLayer4RulePolicy(ConfigLayer4RulePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configLayer4RulePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置区域封禁</p>
     * 
     * @param request ConfigNetworkRegionBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigNetworkRegionBlockResponse
     */
    public ConfigNetworkRegionBlockResponse configNetworkRegionBlockWithOptions(ConfigNetworkRegionBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigNetworkRegionBlock"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigNetworkRegionBlockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置区域封禁</p>
     * 
     * @param request ConfigNetworkRegionBlockRequest
     * @return ConfigNetworkRegionBlockResponse
     */
    public ConfigNetworkRegionBlockResponse configNetworkRegionBlock(ConfigNetworkRegionBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configNetworkRegionBlockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置端口接入规则</p>
     * 
     * @param request ConfigNetworkRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigNetworkRulesResponse
     */
    public ConfigNetworkRulesResponse configNetworkRulesWithOptions(ConfigNetworkRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkRules)) {
            query.put("NetworkRules", request.networkRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigNetworkRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigNetworkRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置端口接入规则</p>
     * 
     * @param request ConfigNetworkRulesRequest
     * @return ConfigNetworkRulesResponse
     */
    public ConfigNetworkRulesResponse configNetworkRules(ConfigNetworkRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configNetworkRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置UDP反射</p>
     * 
     * @param request ConfigUdpReflectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigUdpReflectResponse
     */
    public ConfigUdpReflectResponse configUdpReflectWithOptions(ConfigUdpReflectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigUdpReflect"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigUdpReflectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置UDP反射</p>
     * 
     * @param request ConfigUdpReflectRequest
     * @return ConfigUdpReflectResponse
     */
    public ConfigUdpReflectResponse configUdpReflect(ConfigUdpReflectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configUdpReflectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置新版基于匹配条件的cc规则</p>
     * 
     * @param request ConfigWebCCRuleV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigWebCCRuleV2Response
     */
    public ConfigWebCCRuleV2Response configWebCCRuleV2WithOptions(ConfigWebCCRuleV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expires)) {
            query.put("Expires", request.expires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleList)) {
            query.put("RuleList", request.ruleList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigWebCCRuleV2"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigWebCCRuleV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>配置新版基于匹配条件的cc规则</p>
     * 
     * @param request ConfigWebCCRuleV2Request
     * @return ConfigWebCCRuleV2Response
     */
    public ConfigWebCCRuleV2Response configWebCCRuleV2(ConfigWebCCRuleV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configWebCCRuleV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置WEB CC防护模板</p>
     * 
     * @param request ConfigWebCCTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigWebCCTemplateResponse
     */
    public ConfigWebCCTemplateResponse configWebCCTemplateWithOptions(ConfigWebCCTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigWebCCTemplate"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigWebCCTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置WEB CC防护模板</p>
     * 
     * @param request ConfigWebCCTemplateRequest
     * @return ConfigWebCCTemplateResponse
     */
    public ConfigWebCCTemplateResponse configWebCCTemplate(ConfigWebCCTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configWebCCTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置防护黑白名单</p>
     * 
     * @param request ConfigWebIpSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigWebIpSetResponse
     */
    public ConfigWebIpSetResponse configWebIpSetWithOptions(ConfigWebIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blackList)) {
            query.put("BlackList", request.blackList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteList)) {
            query.put("WhiteList", request.whiteList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigWebIpSet"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigWebIpSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置防护黑白名单</p>
     * 
     * @param request ConfigWebIpSetRequest
     * @return ConfigWebIpSetResponse
     */
    public ConfigWebIpSetResponse configWebIpSet(ConfigWebIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configWebIpSetWithOptions(request, runtime);
    }

    /**
     * @param request CreateAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAsyncTaskResponse
     */
    public CreateAsyncTaskResponse createAsyncTaskWithOptions(CreateAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParams)) {
            query.put("TaskParams", request.taskParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAsyncTask"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAsyncTaskResponse());
    }

    /**
     * @param request CreateAsyncTaskRequest
     * @return CreateAsyncTaskResponse
     */
    public CreateAsyncTaskResponse createAsyncTask(CreateAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>域名资源</p>
     * 
     * @param request CreateDomainResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResourceResponse
     */
    public CreateDomainResourceResponse createDomainResourceWithOptions(CreateDomainResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsExt)) {
            query.put("HttpsExt", request.httpsExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTypes)) {
            query.put("ProxyTypes", request.proxyTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rsType)) {
            query.put("RsType", request.rsType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomainResource"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>域名资源</p>
     * 
     * @param request CreateDomainResourceRequest
     * @return CreateDomainResourceResponse
     */
    public CreateDomainResourceResponse createDomainResource(CreateDomainResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建全局端口防护规则</p>
     * 
     * @param request CreateNetworkRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkRulesResponse
     */
    public CreateNetworkRulesResponse createNetworkRulesWithOptions(CreateNetworkRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipMode)) {
            query.put("IpMode", request.ipMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkRules)) {
            query.put("NetworkRules", request.networkRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建全局端口防护规则</p>
     * 
     * @param request CreateNetworkRulesRequest
     * @return CreateNetworkRulesResponse
     */
    public CreateNetworkRulesResponse createNetworkRules(CreateNetworkRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terraform创建端口</p>
     * 
     * @param request CreatePortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePortResponse
     */
    public CreatePortResponse createPortWithOptions(CreatePortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendPort)) {
            query.put("BackendPort", request.backendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendProtocol)) {
            query.put("FrontendProtocol", request.frontendProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipMode)) {
            query.put("IpMode", request.ipMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyEnable)) {
            query.put("ProxyEnable", request.proxyEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePort"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terraform创建端口</p>
     * 
     * @param request CreatePortRequest
     * @return CreatePortResponse
     */
    public CreatePortResponse createPort(CreatePortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPortWithOptions(request, runtime);
    }

    /**
     * @param request CreateSceneDefensePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSceneDefensePolicyResponse
     */
    public CreateSceneDefensePolicyResponse createSceneDefensePolicyWithOptions(CreateSceneDefensePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSceneDefensePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSceneDefensePolicyResponse());
    }

    /**
     * @param request CreateSceneDefensePolicyRequest
     * @return CreateSceneDefensePolicyResponse
     */
    public CreateSceneDefensePolicyResponse createSceneDefensePolicy(CreateSceneDefensePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSceneDefensePolicyWithOptions(request, runtime);
    }

    /**
     * @param request CreateSchedulerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSchedulerRuleResponse
     */
    public CreateSchedulerRuleResponse createSchedulerRuleWithOptions(CreateSchedulerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchedulerRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSchedulerRuleResponse());
    }

    /**
     * @param request CreateSchedulerRuleRequest
     * @return CreateSchedulerRuleResponse
     */
    public CreateSchedulerRuleResponse createSchedulerRule(CreateSchedulerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSchedulerRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源标签</p>
     * 
     * @param request CreateTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResourcesResponse
     */
    public CreateTagResourcesResponse createTagResourcesWithOptions(CreateTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源标签</p>
     * 
     * @param request CreateTagResourcesRequest
     * @return CreateTagResourcesResponse
     */
    public CreateTagResourcesResponse createTagResources(CreateTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagResourcesWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI CreateWebCCRule is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.
     * 
     * @param request CreateWebCCRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebCCRuleResponse
     */
    @Deprecated
    // Deprecated
    public CreateWebCCRuleResponse createWebCCRuleWithOptions(CreateWebCCRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.act)) {
            query.put("Act", request.act);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            query.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebCCRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebCCRuleResponse());
    }

    /**
     * @deprecated OpenAPI CreateWebCCRule is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.
     * 
     * @param request CreateWebCCRuleRequest
     * @return CreateWebCCRuleResponse
     */
    @Deprecated
    // Deprecated
    public CreateWebCCRuleResponse createWebCCRule(CreateWebCCRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWebCCRuleWithOptions(request, runtime);
    }

    /**
     * @param request CreateWebRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebRuleResponse
     */
    public CreateWebRuleResponse createWebRuleWithOptions(CreateWebRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseId)) {
            query.put("DefenseId", request.defenseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsExt)) {
            query.put("HttpsExt", request.httpsExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rsType)) {
            query.put("RsType", request.rsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebRuleResponse());
    }

    /**
     * @param request CreateWebRuleRequest
     * @return CreateWebRuleResponse
     */
    public CreateWebRuleResponse createWebRule(CreateWebRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWebRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAsyncTaskResponse
     */
    public DeleteAsyncTaskResponse deleteAsyncTaskWithOptions(DeleteAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAsyncTask"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAsyncTaskResponse());
    }

    /**
     * @param request DeleteAsyncTaskRequest
     * @return DeleteAsyncTaskResponse
     */
    public DeleteAsyncTaskResponse deleteAsyncTask(DeleteAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAsyncTaskWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAutoCcBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoCcBlacklistResponse
     */
    public DeleteAutoCcBlacklistResponse deleteAutoCcBlacklistWithOptions(DeleteAutoCcBlacklistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blacklist)) {
            query.put("Blacklist", request.blacklist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoCcBlacklist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoCcBlacklistResponse());
    }

    /**
     * @param request DeleteAutoCcBlacklistRequest
     * @return DeleteAutoCcBlacklistResponse
     */
    public DeleteAutoCcBlacklistResponse deleteAutoCcBlacklist(DeleteAutoCcBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoCcBlacklistWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAutoCcWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoCcWhitelistResponse
     */
    public DeleteAutoCcWhitelistResponse deleteAutoCcWhitelistWithOptions(DeleteAutoCcWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            query.put("Whitelist", request.whitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoCcWhitelist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoCcWhitelistResponse());
    }

    /**
     * @param request DeleteAutoCcWhitelistRequest
     * @return DeleteAutoCcWhitelistResponse
     */
    public DeleteAutoCcWhitelistResponse deleteAutoCcWhitelist(DeleteAutoCcWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoCcWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名资源</p>
     * 
     * @param request DeleteDomainResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResourceResponse
     */
    public DeleteDomainResourceResponse deleteDomainResourceWithOptions(DeleteDomainResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainResource"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名资源</p>
     * 
     * @param request DeleteDomainResourceRequest
     * @return DeleteDomainResourceResponse
     */
    public DeleteDomainResourceResponse deleteDomainResource(DeleteDomainResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除端口转发规则</p>
     * 
     * @param request DeleteNetworkRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkRuleResponse
     */
    public DeleteNetworkRuleResponse deleteNetworkRuleWithOptions(DeleteNetworkRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkRule)) {
            query.put("NetworkRule", request.networkRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除端口转发规则</p>
     * 
     * @param request DeleteNetworkRuleRequest
     * @return DeleteNetworkRuleResponse
     */
    public DeleteNetworkRuleResponse deleteNetworkRule(DeleteNetworkRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeletePortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePortResponse
     */
    public DeletePortResponse deletePortWithOptions(DeletePortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendPort)) {
            query.put("BackendPort", request.backendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendProtocol)) {
            query.put("FrontendProtocol", request.frontendProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePort"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePortResponse());
    }

    /**
     * @param request DeletePortRequest
     * @return DeletePortResponse
     */
    public DeletePortResponse deletePort(DeletePortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePortWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSceneDefensePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSceneDefensePolicyResponse
     */
    public DeleteSceneDefensePolicyResponse deleteSceneDefensePolicyWithOptions(DeleteSceneDefensePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSceneDefensePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneDefensePolicyResponse());
    }

    /**
     * @param request DeleteSceneDefensePolicyRequest
     * @return DeleteSceneDefensePolicyResponse
     */
    public DeleteSceneDefensePolicyResponse deleteSceneDefensePolicy(DeleteSceneDefensePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSceneDefensePolicyWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSchedulerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSchedulerRuleResponse
     */
    public DeleteSchedulerRuleResponse deleteSchedulerRuleWithOptions(DeleteSchedulerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchedulerRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSchedulerRuleResponse());
    }

    /**
     * @param request DeleteSchedulerRuleRequest
     * @return DeleteSchedulerRuleResponse
     */
    public DeleteSchedulerRuleResponse deleteSchedulerRule(DeleteSchedulerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchedulerRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagResourcesResponse
     */
    public DeleteTagResourcesResponse deleteTagResourcesWithOptions(DeleteTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
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
            new TeaPair("action", "DeleteTagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResourcesResponse());
    }

    /**
     * @param request DeleteTagResourcesRequest
     * @return DeleteTagResourcesResponse
     */
    public DeleteTagResourcesResponse deleteTagResources(DeleteTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagResourcesWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI DeleteWebCCRule is deprecated, please use ddoscoo::2020-01-01::DeleteWebCCRuleV2 instead.
     * 
     * @param request DeleteWebCCRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebCCRuleResponse
     */
    @Deprecated
    // Deprecated
    public DeleteWebCCRuleResponse deleteWebCCRuleWithOptions(DeleteWebCCRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebCCRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebCCRuleResponse());
    }

    /**
     * @deprecated OpenAPI DeleteWebCCRule is deprecated, please use ddoscoo::2020-01-01::DeleteWebCCRuleV2 instead.
     * 
     * @param request DeleteWebCCRuleRequest
     * @return DeleteWebCCRuleResponse
     */
    @Deprecated
    // Deprecated
    public DeleteWebCCRuleResponse deleteWebCCRule(DeleteWebCCRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebCCRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除新版cc规则</p>
     * 
     * @param request DeleteWebCCRuleV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebCCRuleV2Response
     */
    public DeleteWebCCRuleV2Response deleteWebCCRuleV2WithOptions(DeleteWebCCRuleV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNames)) {
            query.put("RuleNames", request.ruleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebCCRuleV2"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebCCRuleV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>删除新版cc规则</p>
     * 
     * @param request DeleteWebCCRuleV2Request
     * @return DeleteWebCCRuleV2Response
     */
    public DeleteWebCCRuleV2Response deleteWebCCRuleV2(DeleteWebCCRuleV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebCCRuleV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除缓存规则</p>
     * 
     * @param request DeleteWebCacheCustomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebCacheCustomRuleResponse
     */
    public DeleteWebCacheCustomRuleResponse deleteWebCacheCustomRuleWithOptions(DeleteWebCacheCustomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNames)) {
            query.put("RuleNames", request.ruleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebCacheCustomRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebCacheCustomRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除缓存规则</p>
     * 
     * @param request DeleteWebCacheCustomRuleRequest
     * @return DeleteWebCacheCustomRuleResponse
     */
    public DeleteWebCacheCustomRuleResponse deleteWebCacheCustomRule(DeleteWebCacheCustomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebCacheCustomRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除精准域名规则</p>
     * 
     * @param request DeleteWebPreciseAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebPreciseAccessRuleResponse
     */
    public DeleteWebPreciseAccessRuleResponse deleteWebPreciseAccessRuleWithOptions(DeleteWebPreciseAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNames)) {
            query.put("RuleNames", request.ruleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebPreciseAccessRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebPreciseAccessRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除精准域名规则</p>
     * 
     * @param request DeleteWebPreciseAccessRuleRequest
     * @return DeleteWebPreciseAccessRuleResponse
     */
    public DeleteWebPreciseAccessRuleResponse deleteWebPreciseAccessRule(DeleteWebPreciseAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebPreciseAccessRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteWebRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebRuleResponse
     */
    public DeleteWebRuleResponse deleteWebRuleWithOptions(DeleteWebRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebRuleResponse());
    }

    /**
     * @param request DeleteWebRuleRequest
     * @return DeleteWebRuleResponse
     */
    public DeleteWebRuleResponse deleteWebRule(DeleteWebRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebRuleWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAsyncTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAsyncTasksResponse
     */
    public DescribeAsyncTasksResponse describeAsyncTasksWithOptions(DescribeAsyncTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DescribeAsyncTasks"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAsyncTasksResponse());
    }

    /**
     * @param request DescribeAsyncTasksRequest
     * @return DescribeAsyncTasksResponse
     */
    public DescribeAsyncTasksResponse describeAsyncTasks(DescribeAsyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAsyncTasksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAttackAnalysisMaxQpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAttackAnalysisMaxQpsResponse
     */
    public DescribeAttackAnalysisMaxQpsResponse describeAttackAnalysisMaxQpsWithOptions(DescribeAttackAnalysisMaxQpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAttackAnalysisMaxQps"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAttackAnalysisMaxQpsResponse());
    }

    /**
     * @param request DescribeAttackAnalysisMaxQpsRequest
     * @return DescribeAttackAnalysisMaxQpsResponse
     */
    public DescribeAttackAnalysisMaxQpsResponse describeAttackAnalysisMaxQps(DescribeAttackAnalysisMaxQpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAttackAnalysisMaxQpsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAutoCcBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoCcBlacklistResponse
     */
    public DescribeAutoCcBlacklistResponse describeAutoCcBlacklistWithOptions(DescribeAutoCcBlacklistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoCcBlacklist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoCcBlacklistResponse());
    }

    /**
     * @param request DescribeAutoCcBlacklistRequest
     * @return DescribeAutoCcBlacklistResponse
     */
    public DescribeAutoCcBlacklistResponse describeAutoCcBlacklist(DescribeAutoCcBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoCcBlacklistWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAutoCcListCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoCcListCountResponse
     */
    public DescribeAutoCcListCountResponse describeAutoCcListCountWithOptions(DescribeAutoCcListCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoCcListCount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoCcListCountResponse());
    }

    /**
     * @param request DescribeAutoCcListCountRequest
     * @return DescribeAutoCcListCountResponse
     */
    public DescribeAutoCcListCountResponse describeAutoCcListCount(DescribeAutoCcListCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoCcListCountWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAutoCcWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoCcWhitelistResponse
     */
    public DescribeAutoCcWhitelistResponse describeAutoCcWhitelistWithOptions(DescribeAutoCcWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
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
            new TeaPair("action", "DescribeAutoCcWhitelist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoCcWhitelistResponse());
    }

    /**
     * @param request DescribeAutoCcWhitelistRequest
     * @return DescribeAutoCcWhitelistResponse
     */
    public DescribeAutoCcWhitelistResponse describeAutoCcWhitelist(DescribeAutoCcWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoCcWhitelistWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBackSourceCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackSourceCidrResponse
     */
    public DescribeBackSourceCidrResponse describeBackSourceCidrWithOptions(DescribeBackSourceCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackSourceCidr"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackSourceCidrResponse());
    }

    /**
     * @param request DescribeBackSourceCidrRequest
     * @return DescribeBackSourceCidrResponse
     */
    public DescribeBackSourceCidrResponse describeBackSourceCidr(DescribeBackSourceCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackSourceCidrWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlackholeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlackholeStatusResponse
     */
    public DescribeBlackholeStatusResponse describeBlackholeStatusWithOptions(DescribeBlackholeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlackholeStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlackholeStatusResponse());
    }

    /**
     * @param request DescribeBlackholeStatusRequest
     * @return DescribeBlackholeStatusResponse
     */
    public DescribeBlackholeStatusResponse describeBlackholeStatus(DescribeBlackholeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlackholeStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockStatusResponse
     */
    public DescribeBlockStatusResponse describeBlockStatusWithOptions(DescribeBlockStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockStatusResponse());
    }

    /**
     * @param request DescribeBlockStatusRequest
     * @return DescribeBlockStatusResponse
     */
    public DescribeBlockStatusResponse describeBlockStatus(DescribeBlockStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCdnLinkageRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnLinkageRulesResponse
     */
    public DescribeCdnLinkageRulesResponse describeCdnLinkageRulesWithOptions(DescribeCdnLinkageRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
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
            new TeaPair("action", "DescribeCdnLinkageRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnLinkageRulesResponse());
    }

    /**
     * @param request DescribeCdnLinkageRulesRequest
     * @return DescribeCdnLinkageRulesResponse
     */
    public DescribeCdnLinkageRulesResponse describeCdnLinkageRules(DescribeCdnLinkageRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnLinkageRulesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCertsResponse
     */
    public DescribeCertsResponse describeCertsWithOptions(DescribeCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCerts"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertsResponse());
    }

    /**
     * @param request DescribeCertsRequest
     * @return DescribeCertsResponse
     */
    public DescribeCertsResponse describeCerts(DescribeCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCnameReusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCnameReusesResponse
     */
    public DescribeCnameReusesResponse describeCnameReusesWithOptions(DescribeCnameReusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCnameReuses"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCnameReusesResponse());
    }

    /**
     * @param request DescribeCnameReusesRequest
     * @return DescribeCnameReusesResponse
     */
    public DescribeCnameReusesResponse describeCnameReuses(DescribeCnameReusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCnameReusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询DDoS事件</p>
     * 
     * @param request DescribeDDoSEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDoSEventsResponse
     */
    public DescribeDDoSEventsResponse describeDDoSEventsWithOptions(DescribeDDoSEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDoSEvents"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDoSEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询DDoS事件</p>
     * 
     * @param request DescribeDDoSEventsRequest
     * @return DescribeDDoSEventsResponse
     */
    public DescribeDDoSEventsResponse describeDDoSEvents(DescribeDDoSEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDoSEventsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDDosAllEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDosAllEventListResponse
     */
    public DescribeDDosAllEventListResponse describeDDosAllEventListWithOptions(DescribeDDosAllEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
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
            new TeaPair("action", "DescribeDDosAllEventList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDosAllEventListResponse());
    }

    /**
     * @param request DescribeDDosAllEventListRequest
     * @return DescribeDDosAllEventListResponse
     */
    public DescribeDDosAllEventListResponse describeDDosAllEventList(DescribeDDosAllEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDosAllEventListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDDosEventAreaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDosEventAreaResponse
     */
    public DescribeDDosEventAreaResponse describeDDosEventAreaWithOptions(DescribeDDosEventAreaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            query.put("Range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDosEventArea"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDosEventAreaResponse());
    }

    /**
     * @param request DescribeDDosEventAreaRequest
     * @return DescribeDDosEventAreaResponse
     */
    public DescribeDDosEventAreaResponse describeDDosEventArea(DescribeDDosEventAreaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDosEventAreaWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDDosEventAttackTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDosEventAttackTypeResponse
     */
    public DescribeDDosEventAttackTypeResponse describeDDosEventAttackTypeWithOptions(DescribeDDosEventAttackTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDosEventAttackType"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDosEventAttackTypeResponse());
    }

    /**
     * @param request DescribeDDosEventAttackTypeRequest
     * @return DescribeDDosEventAttackTypeResponse
     */
    public DescribeDDosEventAttackTypeResponse describeDDosEventAttackType(DescribeDDosEventAttackTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDosEventAttackTypeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDDosEventIspRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDosEventIspResponse
     */
    public DescribeDDosEventIspResponse describeDDosEventIspWithOptions(DescribeDDosEventIspRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            query.put("Range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDosEventIsp"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDosEventIspResponse());
    }

    /**
     * @param request DescribeDDosEventIspRequest
     * @return DescribeDDosEventIspResponse
     */
    public DescribeDDosEventIspResponse describeDDosEventIsp(DescribeDDosEventIspRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDosEventIspWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDDosEventMaxRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDosEventMaxResponse
     */
    public DescribeDDosEventMaxResponse describeDDosEventMaxWithOptions(DescribeDDosEventMaxRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDosEventMax"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDosEventMaxResponse());
    }

    /**
     * @param request DescribeDDosEventMaxRequest
     * @return DescribeDDosEventMaxResponse
     */
    public DescribeDDosEventMaxResponse describeDDosEventMax(DescribeDDosEventMaxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDosEventMaxWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDDosEventSrcIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDosEventSrcIpResponse
     */
    public DescribeDDosEventSrcIpResponse describeDDosEventSrcIpWithOptions(DescribeDDosEventSrcIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            query.put("Range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDosEventSrcIp"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDosEventSrcIpResponse());
    }

    /**
     * @param request DescribeDDosEventSrcIpRequest
     * @return DescribeDDosEventSrcIpResponse
     */
    public DescribeDDosEventSrcIpResponse describeDDosEventSrcIp(DescribeDDosEventSrcIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDosEventSrcIpWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDefenseCountStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseCountStatisticsResponse
     */
    public DescribeDefenseCountStatisticsResponse describeDefenseCountStatisticsWithOptions(DescribeDefenseCountStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseCountStatistics"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseCountStatisticsResponse());
    }

    /**
     * @param request DescribeDefenseCountStatisticsRequest
     * @return DescribeDefenseCountStatisticsResponse
     */
    public DescribeDefenseCountStatisticsResponse describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseCountStatisticsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDefenseRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseRecordsResponse
     */
    public DescribeDefenseRecordsResponse describeDefenseRecordsWithOptions(DescribeDefenseRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseRecords"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseRecordsResponse());
    }

    /**
     * @param request DescribeDefenseRecordsRequest
     * @return DescribeDefenseRecordsResponse
     */
    public DescribeDefenseRecordsResponse describeDefenseRecords(DescribeDefenseRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询目的端口事件</p>
     * 
     * @param request DescribeDestinationPortEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDestinationPortEventResponse
     */
    public DescribeDestinationPortEventResponse describeDestinationPortEventWithOptions(DescribeDestinationPortEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            query.put("Range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDestinationPortEvent"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDestinationPortEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询目的端口事件</p>
     * 
     * @param request DescribeDestinationPortEventRequest
     * @return DescribeDestinationPortEventResponse
     */
    public DescribeDestinationPortEventResponse describeDestinationPortEvent(DescribeDestinationPortEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDestinationPortEventWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainAttackEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainAttackEventsResponse
     */
    public DescribeDomainAttackEventsResponse describeDomainAttackEventsWithOptions(DescribeDomainAttackEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainAttackEvents"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainAttackEventsResponse());
    }

    /**
     * @param request DescribeDomainAttackEventsRequest
     * @return DescribeDomainAttackEventsResponse
     */
    public DescribeDomainAttackEventsResponse describeDomainAttackEvents(DescribeDomainAttackEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainAttackEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名业务带宽流量</p>
     * 
     * @param request DescribeDomainBpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainBpsResponse
     */
    public DescribeDomainBpsResponse describeDomainBpsWithOptions(DescribeDomainBpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBps"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名业务带宽流量</p>
     * 
     * @param request DescribeDomainBpsRequest
     * @return DescribeDomainBpsResponse
     */
    public DescribeDomainBpsResponse describeDomainBps(DescribeDomainBpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainBpsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainCcProtectSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainCcProtectSwitchResponse
     */
    public DescribeDomainCcProtectSwitchResponse describeDomainCcProtectSwitchWithOptions(DescribeDomainCcProtectSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCcProtectSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCcProtectSwitchResponse());
    }

    /**
     * @param request DescribeDomainCcProtectSwitchRequest
     * @return DescribeDomainCcProtectSwitchResponse
     */
    public DescribeDomainCcProtectSwitchResponse describeDomainCcProtectSwitch(DescribeDomainCcProtectSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainCcProtectSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询HTTP2指纹</p>
     * 
     * @param request DescribeDomainH2FingerprintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainH2FingerprintResponse
     */
    public DescribeDomainH2FingerprintResponse describeDomainH2FingerprintWithOptions(DescribeDomainH2FingerprintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainH2Fingerprint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainH2FingerprintResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询HTTP2指纹</p>
     * 
     * @param request DescribeDomainH2FingerprintRequest
     * @return DescribeDomainH2FingerprintResponse
     */
    public DescribeDomainH2FingerprintResponse describeDomainH2Fingerprint(DescribeDomainH2FingerprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainH2FingerprintWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainOverviewResponse
     */
    public DescribeDomainOverviewResponse describeDomainOverviewWithOptions(DescribeDomainOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainOverview"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainOverviewResponse());
    }

    /**
     * @param request DescribeDomainOverviewRequest
     * @return DescribeDomainOverviewResponse
     */
    public DescribeDomainOverviewResponse describeDomainOverview(DescribeDomainOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainOverviewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainQPSListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainQPSListResponse
     */
    public DescribeDomainQPSListResponse describeDomainQPSListWithOptions(DescribeDomainQPSListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainQPSList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainQPSListResponse());
    }

    /**
     * @param request DescribeDomainQPSListRequest
     * @return DescribeDomainQPSListResponse
     */
    public DescribeDomainQPSListResponse describeDomainQPSList(DescribeDomainQPSListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainQPSListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainResourceResponse
     */
    public DescribeDomainResourceResponse describeDomainResourceWithOptions(DescribeDomainResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDomainPattern)) {
            query.put("QueryDomainPattern", request.queryDomainPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainResource"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResourceResponse());
    }

    /**
     * @param request DescribeDomainResourceRequest
     * @return DescribeDomainResourceResponse
     */
    public DescribeDomainResourceResponse describeDomainResource(DescribeDomainResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全概要属性开关</p>
     * 
     * @param request DescribeDomainSecurityProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainSecurityProfileResponse
     */
    public DescribeDomainSecurityProfileResponse describeDomainSecurityProfileWithOptions(DescribeDomainSecurityProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSecurityProfile"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSecurityProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全概要属性开关</p>
     * 
     * @param request DescribeDomainSecurityProfileRequest
     * @return DescribeDomainSecurityProfileResponse
     */
    public DescribeDomainSecurityProfileResponse describeDomainSecurityProfile(DescribeDomainSecurityProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainSecurityProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询各类响应状态码统计信息</p>
     * 
     * @param request DescribeDomainStatusCodeCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainStatusCodeCountResponse
     */
    public DescribeDomainStatusCodeCountResponse describeDomainStatusCodeCountWithOptions(DescribeDomainStatusCodeCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainStatusCodeCount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainStatusCodeCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询各类响应状态码统计信息</p>
     * 
     * @param request DescribeDomainStatusCodeCountRequest
     * @return DescribeDomainStatusCodeCountResponse
     */
    public DescribeDomainStatusCodeCountResponse describeDomainStatusCodeCount(DescribeDomainStatusCodeCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainStatusCodeCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询网站业务的响应状态码统计信息</p>
     * 
     * @param request DescribeDomainStatusCodeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainStatusCodeListResponse
     */
    public DescribeDomainStatusCodeListResponse describeDomainStatusCodeListWithOptions(DescribeDomainStatusCodeListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainStatusCodeList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainStatusCodeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询网站业务的响应状态码统计信息</p>
     * 
     * @param request DescribeDomainStatusCodeListRequest
     * @return DescribeDomainStatusCodeListResponse
     */
    public DescribeDomainStatusCodeListResponse describeDomainStatusCodeList(DescribeDomainStatusCodeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainStatusCodeListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainTopAttackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopAttackListResponse
     */
    public DescribeDomainTopAttackListResponse describeDomainTopAttackListWithOptions(DescribeDomainTopAttackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopAttackList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopAttackListResponse());
    }

    /**
     * @param request DescribeDomainTopAttackListRequest
     * @return DescribeDomainTopAttackListResponse
     */
    public DescribeDomainTopAttackListResponse describeDomainTopAttackList(DescribeDomainTopAttackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopAttackListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名 top fingerprint</p>
     * 
     * @param request DescribeDomainTopFingerprintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopFingerprintResponse
     */
    public DescribeDomainTopFingerprintResponse describeDomainTopFingerprintWithOptions(DescribeDomainTopFingerprintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopFingerprint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopFingerprintResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名 top fingerprint</p>
     * 
     * @param request DescribeDomainTopFingerprintRequest
     * @return DescribeDomainTopFingerprintResponse
     */
    public DescribeDomainTopFingerprintResponse describeDomainTopFingerprint(DescribeDomainTopFingerprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopFingerprintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名 top HttpMethod</p>
     * 
     * @param request DescribeDomainTopHttpMethodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopHttpMethodResponse
     */
    public DescribeDomainTopHttpMethodResponse describeDomainTopHttpMethodWithOptions(DescribeDomainTopHttpMethodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopHttpMethod"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopHttpMethodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名 top HttpMethod</p>
     * 
     * @param request DescribeDomainTopHttpMethodRequest
     * @return DescribeDomainTopHttpMethodResponse
     */
    public DescribeDomainTopHttpMethodResponse describeDomainTopHttpMethod(DescribeDomainTopHttpMethodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopHttpMethodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名top referer</p>
     * 
     * @param request DescribeDomainTopRefererRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopRefererResponse
     */
    public DescribeDomainTopRefererResponse describeDomainTopRefererWithOptions(DescribeDomainTopRefererRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopReferer"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopRefererResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名top referer</p>
     * 
     * @param request DescribeDomainTopRefererRequest
     * @return DescribeDomainTopRefererResponse
     */
    public DescribeDomainTopRefererResponse describeDomainTopReferer(DescribeDomainTopRefererRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopRefererWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询top user agent</p>
     * 
     * @param request DescribeDomainTopUserAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopUserAgentResponse
     */
    public DescribeDomainTopUserAgentResponse describeDomainTopUserAgentWithOptions(DescribeDomainTopUserAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopUserAgent"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopUserAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询top user agent</p>
     * 
     * @param request DescribeDomainTopUserAgentRequest
     * @return DescribeDomainTopUserAgentResponse
     */
    public DescribeDomainTopUserAgentResponse describeDomainTopUserAgent(DescribeDomainTopUserAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopUserAgentWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainViewSourceCountriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainViewSourceCountriesResponse
     */
    public DescribeDomainViewSourceCountriesResponse describeDomainViewSourceCountriesWithOptions(DescribeDomainViewSourceCountriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainViewSourceCountries"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainViewSourceCountriesResponse());
    }

    /**
     * @param request DescribeDomainViewSourceCountriesRequest
     * @return DescribeDomainViewSourceCountriesResponse
     */
    public DescribeDomainViewSourceCountriesResponse describeDomainViewSourceCountries(DescribeDomainViewSourceCountriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainViewSourceCountriesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainViewSourceProvincesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainViewSourceProvincesResponse
     */
    public DescribeDomainViewSourceProvincesResponse describeDomainViewSourceProvincesWithOptions(DescribeDomainViewSourceProvincesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainViewSourceProvinces"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainViewSourceProvincesResponse());
    }

    /**
     * @param request DescribeDomainViewSourceProvincesRequest
     * @return DescribeDomainViewSourceProvincesResponse
     */
    public DescribeDomainViewSourceProvincesResponse describeDomainViewSourceProvinces(DescribeDomainViewSourceProvincesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainViewSourceProvincesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainViewTopCostTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainViewTopCostTimeResponse
     */
    public DescribeDomainViewTopCostTimeResponse describeDomainViewTopCostTimeWithOptions(DescribeDomainViewTopCostTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.top)) {
            query.put("Top", request.top);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainViewTopCostTime"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainViewTopCostTimeResponse());
    }

    /**
     * @param request DescribeDomainViewTopCostTimeRequest
     * @return DescribeDomainViewTopCostTimeResponse
     */
    public DescribeDomainViewTopCostTimeResponse describeDomainViewTopCostTime(DescribeDomainViewTopCostTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainViewTopCostTimeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainViewTopUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainViewTopUrlResponse
     */
    public DescribeDomainViewTopUrlResponse describeDomainViewTopUrlWithOptions(DescribeDomainViewTopUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inerval)) {
            query.put("Inerval", request.inerval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.top)) {
            query.put("Top", request.top);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainViewTopUrl"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainViewTopUrlResponse());
    }

    /**
     * @param request DescribeDomainViewTopUrlRequest
     * @return DescribeDomainViewTopUrlResponse
     */
    public DescribeDomainViewTopUrlResponse describeDomainViewTopUrl(DescribeDomainViewTopUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainViewTopUrlWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomains"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsResponse());
    }

    /**
     * @param request DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeElasticBandwidthSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticBandwidthSpecResponse
     */
    public DescribeElasticBandwidthSpecResponse describeElasticBandwidthSpecWithOptions(DescribeElasticBandwidthSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticBandwidthSpec"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticBandwidthSpecResponse());
    }

    /**
     * @param request DescribeElasticBandwidthSpecRequest
     * @return DescribeElasticBandwidthSpecResponse
     */
    public DescribeElasticBandwidthSpecResponse describeElasticBandwidthSpec(DescribeElasticBandwidthSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticBandwidthSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>高防弹性qps曲线图</p>
     * 
     * @param request DescribeElasticQpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticQpsResponse
     */
    public DescribeElasticQpsResponse describeElasticQpsWithOptions(DescribeElasticQpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticQps"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticQpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>高防弹性qps曲线图</p>
     * 
     * @param request DescribeElasticQpsRequest
     * @return DescribeElasticQpsResponse
     */
    public DescribeElasticQpsResponse describeElasticQps(DescribeElasticQpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticQpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询qps日95流量图</p>
     * 
     * @param request DescribeElasticQpsRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticQpsRecordResponse
     */
    public DescribeElasticQpsRecordResponse describeElasticQpsRecordWithOptions(DescribeElasticQpsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticQpsRecord"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticQpsRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询qps日95流量图</p>
     * 
     * @param request DescribeElasticQpsRecordRequest
     * @return DescribeElasticQpsRecordResponse
     */
    public DescribeElasticQpsRecordResponse describeElasticQpsRecord(DescribeElasticQpsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticQpsRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取header</p>
     * 
     * @param request DescribeHeadersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHeadersResponse
     */
    public DescribeHeadersResponse describeHeadersWithOptions(DescribeHeadersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHeaders"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHeadersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取header</p>
     * 
     * @param request DescribeHeadersRequest
     * @return DescribeHeadersResponse
     */
    public DescribeHeadersResponse describeHeaders(DescribeHeadersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHeadersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询健康检查列表</p>
     * 
     * @param request DescribeHealthCheckListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHealthCheckListResponse
     */
    public DescribeHealthCheckListResponse describeHealthCheckListWithOptions(DescribeHealthCheckListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkRules)) {
            query.put("NetworkRules", request.networkRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHealthCheckList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHealthCheckListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询健康检查列表</p>
     * 
     * @param request DescribeHealthCheckListRequest
     * @return DescribeHealthCheckListResponse
     */
    public DescribeHealthCheckListResponse describeHealthCheckList(DescribeHealthCheckListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthCheckListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeHealthCheckStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHealthCheckStatusResponse
     */
    public DescribeHealthCheckStatusResponse describeHealthCheckStatusWithOptions(DescribeHealthCheckStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkRules)) {
            query.put("NetworkRules", request.networkRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHealthCheckStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHealthCheckStatusResponse());
    }

    /**
     * @param request DescribeHealthCheckStatusRequest
     * @return DescribeHealthCheckStatusResponse
     */
    public DescribeHealthCheckStatusResponse describeHealthCheckStatus(DescribeHealthCheckStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthCheckStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDetailsResponse
     */
    public DescribeInstanceDetailsResponse describeInstanceDetailsWithOptions(DescribeInstanceDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceDetails"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDetailsResponse());
    }

    /**
     * @param request DescribeInstanceDetailsRequest
     * @return DescribeInstanceDetailsResponse
     */
    public DescribeInstanceDetailsResponse describeInstanceDetails(DescribeInstanceDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例扩展信息用户terraform</p>
     * 
     * @param request DescribeInstanceExtRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceExtResponse
     */
    public DescribeInstanceExtResponse describeInstanceExtWithOptions(DescribeInstanceExtRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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
            new TeaPair("action", "DescribeInstanceExt"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceExtResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例扩展信息用户terraform</p>
     * 
     * @param request DescribeInstanceExtRequest
     * @return DescribeInstanceExtResponse
     */
    public DescribeInstanceExtResponse describeInstanceExt(DescribeInstanceExtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceExtWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceIdsResponse
     */
    public DescribeInstanceIdsResponse describeInstanceIdsWithOptions(DescribeInstanceIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceIds"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceIdsResponse());
    }

    /**
     * @param request DescribeInstanceIdsRequest
     * @return DescribeInstanceIdsResponse
     */
    public DescribeInstanceIdsResponse describeInstanceIds(DescribeInstanceIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceIdsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSpecsResponse
     */
    public DescribeInstanceSpecsResponse describeInstanceSpecsWithOptions(DescribeInstanceSpecsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSpecs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSpecsResponse());
    }

    /**
     * @param request DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     */
    public DescribeInstanceSpecsResponse describeInstanceSpecs(DescribeInstanceSpecsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSpecsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceStatisticsResponse
     */
    public DescribeInstanceStatisticsResponse describeInstanceStatisticsWithOptions(DescribeInstanceStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceStatistics"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceStatisticsResponse());
    }

    /**
     * @param request DescribeInstanceStatisticsRequest
     * @return DescribeInstanceStatisticsResponse
     */
    public DescribeInstanceStatisticsResponse describeInstanceStatistics(DescribeInstanceStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceStatisticsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceStatusResponse
     */
    public DescribeInstanceStatusResponse describeInstanceStatusWithOptions(DescribeInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceStatusResponse());
    }

    /**
     * @param request DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
     */
    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例列表</p>
     * 
     * @param request DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireEndTime)) {
            query.put("ExpireEndTime", request.expireEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireStartTime)) {
            query.put("ExpireStartTime", request.expireStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2020-01-01"),
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
     * <b>summary</b> : 
     * <p>查询实例列表</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>展示全局模板规则</p>
     * 
     * @param request DescribeL7GlobalRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeL7GlobalRuleResponse
     */
    public DescribeL7GlobalRuleResponse describeL7GlobalRuleWithOptions(DescribeL7GlobalRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeL7GlobalRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeL7GlobalRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>展示全局模板规则</p>
     * 
     * @param request DescribeL7GlobalRuleRequest
     * @return DescribeL7GlobalRuleResponse
     */
    public DescribeL7GlobalRuleResponse describeL7GlobalRule(DescribeL7GlobalRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeL7GlobalRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名接入回源策略</p>
     * 
     * @param request DescribeL7RsPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeL7RsPolicyResponse
     */
    public DescribeL7RsPolicyResponse describeL7RsPolicyWithOptions(DescribeL7RsPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeL7RsPolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeL7RsPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名接入回源策略</p>
     * 
     * @param request DescribeL7RsPolicyRequest
     * @return DescribeL7RsPolicyResponse
     */
    public DescribeL7RsPolicyResponse describeL7RsPolicy(DescribeL7RsPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeL7RsPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询长连接</p>
     * 
     * @param request DescribeL7UsKeepaliveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeL7UsKeepaliveResponse
     */
    public DescribeL7UsKeepaliveResponse describeL7UsKeepaliveWithOptions(DescribeL7UsKeepaliveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeL7UsKeepalive"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeL7UsKeepaliveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询长连接</p>
     * 
     * @param request DescribeL7UsKeepaliveRequest
     * @return DescribeL7UsKeepaliveResponse
     */
    public DescribeL7UsKeepaliveResponse describeL7UsKeepalive(DescribeL7UsKeepaliveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeL7UsKeepaliveWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLayer4RulePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLayer4RulePolicyResponse
     */
    public DescribeLayer4RulePolicyResponse describeLayer4RulePolicyWithOptions(DescribeLayer4RulePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listeners)) {
            query.put("Listeners", request.listeners);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLayer4RulePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLayer4RulePolicyResponse());
    }

    /**
     * @param request DescribeLayer4RulePolicyRequest
     * @return DescribeLayer4RulePolicyResponse
     */
    public DescribeLayer4RulePolicyResponse describeLayer4RulePolicy(DescribeLayer4RulePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLayer4RulePolicyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLogStoreExistStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogStoreExistStatusResponse
     */
    public DescribeLogStoreExistStatusResponse describeLogStoreExistStatusWithOptions(DescribeLogStoreExistStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogStoreExistStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogStoreExistStatusResponse());
    }

    /**
     * @param request DescribeLogStoreExistStatusRequest
     * @return DescribeLogStoreExistStatusResponse
     */
    public DescribeLogStoreExistStatusResponse describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogStoreExistStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeNetworkRegionBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkRegionBlockResponse
     */
    public DescribeNetworkRegionBlockResponse describeNetworkRegionBlockWithOptions(DescribeNetworkRegionBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkRegionBlock"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkRegionBlockResponse());
    }

    /**
     * @param request DescribeNetworkRegionBlockRequest
     * @return DescribeNetworkRegionBlockResponse
     */
    public DescribeNetworkRegionBlockResponse describeNetworkRegionBlock(DescribeNetworkRegionBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkRegionBlockWithOptions(request, runtime);
    }

    /**
     * @param request DescribeNetworkRuleAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkRuleAttributesResponse
     */
    public DescribeNetworkRuleAttributesResponse describeNetworkRuleAttributesWithOptions(DescribeNetworkRuleAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkRules)) {
            query.put("NetworkRules", request.networkRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkRuleAttributes"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkRuleAttributesResponse());
    }

    /**
     * @param request DescribeNetworkRuleAttributesRequest
     * @return DescribeNetworkRuleAttributesResponse
     */
    public DescribeNetworkRuleAttributesResponse describeNetworkRuleAttributes(DescribeNetworkRuleAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkRuleAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口转发规则</p>
     * 
     * @param request DescribeNetworkRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkRulesResponse
     */
    public DescribeNetworkRulesResponse describeNetworkRulesWithOptions(DescribeNetworkRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardProtocol)) {
            query.put("ForwardProtocol", request.forwardProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口转发规则</p>
     * 
     * @param request DescribeNetworkRulesRequest
     * @return DescribeNetworkRulesResponse
     */
    public DescribeNetworkRulesResponse describeNetworkRules(DescribeNetworkRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkRulesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOpEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOpEntitiesResponse
     */
    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityObject)) {
            query.put("EntityObject", request.entityObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOpEntities"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOpEntitiesResponse());
    }

    /**
     * @param request DescribeOpEntitiesRequest
     * @return DescribeOpEntitiesResponse
     */
    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terraform 查询端口</p>
     * 
     * @param request DescribePortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortResponse
     */
    public DescribePortResponse describePortWithOptions(DescribePortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendProtocol)) {
            query.put("FrontendProtocol", request.frontendProtocol);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePort"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terraform 查询端口</p>
     * 
     * @param request DescribePortRequest
     * @return DescribePortResponse
     */
    public DescribePortResponse describePort(DescribePortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口攻击最大峰值</p>
     * 
     * @param request DescribePortAttackMaxFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortAttackMaxFlowResponse
     */
    public DescribePortAttackMaxFlowResponse describePortAttackMaxFlowWithOptions(DescribePortAttackMaxFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortAttackMaxFlow"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortAttackMaxFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口攻击最大峰值</p>
     * 
     * @param request DescribePortAttackMaxFlowRequest
     * @return DescribePortAttackMaxFlowResponse
     */
    public DescribePortAttackMaxFlowResponse describePortAttackMaxFlow(DescribePortAttackMaxFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortAttackMaxFlowWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortAutoCcStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortAutoCcStatusResponse
     */
    public DescribePortAutoCcStatusResponse describePortAutoCcStatusWithOptions(DescribePortAutoCcStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortAutoCcStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortAutoCcStatusResponse());
    }

    /**
     * @param request DescribePortAutoCcStatusRequest
     * @return DescribePortAutoCcStatusResponse
     */
    public DescribePortAutoCcStatusResponse describePortAutoCcStatus(DescribePortAutoCcStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortAutoCcStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortCcAttackTopIPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortCcAttackTopIPResponse
     */
    public DescribePortCcAttackTopIPResponse describePortCcAttackTopIPWithOptions(DescribePortCcAttackTopIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortCcAttackTopIP"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortCcAttackTopIPResponse());
    }

    /**
     * @param request DescribePortCcAttackTopIPRequest
     * @return DescribePortCcAttackTopIPResponse
     */
    public DescribePortCcAttackTopIPResponse describePortCcAttackTopIP(DescribePortCcAttackTopIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortCcAttackTopIPWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口连接数统计</p>
     * 
     * @param request DescribePortConnsCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortConnsCountResponse
     */
    public DescribePortConnsCountResponse describePortConnsCountWithOptions(DescribePortConnsCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortConnsCount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortConnsCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口连接数统计</p>
     * 
     * @param request DescribePortConnsCountRequest
     * @return DescribePortConnsCountResponse
     */
    public DescribePortConnsCountResponse describePortConnsCount(DescribePortConnsCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortConnsCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口连接列表</p>
     * 
     * @param request DescribePortConnsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortConnsListResponse
     */
    public DescribePortConnsListResponse describePortConnsListWithOptions(DescribePortConnsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortConnsList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortConnsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询端口连接列表</p>
     * 
     * @param request DescribePortConnsListRequest
     * @return DescribePortConnsListResponse
     */
    public DescribePortConnsListResponse describePortConnsList(DescribePortConnsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortConnsListWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortFlowListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortFlowListResponse
     */
    public DescribePortFlowListResponse describePortFlowListWithOptions(DescribePortFlowListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortFlowList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortFlowListResponse());
    }

    /**
     * @param request DescribePortFlowListRequest
     * @return DescribePortFlowListResponse
     */
    public DescribePortFlowListResponse describePortFlowList(DescribePortFlowListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortFlowListWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortMaxConnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortMaxConnsResponse
     */
    public DescribePortMaxConnsResponse describePortMaxConnsWithOptions(DescribePortMaxConnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortMaxConns"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortMaxConnsResponse());
    }

    /**
     * @param request DescribePortMaxConnsRequest
     * @return DescribePortMaxConnsResponse
     */
    public DescribePortMaxConnsResponse describePortMaxConns(DescribePortMaxConnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortMaxConnsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortViewSourceCountriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortViewSourceCountriesResponse
     */
    public DescribePortViewSourceCountriesResponse describePortViewSourceCountriesWithOptions(DescribePortViewSourceCountriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortViewSourceCountries"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortViewSourceCountriesResponse());
    }

    /**
     * @param request DescribePortViewSourceCountriesRequest
     * @return DescribePortViewSourceCountriesResponse
     */
    public DescribePortViewSourceCountriesResponse describePortViewSourceCountries(DescribePortViewSourceCountriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortViewSourceCountriesWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortViewSourceIspsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortViewSourceIspsResponse
     */
    public DescribePortViewSourceIspsResponse describePortViewSourceIspsWithOptions(DescribePortViewSourceIspsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortViewSourceIsps"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortViewSourceIspsResponse());
    }

    /**
     * @param request DescribePortViewSourceIspsRequest
     * @return DescribePortViewSourceIspsResponse
     */
    public DescribePortViewSourceIspsResponse describePortViewSourceIsps(DescribePortViewSourceIspsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortViewSourceIspsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePortViewSourceProvincesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePortViewSourceProvincesResponse
     */
    public DescribePortViewSourceProvincesResponse describePortViewSourceProvincesWithOptions(DescribePortViewSourceProvincesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePortViewSourceProvinces"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePortViewSourceProvincesResponse());
    }

    /**
     * @param request DescribePortViewSourceProvincesRequest
     * @return DescribePortViewSourceProvincesResponse
     */
    public DescribePortViewSourceProvincesResponse describePortViewSourceProvinces(DescribePortViewSourceProvincesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePortViewSourceProvincesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSceneDefenseObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneDefenseObjectsResponse
     */
    public DescribeSceneDefenseObjectsResponse describeSceneDefenseObjectsWithOptions(DescribeSceneDefenseObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneDefenseObjects"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneDefenseObjectsResponse());
    }

    /**
     * @param request DescribeSceneDefenseObjectsRequest
     * @return DescribeSceneDefenseObjectsResponse
     */
    public DescribeSceneDefenseObjectsResponse describeSceneDefenseObjects(DescribeSceneDefenseObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneDefenseObjectsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSceneDefensePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneDefensePoliciesResponse
     */
    public DescribeSceneDefensePoliciesResponse describeSceneDefensePoliciesWithOptions(DescribeSceneDefensePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneDefensePolicies"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneDefensePoliciesResponse());
    }

    /**
     * @param request DescribeSceneDefensePoliciesRequest
     * @return DescribeSceneDefensePoliciesResponse
     */
    public DescribeSceneDefensePoliciesResponse describeSceneDefensePolicies(DescribeSceneDefensePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneDefensePoliciesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSchedulerRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSchedulerRulesResponse
     */
    public DescribeSchedulerRulesResponse describeSchedulerRulesWithOptions(DescribeSchedulerRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSchedulerRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSchedulerRulesResponse());
    }

    /**
     * @param request DescribeSchedulerRulesRequest
     * @return DescribeSchedulerRulesResponse
     */
    public DescribeSchedulerRulesResponse describeSchedulerRules(DescribeSchedulerRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSchedulerRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询目的限速事件列表</p>
     * 
     * @param request DescribeSlaEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlaEventListResponse
     */
    public DescribeSlaEventListResponse describeSlaEventListWithOptions(DescribeSlaEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlaEventList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlaEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询目的限速事件列表</p>
     * 
     * @param request DescribeSlaEventListRequest
     * @return DescribeSlaEventListResponse
     */
    public DescribeSlaEventListResponse describeSlaEventList(DescribeSlaEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlaEventListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSlsAuthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsAuthStatusResponse
     */
    public DescribeSlsAuthStatusResponse describeSlsAuthStatusWithOptions(DescribeSlsAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsAuthStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsAuthStatusResponse());
    }

    /**
     * @param request DescribeSlsAuthStatusRequest
     * @return DescribeSlsAuthStatusResponse
     */
    public DescribeSlsAuthStatusResponse describeSlsAuthStatus(DescribeSlsAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsAuthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询全量日志信息</p>
     * 
     * @param request DescribeSlsLogstoreInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsLogstoreInfoResponse
     */
    public DescribeSlsLogstoreInfoResponse describeSlsLogstoreInfoWithOptions(DescribeSlsLogstoreInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsLogstoreInfo"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsLogstoreInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询全量日志信息</p>
     * 
     * @param request DescribeSlsLogstoreInfoRequest
     * @return DescribeSlsLogstoreInfoResponse
     */
    public DescribeSlsLogstoreInfoResponse describeSlsLogstoreInfo(DescribeSlsLogstoreInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsLogstoreInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSlsOpenStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsOpenStatusResponse
     */
    public DescribeSlsOpenStatusResponse describeSlsOpenStatusWithOptions(DescribeSlsOpenStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsOpenStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsOpenStatusResponse());
    }

    /**
     * @param request DescribeSlsOpenStatusRequest
     * @return DescribeSlsOpenStatusResponse
     */
    public DescribeSlsOpenStatusResponse describeSlsOpenStatus(DescribeSlsOpenStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsOpenStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeStsGrantStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStsGrantStatusResponse
     */
    public DescribeStsGrantStatusResponse describeStsGrantStatusWithOptions(DescribeStsGrantStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStsGrantStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStsGrantStatusResponse());
    }

    /**
     * @param request DescribeStsGrantStatusRequest
     * @return DescribeStsGrantStatusResponse
     */
    public DescribeStsGrantStatusResponse describeStsGrantStatus(DescribeStsGrantStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStsGrantStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询系统日志</p>
     * 
     * @param request DescribeSystemLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemLogResponse
     */
    public DescribeSystemLogResponse describeSystemLogWithOptions(DescribeSystemLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityObject)) {
            query.put("EntityObject", request.entityObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
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
            new TeaPair("action", "DescribeSystemLog"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询系统日志</p>
     * 
     * @param request DescribeSystemLogRequest
     * @return DescribeSystemLogResponse
     */
    public DescribeSystemLogResponse describeSystemLog(DescribeSystemLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemLogWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagKeysResponse
     */
    public DescribeTagKeysResponse describeTagKeysWithOptions(DescribeTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagKeys"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagKeysResponse());
    }

    /**
     * @param request DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
    public DescribeTagKeysResponse describeTagKeys(DescribeTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagKeysWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagResourcesResponse
     */
    public DescribeTagResourcesResponse describeTagResourcesWithOptions(DescribeTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagResourcesResponse());
    }

    /**
     * @param request DescribeTagResourcesRequest
     * @return DescribeTagResourcesResponse
     */
    public DescribeTagResourcesResponse describeTagResources(DescribeTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新峰值接口</p>
     * 
     * @param request DescribeTotalAttackMaxFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTotalAttackMaxFlowResponse
     */
    public DescribeTotalAttackMaxFlowResponse describeTotalAttackMaxFlowWithOptions(DescribeTotalAttackMaxFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTotalAttackMaxFlow"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTotalAttackMaxFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新峰值接口</p>
     * 
     * @param request DescribeTotalAttackMaxFlowRequest
     * @return DescribeTotalAttackMaxFlowResponse
     */
    public DescribeTotalAttackMaxFlowResponse describeTotalAttackMaxFlow(DescribeTotalAttackMaxFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTotalAttackMaxFlowWithOptions(request, runtime);
    }

    /**
     * @param request DescribeUdpReflectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUdpReflectResponse
     */
    public DescribeUdpReflectResponse describeUdpReflectWithOptions(DescribeUdpReflectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUdpReflect"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUdpReflectResponse());
    }

    /**
     * @param request DescribeUdpReflectRequest
     * @return DescribeUdpReflectResponse
     */
    public DescribeUdpReflectResponse describeUdpReflect(DescribeUdpReflectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUdpReflectWithOptions(request, runtime);
    }

    /**
     * @param request DescribeUnBlackholeCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUnBlackholeCountResponse
     */
    public DescribeUnBlackholeCountResponse describeUnBlackholeCountWithOptions(DescribeUnBlackholeCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUnBlackholeCount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUnBlackholeCountResponse());
    }

    /**
     * @param request DescribeUnBlackholeCountRequest
     * @return DescribeUnBlackholeCountResponse
     */
    public DescribeUnBlackholeCountResponse describeUnBlackholeCount(DescribeUnBlackholeCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnBlackholeCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询解封次数</p>
     * 
     * @param request DescribeUnBlockCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUnBlockCountResponse
     */
    public DescribeUnBlockCountResponse describeUnBlockCountWithOptions(DescribeUnBlockCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUnBlockCount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUnBlockCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询解封次数</p>
     * 
     * @param request DescribeUnBlockCountRequest
     * @return DescribeUnBlockCountResponse
     */
    public DescribeUnBlockCountResponse describeUnBlockCount(DescribeUnBlockCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnBlockCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名的全量日志分发状态</p>
     * 
     * @param request DescribeWebAccessLogDispatchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebAccessLogDispatchStatusResponse
     */
    public DescribeWebAccessLogDispatchStatusResponse describeWebAccessLogDispatchStatusWithOptions(DescribeWebAccessLogDispatchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DescribeWebAccessLogDispatchStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebAccessLogDispatchStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名的全量日志分发状态</p>
     * 
     * @param request DescribeWebAccessLogDispatchStatusRequest
     * @return DescribeWebAccessLogDispatchStatusResponse
     */
    public DescribeWebAccessLogDispatchStatusResponse describeWebAccessLogDispatchStatus(DescribeWebAccessLogDispatchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebAccessLogDispatchStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebAccessLogEmptyCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebAccessLogEmptyCountResponse
     */
    public DescribeWebAccessLogEmptyCountResponse describeWebAccessLogEmptyCountWithOptions(DescribeWebAccessLogEmptyCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebAccessLogEmptyCount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebAccessLogEmptyCountResponse());
    }

    /**
     * @param request DescribeWebAccessLogEmptyCountRequest
     * @return DescribeWebAccessLogEmptyCountResponse
     */
    public DescribeWebAccessLogEmptyCountResponse describeWebAccessLogEmptyCount(DescribeWebAccessLogEmptyCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebAccessLogEmptyCountWithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebAccessLogStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebAccessLogStatusResponse
     */
    public DescribeWebAccessLogStatusResponse describeWebAccessLogStatusWithOptions(DescribeWebAccessLogStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebAccessLogStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebAccessLogStatusResponse());
    }

    /**
     * @param request DescribeWebAccessLogStatusRequest
     * @return DescribeWebAccessLogStatusResponse
     */
    public DescribeWebAccessLogStatusResponse describeWebAccessLogStatus(DescribeWebAccessLogStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebAccessLogStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebAccessModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebAccessModeResponse
     */
    public DescribeWebAccessModeResponse describeWebAccessModeWithOptions(DescribeWebAccessModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebAccessMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebAccessModeResponse());
    }

    /**
     * @param request DescribeWebAccessModeRequest
     * @return DescribeWebAccessModeResponse
     */
    public DescribeWebAccessModeResponse describeWebAccessMode(DescribeWebAccessModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebAccessModeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebAreaBlockConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebAreaBlockConfigsResponse
     */
    public DescribeWebAreaBlockConfigsResponse describeWebAreaBlockConfigsWithOptions(DescribeWebAreaBlockConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebAreaBlockConfigs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebAreaBlockConfigsResponse());
    }

    /**
     * @param request DescribeWebAreaBlockConfigsRequest
     * @return DescribeWebAreaBlockConfigsResponse
     */
    public DescribeWebAreaBlockConfigsResponse describeWebAreaBlockConfigs(DescribeWebAreaBlockConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebAreaBlockConfigsWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeWebCCRules is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.
     * 
     * @param request DescribeWebCCRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebCCRulesResponse
     */
    @Deprecated
    // Deprecated
    public DescribeWebCCRulesResponse describeWebCCRulesWithOptions(DescribeWebCCRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
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
            new TeaPair("action", "DescribeWebCCRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebCCRulesResponse());
    }

    /**
     * @deprecated OpenAPI DescribeWebCCRules is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.
     * 
     * @param request DescribeWebCCRulesRequest
     * @return DescribeWebCCRulesResponse
     */
    @Deprecated
    // Deprecated
    public DescribeWebCCRulesResponse describeWebCCRules(DescribeWebCCRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebCCRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询新版cc规则</p>
     * 
     * @param request DescribeWebCCRulesV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebCCRulesV2Response
     */
    public DescribeWebCCRulesV2Response describeWebCCRulesV2WithOptions(DescribeWebCCRulesV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebCCRulesV2"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebCCRulesV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>查询新版cc规则</p>
     * 
     * @param request DescribeWebCCRulesV2Request
     * @return DescribeWebCCRulesV2Response
     */
    public DescribeWebCCRulesV2Response describeWebCCRulesV2(DescribeWebCCRulesV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebCCRulesV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebCacheConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebCacheConfigsResponse
     */
    public DescribeWebCacheConfigsResponse describeWebCacheConfigsWithOptions(DescribeWebCacheConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebCacheConfigs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebCacheConfigsResponse());
    }

    /**
     * @param request DescribeWebCacheConfigsRequest
     * @return DescribeWebCacheConfigsResponse
     */
    public DescribeWebCacheConfigsResponse describeWebCacheConfigs(DescribeWebCacheConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebCacheConfigsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebCcProtectSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebCcProtectSwitchResponse
     */
    public DescribeWebCcProtectSwitchResponse describeWebCcProtectSwitchWithOptions(DescribeWebCcProtectSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebCcProtectSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebCcProtectSwitchResponse());
    }

    /**
     * @param request DescribeWebCcProtectSwitchRequest
     * @return DescribeWebCcProtectSwitchResponse
     */
    public DescribeWebCcProtectSwitchResponse describeWebCcProtectSwitch(DescribeWebCcProtectSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebCcProtectSwitchWithOptions(request, runtime);
    }

    /**
     * @param request DescribeWebCustomPortsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebCustomPortsResponse
     */
    public DescribeWebCustomPortsResponse describeWebCustomPortsWithOptions(DescribeWebCustomPortsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebCustomPorts"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebCustomPortsResponse());
    }

    /**
     * @param request DescribeWebCustomPortsRequest
     * @return DescribeWebCustomPortsResponse
     */
    public DescribeWebCustomPortsResponse describeWebCustomPorts(DescribeWebCustomPortsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebCustomPortsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询网站业务关联的DDoS高防实例信息</p>
     * 
     * @param request DescribeWebInstanceRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebInstanceRelationsResponse
     */
    public DescribeWebInstanceRelationsResponse describeWebInstanceRelationsWithOptions(DescribeWebInstanceRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebInstanceRelations"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebInstanceRelationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询网站业务关联的DDoS高防实例信息</p>
     * 
     * @param request DescribeWebInstanceRelationsRequest
     * @return DescribeWebInstanceRelationsResponse
     */
    public DescribeWebInstanceRelationsResponse describeWebInstanceRelations(DescribeWebInstanceRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebInstanceRelationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询网站业务精确访问控制规则</p>
     * 
     * @param request DescribeWebPreciseAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebPreciseAccessRuleResponse
     */
    public DescribeWebPreciseAccessRuleResponse describeWebPreciseAccessRuleWithOptions(DescribeWebPreciseAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebPreciseAccessRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebPreciseAccessRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询网站业务精确访问控制规则</p>
     * 
     * @param request DescribeWebPreciseAccessRuleRequest
     * @return DescribeWebPreciseAccessRuleResponse
     */
    public DescribeWebPreciseAccessRuleResponse describeWebPreciseAccessRule(DescribeWebPreciseAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebPreciseAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报表top IP</p>
     * 
     * @param request DescribeWebReportTopIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebReportTopIpResponse
     */
    public DescribeWebReportTopIpResponse describeWebReportTopIpWithOptions(DescribeWebReportTopIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.top)) {
            query.put("Top", request.top);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebReportTopIp"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebReportTopIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报表top IP</p>
     * 
     * @param request DescribeWebReportTopIpRequest
     * @return DescribeWebReportTopIpResponse
     */
    public DescribeWebReportTopIpResponse describeWebReportTopIp(DescribeWebReportTopIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebReportTopIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名接入规则</p>
     * 
     * @param request DescribeWebRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebRulesResponse
     */
    public DescribeWebRulesResponse describeWebRulesWithOptions(DescribeWebRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cname)) {
            query.put("Cname", request.cname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDomainPattern)) {
            query.put("QueryDomainPattern", request.queryDomainPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebRules"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名接入规则</p>
     * 
     * @param request DescribeWebRulesRequest
     * @return DescribeWebRulesResponse
     */
    public DescribeWebRulesResponse describeWebRules(DescribeWebRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询场景策略防护对象</p>
     * 
     * @param request DetachSceneDefenseObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachSceneDefenseObjectResponse
     */
    public DetachSceneDefenseObjectResponse detachSceneDefenseObjectWithOptions(DetachSceneDefenseObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objects)) {
            query.put("Objects", request.objects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachSceneDefenseObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachSceneDefenseObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询场景策略防护对象</p>
     * 
     * @param request DetachSceneDefenseObjectRequest
     * @return DetachSceneDefenseObjectResponse
     */
    public DetachSceneDefenseObjectResponse detachSceneDefenseObject(DetachSceneDefenseObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachSceneDefenseObjectWithOptions(request, runtime);
    }

    /**
     * @param request DisableSceneDefensePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSceneDefensePolicyResponse
     */
    public DisableSceneDefensePolicyResponse disableSceneDefensePolicyWithOptions(DisableSceneDefensePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSceneDefensePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSceneDefensePolicyResponse());
    }

    /**
     * @param request DisableSceneDefensePolicyRequest
     * @return DisableSceneDefensePolicyResponse
     */
    public DisableSceneDefensePolicyResponse disableSceneDefensePolicy(DisableSceneDefensePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSceneDefensePolicyWithOptions(request, runtime);
    }

    /**
     * @param request DisableWebAccessLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableWebAccessLogConfigResponse
     */
    public DisableWebAccessLogConfigResponse disableWebAccessLogConfigWithOptions(DisableWebAccessLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableWebAccessLogConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableWebAccessLogConfigResponse());
    }

    /**
     * @param request DisableWebAccessLogConfigRequest
     * @return DisableWebAccessLogConfigResponse
     */
    public DisableWebAccessLogConfigResponse disableWebAccessLogConfig(DisableWebAccessLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableWebAccessLogConfigWithOptions(request, runtime);
    }

    /**
     * @param request DisableWebCCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableWebCCResponse
     */
    public DisableWebCCResponse disableWebCCWithOptions(DisableWebCCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableWebCC"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableWebCCResponse());
    }

    /**
     * @param request DisableWebCCRequest
     * @return DisableWebCCResponse
     */
    public DisableWebCCResponse disableWebCC(DisableWebCCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableWebCCWithOptions(request, runtime);
    }

    /**
     * @param request DisableWebCCRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableWebCCRuleResponse
     */
    public DisableWebCCRuleResponse disableWebCCRuleWithOptions(DisableWebCCRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableWebCCRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableWebCCRuleResponse());
    }

    /**
     * @param request DisableWebCCRuleRequest
     * @return DisableWebCCRuleResponse
     */
    public DisableWebCCRuleResponse disableWebCCRule(DisableWebCCRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableWebCCRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询CC黑名单</p>
     * 
     * @param request EmptyAutoCcBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EmptyAutoCcBlacklistResponse
     */
    public EmptyAutoCcBlacklistResponse emptyAutoCcBlacklistWithOptions(EmptyAutoCcBlacklistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EmptyAutoCcBlacklist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EmptyAutoCcBlacklistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询CC黑名单</p>
     * 
     * @param request EmptyAutoCcBlacklistRequest
     * @return EmptyAutoCcBlacklistResponse
     */
    public EmptyAutoCcBlacklistResponse emptyAutoCcBlacklist(EmptyAutoCcBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.emptyAutoCcBlacklistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清空CC白名单</p>
     * 
     * @param request EmptyAutoCcWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EmptyAutoCcWhitelistResponse
     */
    public EmptyAutoCcWhitelistResponse emptyAutoCcWhitelistWithOptions(EmptyAutoCcWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EmptyAutoCcWhitelist"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EmptyAutoCcWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清空CC白名单</p>
     * 
     * @param request EmptyAutoCcWhitelistRequest
     * @return EmptyAutoCcWhitelistResponse
     */
    public EmptyAutoCcWhitelistResponse emptyAutoCcWhitelist(EmptyAutoCcWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.emptyAutoCcWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清空全量日志库</p>
     * 
     * @param request EmptySlsLogstoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EmptySlsLogstoreResponse
     */
    public EmptySlsLogstoreResponse emptySlsLogstoreWithOptions(EmptySlsLogstoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EmptySlsLogstore"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EmptySlsLogstoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清空全量日志库</p>
     * 
     * @param request EmptySlsLogstoreRequest
     * @return EmptySlsLogstoreResponse
     */
    public EmptySlsLogstoreResponse emptySlsLogstore(EmptySlsLogstoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.emptySlsLogstoreWithOptions(request, runtime);
    }

    /**
     * @param request EnableSceneDefensePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSceneDefensePolicyResponse
     */
    public EnableSceneDefensePolicyResponse enableSceneDefensePolicyWithOptions(EnableSceneDefensePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSceneDefensePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSceneDefensePolicyResponse());
    }

    /**
     * @param request EnableSceneDefensePolicyRequest
     * @return EnableSceneDefensePolicyResponse
     */
    public EnableSceneDefensePolicyResponse enableSceneDefensePolicy(EnableSceneDefensePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSceneDefensePolicyWithOptions(request, runtime);
    }

    /**
     * @param request EnableWebAccessLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableWebAccessLogConfigResponse
     */
    public EnableWebAccessLogConfigResponse enableWebAccessLogConfigWithOptions(EnableWebAccessLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWebAccessLogConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWebAccessLogConfigResponse());
    }

    /**
     * @param request EnableWebAccessLogConfigRequest
     * @return EnableWebAccessLogConfigResponse
     */
    public EnableWebAccessLogConfigResponse enableWebAccessLogConfig(EnableWebAccessLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableWebAccessLogConfigWithOptions(request, runtime);
    }

    /**
     * @param request EnableWebCCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableWebCCResponse
     */
    public EnableWebCCResponse enableWebCCWithOptions(EnableWebCCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWebCC"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWebCCResponse());
    }

    /**
     * @param request EnableWebCCRequest
     * @return EnableWebCCResponse
     */
    public EnableWebCCResponse enableWebCC(EnableWebCCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableWebCCWithOptions(request, runtime);
    }

    /**
     * @param request EnableWebCCRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableWebCCRuleResponse
     */
    public EnableWebCCRuleResponse enableWebCCRuleWithOptions(EnableWebCCRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWebCCRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWebCCRuleResponse());
    }

    /**
     * @param request EnableWebCCRuleRequest
     * @return EnableWebCCRuleResponse
     */
    public EnableWebCCRuleResponse enableWebCCRule(EnableWebCCRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableWebCCRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>95计费切换模式</p>
     * 
     * @param request ModifyBizBandWidthModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBizBandWidthModeResponse
     */
    public ModifyBizBandWidthModeResponse modifyBizBandWidthModeWithOptions(ModifyBizBandWidthModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBizBandWidthMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBizBandWidthModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>95计费切换模式</p>
     * 
     * @param request ModifyBizBandWidthModeRequest
     * @return ModifyBizBandWidthModeResponse
     */
    public ModifyBizBandWidthModeResponse modifyBizBandWidthMode(ModifyBizBandWidthModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBizBandWidthModeWithOptions(request, runtime);
    }

    /**
     * @param request ModifyBlackholeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBlackholeStatusResponse
     */
    public ModifyBlackholeStatusResponse modifyBlackholeStatusWithOptions(ModifyBlackholeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blackholeStatus)) {
            query.put("BlackholeStatus", request.blackholeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBlackholeStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBlackholeStatusResponse());
    }

    /**
     * @param request ModifyBlackholeStatusRequest
     * @return ModifyBlackholeStatusResponse
     */
    public ModifyBlackholeStatusResponse modifyBlackholeStatus(ModifyBlackholeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBlackholeStatusWithOptions(request, runtime);
    }

    /**
     * @param request ModifyBlockStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBlockStatusResponse
     */
    public ModifyBlockStatusResponse modifyBlockStatusWithOptions(ModifyBlockStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            query.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBlockStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBlockStatusResponse());
    }

    /**
     * @param request ModifyBlockStatusRequest
     * @return ModifyBlockStatusResponse
     */
    public ModifyBlockStatusResponse modifyBlockStatus(ModifyBlockStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBlockStatusWithOptions(request, runtime);
    }

    /**
     * @param request ModifyCnameReuseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCnameReuseResponse
     */
    public ModifyCnameReuseResponse modifyCnameReuseWithOptions(ModifyCnameReuseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cname)) {
            query.put("Cname", request.cname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCnameReuse"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCnameReuseResponse());
    }

    /**
     * @param request ModifyCnameReuseRequest
     * @return ModifyCnameReuseResponse
     */
    public ModifyCnameReuseResponse modifyCnameReuse(ModifyCnameReuseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCnameReuseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名接入资源</p>
     * 
     * @param request ModifyDomainResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDomainResourceResponse
     */
    public ModifyDomainResourceResponse modifyDomainResourceWithOptions(ModifyDomainResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsExt)) {
            query.put("HttpsExt", request.httpsExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTypes)) {
            query.put("ProxyTypes", request.proxyTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rsType)) {
            query.put("RsType", request.rsType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomainResource"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名接入资源</p>
     * 
     * @param request ModifyDomainResourceRequest
     * @return ModifyDomainResourceResponse
     */
    public ModifyDomainResourceResponse modifyDomainResource(ModifyDomainResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDomainResourceWithOptions(request, runtime);
    }

    /**
     * @param request ModifyElasticBandWidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElasticBandWidthResponse
     */
    public ModifyElasticBandWidthResponse modifyElasticBandWidthWithOptions(ModifyElasticBandWidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticBandwidth)) {
            query.put("ElasticBandwidth", request.elasticBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticBandWidth"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticBandWidthResponse());
    }

    /**
     * @param request ModifyElasticBandWidthRequest
     * @return ModifyElasticBandWidthResponse
     */
    public ModifyElasticBandWidthResponse modifyElasticBandWidth(ModifyElasticBandWidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyElasticBandWidthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性业务带宽</p>
     * 
     * @param request ModifyElasticBizBandWidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElasticBizBandWidthResponse
     */
    public ModifyElasticBizBandWidthResponse modifyElasticBizBandWidthWithOptions(ModifyElasticBizBandWidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticBizBandwidth)) {
            query.put("ElasticBizBandwidth", request.elasticBizBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticBizBandWidth"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticBizBandWidthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性业务带宽</p>
     * 
     * @param request ModifyElasticBizBandWidthRequest
     * @return ModifyElasticBizBandWidthResponse
     */
    public ModifyElasticBizBandWidthResponse modifyElasticBizBandWidth(ModifyElasticBizBandWidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyElasticBizBandWidthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启/关闭弹性QPS 首次模式直接生效</p>
     * 
     * @param request ModifyElasticBizQpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElasticBizQpsResponse
     */
    public ModifyElasticBizQpsResponse modifyElasticBizQpsWithOptions(ModifyElasticBizQpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsElasticQps)) {
            query.put("OpsElasticQps", request.opsElasticQps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticBizQps"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticBizQpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启/关闭弹性QPS 首次模式直接生效</p>
     * 
     * @param request ModifyElasticBizQpsRequest
     * @return ModifyElasticBizQpsResponse
     */
    public ModifyElasticBizQpsResponse modifyElasticBizQps(ModifyElasticBizQpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyElasticBizQpsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyFullLogTtlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFullLogTtlResponse
     */
    public ModifyFullLogTtlResponse modifyFullLogTtlWithOptions(ModifyFullLogTtlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFullLogTtl"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFullLogTtlResponse());
    }

    /**
     * @param request ModifyFullLogTtlRequest
     * @return ModifyFullLogTtlResponse
     */
    public ModifyFullLogTtlResponse modifyFullLogTtl(ModifyFullLogTtlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFullLogTtlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>流量标记</p>
     * 
     * @param request ModifyHeadersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHeadersResponse
     */
    public ModifyHeadersResponse modifyHeadersWithOptions(ModifyHeadersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customHeaders)) {
            query.put("CustomHeaders", request.customHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddedHeaders)) {
            query.put("EmbeddedHeaders", request.embeddedHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHeaders"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHeadersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>流量标记</p>
     * 
     * @param request ModifyHeadersRequest
     * @return ModifyHeadersResponse
     */
    public ModifyHeadersResponse modifyHeaders(ModifyHeadersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHeadersWithOptions(request, runtime);
    }

    /**
     * @param request ModifyHealthCheckConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHealthCheckConfigResponse
     */
    public ModifyHealthCheckConfigResponse modifyHealthCheckConfigWithOptions(ModifyHealthCheckConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardProtocol)) {
            query.put("ForwardProtocol", request.forwardProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHealthCheckConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHealthCheckConfigResponse());
    }

    /**
     * @param request ModifyHealthCheckConfigRequest
     * @return ModifyHealthCheckConfigResponse
     */
    public ModifyHealthCheckConfigResponse modifyHealthCheckConfig(ModifyHealthCheckConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHealthCheckConfigWithOptions(request, runtime);
    }

    /**
     * @param request ModifyHttp2EnableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHttp2EnableResponse
     */
    public ModifyHttp2EnableResponse modifyHttp2EnableWithOptions(ModifyHttp2EnableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHttp2Enable"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHttp2EnableResponse());
    }

    /**
     * @param request ModifyHttp2EnableRequest
     * @return ModifyHttp2EnableResponse
     */
    public ModifyHttp2EnableResponse modifyHttp2Enable(ModifyHttp2EnableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHttp2EnableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例变配  类似bss的变配 </p>
     * 
     * @param request ModifyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseBandwidth)) {
            query.put("BaseBandwidth", request.baseBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCount)) {
            query.put("DomainCount", request.domainCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.editionSale)) {
            query.put("EditionSale", request.editionSale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionVersion)) {
            query.put("FunctionVersion", request.functionVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalBandwidth)) {
            query.put("NormalBandwidth", request.normalBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalQps)) {
            query.put("NormalQps", request.normalQps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portCount)) {
            query.put("PortCount", request.portCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productPlan)) {
            query.put("ProductPlan", request.productPlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceBandwidth)) {
            query.put("ServiceBandwidth", request.serviceBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePartner)) {
            query.put("ServicePartner", request.servicePartner);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例变配  类似bss的变配 </p>
     * 
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例备注</p>
     * 
     * @param request ModifyInstanceRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceRemarkResponse
     */
    public ModifyInstanceRemarkResponse modifyInstanceRemarkWithOptions(ModifyInstanceRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceRemark"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例备注</p>
     * 
     * @param request ModifyInstanceRemarkRequest
     * @return ModifyInstanceRemarkResponse
     */
    public ModifyInstanceRemarkResponse modifyInstanceRemark(ModifyInstanceRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑端口转发规则的会话保持和DDoS防护策略设置</p>
     * 
     * @param request ModifyNetworkRuleAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNetworkRuleAttributeResponse
     */
    public ModifyNetworkRuleAttributeResponse modifyNetworkRuleAttributeWithOptions(ModifyNetworkRuleAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardProtocol)) {
            query.put("ForwardProtocol", request.forwardProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkRuleAttribute"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkRuleAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑端口转发规则的会话保持和DDoS防护策略设置</p>
     * 
     * @param request ModifyNetworkRuleAttributeRequest
     * @return ModifyNetworkRuleAttributeResponse
     */
    public ModifyNetworkRuleAttributeResponse modifyNetworkRuleAttribute(ModifyNetworkRuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkRuleAttributeWithOptions(request, runtime);
    }

    /**
     * @param request ModifyOcspStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOcspStatusResponse
     */
    public ModifyOcspStatusResponse modifyOcspStatusWithOptions(ModifyOcspStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOcspStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOcspStatusResponse());
    }

    /**
     * @param request ModifyOcspStatusRequest
     * @return ModifyOcspStatusResponse
     */
    public ModifyOcspStatusResponse modifyOcspStatus(ModifyOcspStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOcspStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改端口接入配置</p>
     * 
     * @param request ModifyPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPortResponse
     */
    public ModifyPortResponse modifyPortWithOptions(ModifyPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendPort)) {
            query.put("BackendPort", request.backendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendPort)) {
            query.put("FrontendPort", request.frontendPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendProtocol)) {
            query.put("FrontendProtocol", request.frontendProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyEnable)) {
            query.put("ProxyEnable", request.proxyEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPort"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改端口接入配置</p>
     * 
     * @param request ModifyPortRequest
     * @return ModifyPortResponse
     */
    public ModifyPortResponse modifyPort(ModifyPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPortWithOptions(request, runtime);
    }

    /**
     * @param request ModifyPortAutoCcStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPortAutoCcStatusResponse
     */
    public ModifyPortAutoCcStatusResponse modifyPortAutoCcStatusWithOptions(ModifyPortAutoCcStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._switch)) {
            query.put("Switch", request._switch);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPortAutoCcStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPortAutoCcStatusResponse());
    }

    /**
     * @param request ModifyPortAutoCcStatusRequest
     * @return ModifyPortAutoCcStatusResponse
     */
    public ModifyPortAutoCcStatusResponse modifyPortAutoCcStatus(ModifyPortAutoCcStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPortAutoCcStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性qps模式</p>
     * 
     * @param request ModifyQpsModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQpsModeResponse
     */
    public ModifyQpsModeResponse modifyQpsModeWithOptions(ModifyQpsModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyQpsMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQpsModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性qps模式</p>
     * 
     * @param request ModifyQpsModeRequest
     * @return ModifyQpsModeResponse
     */
    public ModifyQpsModeResponse modifyQpsMode(ModifyQpsModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyQpsModeWithOptions(request, runtime);
    }

    /**
     * @param request ModifySceneDefensePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySceneDefensePolicyResponse
     */
    public ModifySceneDefensePolicyResponse modifySceneDefensePolicyWithOptions(ModifySceneDefensePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySceneDefensePolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySceneDefensePolicyResponse());
    }

    /**
     * @param request ModifySceneDefensePolicyRequest
     * @return ModifySceneDefensePolicyResponse
     */
    public ModifySceneDefensePolicyResponse modifySceneDefensePolicy(ModifySceneDefensePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySceneDefensePolicyWithOptions(request, runtime);
    }

    /**
     * @param request ModifySchedulerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySchedulerRuleResponse
     */
    public ModifySchedulerRuleResponse modifySchedulerRuleWithOptions(ModifySchedulerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySchedulerRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySchedulerRuleResponse());
    }

    /**
     * @param request ModifySchedulerRuleRequest
     * @return ModifySchedulerRuleResponse
     */
    public ModifySchedulerRuleResponse modifySchedulerRule(ModifySchedulerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySchedulerRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改证书配置</p>
     * 
     * @param request ModifyTlsConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTlsConfigResponse
     */
    public ModifyTlsConfigResponse modifyTlsConfigWithOptions(ModifyTlsConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTlsConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTlsConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改证书配置</p>
     * 
     * @param request ModifyTlsConfigRequest
     * @return ModifyTlsConfigResponse
     */
    public ModifyTlsConfigResponse modifyTlsConfig(ModifyTlsConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTlsConfigWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebAIProtectModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebAIProtectModeResponse
     */
    public ModifyWebAIProtectModeResponse modifyWebAIProtectModeWithOptions(ModifyWebAIProtectModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebAIProtectMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebAIProtectModeResponse());
    }

    /**
     * @param request ModifyWebAIProtectModeRequest
     * @return ModifyWebAIProtectModeResponse
     */
    public ModifyWebAIProtectModeResponse modifyWebAIProtectMode(ModifyWebAIProtectModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebAIProtectModeWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebAIProtectSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebAIProtectSwitchResponse
     */
    public ModifyWebAIProtectSwitchResponse modifyWebAIProtectSwitchWithOptions(ModifyWebAIProtectSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebAIProtectSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebAIProtectSwitchResponse());
    }

    /**
     * @param request ModifyWebAIProtectSwitchRequest
     * @return ModifyWebAIProtectSwitchResponse
     */
    public ModifyWebAIProtectSwitchResponse modifyWebAIProtectSwitch(ModifyWebAIProtectSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebAIProtectSwitchWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebAccessModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebAccessModeResponse
     */
    public ModifyWebAccessModeResponse modifyWebAccessModeWithOptions(ModifyWebAccessModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebAccessMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebAccessModeResponse());
    }

    /**
     * @param request ModifyWebAccessModeRequest
     * @return ModifyWebAccessModeResponse
     */
    public ModifyWebAccessModeResponse modifyWebAccessMode(ModifyWebAccessModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebAccessModeWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebAreaBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebAreaBlockResponse
     */
    public ModifyWebAreaBlockResponse modifyWebAreaBlockWithOptions(ModifyWebAreaBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebAreaBlock"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebAreaBlockResponse());
    }

    /**
     * @param request ModifyWebAreaBlockRequest
     * @return ModifyWebAreaBlockResponse
     */
    public ModifyWebAreaBlockResponse modifyWebAreaBlock(ModifyWebAreaBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebAreaBlockWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebAreaBlockSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebAreaBlockSwitchResponse
     */
    public ModifyWebAreaBlockSwitchResponse modifyWebAreaBlockSwitchWithOptions(ModifyWebAreaBlockSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebAreaBlockSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebAreaBlockSwitchResponse());
    }

    /**
     * @param request ModifyWebAreaBlockSwitchRequest
     * @return ModifyWebAreaBlockSwitchResponse
     */
    public ModifyWebAreaBlockSwitchResponse modifyWebAreaBlockSwitch(ModifyWebAreaBlockSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebAreaBlockSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>统一全局CC开关</p>
     * 
     * @param request ModifyWebCCGlobalSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebCCGlobalSwitchResponse
     */
    public ModifyWebCCGlobalSwitchResponse modifyWebCCGlobalSwitchWithOptions(ModifyWebCCGlobalSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccGlobalSwitch)) {
            query.put("CcGlobalSwitch", request.ccGlobalSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebCCGlobalSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebCCGlobalSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>统一全局CC开关</p>
     * 
     * @param request ModifyWebCCGlobalSwitchRequest
     * @return ModifyWebCCGlobalSwitchResponse
     */
    public ModifyWebCCGlobalSwitchResponse modifyWebCCGlobalSwitch(ModifyWebCCGlobalSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebCCGlobalSwitchWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ModifyWebCCRule is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.
     * 
     * @param request ModifyWebCCRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebCCRuleResponse
     */
    @Deprecated
    // Deprecated
    public ModifyWebCCRuleResponse modifyWebCCRuleWithOptions(ModifyWebCCRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.act)) {
            query.put("Act", request.act);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            query.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebCCRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebCCRuleResponse());
    }

    /**
     * @deprecated OpenAPI ModifyWebCCRule is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.
     * 
     * @param request ModifyWebCCRuleRequest
     * @return ModifyWebCCRuleResponse
     */
    @Deprecated
    // Deprecated
    public ModifyWebCCRuleResponse modifyWebCCRule(ModifyWebCCRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebCCRuleWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebCacheCustomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebCacheCustomRuleResponse
     */
    public ModifyWebCacheCustomRuleResponse modifyWebCacheCustomRuleWithOptions(ModifyWebCacheCustomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebCacheCustomRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebCacheCustomRuleResponse());
    }

    /**
     * @param request ModifyWebCacheCustomRuleRequest
     * @return ModifyWebCacheCustomRuleResponse
     */
    public ModifyWebCacheCustomRuleResponse modifyWebCacheCustomRule(ModifyWebCacheCustomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebCacheCustomRuleWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebCacheModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebCacheModeResponse
     */
    public ModifyWebCacheModeResponse modifyWebCacheModeWithOptions(ModifyWebCacheModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebCacheMode"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebCacheModeResponse());
    }

    /**
     * @param request ModifyWebCacheModeRequest
     * @return ModifyWebCacheModeResponse
     */
    public ModifyWebCacheModeResponse modifyWebCacheMode(ModifyWebCacheModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebCacheModeWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebCacheSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebCacheSwitchResponse
     */
    public ModifyWebCacheSwitchResponse modifyWebCacheSwitchWithOptions(ModifyWebCacheSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebCacheSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebCacheSwitchResponse());
    }

    /**
     * @param request ModifyWebCacheSwitchRequest
     * @return ModifyWebCacheSwitchResponse
     */
    public ModifyWebCacheSwitchResponse modifyWebCacheSwitch(ModifyWebCacheSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebCacheSwitchWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebIpSetSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebIpSetSwitchResponse
     */
    public ModifyWebIpSetSwitchResponse modifyWebIpSetSwitchWithOptions(ModifyWebIpSetSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebIpSetSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebIpSetSwitchResponse());
    }

    /**
     * @param request ModifyWebIpSetSwitchRequest
     * @return ModifyWebIpSetSwitchResponse
     */
    public ModifyWebIpSetSwitchResponse modifyWebIpSetSwitch(ModifyWebIpSetSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebIpSetSwitchWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebPreciseAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebPreciseAccessRuleResponse
     */
    public ModifyWebPreciseAccessRuleResponse modifyWebPreciseAccessRuleWithOptions(ModifyWebPreciseAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expires)) {
            query.put("Expires", request.expires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebPreciseAccessRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebPreciseAccessRuleResponse());
    }

    /**
     * @param request ModifyWebPreciseAccessRuleRequest
     * @return ModifyWebPreciseAccessRuleResponse
     */
    public ModifyWebPreciseAccessRuleResponse modifyWebPreciseAccessRule(ModifyWebPreciseAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebPreciseAccessRuleWithOptions(request, runtime);
    }

    /**
     * @param request ModifyWebPreciseAccessSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebPreciseAccessSwitchResponse
     */
    public ModifyWebPreciseAccessSwitchResponse modifyWebPreciseAccessSwitchWithOptions(ModifyWebPreciseAccessSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebPreciseAccessSwitch"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebPreciseAccessSwitchResponse());
    }

    /**
     * @param request ModifyWebPreciseAccessSwitchRequest
     * @return ModifyWebPreciseAccessSwitchResponse
     */
    public ModifyWebPreciseAccessSwitchResponse modifyWebPreciseAccessSwitch(ModifyWebPreciseAccessSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebPreciseAccessSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改已经创建的网站业务转发规则</p>
     * 
     * @param request ModifyWebRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWebRuleResponse
     */
    public ModifyWebRuleResponse modifyWebRuleWithOptions(ModifyWebRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsExt)) {
            query.put("HttpsExt", request.httpsExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTypes)) {
            query.put("ProxyTypes", request.proxyTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realServers)) {
            query.put("RealServers", request.realServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rsType)) {
            query.put("RsType", request.rsType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWebRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWebRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改已经创建的网站业务转发规则</p>
     * 
     * @param request ModifyWebRuleRequest
     * @return ModifyWebRuleResponse
     */
    public ModifyWebRuleResponse modifyWebRule(ModifyWebRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWebRuleWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>切换流量调度器</p>
     * 
     * @param request SwitchSchedulerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchSchedulerRuleResponse
     */
    public SwitchSchedulerRuleResponse switchSchedulerRuleWithOptions(SwitchSchedulerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchData)) {
            query.put("SwitchData", request.switchData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSchedulerRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSchedulerRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>切换流量调度器</p>
     * 
     * @param request SwitchSchedulerRuleRequest
     * @return SwitchSchedulerRuleResponse
     */
    public SwitchSchedulerRuleResponse switchSchedulerRule(SwitchSchedulerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchSchedulerRuleWithOptions(request, runtime);
    }
}
