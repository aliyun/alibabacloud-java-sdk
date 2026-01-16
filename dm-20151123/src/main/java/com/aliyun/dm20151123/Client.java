// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.dm20151123.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>Add IP Protection Information</p>
     * 
     * @param request AddIpfilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIpfilterResponse
     */
    public AddIpfilterResponse addIpfilterWithOptions(AddIpfilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipAddress)) {
            query.put("IpAddress", request.ipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpfilter"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpfilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add IP Protection Information</p>
     * 
     * @param request AddIpfilterRequest
     * @return AddIpfilterResponse
     */
    public AddIpfilterResponse addIpfilter(AddIpfilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIpfilterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verify Reply Address</p>
     * 
     * @param request ApproveReplyMailAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveReplyMailAddressResponse
     */
    public ApproveReplyMailAddressResponse approveReplyMailAddressWithOptions(ApproveReplyMailAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveReplyMailAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveReplyMailAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verify Reply Address</p>
     * 
     * @param request ApproveReplyMailAddressRequest
     * @return ApproveReplyMailAddressResponse
     */
    public ApproveReplyMailAddressResponse approveReplyMailAddress(ApproveReplyMailAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveReplyMailAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Send Emails</p>
     * 
     * @param request BatchSendMailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSendMailResponse
     */
    public BatchSendMailResponse batchSendMailWithOptions(BatchSendMailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clickTrace)) {
            query.put("ClickTrace", request.clickTrace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainAuth)) {
            query.put("DomainAuth", request.domainAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headers)) {
            query.put("Headers", request.headers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipPoolId)) {
            query.put("IpPoolId", request.ipPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiversName)) {
            query.put("ReceiversName", request.receiversName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyAddress)) {
            query.put("ReplyAddress", request.replyAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyAddressAlias)) {
            query.put("ReplyAddressAlias", request.replyAddressAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unSubscribeFilterLevel)) {
            query.put("UnSubscribeFilterLevel", request.unSubscribeFilterLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unSubscribeLinkType)) {
            query.put("UnSubscribeLinkType", request.unSubscribeLinkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSendMail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSendMailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Send Emails</p>
     * 
     * @param request BatchSendMailRequest
     * @return BatchSendMailResponse
     */
    public BatchSendMailResponse batchSendMail(BatchSendMailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSendMailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名DKIM记录</p>
     * 
     * @param request ChangeDomainDkimRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeDomainDkimRecordResponse
     */
    public ChangeDomainDkimRecordResponse changeDomainDkimRecordWithOptions(ChangeDomainDkimRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dkimRsaLength)) {
            query.put("DkimRsaLength", request.dkimRsaLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDomainDkimRecord"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDomainDkimRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名DKIM记录</p>
     * 
     * @param request ChangeDomainDkimRecordRequest
     * @return ChangeDomainDkimRecordResponse
     */
    public ChangeDomainDkimRecordResponse changeDomainDkimRecord(ChangeDomainDkimRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeDomainDkimRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查地址是否为一次性邮箱</p>
     * 
     * @param request CheckDisposableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDisposableResponse
     */
    public CheckDisposableResponse checkDisposableWithOptions(CheckDisposableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDisposable"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDisposableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查地址是否为一次性邮箱</p>
     * 
     * @param request CheckDisposableRequest
     * @return CheckDisposableResponse
     */
    public CheckDisposableResponse checkDisposable(CheckDisposableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDisposableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check Domain Status</p>
     * 
     * @param request CheckDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomain"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Check Domain Status</p>
     * 
     * @param request CheckDomainRequest
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validate Reply-To Address</p>
     * 
     * @param request CheckReplyToMailAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckReplyToMailAddressResponse
     */
    public CheckReplyToMailAddressResponse checkReplyToMailAddressWithOptions(CheckReplyToMailAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailAddressId)) {
            query.put("MailAddressId", request.mailAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckReplyToMailAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckReplyToMailAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validate Reply-To Address</p>
     * 
     * @param request CheckReplyToMailAddressRequest
     * @return CheckReplyToMailAddressResponse
     */
    public CheckReplyToMailAddressResponse checkReplyToMailAddress(CheckReplyToMailAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkReplyToMailAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置集取消关联发信地址</p>
     * 
     * @param request ConfigSetCancelRelationFromAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetCancelRelationFromAddressResponse
     */
    public ConfigSetCancelRelationFromAddressResponse configSetCancelRelationFromAddressWithOptions(ConfigSetCancelRelationFromAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromAddress)) {
            query.put("FromAddress", request.fromAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetCancelRelationFromAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetCancelRelationFromAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置集取消关联发信地址</p>
     * 
     * @param request ConfigSetCancelRelationFromAddressRequest
     * @return ConfigSetCancelRelationFromAddressResponse
     */
    public ConfigSetCancelRelationFromAddressResponse configSetCancelRelationFromAddress(ConfigSetCancelRelationFromAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetCancelRelationFromAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置集创建</p>
     * 
     * @param request ConfigSetCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetCreateResponse
     */
    public ConfigSetCreateResponse configSetCreateWithOptions(ConfigSetCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipPoolId)) {
            query.put("IpPoolId", request.ipPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetCreate"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置集创建</p>
     * 
     * @param request ConfigSetCreateRequest
     * @return ConfigSetCreateResponse
     */
    public ConfigSetCreateResponse configSetCreate(ConfigSetCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除配置集</p>
     * 
     * @param request ConfigSetDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetDeleteResponse
     */
    public ConfigSetDeleteResponse configSetDeleteWithOptions(ConfigSetDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isForce)) {
            query.put("IsForce", request.isForce);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetDelete"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除配置集</p>
     * 
     * @param request ConfigSetDeleteRequest
     * @return ConfigSetDeleteResponse
     */
    public ConfigSetDeleteResponse configSetDelete(ConfigSetDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置集详情</p>
     * 
     * @param request ConfigSetDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetDetailResponse
     */
    public ConfigSetDetailResponse configSetDetailWithOptions(ConfigSetDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetDetail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置集详情</p>
     * 
     * @param request ConfigSetDetailRequest
     * @return ConfigSetDetailResponse
     */
    public ConfigSetDetailResponse configSetDetail(ConfigSetDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置集列表</p>
     * 
     * @param request ConfigSetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetListResponse
     */
    public ConfigSetListResponse configSetListWithOptions(ConfigSetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetList"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置集列表</p>
     * 
     * @param request ConfigSetListRequest
     * @return ConfigSetListResponse
     */
    public ConfigSetListResponse configSetList(ConfigSetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置集关联发信地址</p>
     * 
     * @param request ConfigSetRelationFromAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetRelationFromAddressResponse
     */
    public ConfigSetRelationFromAddressResponse configSetRelationFromAddressWithOptions(ConfigSetRelationFromAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromAddress)) {
            query.put("FromAddress", request.fromAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetRelationFromAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetRelationFromAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置集关联发信地址</p>
     * 
     * @param request ConfigSetRelationFromAddressRequest
     * @return ConfigSetRelationFromAddressResponse
     */
    public ConfigSetRelationFromAddressResponse configSetRelationFromAddress(ConfigSetRelationFromAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetRelationFromAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置集更新</p>
     * 
     * @param request ConfigSetUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigSetUpdateResponse
     */
    public ConfigSetUpdateResponse configSetUpdateWithOptions(ConfigSetUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipPoolId)) {
            query.put("IpPoolId", request.ipPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigSetUpdate"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigSetUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置集更新</p>
     * 
     * @param request ConfigSetUpdateRequest
     * @return ConfigSetUpdateResponse
     */
    public ConfigSetUpdateResponse configSetUpdate(ConfigSetUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configSetUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Domain</p>
     * 
     * @param request CreateDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dkimSelector)) {
            query.put("dkimSelector", request.dkimSelector);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Domain</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a mail address.</p>
     * 
     * @param request CreateMailAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMailAddressResponse
     */
    public CreateMailAddressResponse createMailAddressWithOptions(CreateMailAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyAddress)) {
            query.put("ReplyAddress", request.replyAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendtype)) {
            query.put("Sendtype", request.sendtype);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMailAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMailAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a mail address.</p>
     * 
     * @param request CreateMailAddressRequest
     * @return CreateMailAddressResponse
     */
    public CreateMailAddressResponse createMailAddress(CreateMailAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMailAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Receiver List</p>
     * 
     * @param request CreateReceiverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReceiverResponse
     */
    public CreateReceiverResponse createReceiverWithOptions(CreateReceiverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiversAlias)) {
            query.put("ReceiversAlias", request.receiversAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiversName)) {
            query.put("ReceiversName", request.receiversName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReceiver"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReceiverResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Receiver List</p>
     * 
     * @param request CreateReceiverRequest
     * @return CreateReceiverResponse
     */
    public CreateReceiverResponse createReceiver(CreateReceiverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReceiverWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Tag</p>
     * 
     * @param request CreateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResponse
     */
    public CreateTagResponse createTagWithOptions(CreateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagDescription)) {
            query.put("TagDescription", request.tagDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Tag</p>
     * 
     * @param request CreateTagRequest
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create User\&quot;s Invalid Address</p>
     * 
     * @param request CreateUserSuppressionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserSuppressionResponse
     */
    public CreateUserSuppressionResponse createUserSuppressionWithOptions(CreateUserSuppressionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserSuppression"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserSuppressionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create User\&quot;s Invalid Address</p>
     * 
     * @param request CreateUserSuppressionRequest
     * @return CreateUserSuppressionResponse
     */
    public CreateUserSuppressionResponse createUserSuppression(CreateUserSuppressionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserSuppressionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Set Dedicated IP Auto Renewal</p>
     * 
     * @param request DedicatedIpAutoRenewalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpAutoRenewalResponse
     */
    public DedicatedIpAutoRenewalResponse dedicatedIpAutoRenewalWithOptions(DedicatedIpAutoRenewalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewal)) {
            query.put("AutoRenewal", request.autoRenewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyResourceIds)) {
            query.put("BuyResourceIds", request.buyResourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpAutoRenewal"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpAutoRenewalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Set Dedicated IP Auto Renewal</p>
     * 
     * @param request DedicatedIpAutoRenewalRequest
     * @return DedicatedIpAutoRenewalResponse
     */
    public DedicatedIpAutoRenewalResponse dedicatedIpAutoRenewal(DedicatedIpAutoRenewalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpAutoRenewalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Change the warmup method for a dedicated IP</p>
     * 
     * @param request DedicatedIpChangeWarmupTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpChangeWarmupTypeResponse
     */
    public DedicatedIpChangeWarmupTypeResponse dedicatedIpChangeWarmupTypeWithOptions(DedicatedIpChangeWarmupTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warmupType)) {
            query.put("WarmupType", request.warmupType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpChangeWarmupType"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpChangeWarmupTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Change the warmup method for a dedicated IP</p>
     * 
     * @param request DedicatedIpChangeWarmupTypeRequest
     * @return DedicatedIpChangeWarmupTypeResponse
     */
    public DedicatedIpChangeWarmupTypeResponse dedicatedIpChangeWarmupType(DedicatedIpChangeWarmupTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpChangeWarmupTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dedicated IP User IP List</p>
     * 
     * @param request DedicatedIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpListResponse
     */
    public DedicatedIpListResponse dedicatedIpListWithOptions(DedicatedIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpList"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dedicated IP User IP List</p>
     * 
     * @param request DedicatedIpListRequest
     * @return DedicatedIpListResponse
     */
    public DedicatedIpListResponse dedicatedIpList(DedicatedIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Purchased Independent IPs Not Added to Pool</p>
     * 
     * @param request DedicatedIpNonePoolListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpNonePoolListResponse
     */
    public DedicatedIpNonePoolListResponse dedicatedIpNonePoolListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpNonePoolList"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpNonePoolListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Purchased Independent IPs Not Added to Pool</p>
     * @return DedicatedIpNonePoolListResponse
     */
    public DedicatedIpNonePoolListResponse dedicatedIpNonePoolList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpNonePoolListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creation of Independent IP Pool</p>
     * 
     * @param request DedicatedIpPoolCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpPoolCreateResponse
     */
    public DedicatedIpPoolCreateResponse dedicatedIpPoolCreateWithOptions(DedicatedIpPoolCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyResourceIds)) {
            query.put("BuyResourceIds", request.buyResourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpPoolCreate"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpPoolCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creation of Independent IP Pool</p>
     * 
     * @param request DedicatedIpPoolCreateRequest
     * @return DedicatedIpPoolCreateResponse
     */
    public DedicatedIpPoolCreateResponse dedicatedIpPoolCreate(DedicatedIpPoolCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpPoolCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>独立IP池删除</p>
     * 
     * @param request DedicatedIpPoolDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpPoolDeleteResponse
     */
    public DedicatedIpPoolDeleteResponse dedicatedIpPoolDeleteWithOptions(DedicatedIpPoolDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpPoolDelete"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpPoolDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>独立IP池删除</p>
     * 
     * @param request DedicatedIpPoolDeleteRequest
     * @return DedicatedIpPoolDeleteResponse
     */
    public DedicatedIpPoolDeleteResponse dedicatedIpPoolDelete(DedicatedIpPoolDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpPoolDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dedicated IP Pool List</p>
     * 
     * @param request DedicatedIpPoolListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpPoolListResponse
     */
    public DedicatedIpPoolListResponse dedicatedIpPoolListWithOptions(DedicatedIpPoolListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpPoolList"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpPoolListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dedicated IP Pool List</p>
     * 
     * @param request DedicatedIpPoolListRequest
     * @return DedicatedIpPoolListResponse
     */
    public DedicatedIpPoolListResponse dedicatedIpPoolList(DedicatedIpPoolListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpPoolListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update of dedicated IP Pool</p>
     * 
     * @param request DedicatedIpPoolUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DedicatedIpPoolUpdateResponse
     */
    public DedicatedIpPoolUpdateResponse dedicatedIpPoolUpdateWithOptions(DedicatedIpPoolUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyResourceIds)) {
            query.put("BuyResourceIds", request.buyResourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateResource)) {
            query.put("UpdateResource", request.updateResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DedicatedIpPoolUpdate"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DedicatedIpPoolUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update of dedicated IP Pool</p>
     * 
     * @param request DedicatedIpPoolUpdateRequest
     * @return DedicatedIpPoolUpdateResponse
     */
    public DedicatedIpPoolUpdateResponse dedicatedIpPoolUpdate(DedicatedIpPoolUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dedicatedIpPoolUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Domain</p>
     * 
     * @param request DeleteDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2015-11-23"),
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
     * <b>summary</b> : 
     * <p>Delete Domain</p>
     * 
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove invalid addresses from the invalid address database</p>
     * 
     * @param request DeleteInvalidAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInvalidAddressResponse
     */
    public DeleteInvalidAddressResponse deleteInvalidAddressWithOptions(DeleteInvalidAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toAddress)) {
            query.put("ToAddress", request.toAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInvalidAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInvalidAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove invalid addresses from the invalid address database</p>
     * 
     * @param request DeleteInvalidAddressRequest
     * @return DeleteInvalidAddressResponse
     */
    public DeleteInvalidAddressResponse deleteInvalidAddress(DeleteInvalidAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInvalidAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete IP Protection Information</p>
     * 
     * @param request DeleteIpfilterByEdmIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpfilterByEdmIdResponse
     */
    public DeleteIpfilterByEdmIdResponse deleteIpfilterByEdmIdWithOptions(DeleteIpfilterByEdmIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromType)) {
            query.put("FromType", request.fromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpfilterByEdmId"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpfilterByEdmIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete IP Protection Information</p>
     * 
     * @param request DeleteIpfilterByEdmIdRequest
     * @return DeleteIpfilterByEdmIdResponse
     */
    public DeleteIpfilterByEdmIdResponse deleteIpfilterByEdmId(DeleteIpfilterByEdmIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpfilterByEdmIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Mail Address</p>
     * 
     * @param request DeleteMailAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMailAddressResponse
     */
    public DeleteMailAddressResponse deleteMailAddressWithOptions(DeleteMailAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mailAddressId)) {
            query.put("MailAddressId", request.mailAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMailAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMailAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Mail Address</p>
     * 
     * @param request DeleteMailAddressRequest
     * @return DeleteMailAddressResponse
     */
    public DeleteMailAddressResponse deleteMailAddress(DeleteMailAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMailAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Receiver List</p>
     * 
     * @param request DeleteReceiverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteReceiverResponse
     */
    public DeleteReceiverResponse deleteReceiverWithOptions(DeleteReceiverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverId)) {
            query.put("ReceiverId", request.receiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteReceiver"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteReceiverResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Receiver List</p>
     * 
     * @param request DeleteReceiverRequest
     * @return DeleteReceiverResponse
     */
    public DeleteReceiverResponse deleteReceiver(DeleteReceiverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteReceiverWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a Single Recipient</p>
     * 
     * @param request DeleteReceiverDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteReceiverDetailResponse
     */
    public DeleteReceiverDetailResponse deleteReceiverDetailWithOptions(DeleteReceiverDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverId)) {
            query.put("ReceiverId", request.receiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteReceiverDetail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteReceiverDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a Single Recipient</p>
     * 
     * @param request DeleteReceiverDetailRequest
     * @return DeleteReceiverDetailResponse
     */
    public DeleteReceiverDetailResponse deleteReceiverDetail(DeleteReceiverDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteReceiverDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Tag</p>
     * 
     * @param request DeleteTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTag"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Tag</p>
     * 
     * @param request DeleteTagRequest
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除批量校验任务的结果文件</p>
     * 
     * @param request DeleteValidateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteValidateFileResponse
     */
    public DeleteValidateFileResponse deleteValidateFileWithOptions(DeleteValidateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteValidateFile"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteValidateFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除批量校验任务的结果文件</p>
     * 
     * @param request DeleteValidateFileRequest
     * @return DeleteValidateFileResponse
     */
    public DeleteValidateFileResponse deleteValidateFile(DeleteValidateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteValidateFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve account information.</p>
     * 
     * @param request DescAccountSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescAccountSummaryResponse
     */
    public DescAccountSummaryResponse descAccountSummaryWithOptions(DescAccountSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescAccountSummary"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescAccountSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve account information.</p>
     * 
     * @param request DescAccountSummaryRequest
     * @return DescAccountSummaryResponse
     */
    public DescAccountSummaryResponse descAccountSummary(DescAccountSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.descAccountSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Domain Details</p>
     * 
     * @param request DescDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescDomainResponse
     */
    public DescDomainResponse descDomainWithOptions(DescDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireRealTimeDnsRecords)) {
            query.put("RequireRealTimeDnsRecords", request.requireRealTimeDnsRecords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescDomain"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Domain Details</p>
     * 
     * @param request DescDomainRequest
     * @return DescDomainResponse
     */
    public DescDomainResponse descDomain(DescDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.descDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看模板信息</p>
     * 
     * @param request DescTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescTemplateResponse
     */
    public DescTemplateResponse descTemplateWithOptions(DescTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromType)) {
            query.put("FromType", request.fromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescTemplate"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看模板信息</p>
     * 
     * @param request DescTemplateRequest
     * @return DescTemplateResponse
     */
    public DescTemplateResponse descTemplate(DescTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.descTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取专属ip的预热详情信息</p>
     * 
     * @param request GetDedicatedIpWarmUpDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDedicatedIpWarmUpDetailResponse
     */
    public GetDedicatedIpWarmUpDetailResponse getDedicatedIpWarmUpDetailWithOptions(GetDedicatedIpWarmUpDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIp)) {
            query.put("DedicatedIp", request.dedicatedIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDayMark)) {
            query.put("EndDayMark", request.endDayMark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esp)) {
            query.put("Esp", request.esp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDayMark)) {
            query.put("StartDayMark", request.startDayMark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDedicatedIpWarmUpDetail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDedicatedIpWarmUpDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取专属ip的预热详情信息</p>
     * 
     * @param request GetDedicatedIpWarmUpDetailRequest
     * @return GetDedicatedIpWarmUpDetailResponse
     */
    public GetDedicatedIpWarmUpDetailResponse getDedicatedIpWarmUpDetail(GetDedicatedIpWarmUpDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDedicatedIpWarmUpDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取专属ip的预热信息</p>
     * 
     * @param request GetDedicatedIpWarmUpInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDedicatedIpWarmUpInfoResponse
     */
    public GetDedicatedIpWarmUpInfoResponse getDedicatedIpWarmUpInfoWithOptions(GetDedicatedIpWarmUpInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIp)) {
            query.put("DedicatedIp", request.dedicatedIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDedicatedIpWarmUpInfo"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDedicatedIpWarmUpInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取专属ip的预热信息</p>
     * 
     * @param request GetDedicatedIpWarmUpInfoRequest
     * @return GetDedicatedIpWarmUpInfoResponse
     */
    public GetDedicatedIpWarmUpInfoResponse getDedicatedIpWarmUpInfo(GetDedicatedIpWarmUpInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDedicatedIpWarmUpInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get IP Protection Information</p>
     * 
     * @param request GetIpProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIpProtectionResponse
     */
    public GetIpProtectionResponse getIpProtectionWithOptions(GetIpProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIpProtection"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIpProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get IP Protection Information</p>
     * 
     * @param request GetIpProtectionRequest
     * @return GetIpProtectionResponse
     */
    public GetIpProtectionResponse getIpProtection(GetIpProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIpProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve IP Protection Information</p>
     * 
     * @param request GetIpfilterListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIpfilterListResponse
     */
    public GetIpfilterListResponse getIpfilterListWithOptions(GetIpfilterListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIpfilterList"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIpfilterListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve IP Protection Information</p>
     * 
     * @param request GetIpfilterListRequest
     * @return GetIpfilterListResponse
     */
    public GetIpfilterListResponse getIpfilterList(GetIpfilterListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIpfilterListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户无效地址级别配置</p>
     * 
     * @param request GetSuppressionListLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuppressionListLevelResponse
     */
    public GetSuppressionListLevelResponse getSuppressionListLevelWithOptions(GetSuppressionListLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuppressionListLevel"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuppressionListLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户无效地址级别配置</p>
     * 
     * @param request GetSuppressionListLevelRequest
     * @return GetSuppressionListLevelResponse
     */
    public GetSuppressionListLevelResponse getSuppressionListLevel(GetSuppressionListLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuppressionListLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get tracking information</p>
     * 
     * @param request GetTrackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrackListResponse
     */
    public GetTrackListResponse getTrackListWithOptions(GetTrackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSetId)) {
            query.put("ConfigSetId", request.configSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIp)) {
            query.put("DedicatedIp", request.dedicatedIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIpPoolId)) {
            query.put("DedicatedIpPoolId", request.dedicatedIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esp)) {
            query.put("Esp", request.esp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetCreateTime)) {
            query.put("OffsetCreateTime", request.offsetCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetCreateTimeDesc)) {
            query.put("OffsetCreateTimeDesc", request.offsetCreateTimeDesc);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.total)) {
            query.put("Total", request.total);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrackList"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrackListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get tracking information</p>
     * 
     * @param request GetTrackListRequest
     * @return GetTrackListResponse
     */
    public GetTrackListResponse getTrackList(GetTrackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrackListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get tracking information based on the sender address and tag name</p>
     * 
     * @param request GetTrackListByMailFromAndTagNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrackListByMailFromAndTagNameResponse
     */
    public GetTrackListByMailFromAndTagNameResponse getTrackListByMailFromAndTagNameWithOptions(GetTrackListByMailFromAndTagNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSetId)) {
            query.put("ConfigSetId", request.configSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIp)) {
            query.put("DedicatedIp", request.dedicatedIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIpPoolId)) {
            query.put("DedicatedIpPoolId", request.dedicatedIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esp)) {
            query.put("Esp", request.esp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetCreateTime)) {
            query.put("OffsetCreateTime", request.offsetCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetCreateTimeDesc)) {
            query.put("OffsetCreateTimeDesc", request.offsetCreateTimeDesc);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.total)) {
            query.put("Total", request.total);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrackListByMailFromAndTagName"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrackListByMailFromAndTagNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get tracking information based on the sender address and tag name</p>
     * 
     * @param request GetTrackListByMailFromAndTagNameRequest
     * @return GetTrackListByMailFromAndTagNameResponse
     */
    public GetTrackListByMailFromAndTagNameResponse getTrackListByMailFromAndTagName(GetTrackListByMailFromAndTagNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrackListByMailFromAndTagNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Account Details</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Account Details</p>
     * @return GetUserResponse
     */
    public GetUserResponse getUser() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取批量校验任务的结果文件</p>
     * 
     * @param request GetValidateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetValidateFileResponse
     */
    public GetValidateFileResponse getValidateFileWithOptions(GetValidateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetValidateFile"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetValidateFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取批量校验任务的结果文件</p>
     * 
     * @param request GetValidateFileRequest
     * @return GetValidateFileResponse
     */
    public GetValidateFileResponse getValidateFile(GetValidateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getValidateFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取批量校验任务的状态</p>
     * 
     * @param request GetValidateFileStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetValidateFileStatusResponse
     */
    public GetValidateFileStatusResponse getValidateFileStatusWithOptions(GetValidateFileStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetValidateFileStatus"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetValidateFileStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取批量校验任务的状态</p>
     * 
     * @param request GetValidateFileStatusRequest
     * @return GetValidateFileStatusResponse
     */
    public GetValidateFileStatusResponse getValidateFileStatus(GetValidateFileStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getValidateFileStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取电子邮件校验额度</p>
     * 
     * @param request GetValidationQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetValidationQuotaResponse
     */
    public GetValidationQuotaResponse getValidationQuotaWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetValidationQuota"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetValidationQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取电子邮件校验额度</p>
     * @return GetValidationQuotaResponse
     */
    public GetValidationQuotaResponse getValidationQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getValidationQuotaWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取发信的黑名单列表</p>
     * 
     * @param request ListBlockSendingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBlockSendingResponse
     */
    public ListBlockSendingResponse listBlockSendingWithOptions(ListBlockSendingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockEmail)) {
            query.put("BlockEmail", request.blockEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockType)) {
            query.put("BlockType", request.blockType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderEmail)) {
            query.put("SenderEmail", request.senderEmail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBlockSending"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBlockSendingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取发信的黑名单列表</p>
     * 
     * @param request ListBlockSendingRequest
     * @return ListBlockSendingResponse
     */
    public ListBlockSendingResponse listBlockSending(ListBlockSendingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBlockSendingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List User Invalid Addresses.</p>
     * 
     * @param request ListUserSuppressionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserSuppressionResponse
     */
    public ListUserSuppressionResponse listUserSuppressionWithOptions(ListUserSuppressionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBounceTime)) {
            query.put("EndBounceTime", request.endBounceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            query.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startBounceTime)) {
            query.put("StartBounceTime", request.startBounceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCreateTime)) {
            query.put("StartCreateTime", request.startCreateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserSuppression"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserSuppressionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List User Invalid Addresses.</p>
     * 
     * @param request ListUserSuppressionRequest
     * @return ListUserSuppressionResponse
     */
    public ListUserSuppressionResponse listUserSuppression(ListUserSuppressionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserSuppressionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传的校验文件的列表</p>
     * 
     * @param request ListValidateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListValidateFileResponse
     */
    public ListValidateFileResponse listValidateFileWithOptions(ListValidateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileKeyword)) {
            query.put("FileKeyword", request.fileKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
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
            new TeaPair("action", "ListValidateFile"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListValidateFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传的校验文件的列表</p>
     * 
     * @param request ListValidateFileRequest
     * @return ListValidateFileResponse
     */
    public ListValidateFileResponse listValidateFile(ListValidateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listValidateFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the sending address</p>
     * 
     * @param request ModifyMailAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMailAddressResponse
     */
    public ModifyMailAddressResponse modifyMailAddressWithOptions(ModifyMailAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mailAddressId)) {
            query.put("MailAddressId", request.mailAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyAddress)) {
            query.put("ReplyAddress", request.replyAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMailAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMailAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the sending address</p>
     * 
     * @param request ModifyMailAddressRequest
     * @return ModifyMailAddressResponse
     */
    public ModifyMailAddressResponse modifyMailAddress(ModifyMailAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMailAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the domain-level password</p>
     * 
     * @param request ModifyPWByDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPWByDomainResponse
     */
    public ModifyPWByDomainResponse modifyPWByDomainWithOptions(ModifyPWByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPWByDomain"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPWByDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the domain-level password</p>
     * 
     * @param request ModifyPWByDomainRequest
     * @return ModifyPWByDomainResponse
     */
    public ModifyPWByDomainResponse modifyPWByDomain(ModifyPWByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPWByDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Tag</p>
     * 
     * @param request ModifyTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTagResponse
     */
    public ModifyTagResponse modifyTagWithOptions(ModifyTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagDescription)) {
            query.put("TagDescription", request.tagDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTag"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Tag</p>
     * 
     * @param request ModifyTagRequest
     * @return ModifyTagResponse
     */
    public ModifyTagResponse modifyTag(ModifyTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query domain information</p>
     * 
     * @param request QueryDomainByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainByParamResponse
     */
    public QueryDomainByParamResponse queryDomainByParamWithOptions(QueryDomainByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query domain information</p>
     * 
     * @param request QueryDomainByParamRequest
     * @return QueryDomainByParamResponse
     */
    public QueryDomainByParamResponse queryDomainByParam(QueryDomainByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainByParamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve deduplicated invalid address information. If an email is sent to the same invalid address multiple times, only the first occurrence will be recorded. The query should be based on the time when the address was first classified as invalid.</p>
     * 
     * <b>summary</b> : 
     * <p>NextStart changed to string</p>
     * 
     * @param request QueryInvalidAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInvalidAddressResponse
     */
    public QueryInvalidAddressResponse queryInvalidAddressWithOptions(QueryInvalidAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextStart)) {
            query.put("NextStart", request.nextStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInvalidAddress"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInvalidAddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieve deduplicated invalid address information. If an email is sent to the same invalid address multiple times, only the first occurrence will be recorded. The query should be based on the time when the address was first classified as invalid.</p>
     * 
     * <b>summary</b> : 
     * <p>NextStart changed to string</p>
     * 
     * @param request QueryInvalidAddressRequest
     * @return QueryInvalidAddressResponse
     */
    public QueryInvalidAddressResponse queryInvalidAddress(QueryInvalidAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInvalidAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of sending addresses.</p>
     * 
     * @param request QueryMailAddressByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMailAddressByParamResponse
     */
    public QueryMailAddressByParamResponse queryMailAddressByParamWithOptions(QueryMailAddressByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendtype)) {
            query.put("Sendtype", request.sendtype);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMailAddressByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMailAddressByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of sending addresses.</p>
     * 
     * @param request QueryMailAddressByParamRequest
     * @return QueryMailAddressByParamResponse
     */
    public QueryMailAddressByParamResponse queryMailAddressByParam(QueryMailAddressByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMailAddressByParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of the recipient list</p>
     * 
     * @param request QueryReceiverByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReceiverByParamResponse
     */
    public QueryReceiverByParamResponse queryReceiverByParamWithOptions(QueryReceiverByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReceiverByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReceiverByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of the recipient list</p>
     * 
     * @param request QueryReceiverByParamRequest
     * @return QueryReceiverByParamResponse
     */
    public QueryReceiverByParamResponse queryReceiverByParam(QueryReceiverByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReceiverByParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve detailed information about a recipient list</p>
     * 
     * @param request QueryReceiverDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReceiverDetailResponse
     */
    public QueryReceiverDetailResponse queryReceiverDetailWithOptions(QueryReceiverDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextStart)) {
            query.put("NextStart", request.nextStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverId)) {
            query.put("ReceiverId", request.receiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReceiverDetail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReceiverDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve detailed information about a recipient list</p>
     * 
     * @param request QueryReceiverDetailRequest
     * @return QueryReceiverDetailResponse
     */
    public QueryReceiverDetailResponse queryReceiverDetail(QueryReceiverDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReceiverDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call QueryTagByParam to retrieve tags.</p>
     * 
     * @param request QueryTagByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTagByParamResponse
     */
    public QueryTagByParamResponse queryTagByParamWithOptions(QueryTagByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTagByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call QueryTagByParam to retrieve tags.</p>
     * 
     * @param request QueryTagByParamRequest
     * @return QueryTagByParamResponse
     */
    public QueryTagByParamResponse queryTagByParam(QueryTagByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagByParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query task list</p>
     * 
     * @param request QueryTaskByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskByParamResponse
     */
    public QueryTaskByParamResponse queryTaskByParamWithOptions(QueryTaskByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query task list</p>
     * 
     * @param request QueryTaskByParamRequest
     * @return QueryTaskByParamResponse
     */
    public QueryTaskByParamResponse queryTaskByParam(QueryTaskByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskByParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模板信息</p>
     * 
     * @param request QueryTemplateByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTemplateByParamResponse
     */
    public QueryTemplateByParamResponse queryTemplateByParamWithOptions(QueryTemplateByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromType)) {
            query.put("FromType", request.fromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTemplateByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTemplateByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模板信息</p>
     * 
     * @param request QueryTemplateByParamRequest
     * @return QueryTemplateByParamResponse
     */
    public QueryTemplateByParamResponse queryTemplateByParam(QueryTemplateByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTemplateByParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户无效地址</p>
     * 
     * @param request RemoveUserSuppressionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserSuppressionResponse
     */
    public RemoveUserSuppressionResponse removeUserSuppressionWithOptions(RemoveUserSuppressionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suppressionIds)) {
            query.put("SuppressionIds", request.suppressionIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserSuppression"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserSuppressionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户无效地址</p>
     * 
     * @param request RemoveUserSuppressionRequest
     * @return RemoveUserSuppressionResponse
     */
    public RemoveUserSuppressionResponse removeUserSuppression(RemoveUserSuppressionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserSuppressionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a Single Recipient</p>
     * 
     * @param request SaveReceiverDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveReceiverDetailResponse
     */
    public SaveReceiverDetailResponse saveReceiverDetailWithOptions(SaveReceiverDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customDetail)) {
            query.put("CustomDetail", request.customDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverId)) {
            query.put("ReceiverId", request.receiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveReceiverDetail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveReceiverDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a Single Recipient</p>
     * 
     * @param request SaveReceiverDetailRequest
     * @return SaveReceiverDetailResponse
     */
    public SaveReceiverDetailResponse saveReceiverDetail(SaveReceiverDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveReceiverDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Send Template Test Email</p>
     * 
     * @param request SendTestByTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendTestByTemplateResponse
     */
    public SendTestByTemplateResponse sendTestByTemplateWithOptions(SendTestByTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            query.put("Birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            query.put("NickName", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParams)) {
            query.put("TemplateParams", request.templateParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTestByTemplate"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTestByTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Send Template Test Email</p>
     * 
     * @param request SendTestByTemplateRequest
     * @return SendTestByTemplateResponse
     */
    public SendTestByTemplateResponse sendTestByTemplate(SendTestByTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendTestByTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交批量校验任务</p>
     * 
     * @param request SendValidateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendValidateFileResponse
     */
    public SendValidateFileResponse sendValidateFileWithOptions(SendValidateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressColumn)) {
            query.put("AddressColumn", request.addressColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasHeaderRow)) {
            query.put("HasHeaderRow", request.hasHeaderRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeDuplicate)) {
            query.put("RemoveDuplicate", request.removeDuplicate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendValidateFile"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendValidateFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交批量校验任务</p>
     * 
     * @param request SendValidateFileRequest
     * @return SendValidateFileResponse
     */
    public SendValidateFileResponse sendValidateFile(SendValidateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendValidateFileWithOptions(request, runtime);
    }

    public SendValidateFileResponse sendValidateFileAdvance(SendValidateFileAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "Dm"),
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
        SendValidateFileRequest sendValidateFileReq = new SendValidateFileRequest();
        com.aliyun.openapiutil.Client.convert(request, sendValidateFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
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
            sendValidateFileReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        SendValidateFileResponse sendValidateFileResp = this.sendValidateFileWithOptions(sendValidateFileReq, runtime);
        return sendValidateFileResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve Sending Data under Specified Conditions</p>
     * 
     * @param request SenderStatisticsByTagNameAndBatchIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SenderStatisticsByTagNameAndBatchIDResponse
     */
    public SenderStatisticsByTagNameAndBatchIDResponse senderStatisticsByTagNameAndBatchIDWithOptions(SenderStatisticsByTagNameAndBatchIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIp)) {
            query.put("DedicatedIp", request.dedicatedIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedIpPoolId)) {
            query.put("DedicatedIpPoolId", request.dedicatedIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esp)) {
            query.put("Esp", request.esp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SenderStatisticsByTagNameAndBatchID"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SenderStatisticsByTagNameAndBatchIDResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve Sending Data under Specified Conditions</p>
     * 
     * @param request SenderStatisticsByTagNameAndBatchIDRequest
     * @return SenderStatisticsByTagNameAndBatchIDResponse
     */
    public SenderStatisticsByTagNameAndBatchIDResponse senderStatisticsByTagNameAndBatchID(SenderStatisticsByTagNameAndBatchIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.senderStatisticsByTagNameAndBatchIDWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Delivery Result Details</p>
     * 
     * @param request SenderStatisticsDetailByParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SenderStatisticsDetailByParamResponse
     */
    public SenderStatisticsDetailByParamResponse senderStatisticsDetailByParamWithOptions(SenderStatisticsDetailByParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSetId)) {
            query.put("ConfigSetId", request.configSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipPoolId)) {
            query.put("IpPoolId", request.ipPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextStart)) {
            query.put("NextStart", request.nextStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toAddress)) {
            query.put("ToAddress", request.toAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SenderStatisticsDetailByParam"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SenderStatisticsDetailByParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Delivery Result Details</p>
     * 
     * @param request SenderStatisticsDetailByParamRequest
     * @return SenderStatisticsDetailByParamResponse
     */
    public SenderStatisticsDetailByParamResponse senderStatisticsDetailByParam(SenderStatisticsDetailByParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.senderStatisticsDetailByParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户无效地址级别配置</p>
     * 
     * @param request SetSuppressionListLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSuppressionListLevelResponse
     */
    public SetSuppressionListLevelResponse setSuppressionListLevelWithOptions(SetSuppressionListLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suppressionListLevel)) {
            query.put("SuppressionListLevel", request.suppressionListLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSuppressionListLevel"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSuppressionListLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户无效地址级别配置</p>
     * 
     * @param request SetSuppressionListLevelRequest
     * @return SetSuppressionListLevelResponse
     */
    public SetSuppressionListLevelResponse setSuppressionListLevel(SetSuppressionListLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuppressionListLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>API for Sending Emails</p>
     * 
     * @param tmpReq SingleSendMailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SingleSendMailResponse
     */
    public SingleSendMailResponse singleSendMailWithOptions(SingleSendMailRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SingleSendMailShrinkRequest request = new SingleSendMailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            body.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachments)) {
            body.put("Attachments", request.attachments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bccAddress)) {
            body.put("BccAddress", request.bccAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clickTrace)) {
            body.put("ClickTrace", request.clickTrace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainAuth)) {
            body.put("DomainAuth", request.domainAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromAlias)) {
            body.put("FromAlias", request.fromAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headers)) {
            body.put("Headers", request.headers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.htmlBody)) {
            body.put("HtmlBody", request.htmlBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipPoolId)) {
            body.put("IpPoolId", request.ipPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyAddress)) {
            body.put("ReplyAddress", request.replyAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyAddressAlias)) {
            body.put("ReplyAddressAlias", request.replyAddressAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyToAddress)) {
            body.put("ReplyToAddress", request.replyToAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            body.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            body.put("Template", request.templateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textBody)) {
            body.put("TextBody", request.textBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toAddress)) {
            body.put("ToAddress", request.toAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unSubscribeFilterLevel)) {
            body.put("UnSubscribeFilterLevel", request.unSubscribeFilterLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unSubscribeLinkType)) {
            body.put("UnSubscribeLinkType", request.unSubscribeLinkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleSendMail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleSendMailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>API for Sending Emails</p>
     * 
     * @param request SingleSendMailRequest
     * @return SingleSendMailResponse
     */
    public SingleSendMailResponse singleSendMail(SingleSendMailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.singleSendMailWithOptions(request, runtime);
    }

    public SingleSendMailResponse singleSendMailAdvance(SingleSendMailAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "Dm"),
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
        SingleSendMailRequest singleSendMailReq = new SingleSendMailRequest();
        com.aliyun.openapiutil.Client.convert(request, singleSendMailReq);
        if (!com.aliyun.teautil.Common.isUnset(request.attachments)) {
            Integer i0 = 0;
            for (SingleSendMailAdvanceRequest.SingleSendMailAdvanceRequestAttachments item0 : request.attachments) {
                if (!com.aliyun.teautil.Common.isUnset(item0.attachmentUrlObject)) {
                    Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
                    authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
                    tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
                    useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
                    authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponseBody.get("ObjectKey")),
                        new TeaPair("content", item0.attachmentUrlObject),
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
                    SingleSendMailRequest.SingleSendMailRequestAttachments tmp = singleSendMailReq.attachments.get(i0);
                    tmp.attachmentUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        SingleSendMailResponse singleSendMailResp = this.singleSendMailWithOptions(singleSendMailReq, runtime);
        return singleSendMailResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Lift sending restrictions due to unsubscription, reporting, etc.</p>
     * 
     * @param request UnblockSendingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnblockSendingResponse
     */
    public UnblockSendingResponse unblockSendingWithOptions(UnblockSendingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockEmail)) {
            query.put("BlockEmail", request.blockEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockType)) {
            query.put("BlockType", request.blockType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderEmail)) {
            query.put("SenderEmail", request.senderEmail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnblockSending"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnblockSendingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lift sending restrictions due to unsubscription, reporting, etc.</p>
     * 
     * @param request UnblockSendingRequest
     * @return UnblockSendingResponse
     */
    public UnblockSendingResponse unblockSending(UnblockSendingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unblockSendingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update IP Protection API</p>
     * 
     * @param request UpdateIpProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIpProtectionResponse
     */
    public UpdateIpProtectionResponse updateIpProtectionWithOptions(UpdateIpProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipProtection)) {
            query.put("IpProtection", request.ipProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpProtection"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update IP Protection API</p>
     * 
     * @param request UpdateIpProtectionRequest
     * @return UpdateIpProtectionResponse
     */
    public UpdateIpProtectionResponse updateIpProtection(UpdateIpProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update account information</p>
     * 
     * @param tmpReq UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserShrinkRequest request = new UpdateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.user)) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.user, "User", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userShrink)) {
            body.put("User", request.userShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update account information</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验电子邮件地址</p>
     * 
     * @param request ValidateEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateEmailResponse
     */
    public ValidateEmailResponse validateEmailWithOptions(ValidateEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkGraylist)) {
            query.put("CheckGraylist", request.checkGraylist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateEmail"),
            new TeaPair("version", "2015-11-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验电子邮件地址</p>
     * 
     * @param request ValidateEmailRequest
     * @return ValidateEmailResponse
     */
    public ValidateEmailResponse validateEmail(ValidateEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateEmailWithOptions(request, runtime);
    }
}
