// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.dcdn20180115.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

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

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("key", com.aliyun.teautil.Common.defaultString(runtime.key, _key)),
            new TeaPair("cert", com.aliyun.teautil.Common.defaultString(runtime.cert, _cert)),
            new TeaPair("ca", com.aliyun.teautil.Common.defaultString(runtime.ca, _ca)),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("socks5Proxy", com.aliyun.teautil.Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
            new TeaPair("socks5NetWork", com.aliyun.teautil.Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", com.aliyun.teaopenapi.Client.defaultAny(runtime.ignoreSSL, false)),
            new TeaPair("tlsMinVersion", _tlsMinVersion)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
                String boundary = com.aliyun.fileform.Client.getBoundary();
                String host = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                request_.protocol = "HTTPS";
                request_.method = "POST";
                request_.pathname = "/";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", host),
                    new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                    new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(""))
                );
                request_.headers.put("content-type", "multipart/form-data; boundary=" + boundary + "");
                request_.body = com.aliyun.fileform.Client.toFileForm(form, boundary);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> respMap = null;
                String bodyStr = com.aliyun.teautil.Common.readAsString(response_.body);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                    java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("code", err.get("Code")),
                        new TeaPair("message", err.get("Message")),
                        new TeaPair("data", TeaConverter.buildMap(
                            new TeaPair("httpCode", response_.statusCode),
                            new TeaPair("requestId", err.get("RequestId")),
                            new TeaPair("hostId", err.get("HostId"))
                        ))
                    ));
                }

                respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                return TeaConverter.merge(Object.class,
                    respMap
                );
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) is activated.</li>
     * <li>Internet content provider (ICP) filing is complete for the accelerated domain name.</li>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to accelerate. You can specify only one domain name in each request.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            query.put("FunctionType", request.functionType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) is activated.</li>
     * <li>Internet content provider (ICP) filing is complete for the accelerated domain name.</li>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to accelerate. You can specify only one domain name in each request.</p>
     * 
     * @param request AddDcdnDomainRequest
     * @return AddDcdnDomainResponse
     */
    public AddDcdnDomainResponse addDcdnDomain(AddDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Make sure that the IPA service is activated before you add a domain name to accelerate.</li>
     * <li>Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to IPA. You can specify only one domain name in each request.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Make sure that the IPA service is activated before you add a domain name to accelerate.</li>
     * <li>Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to IPA. You can specify only one domain name in each request.</p>
     * 
     * @param request AddDcdnIpaDomainRequest
     * @return AddDcdnIpaDomainResponse
     */
    public AddDcdnIpaDomainResponse addDcdnIpaDomain(AddDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*:</p>
     * <ul>
     * <li>The <a href="https://help.aliyun.com/document_detail/64926.html">DCDN service is activated</a>.</li>
     * <li>Internet content provider (ICP) filing is complete for the accelerated domain names.<blockquote>
     * <ul>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more domain names to DCDN at a time.</p>
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*:</p>
     * <ul>
     * <li>The <a href="https://help.aliyun.com/document_detail/64926.html">DCDN service is activated</a>.</li>
     * <li>Internet content provider (ICP) filing is complete for the accelerated domain names.<blockquote>
     * <ul>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more domain names to DCDN at a time.</p>
     * 
     * @param request BatchAddDcdnDomainRequest
     * @return BatchAddDcdnDomainResponse
     */
    public BatchAddDcdnDomainResponse batchAddDcdnDomain(BatchAddDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAddDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates Web Application Firewall (WAF) protection rules.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates Web Application Firewall (WAF) protection rules.</p>
     * 
     * @param request BatchCreateDcdnWafRulesRequest
     * @return BatchCreateDcdnWafRulesResponse
     */
    public BatchCreateDcdnWafRulesResponse batchCreateDcdnWafRules(BatchCreateDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateDcdnWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes configurations of multiple accelerated domain names at a time.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes configurations of multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchDeleteDcdnDomainConfigsRequest
     * @return BatchDeleteDcdnDomainConfigsResponse
     */
    public BatchDeleteDcdnDomainConfigsResponse batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDcdnDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除kv数据，支持最大2M的请求体</p>
     * 
     * @param tmpReq BatchDeleteDcdnKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteDcdnKvResponse
     */
    public BatchDeleteDcdnKvResponse batchDeleteDcdnKvWithOptions(BatchDeleteDcdnKvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteDcdnKvShrinkRequest request = new BatchDeleteDcdnKvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            body.put("Keys", request.keysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDcdnKv"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDcdnKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除kv数据，支持最大2M的请求体</p>
     * 
     * @param request BatchDeleteDcdnKvRequest
     * @return BatchDeleteDcdnKvResponse
     */
    public BatchDeleteDcdnKvResponse batchDeleteDcdnKv(BatchDeleteDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDcdnKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除kv数据，支持最大100M的请求体</p>
     * 
     * @param request BatchDeleteDcdnKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteDcdnKvWithHighCapacityResponse
     */
    public BatchDeleteDcdnKvWithHighCapacityResponse batchDeleteDcdnKvWithHighCapacityWithOptions(BatchDeleteDcdnKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDcdnKvWithHighCapacity"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDcdnKvWithHighCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除kv数据，支持最大100M的请求体</p>
     * 
     * @param request BatchDeleteDcdnKvWithHighCapacityRequest
     * @return BatchDeleteDcdnKvWithHighCapacityResponse
     */
    public BatchDeleteDcdnKvWithHighCapacityResponse batchDeleteDcdnKvWithHighCapacity(BatchDeleteDcdnKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDcdnKvWithHighCapacityWithOptions(request, runtime);
    }

    public BatchDeleteDcdnKvWithHighCapacityResponse batchDeleteDcdnKvWithHighCapacityAdvance(BatchDeleteDcdnKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "dcdn"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        BatchDeleteDcdnKvWithHighCapacityRequest batchDeleteDcdnKvWithHighCapacityReq = new BatchDeleteDcdnKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, batchDeleteDcdnKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            batchDeleteDcdnKvWithHighCapacityReq.url = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        BatchDeleteDcdnKvWithHighCapacityResponse batchDeleteDcdnKvWithHighCapacityResp = this.batchDeleteDcdnKvWithHighCapacityWithOptions(batchDeleteDcdnKvWithHighCapacityReq, runtime);
        return batchDeleteDcdnKvWithHighCapacityResp;
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple Web Application Firewall (WAF) protection rules at a time.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple Web Application Firewall (WAF) protection rules at a time.</p>
     * 
     * @param request BatchDeleteDcdnWafRulesRequest
     * @return BatchDeleteDcdnWafRulesResponse
     */
    public BatchDeleteDcdnWafRulesResponse batchDeleteDcdnWafRules(BatchDeleteDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDcdnWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies multiple Web Application Firewall (WAF) protection rules. Only Bot management rules can be modified.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies multiple Web Application Firewall (WAF) protection rules. Only Bot management rules can be modified.</p>
     * 
     * @param request BatchModifyDcdnWafRulesRequest
     * @return BatchModifyDcdnWafRulesResponse
     */
    public BatchModifyDcdnWafRulesResponse batchModifyDcdnWafRules(BatchModifyDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchModifyDcdnWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures multiple key-value (KV) pairs for a namespace.</p>
     * 
     * @param tmpReq BatchPutDcdnKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPutDcdnKvResponse
     */
    public BatchPutDcdnKvResponse batchPutDcdnKvWithOptions(BatchPutDcdnKvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchPutDcdnKvShrinkRequest request = new BatchPutDcdnKvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kvList)) {
            request.kvListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kvList, "KvList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvListShrink)) {
            body.put("KvList", request.kvListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPutDcdnKv"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPutDcdnKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures multiple key-value (KV) pairs for a namespace.</p>
     * 
     * @param request BatchPutDcdnKvRequest
     * @return BatchPutDcdnKvResponse
     */
    public BatchPutDcdnKvResponse batchPutDcdnKv(BatchPutDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchPutDcdnKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量写入kv数据，支持最大100M的请求体</p>
     * 
     * @param request BatchPutDcdnKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPutDcdnKvWithHighCapacityResponse
     */
    public BatchPutDcdnKvWithHighCapacityResponse batchPutDcdnKvWithHighCapacityWithOptions(BatchPutDcdnKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPutDcdnKvWithHighCapacity"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPutDcdnKvWithHighCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量写入kv数据，支持最大100M的请求体</p>
     * 
     * @param request BatchPutDcdnKvWithHighCapacityRequest
     * @return BatchPutDcdnKvWithHighCapacityResponse
     */
    public BatchPutDcdnKvWithHighCapacityResponse batchPutDcdnKvWithHighCapacity(BatchPutDcdnKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchPutDcdnKvWithHighCapacityWithOptions(request, runtime);
    }

    public BatchPutDcdnKvWithHighCapacityResponse batchPutDcdnKvWithHighCapacityAdvance(BatchPutDcdnKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "dcdn"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        BatchPutDcdnKvWithHighCapacityRequest batchPutDcdnKvWithHighCapacityReq = new BatchPutDcdnKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, batchPutDcdnKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            batchPutDcdnKvWithHighCapacityReq.url = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        BatchPutDcdnKvWithHighCapacityResponse batchPutDcdnKvWithHighCapacityResp = this.batchPutDcdnKvWithHighCapacityWithOptions(batchPutDcdnKvWithHighCapacityReq, runtime);
        return batchPutDcdnKvWithHighCapacityResp;
    }

    /**
     * <b>description</b> :
     * <p>  You can specify up to 50 domain names in each request.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures features for one or more domain names.</p>
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
     * <b>description</b> :
     * <p>  You can specify up to 50 domain names in each request.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures features for one or more domain names.</p>
     * 
     * @param request BatchSetDcdnDomainConfigsRequest
     * @return BatchSetDcdnDomainConfigsResponse
     */
    public BatchSetDcdnDomainConfigsResponse batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures multiple domain names to be accelerated by IP Application Accelerator (IPA).</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures multiple domain names to be accelerated by IP Application Accelerator (IPA).</p>
     * 
     * @param request BatchSetDcdnIpaDomainConfigsRequest
     * @return BatchSetDcdnIpaDomainConfigsResponse
     */
    public BatchSetDcdnIpaDomainConfigsResponse batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnIpaDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1></h1>
     * <ul>
     * <li>You can call this operation up to 20 times per second.</li>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the protection status of multiple domain names at a time.</p>
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
     * <b>description</b> :
     * <h1></h1>
     * <ul>
     * <li>You can call this operation up to 20 times per second.</li>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the protection status of multiple domain names at a time.</p>
     * 
     * @param request BatchSetDcdnWafDomainConfigsRequest
     * @return BatchSetDcdnWafDomainConfigsResponse
     */
    public BatchSetDcdnWafDomainConfigsResponse batchSetDcdnWafDomainConfigs(BatchSetDcdnWafDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDcdnWafDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If an accelerated domain name is in an invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more accelerated domain names. After the accelerated domain names are enabled, the value of the DomainStatus parameter for the domain names changes to Online.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If an accelerated domain name is in an invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more accelerated domain names. After the accelerated domain names are enabled, the value of the DomainStatus parameter for the domain names changes to Online.</p>
     * 
     * @param request BatchStartDcdnDomainRequest
     * @return BatchStartDcdnDomainResponse
     */
    public BatchStartDcdnDomainResponse batchStartDcdnDomain(BatchStartDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more accelerated domain names. After an accelerated domain name is disabled, the value of the DomainStatus parameter for the domain name changes to Offline.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more accelerated domain names. After an accelerated domain name is disabled, the value of the DomainStatus parameter for the domain name changes to Offline.</p>
     * 
     * @param request BatchStopDcdnDomainRequest
     * @return BatchStopDcdnDomainResponse
     */
    public BatchStopDcdnDomainResponse batchStopDcdnDomain(BatchStopDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a real-time log delivery project exists.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a real-time log delivery project exists.</p>
     * 
     * @param request CheckDcdnProjectExistRequest
     * @return CheckDcdnProjectExistResponse
     */
    public CheckDcdnProjectExistResponse checkDcdnProjectExist(CheckDcdnProjectExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDcdnProjectExistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The call frequency of the API is no more than 100 queries per second.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates an official code version from unstable JavaScript code that is in the staging
     *                   environment. The version can be used in the canary release or production environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> The call frequency of the API is no more than 100 queries per second.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates an official code version from unstable JavaScript code that is in the staging
     *                   environment. The version can be used in the canary release or production environment.</p>
     * 
     * @param request CommitStagingRoutineCodeRequest
     * @return CommitStagingRoutineCodeResponse
     */
    public CommitStagingRoutineCodeResponse commitStagingRoutineCode(CommitStagingRoutineCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitStagingRoutineCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate signing request (CSR) file.</p>
     * 
     * @param request CreateDcdnCertificateSigningRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDcdnCertificateSigningRequestResponse
     */
    public CreateDcdnCertificateSigningRequestResponse createDcdnCertificateSigningRequestWithOptions(CreateDcdnCertificateSigningRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationUnit)) {
            query.put("OrganizationUnit", request.organizationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SANs)) {
            query.put("SANs", request.SANs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDcdnCertificateSigningRequest"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDcdnCertificateSigningRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate signing request (CSR) file.</p>
     * 
     * @param request CreateDcdnCertificateSigningRequestRequest
     * @return CreateDcdnCertificateSigningRequestResponse
     */
    public CreateDcdnCertificateSigningRequestResponse createDcdnCertificateSigningRequest(CreateDcdnCertificateSigningRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnCertificateSigningRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**You can call this operation up to three times per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a tracking task. After you create a tracking task, the system periodically sends operations reports to you by email.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>**You can call this operation up to three times per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a tracking task. After you create a tracking task, the system periodically sends operations reports to you by email.</p>
     * 
     * @param request CreateDcdnDeliverTaskRequest
     * @return CreateDcdnDeliverTaskResponse
     */
    public CreateDcdnDeliverTaskResponse createDcdnDeliverTask(CreateDcdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnDeliverTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a real-time log delivery project.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a real-time log delivery project.</p>
     * 
     * @param request CreateDcdnSLSRealTimeLogDeliveryRequest
     * @return CreateDcdnSLSRealTimeLogDeliveryResponse
     */
    public CreateDcdnSLSRealTimeLogDeliveryResponse createDcdnSLSRealTimeLogDelivery(CreateDcdnSLSRealTimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnSLSRealTimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.</li>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom operations report.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.</li>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom operations report.</p>
     * 
     * @param request CreateDcdnSubTaskRequest
     * @return CreateDcdnSubTaskResponse
     */
    public CreateDcdnSubTaskResponse createDcdnSubTask(CreateDcdnSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a custom WAF rule group.</p>
     * 
     * @param request CreateDcdnWafGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDcdnWafGroupResponse
     */
    public CreateDcdnWafGroupResponse createDcdnWafGroupWithOptions(CreateDcdnWafGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribe)) {
            body.put("Subscribe", request.subscribe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDcdnWafGroup"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDcdnWafGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a custom WAF rule group.</p>
     * 
     * @param request CreateDcdnWafGroupRequest
     * @return CreateDcdnWafGroupResponse
     */
    public CreateDcdnWafGroupResponse createDcdnWafGroup(CreateDcdnWafGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnWafGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per user.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Web Application Firewall (WAF) protection policy.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per user.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Web Application Firewall (WAF) protection policy.</p>
     * 
     * @param request CreateDcdnWafPolicyRequest
     * @return CreateDcdnWafPolicyResponse
     */
    public CreateDcdnWafPolicyResponse createDcdnWafPolicy(CreateDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.</li>
     * <li>You can only specify the production and staging environments when you call this operation.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.</li>
     * <li>You can only specify the production and staging environments when you call this operation.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a routine.</p>
     * 
     * @param request CreateRoutineRequest
     * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutine(CreateRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a service-linked role (SLR) and a Log Service project.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a service-linked role (SLR) and a Log Service project.</p>
     * 
     * @param request CreateSlrAndSlsProjectRequest
     * @return CreateSlrAndSlsProjectResponse
     */
    public CreateSlrAndSlsProjectResponse createSlrAndSlsProject(CreateSlrAndSlsProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSlrAndSlsProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A客户定制实时日志删除接口</p>
     * 
     * @param request DeleteCustomDomainSampleRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomDomainSampleRateResponse
     */
    public DeleteCustomDomainSampleRateResponse deleteCustomDomainSampleRateWithOptions(DeleteCustomDomainSampleRateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            body.put("DomainNames", request.domainNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomDomainSampleRate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomDomainSampleRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>A客户定制实时日志删除接口</p>
     * 
     * @param request DeleteCustomDomainSampleRateRequest
     * @return DeleteCustomDomainSampleRateResponse
     */
    public DeleteCustomDomainSampleRateResponse deleteCustomDomainSampleRate(DeleteCustomDomainSampleRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomDomainSampleRateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 3.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes tracking tasks by task ID.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 3.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes tracking tasks by task ID.</p>
     * 
     * @param request DeleteDcdnDeliverTaskRequest
     * @return DeleteDcdnDeliverTaskResponse
     */
    public DeleteDcdnDeliverTaskResponse deleteDcdnDeliverTask(DeleteDcdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnDeliverTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Before you delete your domain name, you need to request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.</li>
     * <li>If you call the <strong>DeleteDcdnDomain</strong> operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the <a href="https://help.aliyun.com/document_detail/130622.html">StopDcdnDomain</a> operation.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Before you delete your domain name, you need to request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.</li>
     * <li>If you call the <strong>DeleteDcdnDomain</strong> operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the <a href="https://help.aliyun.com/document_detail/130622.html">StopDcdnDomain</a> operation.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified accelerated domain name.</p>
     * 
     * @param request DeleteDcdnDomainRequest
     * @return DeleteDcdnDomainResponse
     */
    public DeleteDcdnDomainResponse deleteDcdnDomain(DeleteDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.</li>
     * <li>This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the <strong>StopDcdnIpaDomain</strong> operation.****</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an accelerated domain name from IP Application Accelerator (IPA).</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.</li>
     * <li>This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the <strong>StopDcdnIpaDomain</strong> operation.****</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an accelerated domain name from IP Application Accelerator (IPA).</p>
     * 
     * @param request DeleteDcdnIpaDomainRequest
     * @return DeleteDcdnIpaDomainResponse
     */
    public DeleteDcdnIpaDomainResponse deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes specific configurations of an accelerated domain name from IP Application Accelerator (IPA).</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes specific configurations of an accelerated domain name from IP Application Accelerator (IPA).</p>
     * 
     * @param request DeleteDcdnIpaSpecificConfigRequest
     * @return DeleteDcdnIpaSpecificConfigResponse
     */
    public DeleteDcdnIpaSpecificConfigResponse deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnIpaSpecificConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the key-value pairs in a namespace that you specify when you call the PutDcdnKvNamespace operation. EdgeKV provides a global key-value database for Dynamic Route for CDN (DCDN) points of presence (POPs).</p>
     * 
     * @param request DeleteDcdnKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDcdnKvResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes the key-value pairs in a namespace that you specify when you call the PutDcdnKvNamespace operation. EdgeKV provides a global key-value database for Dynamic Route for CDN (DCDN) points of presence (POPs).</p>
     * 
     * @param request DeleteDcdnKvRequest
     * @return DeleteDcdnKvResponse
     */
    public DeleteDcdnKvResponse deleteDcdnKv(DeleteDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a namespace that belongs to your account.</p>
     * 
     * @param request DeleteDcdnKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDcdnKvNamespaceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a namespace that belongs to your account.</p>
     * 
     * @param request DeleteDcdnKvNamespaceRequest
     * @return DeleteDcdnKvNamespaceResponse
     */
    public DeleteDcdnKvNamespaceResponse deleteDcdnKvNamespace(DeleteDcdnKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DeleteDcdnRealTimeLogProjectRequest
     * @return DeleteDcdnRealTimeLogProjectResponse
     */
    public DeleteDcdnRealTimeLogProjectResponse deleteDcdnRealTimeLogProject(DeleteDcdnRealTimeLogProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnRealTimeLogProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes configurations of a domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes configurations of a domain name.</p>
     * 
     * @param request DeleteDcdnSpecificConfigRequest
     * @return DeleteDcdnSpecificConfigResponse
     */
    public DeleteDcdnSpecificConfigResponse deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnSpecificConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of an accelerated domain name in the canary release environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of an accelerated domain name in the canary release environment.</p>
     * 
     * @param request DeleteDcdnSpecificStagingConfigRequest
     * @return DeleteDcdnSpecificStagingConfigResponse
     */
    public DeleteDcdnSpecificStagingConfigResponse deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnSpecificStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 3 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes all custom operations reports.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 3 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes all custom operations reports.</p>
     * @return DeleteDcdnSubTaskResponse
     */
    public DeleteDcdnSubTaskResponse deleteDcdnSubTask() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnSubTaskWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes feature configurations by user.</p>
     * 
     * @param request DeleteDcdnUserConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDcdnUserConfigResponse
     */
    public DeleteDcdnUserConfigResponse deleteDcdnUserConfigWithOptions(DeleteDcdnUserConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnUserConfig"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnUserConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes feature configurations by user.</p>
     * 
     * @param request DeleteDcdnUserConfigRequest
     * @return DeleteDcdnUserConfigResponse
     */
    public DeleteDcdnUserConfigResponse deleteDcdnUserConfig(DeleteDcdnUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnUserConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom WAF rule group.</p>
     * 
     * @param request DeleteDcdnWafGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDcdnWafGroupResponse
     */
    public DeleteDcdnWafGroupResponse deleteDcdnWafGroupWithOptions(DeleteDcdnWafGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDcdnWafGroup"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDcdnWafGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom WAF rule group.</p>
     * 
     * @param request DeleteDcdnWafGroupRequest
     * @return DeleteDcdnWafGroupResponse
     */
    public DeleteDcdnWafGroupResponse deleteDcdnWafGroup(DeleteDcdnWafGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnWafGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a protection policy.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a protection policy.</p>
     * 
     * @param request DeleteDcdnWafPolicyRequest
     * @return DeleteDcdnWafPolicyResponse
     */
    public DeleteDcdnWafPolicyResponse deleteDcdnWafPolicy(DeleteDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a routine.</p>
     * 
     * @param request DeleteRoutineRequest
     * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutine(DeleteRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the code of the specified version from a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the code of the specified version from a routine.</p>
     * 
     * @param request DeleteRoutineCodeRevisionRequest
     * @return DeleteRoutineCodeRevisionResponse
     */
    public DeleteRoutineCodeRevisionResponse deleteRoutineCodeRevision(DeleteRoutineCodeRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineCodeRevisionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes canary release environments from a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes canary release environments from a routine.</p>
     * 
     * @param request DeleteRoutineConfEnvsRequest
     * @return DeleteRoutineConfEnvsResponse
     */
    public DeleteRoutineConfEnvsResponse deleteRoutineConfEnvs(DeleteRoutineConfEnvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineConfEnvsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A客户定制查询域名采样率</p>
     * 
     * @param request DescribeCustomDomainSampleRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomDomainSampleRateResponse
     */
    public DescribeCustomDomainSampleRateResponse describeCustomDomainSampleRateWithOptions(DescribeCustomDomainSampleRateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
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
            new TeaPair("action", "DescribeCustomDomainSampleRate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomDomainSampleRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>A客户定制查询域名采样率</p>
     * 
     * @param request DescribeCustomDomainSampleRateRequest
     * @return DescribeCustomDomainSampleRateResponse
     */
    public DescribeCustomDomainSampleRateResponse describeCustomDomainSampleRate(DescribeCustomDomainSampleRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomDomainSampleRateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries precise access control rules.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries precise access control rules.</p>
     * 
     * @param request DescribeDcdnAclFieldsRequest
     * @return DescribeDcdnAclFieldsResponse
     */
    public DescribeDcdnAclFieldsResponse describeDcdnAclFields(DescribeDcdnAclFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnAclFieldsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.</p>
     * <ul>
     * <li>If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.</li>
     * <li>If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.</li>
     * <li>You can call this operation up to five times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data for Border Gateway Protocol (BGP) accelerated domain names. Data is collected every 5 minutes.</p>
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
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.</p>
     * <ul>
     * <li>If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.</li>
     * <li>If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.</li>
     * <li>You can call this operation up to five times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data for Border Gateway Protocol (BGP) accelerated domain names. Data is collected every 5 minutes.</p>
     * 
     * @param request DescribeDcdnBgpBpsDataRequest
     * @return DescribeDcdnBgpBpsDataResponse
     */
    public DescribeDcdnBgpBpsDataResponse describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnBgpBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.</p>
     * <ul>
     * <li>If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.</li>
     * <li>If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.</li>
     * <li>You can call this operation up to five times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic data for BGP accelerated domain names. Data is collected every 5 minutes.</p>
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
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.</p>
     * <ul>
     * <li>If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.</li>
     * <li>If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.</li>
     * <li>You can call this operation up to five times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic data for BGP accelerated domain names. Data is collected every 5 minutes.</p>
     * 
     * @param request DescribeDcdnBgpTrafficDataRequest
     * @return DescribeDcdnBgpTrafficDataResponse
     */
    public DescribeDcdnBgpTrafficDataResponse describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnBgpTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries countries and regions that can be added to the blacklist.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries countries and regions that can be added to the blacklist.</p>
     * 
     * @param request DescribeDcdnBlockedRegionsRequest
     * @return DescribeDcdnBlockedRegionsResponse
     */
    public DescribeDcdnBlockedRegionsResponse describeDcdnBlockedRegions(DescribeDcdnBlockedRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnBlockedRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries details about a certificate.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries details about a certificate.</p>
     * 
     * @param request DescribeDcdnCertificateDetailRequest
     * @return DescribeDcdnCertificateDetailResponse
     */
    public DescribeDcdnCertificateDetailResponse describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificates of one or more accelerated domain names.</p>
     * 
     * @deprecated OpenAPI DescribeDcdnCertificateList is deprecated, please use dcdn::2018-01-15::DescribeDcdnSSLCertificateList instead.
     * 
     * @param request DescribeDcdnCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnCertificateListResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificates of one or more accelerated domain names.</p>
     * 
     * @deprecated OpenAPI DescribeDcdnCertificateList is deprecated, please use dcdn::2018-01-15::DescribeDcdnSSLCertificateList instead.
     * 
     * @param request DescribeDcdnCertificateListRequest
     * @return DescribeDcdnCertificateListResponse
     */
    @Deprecated
    // Deprecated
    public DescribeDcdnCertificateListResponse describeDcdnCertificateList(DescribeDcdnCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of DCDN DDoS mitigation.</p>
     * 
     * @param request DescribeDcdnDdosServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDdosServiceResponse
     */
    public DescribeDcdnDdosServiceResponse describeDcdnDdosServiceWithOptions(DescribeDcdnDdosServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeDcdnDdosService"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDdosServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of DCDN DDoS mitigation.</p>
     * 
     * @param request DescribeDcdnDdosServiceRequest
     * @return DescribeDcdnDdosServiceResponse
     */
    public DescribeDcdnDdosServiceResponse describeDcdnDdosService(DescribeDcdnDdosServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDdosServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of DCDN DDoS versions.</p>
     * 
     * @param request DescribeDcdnDdosSpecInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDdosSpecInfoResponse
     */
    public DescribeDcdnDdosSpecInfoResponse describeDcdnDdosSpecInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDdosSpecInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDdosSpecInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of DCDN DDoS versions.</p>
     * @return DescribeDcdnDdosSpecInfoResponse
     */
    public DescribeDcdnDdosSpecInfoResponse describeDcdnDdosSpecInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDdosSpecInfoWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names that are deleted from your Alibaba Cloud account.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names that are deleted from your Alibaba Cloud account.</p>
     * 
     * @param request DescribeDcdnDeletedDomainsRequest
     * @return DescribeDcdnDeletedDomainsResponse
     */
    public DescribeDcdnDeletedDomainsResponse describeDcdnDeletedDomains(DescribeDcdnDeletedDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDeletedDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all tracking tasks of operations reports.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all tracking tasks of operations reports.</p>
     * 
     * @param request DescribeDcdnDeliverListRequest
     * @return DescribeDcdnDeliverListResponse
     */
    public DescribeDcdnDeliverListResponse describeDcdnDeliverList(DescribeDcdnDeliverListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDeliverListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of network bandwidth for one or more accelerated domain names. You can query data in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of network bandwidth for one or more accelerated domain names. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainBpsDataRequest
     * @return DescribeDcdnDomainBpsDataResponse
     */
    public DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last 24 hours. If you set both <strong>StartTime</strong> and <strong>EndTime</strong>, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data of accelerated domain names.</p>
     * 
     * @param request DescribeDcdnDomainBpsDataByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDomainBpsDataByLayerResponse
     */
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

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last 24 hours. If you set both <strong>StartTime</strong> and <strong>EndTime</strong>, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data of accelerated domain names.</p>
     * 
     * @param request DescribeDcdnDomainBpsDataByLayerRequest
     * @return DescribeDcdnDomainBpsDataByLayerResponse
     */
    public DescribeDcdnDomainBpsDataByLayerResponse describeDcdnDomainBpsDataByLayer(DescribeDcdnDomainBpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainBpsDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names by SSL certificate.</p>
     * 
     * @param request DescribeDcdnDomainByCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDomainByCertificateResponse
     */
    public DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificateWithOptions(DescribeDcdnDomainByCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exact)) {
            query.put("Exact", request.exact);
        }

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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names by SSL certificate.</p>
     * 
     * @param request DescribeDcdnDomainByCertificateRequest
     * @return DescribeDcdnDomainByCertificateResponse
     */
    public DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainByCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.</li>
     * <li>You can query data collected over the last 30 days.</li>
     * <li>You can call the RefreshObjectCaches operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries logs of rate limiting.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.</li>
     * <li>You can query data collected over the last 30 days.</li>
     * <li>You can call the RefreshObjectCaches operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries logs of rate limiting.</p>
     * 
     * @param request DescribeDcdnDomainCcActivityLogRequest
     * @return DescribeDcdnDomainCcActivityLogResponse
     */
    public DescribeDcdnDomainCcActivityLogResponse describeDcdnDomainCcActivityLog(DescribeDcdnDomainCcActivityLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainCcActivityLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate information about an accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate information about an accelerated domain name.</p>
     * 
     * @param request DescribeDcdnDomainCertificateInfoRequest
     * @return DescribeDcdnDomainCertificateInfoResponse
     */
    public DescribeDcdnDomainCertificateInfoResponse describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 80 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Checks whether CNAME records are configured for one or more accelerated domain names.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 80 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Checks whether CNAME records are configured for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDcdnDomainCnameRequest
     * @return DescribeDcdnDomainCnameResponse
     */
    public DescribeDcdnDomainCnameResponse describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainCnameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can query the configurations of one or more features in a request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can query the configurations of one or more features in a request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an accelerated domain name.</p>
     * 
     * @param request DescribeDcdnDomainConfigsRequest
     * @return DescribeDcdnDomainConfigsResponse
     */
    public DescribeDcdnDomainConfigsResponse describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic configuration information about an accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic configuration information about an accelerated domain name.</p>
     * 
     * @param request DescribeDcdnDomainDetailRequest
     * @return DescribeDcdnDomainDetailResponse
     */
    public DescribeDcdnDomainDetailResponse describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1></h1>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratios of one or more accelerated domain names. You can query data collected within the last 90 days.</p>
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
     * <b>description</b> :
     * <h1></h1>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratios of one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainHitRateDataRequest
     * @return DescribeDcdnDomainHitRateDataResponse
     */
    public DescribeDcdnDomainHitRateDataResponse describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from one or more accelerated domain names. Data is collected every 5 minutes. You can query data in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from one or more accelerated domain names. Data is collected every 5 minutes. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainHttpCodeDataRequest
     * @return DescribeDcdnDomainHttpCodeDataResponse
     */
    public DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>You cannot query the distribution of HTTP status codes by IP protocol.</li>
     * <li>If you do not specify the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the data that is collected within the last 24 hours is collected. If you specify both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the data that is collected within the time range that you specify is collected.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution of HTTP status codes by protocol.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>You cannot query the distribution of HTTP status codes by IP protocol.</li>
     * <li>If you do not specify the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the data that is collected within the last 24 hours is collected. If you specify both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the data that is collected within the time range that you specify is collected.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution of HTTP status codes by protocol.</p>
     * 
     * @param request DescribeDcdnDomainHttpCodeDataByLayerRequest
     * @return DescribeDcdnDomainHttpCodeDataByLayerResponse
     */
    public DescribeDcdnDomainHttpCodeDataByLayerResponse describeDcdnDomainHttpCodeDataByLayer(DescribeDcdnDomainHttpCodeDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainHttpCodeDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The bandwidth is measured in bit/s.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth of accelerated domain names for which Layer 4 acceleration is enabled. You can query the data that is collected over the last 90 days.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The bandwidth is measured in bit/s.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth of accelerated domain names for which Layer 4 acceleration is enabled. You can query the data that is collected over the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainIpaBpsDataRequest
     * @return DescribeDcdnDomainIpaBpsDataResponse
     */
    public DescribeDcdnDomainIpaBpsDataResponse describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIpaBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of IPA user connections.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of IPA user connections.</p>
     * 
     * @param request DescribeDcdnDomainIpaConnDataRequest
     * @return DescribeDcdnDomainIpaConnDataResponse
     */
    public DescribeDcdnDomainIpaConnDataResponse describeDcdnDomainIpaConnData(DescribeDcdnDomainIpaConnDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIpaConnDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>Unit: bytes.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic of one or more accelerated domain names for which Layer 4 acceleration is enabled. You can query the data that is collected over the last 90 days.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>Unit: bytes.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic of one or more accelerated domain names for which Layer 4 acceleration is enabled. You can query the data that is collected over the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainIpaTrafficDataRequest
     * @return DescribeDcdnDomainIpaTrafficDataResponse
     */
    public DescribeDcdnDomainIpaTrafficDataResponse describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIpaTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If <strong>StartTime</strong> is set but <strong>EndTime</strong> is not set, the data within the hour that starts from <strong>StartTime</strong> is queried.</li>
     * <li>If <strong>EndTime</strong> is set but <strong>StartTime</strong> is not set, the data within the last hour that precedes <strong>EndTime</strong> is queried.</li>
     * <li>You can query data of a domain name or all domain names that belong to your account.</li>
     * <li>You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by <strong>StartTime</strong> and <strong>EndTime</strong>.<ul>
     * <li><strong>If the time range is shorter than or equal to one hour</strong>, data is queried every minute.</li>
     * <li><strong>If the time range is longer than 1 hour but shorter than or equal to three days</strong>, data is queried every five minutes.</li>
     * <li><strong>If the time range is longer than three days but shorter than or equal to seven days</strong>, data is queried every hour.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of data usage of different Internet service providers (ISPs). You can query data within the last 90 days.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If <strong>StartTime</strong> is set but <strong>EndTime</strong> is not set, the data within the hour that starts from <strong>StartTime</strong> is queried.</li>
     * <li>If <strong>EndTime</strong> is set but <strong>StartTime</strong> is not set, the data within the last hour that precedes <strong>EndTime</strong> is queried.</li>
     * <li>You can query data of a domain name or all domain names that belong to your account.</li>
     * <li>You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by <strong>StartTime</strong> and <strong>EndTime</strong>.<ul>
     * <li><strong>If the time range is shorter than or equal to one hour</strong>, data is queried every minute.</li>
     * <li><strong>If the time range is longer than 1 hour but shorter than or equal to three days</strong>, data is queried every five minutes.</li>
     * <li><strong>If the time range is longer than three days but shorter than or equal to seven days</strong>, data is queried every hour.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of data usage of different Internet service providers (ISPs). You can query data within the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainIspDataRequest
     * @return DescribeDcdnDomainIspDataResponse
     */
    public DescribeDcdnDomainIspDataResponse describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainIspDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.********</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the address where you can download the log data of a domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.********</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the address where you can download the log data of a domain name.</p>
     * 
     * @param request DescribeDcdnDomainLogRequest
     * @return DescribeDcdnDomainLogResponse
     */
    public DescribeDcdnDomainLogResponse describeDcdnDomainLog(DescribeDcdnDomainLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeDcdnDomainLogExTtl</p>
     * 
     * @param request DescribeDcdnDomainLogExTtlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDomainLogExTtlResponse
     */
    public DescribeDcdnDomainLogExTtlResponse describeDcdnDomainLogExTtlWithOptions(DescribeDcdnDomainLogExTtlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeDcdnDomainLogExTtl"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainLogExTtlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeDcdnDomainLogExTtl</p>
     * 
     * @param request DescribeDcdnDomainLogExTtlRequest
     * @return DescribeDcdnDomainLogExTtlResponse
     */
    public DescribeDcdnDomainLogExTtlResponse describeDcdnDomainLogExTtl(DescribeDcdnDomainLogExTtlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainLogExTtlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.</p>
     * <ul>
     * <li>You can specify one or more accelerated domain names. Separate domain names with commas (,).</li>
     * <li>You can query data within the last 90 days.</li>
     * <li>The time range cannot exceed 1 hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the billable items of accelerated domain names. The data is collected at least every 5 minutes. The billable items do not include non-request items.</p>
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
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.</p>
     * <ul>
     * <li>You can specify one or more accelerated domain names. Separate domain names with commas (,).</li>
     * <li>You can query data within the last 90 days.</li>
     * <li>The time range cannot exceed 1 hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the billable items of accelerated domain names. The data is collected at least every 5 minutes. The billable items do not include non-request items.</p>
     * 
     * @param request DescribeDcdnDomainMultiUsageDataRequest
     * @return DescribeDcdnDomainMultiUsageDataResponse
     */
    public DescribeDcdnDomainMultiUsageDataResponse describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainMultiUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the origin bandwidth data for one or more accelerated domain names. You can query data in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the origin bandwidth data for one or more accelerated domain names. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainOriginBpsDataRequest
     * @return DescribeDcdnDomainOriginBpsDataResponse
     */
    public DescribeDcdnDomainOriginBpsDataResponse describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainOriginBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameters, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin traffic of one or more accelerated domain names.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameters, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin traffic of one or more accelerated domain names.</p>
     * 
     * @param request DescribeDcdnDomainOriginTrafficDataRequest
     * @return DescribeDcdnDomainOriginTrafficDataResponse
     */
    public DescribeDcdnDomainOriginTrafficDataResponse describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainOriginTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the protocol type of IP Application Accelerator (IPA).</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the protocol type of IP Application Accelerator (IPA).</p>
     * 
     * @param request DescribeDcdnDomainPropertyRequest
     * @return DescribeDcdnDomainPropertyResponse
     */
    public DescribeDcdnDomainPropertyResponse describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainPropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries page view (PV) data of an accelerated domain name. Data can be collected at minimum intervals of one hour.</p>
     * 
     * @param request DescribeDcdnDomainPvDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDomainPvDataResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries page view (PV) data of an accelerated domain name. Data can be collected at minimum intervals of one hour.</p>
     * 
     * @param request DescribeDcdnDomainPvDataRequest
     * @return DescribeDcdnDomainPvDataResponse
     */
    public DescribeDcdnDomainPvDataResponse describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainPvDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of requests to an accelerated domain name per second. You can query data in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of requests to an accelerated domain name per second. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainQpsDataRequest
     * @return DescribeDcdnDomainQpsDataResponse
     */
    public DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The number of queries per second in the Chinese mainland.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The number of queries per second in the Chinese mainland.</p>
     * 
     * @param request DescribeDcdnDomainQpsDataByLayerRequest
     * @return DescribeDcdnDomainQpsDataByLayerResponse
     */
    public DescribeDcdnDomainQpsDataByLayerResponse describeDcdnDomainQpsDataByLayer(DescribeDcdnDomainQpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainQpsDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last hour by default. If you specify both parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time network bandwidth of a domain name.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDomainRealTimeBpsDataResponse
     */
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

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last hour by default. If you specify both parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time network bandwidth of a domain name.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeBpsDataRequest
     * @return DescribeDcdnDomainRealTimeBpsDataResponse
     */
    public DescribeDcdnDomainRealTimeBpsDataResponse describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last hour. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries byte hit ratios at a time granularity of 1 minute.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last hour. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries byte hit ratios at a time granularity of 1 minute.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeByteHitRateDataRequest
     * @return DescribeDcdnDomainRealTimeByteHitRateDataResponse
     */
    public DescribeDcdnDomainRealTimeByteHitRateDataResponse describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>This operation is available only to users whose daily peak bandwidth value is higher than 1 Gbit/s. If you meet this requirement, you can <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to apply for permissions to use this operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic usage through each Internet service provider (ISP) and the number of visits in each region. The resolution of the data is one minute. The maximum time range to query for this operation is 10 minutes.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>This operation is available only to users whose daily peak bandwidth value is higher than 1 Gbit/s. If you meet this requirement, you can <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to apply for permissions to use this operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries traffic usage through each Internet service provider (ISP) and the number of visits in each region. The resolution of the data is one minute. The maximum time range to query for this operation is 10 minutes.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeDetailDataRequest
     * @return DescribeDcdnDomainRealTimeDetailDataResponse
     */
    public DescribeDcdnDomainRealTimeDetailDataResponse describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from one or more accelerated domain names.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from one or more accelerated domain names.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeHttpCodeDataRequest
     * @return DescribeDcdnDomainRealTimeHttpCodeDataResponse
     */
    public DescribeDcdnDomainRealTimeHttpCodeDataResponse describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The number of QPS for one or more accelerated domain names is queried. Data is collected every minute.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The number of QPS for one or more accelerated domain names is queried. Data is collected every minute.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeQpsDataRequest
     * @return DescribeDcdnDomainRealTimeQpsDataResponse
     */
    public DescribeDcdnDomainRealTimeQpsDataResponse describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last hour. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit rates with a time granularity of 1 minute.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last hour. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit rates with a time granularity of 1 minute.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeReqHitRateDataRequest
     * @return DescribeDcdnDomainRealTimeReqHitRateDataResponse
     */
    public DescribeDcdnDomainRealTimeReqHitRateDataResponse describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data of back-to-origin requests. Data is collected every minute. You can query data collected in the last 7 days.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data of back-to-origin requests. Data is collected every minute. You can query data collected in the last 7 days.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeSrcBpsDataRequest
     * @return DescribeDcdnDomainRealTimeSrcBpsDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcBpsDataResponse describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of HTTP status codes based on back-to-origin statistics with a time granularity of one minute.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of HTTP status codes based on back-to-origin statistics with a time granularity of one minute.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest
     * @return DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the origin traffic monitoring data for an accelerated domain name. Data is collected every minute. You can query data in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the origin traffic monitoring data for an accelerated domain name. Data is collected every minute. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeSrcTrafficDataRequest
     * @return DescribeDcdnDomainRealTimeSrcTrafficDataResponse
     */
    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per user.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic monitoring data of an accelerated domain name. Data is collected every minute.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per user.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic monitoring data of an accelerated domain name. Data is collected every minute.</p>
     * 
     * @param request DescribeDcdnDomainRealTimeTrafficDataRequest
     * @return DescribeDcdnDomainRealTimeTrafficDataResponse
     */
    public DescribeDcdnDomainRealTimeTrafficDataResponse describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries regional distribution of users. Data is collected every day. You can query data within the last 90 days.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries regional distribution of users. Data is collected every day. You can query data within the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainRegionDataRequest
     * @return DescribeDcdnDomainRegionDataResponse
     */
    public DescribeDcdnDomainRegionDataResponse describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainRegionDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the environment configuration in the canary release environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the environment configuration in the canary release environment.</p>
     * 
     * @param request DescribeDcdnDomainStagingConfigRequest
     * @return DescribeDcdnDomainStagingConfigResponse
     */
    public DescribeDcdnDomainStagingConfigResponse describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime parameter, the data on the previous day is queried.</p>
     * <ul>
     * <li>You can specify only one domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries and sorts frequently requested web pages on a specified day. You can query data collected within the last 90 days.</p>
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
     * <b>description</b> :
     * <p>  If you do not set the StartTime parameter, the data on the previous day is queried.</p>
     * <ul>
     * <li>You can specify only one domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries and sorts frequently requested web pages on a specified day. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainTopReferVisitRequest
     * @return DescribeDcdnDomainTopReferVisitResponse
     */
    public DescribeDcdnDomainTopReferVisitResponse describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainTopReferVisitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query data in the last seven days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries frequently requested URLs on a day.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can query data in the last seven days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries frequently requested URLs on a day.</p>
     * 
     * @param request DescribeDcdnDomainTopUrlVisitRequest
     * @return DescribeDcdnDomainTopUrlVisitResponse
     */
    public DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainTopUrlVisitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the network traffic of accelerated domain names. You can query data collected in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the network traffic of accelerated domain names. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainTrafficDataRequest
     * @return DescribeDcdnDomainTrafficDataResponse
     */
    public DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries resource usage about domain names in a billable region.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries resource usage about domain names in a billable region.</p>
     * 
     * @param request DescribeDcdnDomainUsageDataRequest
     * @return DescribeDcdnDomainUsageDataResponse
     */
    public DescribeDcdnDomainUsageDataResponse describeDcdnDomainUsageData(DescribeDcdnDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of unique visitors (UVs) to an accelerated domain name. Data is collected every hour. You can query data within the last 90 days.</p>
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
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of unique visitors (UVs) to an accelerated domain name. Data is collected every hour. You can query data within the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainUvDataRequest
     * @return DescribeDcdnDomainUvDataResponse
     */
    public DescribeDcdnDomainUvDataResponse describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainUvDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth of one or more accelerated domain names for which WebSocket is enabled. You can query the data that is collected over the last 90 days.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth of one or more accelerated domain names for which WebSocket is enabled. You can query the data that is collected over the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainWebsocketBpsDataRequest
     * @return DescribeDcdnDomainWebsocketBpsDataResponse
     */
    public DescribeDcdnDomainWebsocketBpsDataResponse describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainWebsocketBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>The total number and proportions of HTTP status codes returned from one or more accelerated domain names for which WebSocket is enabled are queried. Data can be collected at minimum intervals of 5 minutes.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>The total number and proportions of HTTP status codes returned from one or more accelerated domain names for which WebSocket is enabled are queried. Data can be collected at minimum intervals of 5 minutes.</p>
     * 
     * @param request DescribeDcdnDomainWebsocketHttpCodeDataRequest
     * @return DescribeDcdnDomainWebsocketHttpCodeDataResponse
     */
    public DescribeDcdnDomainWebsocketHttpCodeDataResponse describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainWebsocketHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic monitoring data for an accelerated domain name with WebSocket enabled. You can query data in the last 90 days.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic monitoring data for an accelerated domain name with WebSocket enabled. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDcdnDomainWebsocketTrafficDataRequest
     * @return DescribeDcdnDomainWebsocketTrafficDataResponse
     */
    public DescribeDcdnDomainWebsocketTrafficDataResponse describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainWebsocketTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DCDN-accelerated domain names by origin server.</p>
     * 
     * @param request DescribeDcdnDomainsBySourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnDomainsBySourceResponse
     */
    public DescribeDcdnDomainsBySourceResponse describeDcdnDomainsBySourceWithOptions(DescribeDcdnDomainsBySourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnDomainsBySource"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnDomainsBySourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DCDN-accelerated domain names by origin server.</p>
     * 
     * @param request DescribeDcdnDomainsBySourceRequest
     * @return DescribeDcdnDomainsBySourceResponse
     */
    public DescribeDcdnDomainsBySourceResponse describeDcdnDomainsBySource(DescribeDcdnDomainsBySourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnDomainsBySourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of times that a routine is executed within a specified period of time.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of times that a routine is executed within a specified period of time.</p>
     * 
     * @param request DescribeDcdnErUsageDataRequest
     * @return DescribeDcdnErUsageDataResponse
     */
    public DescribeDcdnErUsageDataResponse describeDcdnErUsageData(DescribeDcdnErUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnErUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>If you specify IP addresses or CIDR blocks, IP addresses that are effective and the corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.</li>
     * <li>The results are written to OSS and returned as OSS URLs. The content in OSS objects is in the format of <code>IP address-Corresponding expiration time</code>. The expiration time is in the YYYY-MM-DD hh:mm:ss format.</li>
     * <li>You can share OSS URLs with others. The shared URLs are valid for three days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of blocked IP addresses.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>If you specify IP addresses or CIDR blocks, IP addresses that are effective and the corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.</li>
     * <li>The results are written to OSS and returned as OSS URLs. The content in OSS objects is in the format of <code>IP address-Corresponding expiration time</code>. The expiration time is in the YYYY-MM-DD hh:mm:ss format.</li>
     * <li>You can share OSS URLs with others. The shared URLs are valid for three days.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of blocked IP addresses.</p>
     * 
     * @param request DescribeDcdnFullDomainsBlockIPConfigRequest
     * @return DescribeDcdnFullDomainsBlockIPConfigResponse
     */
    public DescribeDcdnFullDomainsBlockIPConfigResponse describeDcdnFullDomainsBlockIPConfig(DescribeDcdnFullDomainsBlockIPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnFullDomainsBlockIPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.</p>
     * <ul>
     * <li>If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.</li>
     * <li>The maximum time range to query is 90 days.</li>
     * <li>If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询用户海量封禁历史</p>
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
     * <b>description</b> :
     * <p>  For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.</p>
     * <ul>
     * <li>If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.</li>
     * <li>The maximum time range to query is 90 days.</li>
     * <li>If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询用户海量封禁历史</p>
     * 
     * @param request DescribeDcdnFullDomainsBlockIPHistoryRequest
     * @return DescribeDcdnFullDomainsBlockIPHistoryResponse
     */
    public DescribeDcdnFullDomainsBlockIPHistoryResponse describeDcdnFullDomainsBlockIPHistory(DescribeDcdnFullDomainsBlockIPHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnFullDomainsBlockIPHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about all certificates that belong to your account.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about all certificates that belong to your account.</p>
     * 
     * @param request DescribeDcdnHttpsDomainListRequest
     * @return DescribeDcdnHttpsDomainListResponse
     */
    public DescribeDcdnHttpsDomainListResponse describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnHttpsDomainListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether an IP address belongs to a POP.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether an IP address belongs to a POP.</p>
     * 
     * @param request DescribeDcdnIpInfoRequest
     * @return DescribeDcdnIpInfoResponse
     */
    public DescribeDcdnIpInfoResponse describeDcdnIpInfo(DescribeDcdnIpInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation can be called globally up to 50 times per second. This operation can be called up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin CIDR blocks of IPA-accelerated domain names. If you want to call this API operation, you must submit a ticket to apply for the required permissions.</p>
     * 
     * @param request DescribeDcdnIpaDomainCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnIpaDomainCidrResponse
     */
    public DescribeDcdnIpaDomainCidrResponse describeDcdnIpaDomainCidrWithOptions(DescribeDcdnIpaDomainCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnIpaDomainCidr"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnIpaDomainCidrResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation can be called globally up to 50 times per second. This operation can be called up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the back-to-origin CIDR blocks of IPA-accelerated domain names. If you want to call this API operation, you must submit a ticket to apply for the required permissions.</p>
     * 
     * @param request DescribeDcdnIpaDomainCidrRequest
     * @return DescribeDcdnIpaDomainCidrResponse
     */
    public DescribeDcdnIpaDomainCidrResponse describeDcdnIpaDomainCidr(DescribeDcdnIpaDomainCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaDomainCidrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an accelerated domain name. You can query the configurations of one or more features in each request.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an accelerated domain name. You can query the configurations of one or more features in each request.</p>
     * 
     * @param request DescribeDcdnIpaDomainConfigsRequest
     * @return DescribeDcdnIpaDomainConfigsResponse
     */
    public DescribeDcdnIpaDomainConfigsResponse describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic configuration information about an accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic configuration information about an accelerated domain name.</p>
     * 
     * @param request DescribeDcdnIpaDomainDetailRequest
     * @return DescribeDcdnIpaDomainDetailResponse
     */
    public DescribeDcdnIpaDomainDetailResponse describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**The maximum number of times that each user can call this operation per second is 20.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of IPA. The information includes the time when the service was activated, the current service status, the current billing method, and the billing method of the next cycle.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>**The maximum number of times that each user can call this operation per second is 20.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of IPA. The information includes the time when the service was activated, the current service status, the current billing method, and the billing method of the next cycle.</p>
     * 
     * @param request DescribeDcdnIpaServiceRequest
     * @return DescribeDcdnIpaServiceResponse
     */
    public DescribeDcdnIpaServiceResponse describeDcdnIpaService(DescribeDcdnIpaServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about all domain names that are accelerated by IP Application Accelerator (IPA) in your account. Fuzzy search and filtering by domain status are supported.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about all domain names that are accelerated by IP Application Accelerator (IPA) in your account. Fuzzy search and filtering by domain status are supported.</p>
     * 
     * @param request DescribeDcdnIpaUserDomainsRequest
     * @return DescribeDcdnIpaUserDomainsResponse
     */
    public DescribeDcdnIpaUserDomainsResponse describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnIpaUserDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the key-value pairs that belong to your account.</p>
     * 
     * @param request DescribeDcdnKvAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnKvAccountResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the key-value pairs that belong to your account.</p>
     * @return DescribeDcdnKvAccountResponse
     */
    public DescribeDcdnKvAccountResponse describeDcdnKvAccount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnKvAccountWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the KV status of an account.</p>
     * 
     * @param request DescribeDcdnKvAccountStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnKvAccountStatusResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the KV status of an account.</p>
     * @return DescribeDcdnKvAccountStatusResponse
     */
    public DescribeDcdnKvAccountStatusResponse describeDcdnKvAccountStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnKvAccountStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace.</p>
     * 
     * @param request DescribeDcdnKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnKvNamespaceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace.</p>
     * 
     * @param request DescribeDcdnKvNamespaceRequest
     * @return DescribeDcdnKvNamespaceResponse
     */
    public DescribeDcdnKvNamespaceResponse describeDcdnKvNamespace(DescribeDcdnKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To use this operation, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries CIDR blocks of Dynamic Content Delivery Network (DCDN) points of presence (POPs).</p>
     * 
     * @param request DescribeDcdnL2IpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnL2IpsResponse
     */
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To use this operation, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries CIDR blocks of Dynamic Content Delivery Network (DCDN) points of presence (POPs).</p>
     * @return DescribeDcdnL2IpsResponse
     */
    public DescribeDcdnL2IpsResponse describeDcdnL2Ips() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnL2IpsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the origin CIDR blocks by domain name. The CIDR blocks include IPv4 and IPv6 CIDR blocks.</p>
     * 
     * @param request DescribeDcdnL2VipsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnL2VipsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the origin CIDR blocks by domain name. The CIDR blocks include IPv4 and IPv6 CIDR blocks.</p>
     * 
     * @param request DescribeDcdnL2VipsRequest
     * @return DescribeDcdnL2VipsResponse
     */
    public DescribeDcdnL2VipsResponse describeDcdnL2Vips(DescribeDcdnL2VipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnL2VipsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the origin server for a DCDN-accelerated domain name.</p>
     * 
     * @param request DescribeDcdnOriginSiteHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnOriginSiteHealthStatusResponse
     */
    public DescribeDcdnOriginSiteHealthStatusResponse describeDcdnOriginSiteHealthStatusWithOptions(DescribeDcdnOriginSiteHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnOriginSiteHealthStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnOriginSiteHealthStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the origin server for a DCDN-accelerated domain name.</p>
     * 
     * @param request DescribeDcdnOriginSiteHealthStatusRequest
     * @return DescribeDcdnOriginSiteHealthStatusResponse
     */
    public DescribeDcdnOriginSiteHealthStatusResponse describeDcdnOriginSiteHealthStatus(DescribeDcdnOriginSiteHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnOriginSiteHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the fields in real-time log entries.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the fields in real-time log entries.</p>
     * 
     * @param request DescribeDcdnRealTimeDeliveryFieldRequest
     * @return DescribeDcdnRealTimeDeliveryFieldResponse
     */
    public DescribeDcdnRealTimeDeliveryFieldResponse describeDcdnRealTimeDeliveryField(DescribeDcdnRealTimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRealTimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call the <strong>RefreshDcdnObjectCaches</strong> operation to refresh content and call the <strong>PreloadDcdnObjectCaches</strong> operation to prefetch content.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum number and the remaining number of URLs and directories that can be refreshed or the maximum number and the remaining number of URLs that can be prefetched per day.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call the <strong>RefreshDcdnObjectCaches</strong> operation to refresh content and call the <strong>PreloadDcdnObjectCaches</strong> operation to prefetch content.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum number and the remaining number of URLs and directories that can be refreshed or the maximum number and the remaining number of URLs that can be prefetched per day.</p>
     * 
     * @param request DescribeDcdnRefreshQuotaRequest
     * @return DescribeDcdnRefreshQuotaResponse
     */
    public DescribeDcdnRefreshQuotaResponse describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRefreshQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can query data within the last three days.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of refresh or prefetch tasks by task ID.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can query data within the last three days.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of refresh or prefetch tasks by task ID.</p>
     * 
     * @param request DescribeDcdnRefreshTaskByIdRequest
     * @return DescribeDcdnRefreshTaskByIdResponse
     */
    public DescribeDcdnRefreshTaskByIdResponse describeDcdnRefreshTaskById(DescribeDcdnRefreshTaskByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRefreshTaskByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query the refresh or prefetch tasks by ID or URL.</p>
     * <ul>
     * <li>You can set both <strong>TaskId</strong> and <strong>ObjectPath</strong> in a request. If you do not set <strong>TaskId</strong> or <strong>ObjectPath</strong>, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.</li>
     * <li>If you specify <strong>DomainName</strong> or <strong>Status</strong>, you must also specify <strong>ObjectType</strong>.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the refresh or prefetch tasks. You can query the tasks in the last three days.</p>
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
     * <b>description</b> :
     * <p>  You can query the refresh or prefetch tasks by ID or URL.</p>
     * <ul>
     * <li>You can set both <strong>TaskId</strong> and <strong>ObjectPath</strong> in a request. If you do not set <strong>TaskId</strong> or <strong>ObjectPath</strong>, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.</li>
     * <li>If you specify <strong>DomainName</strong> or <strong>Status</strong>, you must also specify <strong>ObjectType</strong>.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the refresh or prefetch tasks. You can query the tasks in the last three days.</p>
     * 
     * @param request DescribeDcdnRefreshTasksRequest
     * @return DescribeDcdnRefreshTasksResponse
     */
    public DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRefreshTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Internet service providers (ISPs) and regions.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Internet service providers (ISPs) and regions.</p>
     * 
     * @param request DescribeDcdnRegionAndIspRequest
     * @return DescribeDcdnRegionAndIspResponse
     */
    public DescribeDcdnRegionAndIspResponse describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnRegionAndIspWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of an operations report.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of an operations report.</p>
     * 
     * @param request DescribeDcdnReportRequest
     * @return DescribeDcdnReportResponse
     */
    public DescribeDcdnReportResponse describeDcdnReport(DescribeDcdnReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation queries the metadata of all operations reports. The statistics in the reports are not returned.</li>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries custom operations reports.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation queries the metadata of all operations reports. The statistics in the reports are not returned.</li>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries custom operations reports.</p>
     * 
     * @param request DescribeDcdnReportListRequest
     * @return DescribeDcdnReportListResponse
     */
    public DescribeDcdnReportListResponse describeDcdnReportList(DescribeDcdnReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnReportListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported types of real-time logs.</p>
     * 
     * @param request DescribeDcdnSLSRealTimeLogTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnSLSRealTimeLogTypeResponse
     */
    public DescribeDcdnSLSRealTimeLogTypeResponse describeDcdnSLSRealTimeLogTypeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSLSRealTimeLogType"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSLSRealTimeLogTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported types of real-time logs.</p>
     * @return DescribeDcdnSLSRealTimeLogTypeResponse
     */
    public DescribeDcdnSLSRealTimeLogTypeResponse describeDcdnSLSRealTimeLogType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSLSRealTimeLogTypeWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a real-time log delivery project.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a real-time log delivery project.</p>
     * 
     * @param request DescribeDcdnSLSRealtimeLogDeliveryRequest
     * @return DescribeDcdnSLSRealtimeLogDeliveryResponse
     */
    public DescribeDcdnSLSRealtimeLogDeliveryResponse describeDcdnSLSRealtimeLogDelivery(DescribeDcdnSLSRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSLSRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a ShangMi (SM) certificate.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a ShangMi (SM) certificate.</p>
     * 
     * @param request DescribeDcdnSMCertificateDetailRequest
     * @return DescribeDcdnSMCertificateDetailResponse
     */
    public DescribeDcdnSMCertificateDetailResponse describeDcdnSMCertificateDetail(DescribeDcdnSMCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSMCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the ShangMi (SM) certificates of an accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the ShangMi (SM) certificates of an accelerated domain name.</p>
     * 
     * @param request DescribeDcdnSMCertificateListRequest
     * @return DescribeDcdnSMCertificateListResponse
     */
    public DescribeDcdnSMCertificateListResponse describeDcdnSMCertificateList(DescribeDcdnSMCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSMCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates of accelerated domain names.</p>
     * 
     * @param request DescribeDcdnSSLCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnSSLCertificateListResponse
     */
    public DescribeDcdnSSLCertificateListResponse describeDcdnSSLCertificateListWithOptions(DescribeDcdnSSLCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            query.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnSSLCertificateList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnSSLCertificateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates of accelerated domain names.</p>
     * 
     * @param request DescribeDcdnSSLCertificateListRequest
     * @return DescribeDcdnSSLCertificateListResponse
     */
    public DescribeDcdnSSLCertificateListResponse describeDcdnSSLCertificateList(DescribeDcdnSSLCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSSLCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an edge security drop-down list in the Dynamic Content Delivery Network (DCDN) console.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an edge security drop-down list in the Dynamic Content Delivery Network (DCDN) console.</p>
     * 
     * @param request DescribeDcdnSecFuncInfoRequest
     * @return DescribeDcdnSecFuncInfoResponse
     */
    public DescribeDcdnSecFuncInfoResponse describeDcdnSecFuncInfo(DescribeDcdnSecFuncInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSecFuncInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the version of secure Dynamic Route for CDN (DCDN) and the security rules.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the version of secure Dynamic Route for CDN (DCDN) and the security rules.</p>
     * @return DescribeDcdnSecSpecInfoResponse
     */
    public DescribeDcdnSecSpecInfoResponse describeDcdnSecSpecInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSecSpecInfoWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the Dynamic Content Delivery Network (DCDN) service. The information includes the time when the service was activated, the current service status, the current billing method, and the billing method of the next cycle.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the Dynamic Content Delivery Network (DCDN) service. The information includes the time when the service was activated, the current service status, the current billing method, and the billing method of the next cycle.</p>
     * 
     * @param request DescribeDcdnServiceRequest
     * @return DescribeDcdnServiceResponse
     */
    public DescribeDcdnServiceResponse describeDcdnService(DescribeDcdnServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries valid virtual IP addresses (VIPs) in the staging environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries valid virtual IP addresses (VIPs) in the staging environment.</p>
     * @return DescribeDcdnStagingIpResponse
     */
    public DescribeDcdnStagingIpResponse describeDcdnStagingIp() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnStagingIpWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.</li>
     * <li>You can call this API operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries custom operations reports.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.</li>
     * <li>You can call this API operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries custom operations reports.</p>
     * @return DescribeDcdnSubListResponse
     */
    public DescribeDcdnSubListResponse describeDcdnSubList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnSubListWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of one or more resources.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of one or more resources.</p>
     * 
     * @param request DescribeDcdnTagResourcesRequest
     * @return DescribeDcdnTagResourcesResponse
     */
    public DescribeDcdnTagResourcesResponse describeDcdnTagResources(DescribeDcdnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not specify the StartTime and EndTime parameters, the data within the current month is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names ranked by network traffic. You can query data within the last 90 days.</p>
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
     * <b>description</b> :
     * <p>If you do not specify the StartTime and EndTime parameters, the data within the current month is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names ranked by network traffic. You can query data within the last 90 days.</p>
     * 
     * @param request DescribeDcdnTopDomainsByFlowRequest
     * @return DescribeDcdnTopDomainsByFlowResponse
     */
    public DescribeDcdnTopDomainsByFlowResponse describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnTopDomainsByFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the billing records of an Alibaba Cloud account. The maximum time range that you can specify is one month.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the billing records of an Alibaba Cloud account. The maximum time range that you can specify is one month.</p>
     * 
     * @param request DescribeDcdnUserBillHistoryRequest
     * @return DescribeDcdnUserBillHistoryResponse
     */
    public DescribeDcdnUserBillHistoryResponse describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserBillHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering method that is used in Dynamic Content Delivery Network (DCDN).</p>
     * 
     * @param request DescribeDcdnUserBillTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnUserBillTypeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the metering method that is used in Dynamic Content Delivery Network (DCDN).</p>
     * 
     * @param request DescribeDcdnUserBillTypeRequest
     * @return DescribeDcdnUserBillTypeResponse
     */
    public DescribeDcdnUserBillTypeResponse describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserBillTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of domain names whose SSL certificates are about to expire or have already expired.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of domain names whose SSL certificates are about to expire or have already expired.</p>
     * @return DescribeDcdnUserCertificateExpireCountResponse
     */
    public DescribeDcdnUserCertificateExpireCountResponse describeDcdnUserCertificateExpireCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserCertificateExpireCountWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of security features.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of security features.</p>
     * 
     * @param request DescribeDcdnUserConfigsRequest
     * @return DescribeDcdnUserConfigsResponse
     */
    public DescribeDcdnUserConfigsResponse describeDcdnUserConfigs(DescribeDcdnUserConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 80 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the accelerated domain names that belong to your Alibaba Cloud account. You can filter domains by name or by status. Fuzzy match is supported when you filter domains by name.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.webSiteType)) {
            query.put("WebSiteType", request.webSiteType);
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 80 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the accelerated domain names that belong to your Alibaba Cloud account. You can filter domains by name or by status. Fuzzy match is supported when you filter domains by name.</p>
     * 
     * @param request DescribeDcdnUserDomainsRequest
     * @return DescribeDcdnUserDomainsResponse
     */
    public DescribeDcdnUserDomainsResponse describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all accelerated domain names with specified features configured that belong to your Alibaba Cloud account based on the FuncId parameter.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all accelerated domain names with specified features configured that belong to your Alibaba Cloud account based on the FuncId parameter.</p>
     * 
     * @param request DescribeDcdnUserDomainsByFuncRequest
     * @return DescribeDcdnUserDomainsByFuncResponse
     */
    public DescribeDcdnUserDomainsByFuncResponse describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserDomainsByFuncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 30.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource quotas and the used resources.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 30.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource quotas and the used resources.</p>
     * 
     * @param request DescribeDcdnUserQuotaRequest
     * @return DescribeDcdnUserQuotaResponse
     */
    public DescribeDcdnUserQuotaResponse describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the fields that are selected.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the fields that are selected.</p>
     * 
     * @param request DescribeDcdnUserRealTimeDeliveryFieldRequest
     * @return DescribeDcdnUserRealTimeDeliveryFieldResponse
     */
    public DescribeDcdnUserRealTimeDeliveryFieldResponse describeDcdnUserRealTimeDeliveryField(DescribeDcdnUserRealTimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserRealTimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The maximum number of times that each user can call this operation per second is 30.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the resource plans in your Alibaba Cloud account.</p>
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
     * <b>description</b> :
     * <p>The maximum number of times that each user can call this operation per second is 30.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the resource plans in your Alibaba Cloud account.</p>
     * 
     * @param request DescribeDcdnUserResourcePackageRequest
     * @return DescribeDcdnUserResourcePackageResponse
     */
    public DescribeDcdnUserResourcePackageResponse describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserResourcePackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of packets blocked by a specified security feature.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of packets blocked by a specified security feature.</p>
     * 
     * @param request DescribeDcdnUserSecDropRequest
     * @return DescribeDcdnUserSecDropResponse
     */
    public DescribeDcdnUserSecDropResponse describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserSecDropWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of packets that are blocked by security features at the application layer in a specific time range.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of packets that are blocked by security features at the application layer in a specific time range.</p>
     * 
     * @param request DescribeDcdnUserSecDropByMinuteRequest
     * @return DescribeDcdnUserSecDropByMinuteResponse
     */
    public DescribeDcdnUserSecDropByMinuteResponse describeDcdnUserSecDropByMinute(DescribeDcdnUserSecDropByMinuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserSecDropByMinuteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries user tags.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries user tags.</p>
     * @return DescribeDcdnUserTagsResponse
     */
    public DescribeDcdnUserTagsResponse describeDcdnUserTags() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserTagsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries virtual IP addresses of the POPs by domain name.</p>
     * 
     * @param request DescribeDcdnUserVipsByDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnUserVipsByDomainResponse
     */
    public DescribeDcdnUserVipsByDomainResponse describeDcdnUserVipsByDomainWithOptions(DescribeDcdnUserVipsByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.available)) {
            query.put("Available", request.available);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnUserVipsByDomain"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnUserVipsByDomainResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries virtual IP addresses of the POPs by domain name.</p>
     * 
     * @param request DescribeDcdnUserVipsByDomainRequest
     * @return DescribeDcdnUserVipsByDomainResponse
     */
    public DescribeDcdnUserVipsByDomainResponse describeDcdnUserVipsByDomain(DescribeDcdnUserVipsByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnUserVipsByDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the ownership verification content of a domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the ownership verification content of a domain name.</p>
     * 
     * @param request DescribeDcdnVerifyContentRequest
     * @return DescribeDcdnVerifyContentResponse
     */
    public DescribeDcdnVerifyContentResponse describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnVerifyContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SDK authentication key for the Alibaba Cloud account. You can also use the SDK authentication key to send SDK initialization requests. The key must be included in the integration code.</p>
     * 
     * @param request DescribeDcdnWafBotAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnWafBotAppKeyResponse
     */
    public DescribeDcdnWafBotAppKeyResponse describeDcdnWafBotAppKeyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafBotAppKey"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafBotAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SDK authentication key for the Alibaba Cloud account. You can also use the SDK authentication key to send SDK initialization requests. The key must be included in the integration code.</p>
     * @return DescribeDcdnWafBotAppKeyResponse
     */
    public DescribeDcdnWafBotAppKeyResponse describeDcdnWafBotAppKey() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafBotAppKeyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default configurations of a WAF rule.</p>
     * 
     * @param request DescribeDcdnWafDefaultRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnWafDefaultRulesResponse
     */
    public DescribeDcdnWafDefaultRulesResponse describeDcdnWafDefaultRulesWithOptions(DescribeDcdnWafDefaultRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryArgs)) {
            query.put("QueryArgs", request.queryArgs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafDefaultRules"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafDefaultRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default configurations of a WAF rule.</p>
     * 
     * @param request DescribeDcdnWafDefaultRulesRequest
     * @return DescribeDcdnWafDefaultRulesResponse
     */
    public DescribeDcdnWafDefaultRulesResponse describeDcdnWafDefaultRules(DescribeDcdnWafDefaultRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDefaultRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names that have Web Application Firewall (WAF) enabled and the relevant information, including the status of the access control list (ACL), protection against HTTP flood attacks, domain name, and WAF.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names that have Web Application Firewall (WAF) enabled and the relevant information, including the status of the access control list (ACL), protection against HTTP flood attacks, domain name, and WAF.</p>
     * 
     * @param request DescribeDcdnWafDomainRequest
     * @return DescribeDcdnWafDomainResponse
     */
    public DescribeDcdnWafDomainResponse describeDcdnWafDomain(DescribeDcdnWafDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the protection policy of a domain name.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the protection policy of a domain name.</p>
     * 
     * @param request DescribeDcdnWafDomainDetailRequest
     * @return DescribeDcdnWafDomainDetailResponse
     */
    public DescribeDcdnWafDomainDetailResponse describeDcdnWafDomainDetail(DescribeDcdnWafDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the accelerated domain names that are protected by Web Application Firewall (WAF). Fuzzy search is supported.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the accelerated domain names that are protected by Web Application Firewall (WAF). Fuzzy search is supported.</p>
     * 
     * @param request DescribeDcdnWafDomainsRequest
     * @return DescribeDcdnWafDomainsResponse
     */
    public DescribeDcdnWafDomainsResponse describeDcdnWafDomains(DescribeDcdnWafDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about match conditions in a custom protection rule, such as the match fields, logical characters, and match content.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about match conditions in a custom protection rule, such as the match fields, logical characters, and match content.</p>
     * 
     * @param request DescribeDcdnWafFilterInfoRequest
     * @return DescribeDcdnWafFilterInfoResponse
     */
    public DescribeDcdnWafFilterInfoResponse describeDcdnWafFilterInfo(DescribeDcdnWafFilterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafFilterInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the countries and regions that can be added to the blacklist of Web Application Firewall (WAF).</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the countries and regions that can be added to the blacklist of Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeDcdnWafGeoInfoRequest
     * @return DescribeDcdnWafGeoInfoResponse
     */
    public DescribeDcdnWafGeoInfoResponse describeDcdnWafGeoInfo(DescribeDcdnWafGeoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafGeoInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom WAF rule group by page.</p>
     * 
     * @param request DescribeDcdnWafGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnWafGroupResponse
     */
    public DescribeDcdnWafGroupResponse describeDcdnWafGroupWithOptions(DescribeDcdnWafGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgs)) {
            query.put("QueryArgs", request.queryArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDcdnWafGroup"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom WAF rule group by page.</p>
     * 
     * @param request DescribeDcdnWafGroupRequest
     * @return DescribeDcdnWafGroupResponse
     */
    public DescribeDcdnWafGroupResponse describeDcdnWafGroup(DescribeDcdnWafGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom Web Application Firewall (WAF) rule groups.</p>
     * 
     * @param request DescribeDcdnWafGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDcdnWafGroupsResponse
     */
    public DescribeDcdnWafGroupsResponse describeDcdnWafGroupsWithOptions(DescribeDcdnWafGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

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
            new TeaPair("action", "DescribeDcdnWafGroups"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDcdnWafGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom Web Application Firewall (WAF) rule groups.</p>
     * 
     * @param request DescribeDcdnWafGroupsRequest
     * @return DescribeDcdnWafGroupsResponse
     */
    public DescribeDcdnWafGroupsResponse describeDcdnWafGroups(DescribeDcdnWafGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>The log data is collected every hour.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the address from which you can download the Web Application Firewall (WAF) logs of a domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>The log data is collected every hour.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the address from which you can download the Web Application Firewall (WAF) logs of a domain name.</p>
     * 
     * @param request DescribeDcdnWafLogsRequest
     * @return DescribeDcdnWafLogsResponse
     */
    public DescribeDcdnWafLogsResponse describeDcdnWafLogs(DescribeDcdnWafLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the Web Application Firewall (WAF) protection policies that you configured.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the Web Application Firewall (WAF) protection policies that you configured.</p>
     * 
     * @param request DescribeDcdnWafPoliciesRequest
     * @return DescribeDcdnWafPoliciesResponse
     */
    public DescribeDcdnWafPoliciesResponse describeDcdnWafPolicies(DescribeDcdnWafPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a protection policy.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a protection policy.</p>
     * 
     * @param request DescribeDcdnWafPolicyRequest
     * @return DescribeDcdnWafPolicyResponse
     */
    public DescribeDcdnWafPolicyResponse describeDcdnWafPolicy(DescribeDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the accelerated domain names that are protected by a specified Web Application Firewall (WAF) protection policy.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the accelerated domain names that are protected by a specified Web Application Firewall (WAF) protection policy.</p>
     * 
     * @param request DescribeDcdnWafPolicyDomainsRequest
     * @return DescribeDcdnWafPolicyDomainsResponse
     */
    public DescribeDcdnWafPolicyDomainsResponse describeDcdnWafPolicyDomains(DescribeDcdnWafPolicyDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPolicyDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names that can be bound to a custom protection policy.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names that can be bound to a custom protection policy.</p>
     * 
     * @param request DescribeDcdnWafPolicyValidDomainsRequest
     * @return DescribeDcdnWafPolicyValidDomainsResponse
     */
    public DescribeDcdnWafPolicyValidDomainsResponse describeDcdnWafPolicyValidDomains(DescribeDcdnWafPolicyValidDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafPolicyValidDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1></h1>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified protection rule.</p>
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
     * <b>description</b> :
     * <h1></h1>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified protection rule.</p>
     * 
     * @param request DescribeDcdnWafRuleRequest
     * @return DescribeDcdnWafRuleResponse
     */
    public DescribeDcdnWafRuleResponse describeDcdnWafRule(DescribeDcdnWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the protection rules that you configured.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the protection rules that you configured.</p>
     * 
     * @param request DescribeDcdnWafRulesRequest
     * @return DescribeDcdnWafRulesResponse
     */
    public DescribeDcdnWafRulesResponse describeDcdnWafRules(DescribeDcdnWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the type of the protection policy that you use.</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the type of the protection policy that you use.</p>
     * 
     * @param request DescribeDcdnWafScenesRequest
     * @return DescribeDcdnWafScenesResponse
     */
    public DescribeDcdnWafScenesResponse describeDcdnWafScenes(DescribeDcdnWafScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafScenesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Dynamic Content Delivery Network (DCDN) Web Application Firewall WAF), including the time when WAF is enabled, edition of WAF, current status of WAF, metering method for requests, and metering method for rules.</p>
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
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Dynamic Content Delivery Network (DCDN) Web Application Firewall WAF), including the time when WAF is enabled, edition of WAF, current status of WAF, metering method for requests, and metering method for rules.</p>
     * 
     * @param request DescribeDcdnWafServiceRequest
     * @return DescribeDcdnWafServiceResponse
     */
    public DescribeDcdnWafServiceResponse describeDcdnWafService(DescribeDcdnWafServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the version of Web Application Firewall (WAF) used in Dynamic Content Delivery Network (DCDN).</p>
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
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the version of Web Application Firewall (WAF) used in Dynamic Content Delivery Network (DCDN).</p>
     * @return DescribeDcdnWafSpecInfoResponse
     */
    public DescribeDcdnWafSpecInfoResponse describeDcdnWafSpecInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafSpecInfoWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The number of used SeCUs.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The number of used SeCUs.</p>
     * 
     * @param request DescribeDcdnWafUsageDataRequest
     * @return DescribeDcdnWafUsageDataResponse
     */
    public DescribeDcdnWafUsageDataResponse describeDcdnWafUsageData(DescribeDcdnWafUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnWafUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Dynamic Content Delivery Network (DCDN), such as the service activation time, the expiration time, and the current status.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Dynamic Content Delivery Network (DCDN), such as the service activation time, the expiration time, and the current status.</p>
     * 
     * @param request DescribeDcdnsecServiceRequest
     * @return DescribeDcdnsecServiceResponse
     */
    public DescribeDcdnsecServiceResponse describeDcdnsecService(DescribeDcdnsecServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDcdnsecServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries attack events.</p>
     * 
     * @param request DescribeDdosAllEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosAllEventListResponse
     */
    public DescribeDdosAllEventListResponse describeDdosAllEventListWithOptions(DescribeDdosAllEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
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
            new TeaPair("action", "DescribeDdosAllEventList"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosAllEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries attack events.</p>
     * 
     * @param request DescribeDdosAllEventListRequest
     * @return DescribeDdosAllEventListResponse
     */
    public DescribeDdosAllEventListResponse describeDdosAllEventList(DescribeDdosAllEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosAllEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the encrypted RoutineUid of a routine.</p>
     * 
     * @param request DescribeEncryptRoutineUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEncryptRoutineUidResponse
     */
    public DescribeEncryptRoutineUidResponse describeEncryptRoutineUidWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEncryptRoutineUid"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEncryptRoutineUidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the encrypted RoutineUid of a routine.</p>
     * @return DescribeEncryptRoutineUidResponse
     */
    public DescribeEncryptRoutineUidResponse describeEncryptRoutineUid() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEncryptRoutineUidWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the highlighted data of attack details. You can query the reasons for which requests are blocked based on TraceIDs in logs of requests that are blocked by Basic Web Protection. The highlighted data matches the content blocked by the basic web protection module.</p>
     * 
     * @param request DescribeHighlightInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHighlightInfoResponse
     */
    public DescribeHighlightInfoResponse describeHighlightInfoWithOptions(DescribeHighlightInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHighlightInfo"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHighlightInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the highlighted data of attack details. You can query the reasons for which requests are blocked based on TraceIDs in logs of requests that are blocked by Basic Web Protection. The highlighted data matches the content blocked by the basic web protection module.</p>
     * 
     * @param request DescribeHighlightInfoRequest
     * @return DescribeHighlightInfoResponse
     */
    public DescribeHighlightInfoResponse describeHighlightInfo(DescribeHighlightInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHighlightInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>kv存储实时Qps监控数据</p>
     * 
     * @param request DescribeKvRealTimeQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKvRealTimeQpsDataResponse
     */
    public DescribeKvRealTimeQpsDataResponse describeKvRealTimeQpsDataWithOptions(DescribeKvRealTimeQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
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
            new TeaPair("action", "DescribeKvRealTimeQpsData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKvRealTimeQpsDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>kv存储实时Qps监控数据</p>
     * 
     * @param request DescribeKvRealTimeQpsDataRequest
     * @return DescribeKvRealTimeQpsDataResponse
     */
    public DescribeKvRealTimeQpsDataResponse describeKvRealTimeQpsData(DescribeKvRealTimeQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKvRealTimeQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Note</em>** You can call this operation up to 5 times per second per account.</p>
     * <ul>
     * <li>The usage data indicates the number of requests.
     * <strong>Time granularity:</strong> This operation supports only the time granularity of 1 hour.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range to query</th>
     * <th>Historical data available</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>90 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage data of KV storage.</p>
     * 
     * @param request DescribeKvUsageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKvUsageDataResponse
     */
    public DescribeKvUsageDataResponse describeKvUsageDataWithOptions(DescribeKvUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            query.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseType)) {
            query.put("ResponseType", request.responseType);
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
            new TeaPair("action", "DescribeKvUsageData"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKvUsageDataResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Note</em>** You can call this operation up to 5 times per second per account.</p>
     * <ul>
     * <li>The usage data indicates the number of requests.
     * <strong>Time granularity:</strong> This operation supports only the time granularity of 1 hour.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range to query</th>
     * <th>Historical data available</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>90 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage data of KV storage.</p>
     * 
     * @param request DescribeKvUsageDataRequest
     * @return DescribeKvUsageDataResponse
     */
    public DescribeKvUsageDataResponse describeKvUsageData(DescribeKvUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKvUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the feature configurations of an accelerated domain name in the resource directory.</p>
     * 
     * @param request DescribeRDDomainConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRDDomainConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the feature configurations of an accelerated domain name in the resource directory.</p>
     * 
     * @param request DescribeRDDomainConfigRequest
     * @return DescribeRDDomainConfigResponse
     */
    public DescribeRDDomainConfigResponse describeRDDomainConfig(DescribeRDDomainConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDDomainConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A domain name can be in one of the following states:</p>
     * <ul>
     * <li>online</li>
     * <li>offline</li>
     * <li>configuring</li>
     * <li>configure_failed</li>
     * <li>checking</li>
     * <li>check_failed</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all domain names of Alibaba Cloud CDN and Dynamic Content Delivery Network (DCDN) in a Resource Directory (RD).</p>
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
     * <b>description</b> :
     * <p>A domain name can be in one of the following states:</p>
     * <ul>
     * <li>online</li>
     * <li>offline</li>
     * <li>configuring</li>
     * <li>configure_failed</li>
     * <li>checking</li>
     * <li>check_failed</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all domain names of Alibaba Cloud CDN and Dynamic Content Delivery Network (DCDN) in a Resource Directory (RD).</p>
     * 
     * @param request DescribeRDDomainsRequest
     * @return DescribeRDDomainsResponse
     */
    public DescribeRDDomainsResponse describeRDDomains(DescribeRDDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a specified routine. The metadata includes the routine configuration, configuration version, and code version.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a specified routine. The metadata includes the routine configuration, configuration version, and code version.</p>
     * 
     * @param request DescribeRoutineRequest
     * @return DescribeRoutineResponse
     */
    public DescribeRoutineResponse describeRoutine(DescribeRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the canary release environments that are supported by a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the canary release environments that are supported by a routine.</p>
     * @return DescribeRoutineCanaryEnvsResponse
     */
    public DescribeRoutineCanaryEnvsResponse describeRoutineCanaryEnvs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineCanaryEnvsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the JavaScript code version of a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the JavaScript code version of a routine.</p>
     * 
     * @param request DescribeRoutineCodeRevisionRequest
     * @return DescribeRoutineCodeRevisionResponse
     */
    public DescribeRoutineCodeRevisionResponse describeRoutineCodeRevision(DescribeRoutineCodeRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineCodeRevisionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of domain names that are associated with a routine.</p>
     * 
     * @param request DescribeRoutineRelatedDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRoutineRelatedDomainsResponse
     */
    public DescribeRoutineRelatedDomainsResponse describeRoutineRelatedDomainsWithOptions(DescribeRoutineRelatedDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoutineRelatedDomains"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoutineRelatedDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of domain names that are associated with a routine.</p>
     * 
     * @param request DescribeRoutineRelatedDomainsRequest
     * @return DescribeRoutineRelatedDomainsResponse
     */
    public DescribeRoutineRelatedDomainsResponse describeRoutineRelatedDomains(DescribeRoutineRelatedDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineRelatedDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the supported specifications for routines. The private preview supports the following CPU time slice specifications: 5 ms, 50 ms, and 100 ms.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the supported specifications for routines. The private preview supports the following CPU time slice specifications: 5 ms, 50 ms, and 100 ms.</p>
     * @return DescribeRoutineSpecResponse
     */
    public DescribeRoutineSpecResponse describeRoutineSpec() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineSpecWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the subdomains and routines that belong to your Alibaba Cloud account.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the subdomains and routines that belong to your Alibaba Cloud account.</p>
     * @return DescribeRoutineUserInfoResponse
     */
    public DescribeRoutineUserInfoResponse describeRoutineUserInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoutineUserInfoWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**The maximum number of times that each user can call this operation per second is 20.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Whether IPA is enabled and whether you have overdue payments for your IPA are queried.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>**The maximum number of times that each user can call this operation per second is 20.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Whether IPA is enabled and whether you have overdue payments for your IPA are queried.</p>
     * 
     * @param request DescribeUserDcdnIpaStatusRequest
     * @return DescribeUserDcdnIpaStatusResponse
     */
    public DescribeUserDcdnIpaStatusResponse describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserDcdnIpaStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether DCDN is activated and whether your account has overdue payments.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether DCDN is activated and whether your account has overdue payments.</p>
     * 
     * @param request DescribeUserDcdnStatusRequest
     * @return DescribeUserDcdnStatusResponse
     */
    public DescribeUserDcdnStatusResponse describeUserDcdnStatus(DescribeUserDcdnStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserDcdnStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether EdgeRoutine (ER) is activated or has an overdue payment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether EdgeRoutine (ER) is activated or has an overdue payment.</p>
     * 
     * @param request DescribeUserErStatusRequest
     * @return DescribeUserErStatusResponse
     */
    public DescribeUserErStatusResponse describeUserErStatus(DescribeUserErStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserErStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether Log Service is activated and whether you have overdue payments for your Log Service.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether Log Service is activated and whether you have overdue payments for your Log Service.</p>
     * 
     * @param request DescribeUserLogserviceStatusRequest
     * @return DescribeUserLogserviceStatusResponse
     */
    public DescribeUserLogserviceStatusResponse describeUserLogserviceStatus(DescribeUserLogserviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserLogserviceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation modifies only the specified configurations. Other configurations remain unchanged.</li>
     * <li>If you want to delete a setting, delete the parameter value.</li>
     * <li>This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.</li>
     * <li>Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:<ul>
     * <li>Outside China: presetCanaryOverseas.</li>
     * <li>In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.</li>
     * </ul>
     * </li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation modifies only the specified configurations. Other configurations remain unchanged.</li>
     * <li>If you want to delete a setting, delete the parameter value.</li>
     * <li>This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.</li>
     * <li>Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:<ul>
     * <li>Outside China: presetCanaryOverseas.</li>
     * <li>In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.</li>
     * </ul>
     * </li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a routine.</p>
     * 
     * @param request EditRoutineConfRequest
     * @return EditRoutineConfResponse
     */
    public EditRoutineConfResponse editRoutineConf(EditRoutineConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editRoutineConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the value of a key in a key-value pair.</p>
     * 
     * @param request GetDcdnKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDcdnKvResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the value of a key in a key-value pair.</p>
     * 
     * @param request GetDcdnKvRequest
     * @return GetDcdnKvResponse
     */
    public GetDcdnKvResponse getDcdnKv(GetDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDcdnKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询KV对的值以及TTL信息</p>
     * 
     * @param request GetDcdnKvDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDcdnKvDetailResponse
     */
    public GetDcdnKvDetailResponse getDcdnKvDetailWithOptions(GetDcdnKvDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDcdnKvDetail"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDcdnKvDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询KV对的值以及TTL信息</p>
     * 
     * @param request GetDcdnKvDetailRequest
     * @return GetDcdnKvDetailResponse
     */
    public GetDcdnKvDetailResponse getDcdnKvDetail(GetDcdnKvDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDcdnKvDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the KV status by key value.</p>
     * 
     * @param request GetDcdnKvStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDcdnKvStatusResponse
     */
    public GetDcdnKvStatusResponse getDcdnKvStatusWithOptions(GetDcdnKvStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetDcdnKvStatus"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDcdnKvStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the KV status by key value.</p>
     * 
     * @param request GetDcdnKvStatusRequest
     * @return GetDcdnKvStatusResponse
     */
    public GetDcdnKvStatusResponse getDcdnKvStatus(GetDcdnKvStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDcdnKvStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Traverses the values of keys in a namespace.</p>
     * 
     * @param request ListDcdnKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDcdnKvResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Traverses the values of keys in a namespace.</p>
     * 
     * @param request ListDcdnKvRequest
     * @return ListDcdnKvResponse
     */
    public ListDcdnKvResponse listDcdnKv(ListDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDcdnKvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a real-time log delivery project.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a real-time log delivery project.</p>
     * 
     * @param request ListDcdnRealTimeDeliveryProjectRequest
     * @return ListDcdnRealTimeDeliveryProjectResponse
     */
    public ListDcdnRealTimeDeliveryProjectResponse listDcdnRealTimeDeliveryProject(ListDcdnRealTimeDeliveryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDcdnRealTimeDeliveryProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A客户定制新增修改域名采样率接口</p>
     * 
     * @param request ModifyCustomDomainSampleRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomDomainSampleRateResponse
     */
    public ModifyCustomDomainSampleRateResponse modifyCustomDomainSampleRateWithOptions(ModifyCustomDomainSampleRateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseConfigID)) {
            body.put("BaseConfigID", request.baseConfigID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            body.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            body.put("SampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkID)) {
            body.put("SinkID", request.sinkID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomDomainSampleRate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomDomainSampleRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>A客户定制新增修改域名采样率接口</p>
     * 
     * @param request ModifyCustomDomainSampleRateRequest
     * @return ModifyCustomDomainSampleRateResponse
     */
    public ModifyCustomDomainSampleRateResponse modifyCustomDomainSampleRate(ModifyCustomDomainSampleRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomDomainSampleRateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the acceleration region.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the acceleration region.</p>
     * 
     * @param request ModifyDCdnDomainSchdmByPropertyRequest
     * @return ModifyDCdnDomainSchdmByPropertyResponse
     */
    public ModifyDCdnDomainSchdmByPropertyResponse modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDCdnDomainSchdmByPropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a custom Web Application Firewall (WAF) rule group.</p>
     * 
     * @param request ModifyDcdnWafGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDcdnWafGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies a custom Web Application Firewall (WAF) rule group.</p>
     * 
     * @param request ModifyDcdnWafGroupRequest
     * @return ModifyDcdnWafGroupResponse
     */
    public ModifyDcdnWafGroupResponse modifyDcdnWafGroup(ModifyDcdnWafGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the name or the status of a protection policy.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the name or the status of a protection policy.</p>
     * 
     * @param request ModifyDcdnWafPolicyRequest
     * @return ModifyDcdnWafPolicyResponse
     */
    public ModifyDcdnWafPolicyResponse modifyDcdnWafPolicy(ModifyDcdnWafPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * <li>Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the accelerated domain names that are bound to a protection policy.</p>
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
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * <li>Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the accelerated domain names that are bound to a protection policy.</p>
     * 
     * @param request ModifyDcdnWafPolicyDomainsRequest
     * @return ModifyDcdnWafPolicyDomainsResponse
     */
    public ModifyDcdnWafPolicyDomainsResponse modifyDcdnWafPolicyDomains(ModifyDcdnWafPolicyDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafPolicyDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * <li>You must configure at least one of the <strong>RuleStatus</strong>, <strong>RuleName</strong> and <strong>RuleConfig</strong> parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the name, status, or configurations of a protection rule.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * <li>You must configure at least one of the <strong>RuleStatus</strong>, <strong>RuleName</strong> and <strong>RuleConfig</strong> parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the name, status, or configurations of a protection rule.</p>
     * 
     * @param request ModifyDcdnWafRuleRequest
     * @return ModifyDcdnWafRuleResponse
     */
    public ModifyDcdnWafRuleResponse modifyDcdnWafRule(ModifyDcdnWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDcdnWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.</li>
     * <li>You can call this operation up to five times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Dynamic Route for CDN (DCDN).</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.</li>
     * <li>You can call this operation up to five times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Dynamic Route for CDN (DCDN).</p>
     * 
     * @param request OpenDcdnServiceRequest
     * @return OpenDcdnServiceResponse
     */
    public OpenDcdnServiceResponse openDcdnService(OpenDcdnServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openDcdnServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to prefetch content.</p>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.</li>
     * <li>You can specify up to 100 URLs to prefetch.</li>
     * <li>The prefetch queue of each Alibaba Cloud account can contain up to 100,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.</li>
     * <li>You can call this operation up to 15 times per second per account.</li>
     * </ul>
     * <h2>Description</h2>
     * <ul>
     * <li>After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.</li>
     * <li>To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/445051.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Prefetches content from origin servers to points of presence (POPs). This reduces workloads on origin servers because users can hit cache upon their first visits.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.queryHashkey)) {
            query.put("QueryHashkey", request.queryHashkey);
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
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to prefetch content.</p>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.</li>
     * <li>You can specify up to 100 URLs to prefetch.</li>
     * <li>The prefetch queue of each Alibaba Cloud account can contain up to 100,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.</li>
     * <li>You can call this operation up to 15 times per second per account.</li>
     * </ul>
     * <h2>Description</h2>
     * <ul>
     * <li>After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.</li>
     * <li>To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/445051.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Prefetches content from origin servers to points of presence (POPs). This reduces workloads on origin servers because users can hit cache upon their first visits.</p>
     * 
     * @param request PreloadDcdnObjectCachesRequest
     * @return PreloadDcdnObjectCachesResponse
     */
    public PreloadDcdnObjectCachesResponse preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadDcdnObjectCachesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Publishes the configurations of an accelerated domain name from the staging environment to the production environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Publishes the configurations of an accelerated domain name from the staging environment to the production environment.</p>
     * 
     * @param request PublishDcdnStagingConfigToProductionRequest
     * @return PublishDcdnStagingConfigToProductionResponse
     */
    public PublishDcdnStagingConfigToProductionResponse publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDcdnStagingConfigToProductionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified version of routine code to an environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified version of routine code to an environment.</p>
     * 
     * @param request PublishRoutineCodeRevisionRequest
     * @return PublishRoutineCodeRevisionResponse
     */
    public PublishRoutineCodeRevisionResponse publishRoutineCodeRevision(PublishRoutineCodeRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRoutineCodeRevisionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets key-value pairs in a namespace.</p>
     * 
     * @param request PutDcdnKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutDcdnKvResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Sets key-value pairs in a namespace.</p>
     * 
     * @param request PutDcdnKvRequest
     * @return PutDcdnKvResponse
     */
    public PutDcdnKvResponse putDcdnKv(PutDcdnKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDcdnKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds namespaces to your account.</p>
     * 
     * @param request PutDcdnKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutDcdnKvNamespaceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds namespaces to your account.</p>
     * 
     * @param request PutDcdnKvNamespaceRequest
     * @return PutDcdnKvNamespaceResponse
     */
    public PutDcdnKvNamespaceResponse putDcdnKvNamespace(PutDcdnKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDcdnKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置Namespace的key-value对，支持最大25M的请求体</p>
     * 
     * @param request PutDcdnKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutDcdnKvWithHighCapacityResponse
     */
    public PutDcdnKvWithHighCapacityResponse putDcdnKvWithHighCapacityWithOptions(PutDcdnKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDcdnKvWithHighCapacity"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDcdnKvWithHighCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置Namespace的key-value对，支持最大25M的请求体</p>
     * 
     * @param request PutDcdnKvWithHighCapacityRequest
     * @return PutDcdnKvWithHighCapacityResponse
     */
    public PutDcdnKvWithHighCapacityResponse putDcdnKvWithHighCapacity(PutDcdnKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDcdnKvWithHighCapacityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定缓存tag刷新节点上的文件内容</p>
     * 
     * @param request RefreshDcdnObjectCacheByCacheTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDcdnObjectCacheByCacheTagResponse
     */
    public RefreshDcdnObjectCacheByCacheTagResponse refreshDcdnObjectCacheByCacheTagWithOptions(RefreshDcdnObjectCacheByCacheTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheTag)) {
            query.put("CacheTag", request.cacheTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDcdnObjectCacheByCacheTag"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDcdnObjectCacheByCacheTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指定缓存tag刷新节点上的文件内容</p>
     * 
     * @param request RefreshDcdnObjectCacheByCacheTagRequest
     * @return RefreshDcdnObjectCacheByCacheTagResponse
     */
    public RefreshDcdnObjectCacheByCacheTagResponse refreshDcdnObjectCacheByCacheTag(RefreshDcdnObjectCacheByCacheTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDcdnObjectCacheByCacheTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to purge content and call the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to prefetch content.</li>
     * <li>By default, each Alibaba Cloud account can purge content from a maximum of 10,000 URLs and 100 directories including subdirectories per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 200 Mbit/s, <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to request a quota increase. Alibaba Cloud determines whether to approve your application based on your workloads.</li>
     * <li>You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.</li>
     * <li>You can specify up to 1,000 URLs that you want to purge per minute for each domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * <h4><a href="#"></a>Precautions</h4>
     * <ul>
     * <li>After a purge task is completed, your resources that are cached on points of presence (POPs) are removed. When a POP receives a request for your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on POPs. If you frequently run purge tasks, more requests are redirected to the origin server for resources. This results in high bandwidth costs and more loads on the origin server.</li>
     * <li>A purge task takes effect 5 to 6 minutes after being submitted. If the resource you want to purge has a TTL of less than 5 minutes, you wait for it to expire instead of manually running a purge task.</li>
     * <li>To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/445051.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes specified objects on points of presence (POPs). The objects can be included in the content of files or URLs. You can refresh multiple URLs in each request.</p>
     * 
     * @param request RefreshDcdnObjectCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDcdnObjectCachesResponse
     */
    public RefreshDcdnObjectCachesResponse refreshDcdnObjectCachesWithOptions(RefreshDcdnObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
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
     * <b>description</b> :
     * <p>  Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to purge content and call the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to prefetch content.</li>
     * <li>By default, each Alibaba Cloud account can purge content from a maximum of 10,000 URLs and 100 directories including subdirectories per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 200 Mbit/s, <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to request a quota increase. Alibaba Cloud determines whether to approve your application based on your workloads.</li>
     * <li>You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.</li>
     * <li>You can specify up to 1,000 URLs that you want to purge per minute for each domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * <h4><a href="#"></a>Precautions</h4>
     * <ul>
     * <li>After a purge task is completed, your resources that are cached on points of presence (POPs) are removed. When a POP receives a request for your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on POPs. If you frequently run purge tasks, more requests are redirected to the origin server for resources. This results in high bandwidth costs and more loads on the origin server.</li>
     * <li>A purge task takes effect 5 to 6 minutes after being submitted. If the resource you want to purge has a TTL of less than 5 minutes, you wait for it to expire instead of manually running a purge task.</li>
     * <li>To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/445051.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes specified objects on points of presence (POPs). The objects can be included in the content of files or URLs. You can refresh multiple URLs in each request.</p>
     * 
     * @param request RefreshDcdnObjectCachesRequest
     * @return RefreshDcdnObjectCachesResponse
     */
    public RefreshDcdnObjectCachesResponse refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDcdnObjectCachesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</li>
     * <li>Related operation: <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a>.</li>
     * <li>By default, each Alibaba Cloud account can purge content from a maxim&gt; um of 10,000 URLs and 100 directories including subdirectories per day.</li>
     * <li>You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.</li>
     * <li>You can specify up to 1,000 URLs that you want to purge per minute for each domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Refreshes the cache that is written by calling the cache operation of EdgeRoutine. You can refresh multiple URLs in each request.</p>
     * 
     * @param request RefreshErObjectCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshErObjectCachesResponse
     */
    public RefreshErObjectCachesResponse refreshErObjectCachesWithOptions(RefreshErObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeDomainName)) {
            query.put("MergeDomainName", request.mergeDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routineId)) {
            query.put("RoutineId", request.routineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshErObjectCaches"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshErObjectCachesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</li>
     * <li>Related operation: <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a>.</li>
     * <li>By default, each Alibaba Cloud account can purge content from a maxim&gt; um of 10,000 URLs and 100 directories including subdirectories per day.</li>
     * <li>You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.</li>
     * <li>You can specify up to 1,000 URLs that you want to purge per minute for each domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Refreshes the cache that is written by calling the cache operation of EdgeRoutine. You can refresh multiple URLs in each request.</p>
     * 
     * @param request RefreshErObjectCachesRequest
     * @return RefreshErObjectCachesResponse
     */
    public RefreshErObjectCachesResponse refreshErObjectCaches(RefreshErObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshErObjectCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ER场景下的cache tag粒度的刷新接口</p>
     * 
     * @param request RefreshErObjectCachesByCacheTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshErObjectCachesByCacheTagResponse
     */
    public RefreshErObjectCachesByCacheTagResponse refreshErObjectCachesByCacheTagWithOptions(RefreshErObjectCachesByCacheTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheTag)) {
            query.put("CacheTag", request.cacheTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeDomainName)) {
            query.put("MergeDomainName", request.mergeDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshErObjectCachesByCacheTag"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshErObjectCachesByCacheTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ER场景下的cache tag粒度的刷新接口</p>
     * 
     * @param request RefreshErObjectCachesByCacheTagRequest
     * @return RefreshErObjectCachesByCacheTagResponse
     */
    public RefreshErObjectCachesByCacheTagResponse refreshErObjectCachesByCacheTag(RefreshErObjectCachesByCacheTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshErObjectCachesByCacheTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Rolls back the configurations of an accelerated domain name from the staging environment to the production environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Rolls back the configurations of an accelerated domain name from the staging environment to the production environment.</p>
     * 
     * @param request RollbackDcdnStagingConfigRequest
     * @return RollbackDcdnStagingConfigResponse
     */
    public RollbackDcdnStagingConfigResponse rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackDcdnStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an SSL certificate for a specified domain name.</p>
     * 
     * @param request SetDcdnDomainCSRCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDcdnDomainCSRCertificateResponse
     */
    public SetDcdnDomainCSRCertificateResponse setDcdnDomainCSRCertificateWithOptions(SetDcdnDomainCSRCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificate)) {
            query.put("ServerCertificate", request.serverCertificate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDcdnDomainCSRCertificate"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDcdnDomainCSRCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an SSL certificate for a specified domain name.</p>
     * 
     * @param request SetDcdnDomainCSRCertificateRequest
     * @return SetDcdnDomainCSRCertificateResponse
     */
    public SetDcdnDomainCSRCertificateResponse setDcdnDomainCSRCertificate(SetDcdnDomainCSRCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainCSRCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the ShangMi (SM) certificate for a domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the ShangMi (SM) certificate for a domain name.</p>
     * 
     * @param request SetDcdnDomainSMCertificateRequest
     * @return SetDcdnDomainSMCertificateResponse
     */
    public SetDcdnDomainSMCertificateResponse setDcdnDomainSMCertificate(SetDcdnDomainSMCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainSMCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the SSL certificate for a domain name and updates certificate details.</p>
     * 
     * @param request SetDcdnDomainSSLCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDcdnDomainSSLCertificateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the SSL certificate for a domain name and updates certificate details.</p>
     * 
     * @param request SetDcdnDomainSSLCertificateRequest
     * @return SetDcdnDomainSSLCertificateResponse
     */
    public SetDcdnDomainSSLCertificateResponse setDcdnDomainSSLCertificate(SetDcdnDomainSSLCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainSSLCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sets or modifies the domain name configuration in the canary release environment.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sets or modifies the domain name configuration in the canary release environment.</p>
     * 
     * @param request SetDcdnDomainStagingConfigRequest
     * @return SetDcdnDomainStagingConfigResponse
     */
    public SetDcdnDomainStagingConfigResponse setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnDomainStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to block or unblock a large number of IP addresses or CIDR blocks. You can block or unblock up to 1,000 IP addresses or CIDR blocks in a request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Blocks or unblocks IP addresses or CIDR blocks.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to block or unblock a large number of IP addresses or CIDR blocks. You can block or unblock up to 1,000 IP addresses or CIDR blocks in a request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Blocks or unblocks IP addresses or CIDR blocks.</p>
     * 
     * @param request SetDcdnFullDomainsBlockIPRequest
     * @return SetDcdnFullDomainsBlockIPResponse
     */
    public SetDcdnFullDomainsBlockIPResponse setDcdnFullDomainsBlockIP(SetDcdnFullDomainsBlockIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnFullDomainsBlockIPWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures features for a user.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures features for a user.</p>
     * 
     * @param request SetDcdnUserConfigRequest
     * @return SetDcdnUserConfigResponse
     */
    public SetDcdnUserConfigResponse setDcdnUserConfig(SetDcdnUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDcdnUserConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a subdomain for a routine.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a subdomain for a routine.</p>
     * 
     * @param request SetRoutineSubdomainRequest
     * @return SetRoutineSubdomainResponse
     */
    public SetRoutineSubdomainResponse setRoutineSubdomain(SetRoutineSubdomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRoutineSubdomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a specified disabled accelerated domain. After the accelerated domain is enabled, the value of the DomainStatus parameter changes to Online for the domain.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a specified disabled accelerated domain. After the accelerated domain is enabled, the value of the DomainStatus parameter changes to Online for the domain.</p>
     * 
     * @param request StartDcdnDomainRequest
     * @return StartDcdnDomainResponse
     */
    public StartDcdnDomainResponse startDcdnDomain(StartDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more accelerated domain names. After the accelerated domain names are enabled, the value of the DomainStatus parameter for the domain names changes to Online.</p>
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
     * <b>description</b> :
     * <p>  If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more accelerated domain names. After the accelerated domain names are enabled, the value of the DomainStatus parameter for the domain names changes to Online.</p>
     * 
     * @param request StartDcdnIpaDomainRequest
     * @return StartDcdnIpaDomainResponse
     */
    public StartDcdnIpaDomainResponse startDcdnIpaDomain(StartDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>After an accelerated domain is disabled, Dynamic Content Delivery Network (DCDN) retains its information and routes all the requests that are destined for the accelerated domain to the origin server.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a specified accelerated domain. After the accelerated domain is disabled,
     *                   the value of the DomainStatus parameter changes to Offline for the domain.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>After an accelerated domain is disabled, Dynamic Content Delivery Network (DCDN) retains its information and routes all the requests that are destined for the accelerated domain to the origin server.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a specified accelerated domain. After the accelerated domain is disabled,
     *                   the value of the DomainStatus parameter changes to Offline for the domain.</p>
     * 
     * @param request StopDcdnDomainRequest
     * @return StopDcdnDomainResponse
     */
    public StopDcdnDomainResponse stopDcdnDomain(StopDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables an accelerated domain name. After an accelerated domain name is disabled, the value of the DomainStatus parameter for the domain name changes to Offline.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables an accelerated domain name. After an accelerated domain name is disabled, the value of the DomainStatus parameter for the domain name changes to Offline.</p>
     * 
     * @param request StopDcdnIpaDomainRequest
     * @return StopDcdnIpaDomainResponse
     */
    public StopDcdnIpaDomainResponse stopDcdnIpaDomain(StopDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more tags to a resource.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more tags to a resource.</p>
     * 
     * @param request TagDcdnResourcesRequest
     * @return TagDcdnResourcesResponse
     */
    public TagDcdnResourcesResponse tagDcdnResources(TagDcdnResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagDcdnResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more tags from a resource.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more tags from a resource.</p>
     * 
     * @param request UntagDcdnResourcesRequest
     * @return UntagDcdnResourcesResponse
     */
    public UntagDcdnResourcesResponse untagDcdnResources(UntagDcdnResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagDcdnResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates a tracking task by task ID.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates a tracking task by task ID.</p>
     * 
     * @param request UpdateDcdnDeliverTaskRequest
     * @return UpdateDcdnDeliverTaskResponse
     */
    public UpdateDcdnDeliverTaskResponse updateDcdnDeliverTask(UpdateDcdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnDeliverTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies an accelerated domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies an accelerated domain name.</p>
     * 
     * @param request UpdateDcdnDomainRequest
     * @return UpdateDcdnDomainResponse
     */
    public UpdateDcdnDomainResponse updateDcdnDomain(UpdateDcdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a domain name that is accelerated by IP Application Accelerator (IPA).</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a domain name that is accelerated by IP Application Accelerator (IPA).</p>
     * 
     * @param request UpdateDcdnIpaDomainRequest
     * @return UpdateDcdnIpaDomainResponse
     */
    public UpdateDcdnIpaDomainResponse updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnIpaDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates a real-time log delivery project.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates a real-time log delivery project.</p>
     * 
     * @param request UpdateDcdnSLSRealtimeLogDeliveryRequest
     * @return UpdateDcdnSLSRealtimeLogDeliveryResponse
     */
    public UpdateDcdnSLSRealtimeLogDeliveryResponse updateDcdnSLSRealtimeLogDelivery(UpdateDcdnSLSRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnSLSRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates one or more operations reports.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates one or more operations reports.</p>
     * 
     * @param request UpdateDcdnSubTaskRequest
     * @return UpdateDcdnSubTaskResponse
     */
    public UpdateDcdnSubTaskResponse updateDcdnSubTask(UpdateDcdnSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the fields in real-time log entries.</p>
     * 
     * @param request UpdateDcdnUserRealTimeDeliveryFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDcdnUserRealTimeDeliveryFieldResponse
     */
    public UpdateDcdnUserRealTimeDeliveryFieldResponse updateDcdnUserRealTimeDeliveryFieldWithOptions(UpdateDcdnUserRealTimeDeliveryFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDcdnUserRealTimeDeliveryField"),
            new TeaPair("version", "2018-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDcdnUserRealTimeDeliveryFieldResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the fields in real-time log entries.</p>
     * 
     * @param request UpdateDcdnUserRealTimeDeliveryFieldRequest
     * @return UpdateDcdnUserRealTimeDeliveryFieldResponse
     */
    public UpdateDcdnUserRealTimeDeliveryFieldResponse updateDcdnUserRealTimeDeliveryField(UpdateDcdnUserRealTimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDcdnUserRealTimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each time you submit code, a version of the code is generated. You can manage and publish code by version.</li>
     * <li>Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads code to EdgeRoutine (ER).</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each time you submit code, a version of the code is generated. You can manage and publish code by version.</li>
     * <li>Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads code to EdgeRoutine (ER).</p>
     * 
     * @param request UploadRoutineCodeRequest
     * @return UploadRoutineCodeResponse
     */
    public UploadRoutineCodeResponse uploadRoutineCode(UploadRoutineCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadRoutineCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.</li>
     * <li>The code is automatically published to a staging environment.</li>
     * <li>Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads code to a routine for testing.</p>
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
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.</li>
     * <li>The code is automatically published to a staging environment.</li>
     * <li>Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads code to a routine for testing.</p>
     * 
     * @param request UploadStagingRoutineCodeRequest
     * @return UploadStagingRoutineCodeResponse
     */
    public UploadStagingRoutineCodeResponse uploadStagingRoutineCode(UploadStagingRoutineCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadStagingRoutineCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a domain name.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a domain name.</p>
     * 
     * @param request VerifyDcdnDomainOwnerRequest
     * @return VerifyDcdnDomainOwnerResponse
     */
    public VerifyDcdnDomainOwnerResponse verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyDcdnDomainOwnerWithOptions(request, runtime);
    }
}
