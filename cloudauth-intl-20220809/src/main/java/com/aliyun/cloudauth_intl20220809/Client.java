// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.cloudauth_intl20220809.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth-intl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>API for comparing two addresses, standardizing and checking address consistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Address Similarity Comparison</p>
     * 
     * @param request AddressCompareIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddressCompareIntlResponse
     */
    public AddressCompareIntlResponse addressCompareIntlWithOptions(AddressCompareIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultCountry)) {
            query.put("DefaultCountry", request.defaultCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text1)) {
            query.put("Text1", request.text1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text2)) {
            query.put("Text2", request.text2);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddressCompareIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddressCompareIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>API for comparing two addresses, standardizing and checking address consistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Address Similarity Comparison</p>
     * 
     * @param request AddressCompareIntlRequest
     * @return AddressCompareIntlResponse
     */
    public AddressCompareIntlResponse addressCompareIntl(AddressCompareIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addressCompareIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Based on the operator\&quot;s capabilities, input the phone number and address (or latitude and longitude) to verify whether the provided address is the user\&quot;s usual residence.</p>
     * 
     * <b>summary</b> : 
     * <p>Address Verification</p>
     * 
     * @deprecated OpenAPI AddressVerifyIntl is deprecated, please use Cloudauth-intl::2022-08-09::AddressVerifyV2Intl instead.
     * 
     * @param request AddressVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddressVerifyIntlResponse
     */
    @Deprecated
    // Deprecated
    public AddressVerifyIntlResponse addressVerifyIntlWithOptions(AddressVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            query.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCountry)) {
            query.put("DefaultCountry", request.defaultCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            query.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            query.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddressVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddressVerifyIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Based on the operator\&quot;s capabilities, input the phone number and address (or latitude and longitude) to verify whether the provided address is the user\&quot;s usual residence.</p>
     * 
     * <b>summary</b> : 
     * <p>Address Verification</p>
     * 
     * @deprecated OpenAPI AddressVerifyIntl is deprecated, please use Cloudauth-intl::2022-08-09::AddressVerifyV2Intl instead.
     * 
     * @param request AddressVerifyIntlRequest
     * @return AddressVerifyIntlResponse
     */
    @Deprecated
    // Deprecated
    public AddressVerifyIntlResponse addressVerifyIntl(AddressVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addressVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes the address verification API operation, which verifies the region and address of a device using device data and carrier big data capabilities.</p>
     * 
     * @param request AddressVerifyV2IntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddressVerifyV2IntlResponse
     */
    public AddressVerifyV2IntlResponse addressVerifyV2IntlWithOptions(AddressVerifyV2IntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceToken)) {
            query.put("DeviceToken", request.deviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regCountry)) {
            query.put("RegCountry", request.regCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddressVerifyV2Intl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddressVerifyV2IntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes the address verification API operation, which verifies the region and address of a device using device data and carrier big data capabilities.</p>
     * 
     * @param request AddressVerifyV2IntlRequest
     * @return AddressVerifyV2IntlResponse
     */
    public AddressVerifyV2IntlResponse addressVerifyV2Intl(AddressVerifyV2IntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addressVerifyV2IntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Verification of bank card elements, including: two-element verification (name + bank card number), three-element verification (name + ID number + bank card number), and four-element verification (name + ID number + phone number + bank card number) for consistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Bank Card Verification</p>
     * 
     * @param request BankMetaVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BankMetaVerifyIntlResponse
     */
    public BankMetaVerifyIntlResponse bankMetaVerifyIntlWithOptions(BankMetaVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bankCard)) {
            query.put("BankCard", request.bankCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyMode)) {
            query.put("VerifyMode", request.verifyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BankMetaVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BankMetaVerifyIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Verification of bank card elements, including: two-element verification (name + bank card number), three-element verification (name + ID number + bank card number), and four-element verification (name + ID number + phone number + bank card number) for consistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Bank Card Verification</p>
     * 
     * @param request BankMetaVerifyIntlRequest
     * @return BankMetaVerifyIntlResponse
     */
    public BankMetaVerifyIntlResponse bankMetaVerifyIntl(BankMetaVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bankMetaVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pure server-side interface for document OCR recognition</p>
     * 
     * @deprecated OpenAPI CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.
     * 
     * @param request CardOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CardOcrResponse
     */
    @Deprecated
    // Deprecated
    public CardOcrResponse cardOcrWithOptions(CardOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            query.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spoof)) {
            query.put("Spoof", request.spoof);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CardOcr"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CardOcrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pure server-side interface for document OCR recognition</p>
     * 
     * @deprecated OpenAPI CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.
     * 
     * @param request CardOcrRequest
     * @return CardOcrResponse
     */
    @Deprecated
    // Deprecated
    public CardOcrResponse cardOcr(CardOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cardOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Result Query</p>
     * 
     * @param request CheckResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResultResponse
     */
    public CheckResultResponse checkResultWithOptions(CheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraImageControlList)) {
            query.put("ExtraImageControlList", request.extraImageControlList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReturnImage)) {
            query.put("IsReturnImage", request.isReturnImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFiveCategorySpoofResult)) {
            query.put("ReturnFiveCategorySpoofResult", request.returnFiveCategorySpoofResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResult"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Result Query</p>
     * 
     * @param request CheckResultRequest
     * @return CheckResultResponse
     */
    public CheckResultResponse checkResult(CheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authentication Log Query Interface</p>
     * 
     * @param request CheckVerifyLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckVerifyLogResponse
     */
    public CheckVerifyLogResponse checkVerifyLogWithOptions(CheckVerifyLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            body.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            body.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckVerifyLog"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckVerifyLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authentication Log Query Interface</p>
     * 
     * @param request CheckVerifyLogRequest
     * @return CheckVerifyLogResponse
     */
    public CheckVerifyLogResponse checkVerifyLog(CheckVerifyLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkVerifyLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After obtaining the TransactionId, you can use this interface on the server side to get the corresponding authentication result.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Recognition Query</p>
     * 
     * @param request CredentialGetResultIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialGetResultIntlResponse
     */
    public CredentialGetResultIntlResponse credentialGetResultIntlWithOptions(CredentialGetResultIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialGetResultIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialGetResultIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>After obtaining the TransactionId, you can use this interface on the server side to get the corresponding authentication result.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Recognition Query</p>
     * 
     * @param request CredentialGetResultIntlRequest
     * @return CredentialGetResultIntlResponse
     */
    public CredentialGetResultIntlResponse credentialGetResultIntl(CredentialGetResultIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialGetResultIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Detects whether a voucher (such as water, electricity, gas, credit card, etc., e-bills) is forged using AI technology and extracts key information from the voucher.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Recognition</p>
     * 
     * @param request CredentialRecognitionIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialRecognitionIntlResponse
     */
    public CredentialRecognitionIntlResponse credentialRecognitionIntlWithOptions(CredentialRecognitionIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fraudCheck)) {
            query.put("FraudCheck", request.fraudCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrArea)) {
            query.put("OcrArea", request.ocrArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialOcrPictureBase64)) {
            body.put("CredentialOcrPictureBase64", request.credentialOcrPictureBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialOcrPictureUrl)) {
            body.put("CredentialOcrPictureUrl", request.credentialOcrPictureUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialRecognitionIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialRecognitionIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Detects whether a voucher (such as water, electricity, gas, credit card, etc., e-bills) is forged using AI technology and extracts key information from the voucher.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Recognition</p>
     * 
     * @param request CredentialRecognitionIntlRequest
     * @return CredentialRecognitionIntlResponse
     */
    public CredentialRecognitionIntlResponse credentialRecognitionIntl(CredentialRecognitionIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialRecognitionIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Initialization interface for credential recognition OCR, through which you can obtain the transactionId.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Recognition Submission</p>
     * 
     * @param request CredentialSubmitIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialSubmitIntlResponse
     */
    public CredentialSubmitIntlResponse credentialSubmitIntlWithOptions(CredentialSubmitIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fraudCheck)) {
            query.put("FraudCheck", request.fraudCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrArea)) {
            query.put("OcrArea", request.ocrArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialOcrPictureBase64)) {
            body.put("CredentialOcrPictureBase64", request.credentialOcrPictureBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialOcrPictureUrl)) {
            body.put("CredentialOcrPictureUrl", request.credentialOcrPictureUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialSubmitIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialSubmitIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Initialization interface for credential recognition OCR, through which you can obtain the transactionId.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Recognition Submission</p>
     * 
     * @param request CredentialSubmitIntlRequest
     * @return CredentialSubmitIntlResponse
     */
    public CredentialSubmitIntlResponse credentialSubmitIntl(CredentialSubmitIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialSubmitIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Input credential image information, perform image quality, tampering, and forgery detection, and return the detection results.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Verification</p>
     * 
     * @param request CredentialVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialVerifyIntlResponse
     */
    public CredentialVerifyIntlResponse credentialVerifyIntlWithOptions(CredentialVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credName)) {
            query.put("CredName", request.credName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credType)) {
            query.put("CredType", request.credType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageFile)) {
            body.put("ImageFile", request.imageFile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialVerifyIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Input credential image information, perform image quality, tampering, and forgery detection, and return the detection results.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Verification</p>
     * 
     * @param request CredentialVerifyIntlRequest
     * @return CredentialVerifyIntlResponse
     */
    public CredentialVerifyIntlResponse credentialVerifyIntl(CredentialVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialVerifyIntlWithOptions(request, runtime);
    }

    public CredentialVerifyIntlResponse credentialVerifyIntlAdvance(CredentialVerifyIntlAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "Cloudauth-intl"),
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
        CredentialVerifyIntlRequest credentialVerifyIntlReq = new CredentialVerifyIntlRequest();
        com.aliyun.openapiutil.Client.convert(request, credentialVerifyIntlReq);
        if (!com.aliyun.teautil.Common.isUnset(request.imageFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.imageFileObject),
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
            credentialVerifyIntlReq.imageFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CredentialVerifyIntlResponse credentialVerifyIntlResp = this.credentialVerifyIntlWithOptions(credentialVerifyIntlReq, runtime);
        return credentialVerifyIntlResp;
    }

    /**
     * <b>description</b> :
     * <p>Input a face image and use the algorithm to detect if there is a risk of deep forgery. This includes risk scenarios such as AIGC-generated faces, deepfake face swapping, template faces, and rephotographed faces, and outputs risk labels and confidence levels.</p>
     * 
     * <b>summary</b> : 
     * <p>Face Credential Verification</p>
     * 
     * @param request DeepfakeDetectIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeepfakeDetectIntlResponse
     */
    public DeepfakeDetectIntlResponse deepfakeDetectIntlWithOptions(DeepfakeDetectIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceInputType)) {
            query.put("FaceInputType", request.faceInputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            query.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceBase64)) {
            body.put("FaceBase64", request.faceBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeepfakeDetectIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeepfakeDetectIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Input a face image and use the algorithm to detect if there is a risk of deep forgery. This includes risk scenarios such as AIGC-generated faces, deepfake face swapping, template faces, and rephotographed faces, and outputs risk labels and confidence levels.</p>
     * 
     * <b>summary</b> : 
     * <p>Face Credential Verification</p>
     * 
     * @param request DeepfakeDetectIntlRequest
     * @return DeepfakeDetectIntlResponse
     */
    public DeepfakeDetectIntlResponse deepfakeDetectIntl(DeepfakeDetectIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deepfakeDetectIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Input a face image and use the algorithm to detect if there is a risk of deepfake. This includes risk scenarios such as AIGC-generated faces, deepfake face swaps, template faces, and rephotographed faces, and outputs risk labels and confidence scores.</p>
     * 
     * <b>summary</b> : 
     * <p>deepfake file stream API</p>
     * 
     * @param request DeepfakeDetectIntlStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeepfakeDetectIntlStreamResponse
     */
    public DeepfakeDetectIntlStreamResponse deepfakeDetectIntlStreamWithOptions(DeepfakeDetectIntlStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceBase64)) {
            body.put("FaceBase64", request.faceBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceFile)) {
            body.put("FaceFile", request.faceFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceInputType)) {
            body.put("FaceInputType", request.faceInputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            body.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            body.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            body.put("SceneCode", request.sceneCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeepfakeDetectIntlStream"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeepfakeDetectIntlStreamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Input a face image and use the algorithm to detect if there is a risk of deepfake. This includes risk scenarios such as AIGC-generated faces, deepfake face swaps, template faces, and rephotographed faces, and outputs risk labels and confidence scores.</p>
     * 
     * <b>summary</b> : 
     * <p>deepfake file stream API</p>
     * 
     * @param request DeepfakeDetectIntlStreamRequest
     * @return DeepfakeDetectIntlStreamResponse
     */
    public DeepfakeDetectIntlStreamResponse deepfakeDetectIntlStream(DeepfakeDetectIntlStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deepfakeDetectIntlStreamWithOptions(request, runtime);
    }

    public DeepfakeDetectIntlStreamResponse deepfakeDetectIntlStreamAdvance(DeepfakeDetectIntlStreamAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "Cloudauth-intl"),
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
        DeepfakeDetectIntlStreamRequest deepfakeDetectIntlStreamReq = new DeepfakeDetectIntlStreamRequest();
        com.aliyun.openapiutil.Client.convert(request, deepfakeDetectIntlStreamReq);
        if (!com.aliyun.teautil.Common.isUnset(request.faceFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.faceFileObject),
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
            deepfakeDetectIntlStreamReq.faceFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        DeepfakeDetectIntlStreamResponse deepfakeDetectIntlStreamResp = this.deepfakeDetectIntlStreamWithOptions(deepfakeDetectIntlStreamReq, runtime);
        return deepfakeDetectIntlStreamResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Face Group</p>
     * 
     * @param request DeleteFaceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceGroupResponse
     */
    public DeleteFaceGroupResponse deleteFaceGroupWithOptions(DeleteFaceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceGroup"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Face Group</p>
     * 
     * @param request DeleteFaceGroupRequest
     * @return DeleteFaceGroupResponse
     */
    public DeleteFaceGroupResponse deleteFaceGroup(DeleteFaceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Face</p>
     * 
     * @param request DeleteFaceRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceRecordResponse
     */
    public DeleteFaceRecordResponse deleteFaceRecordWithOptions(DeleteFaceRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceRecord"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Face</p>
     * 
     * @param request DeleteFaceRecordRequest
     * @return DeleteFaceRecordResponse
     */
    public DeleteFaceRecordResponse deleteFaceRecord(DeleteFaceRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete user authentication record results</p>
     * 
     * @param request DeleteVerifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVerifyResultResponse
     */
    public DeleteVerifyResultResponse deleteVerifyResultWithOptions(DeleteVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAfterQuery)) {
            query.put("DeleteAfterQuery", request.deleteAfterQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteType)) {
            query.put("DeleteType", request.deleteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVerifyResult"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVerifyResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete user authentication record results</p>
     * 
     * @param request DeleteVerifyResultRequest
     * @return DeleteVerifyResultResponse
     */
    public DeleteVerifyResultResponse deleteVerifyResult(DeleteVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVerifyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Card and document OCR pure server-side</p>
     * 
     * @param request DocOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DocOcrResponse
     */
    public DocOcrResponse docOcrWithOptions(DocOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardSide)) {
            query.put("CardSide", request.cardSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            query.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            query.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spoof)) {
            query.put("Spoof", request.spoof);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DocOcr"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DocOcrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Card and document OCR pure server-side</p>
     * 
     * @param request DocOcrRequest
     * @return DocOcrResponse
     */
    public DocOcrResponse docOcr(DocOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.docOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Global Document OCR Recognition Interface</p>
     * 
     * @param request DocOcrMaxRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DocOcrMaxResponse
     */
    public DocOcrMaxResponse docOcrMaxWithOptions(DocOcrMaxRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ocrValueStandard)) {
            query.put("OcrValueStandard", request.ocrValueStandard);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            body.put("Authorize", request.authorize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docPage)) {
            body.put("DocPage", request.docPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            body.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idSpoof)) {
            body.put("IdSpoof", request.idSpoof);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            body.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            body.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            body.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrModel)) {
            body.put("OcrModel", request.ocrModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            body.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spoof)) {
            body.put("Spoof", request.spoof);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DocOcrMax"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DocOcrMaxResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Global Document OCR Recognition Interface</p>
     * 
     * @param request DocOcrMaxRequest
     * @return DocOcrMaxResponse
     */
    public DocOcrMaxResponse docOcrMax(DocOcrMaxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.docOcrMaxWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Console Export Records</p>
     * 
     * @param request DownloadVerifyRecordIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadVerifyRecordIntlResponse
     */
    public DownloadVerifyRecordIntlResponse downloadVerifyRecordIntlWithOptions(DownloadVerifyRecordIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadMode)) {
            query.put("DownloadMode", request.downloadMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadVerifyRecordIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadVerifyRecordIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Console Export Records</p>
     * 
     * @param request DownloadVerifyRecordIntlRequest
     * @return DownloadVerifyRecordIntlResponse
     */
    public DownloadVerifyRecordIntlResponse downloadVerifyRecordIntl(DownloadVerifyRecordIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadVerifyRecordIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to integrate with ID Verification using only the server-side API.</p>
     * 
     * @param request EkycVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EkycVerifyResponse
     */
    public EkycVerifyResponse ekycVerifyWithOptions(EkycVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            query.put("Authorize", request.authorize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            query.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docNo)) {
            query.put("DocNo", request.docNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            query.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            query.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            body.put("FacePictureBase64", request.facePictureBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EkycVerify"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EkycVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to integrate with ID Verification using only the server-side API.</p>
     * 
     * @param request EkycVerifyRequest
     * @return EkycVerifyResponse
     */
    public EkycVerifyResponse ekycVerify(EkycVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ekycVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to integrate FaceCompare using only the server-side API.</p>
     * 
     * @param request FaceCompareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceCompareResponse
     */
    public FaceCompareResponse faceCompareWithOptions(FaceCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureQualityCheck)) {
            query.put("FacePictureQualityCheck", request.facePictureQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePictureUrl)) {
            query.put("SourceFacePictureUrl", request.sourceFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePictureUrl)) {
            query.put("TargetFacePictureUrl", request.targetFacePictureUrl);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePicture)) {
            body.put("SourceFacePicture", request.sourceFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePicture)) {
            body.put("TargetFacePicture", request.targetFacePicture);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceCompare"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceCompareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to integrate FaceCompare using only the server-side API.</p>
     * 
     * @param request FaceCompareRequest
     * @return FaceCompareResponse
     */
    public FaceCompareResponse faceCompare(FaceCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceCompareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Face Cross Comparison</p>
     * 
     * @param request FaceCrossCompareIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceCrossCompareIntlResponse
     */
    public FaceCrossCompareIntlResponse faceCrossCompareIntlWithOptions(FaceCrossCompareIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compareModel)) {
            query.put("CompareModel", request.compareModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceVerifyThreshold)) {
            query.put("FaceVerifyThreshold", request.faceVerifyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceAFacePictureUrl)) {
            query.put("SourceAFacePictureUrl", request.sourceAFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBFacePictureUrl)) {
            query.put("SourceBFacePictureUrl", request.sourceBFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCFacePictureUrl)) {
            query.put("SourceCFacePictureUrl", request.sourceCFacePictureUrl);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceAFacePicture)) {
            body.put("SourceAFacePicture", request.sourceAFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBFacePicture)) {
            body.put("SourceBFacePicture", request.sourceBFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCFacePicture)) {
            body.put("SourceCFacePicture", request.sourceCFacePicture);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceCrossCompareIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceCrossCompareIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Face Cross Comparison</p>
     * 
     * @param request FaceCrossCompareIntlRequest
     * @return FaceCrossCompareIntlResponse
     */
    public FaceCrossCompareIntlResponse faceCrossCompareIntl(FaceCrossCompareIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceCrossCompareIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Face Duplication Detection API</p>
     * 
     * @param request FaceDuplicationCheckIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceDuplicationCheckIntlResponse
     */
    public FaceDuplicationCheckIntlResponse faceDuplicationCheckIntlWithOptions(FaceDuplicationCheckIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRegistration)) {
            body.put("AutoRegistration", request.autoRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGroupCodes)) {
            body.put("FaceGroupCodes", request.faceGroupCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceRegisterGroupCode)) {
            body.put("FaceRegisterGroupCode", request.faceRegisterGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceVerifyThreshold)) {
            body.put("FaceVerifyThreshold", request.faceVerifyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            body.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            body.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            body.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFaces)) {
            body.put("ReturnFaces", request.returnFaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveFacePicture)) {
            body.put("SaveFacePicture", request.saveFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            body.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePicture)) {
            body.put("SourceFacePicture", request.sourceFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePictureUrl)) {
            body.put("SourceFacePictureUrl", request.sourceFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePicture)) {
            body.put("TargetFacePicture", request.targetFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePictureUrl)) {
            body.put("TargetFacePictureUrl", request.targetFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyModel)) {
            body.put("VerifyModel", request.verifyModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceDuplicationCheckIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceDuplicationCheckIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Face Duplication Detection API</p>
     * 
     * @param request FaceDuplicationCheckIntlRequest
     * @return FaceDuplicationCheckIntlResponse
     */
    public FaceDuplicationCheckIntlResponse faceDuplicationCheckIntl(FaceDuplicationCheckIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceDuplicationCheckIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to set up the server for FACE_GUARD.</p>
     * 
     * @param request FaceGuardRiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceGuardRiskResponse
     */
    public FaceGuardRiskResponse faceGuardRiskWithOptions(FaceGuardRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceToken)) {
            query.put("DeviceToken", request.deviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceGuardRisk"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceGuardRiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes how to set up the server for FACE_GUARD.</p>
     * 
     * @param request FaceGuardRiskRequest
     * @return FaceGuardRiskResponse
     */
    public FaceGuardRiskResponse faceGuardRisk(FaceGuardRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceGuardRiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Passive liveness detection (FaceLiveness) is a service that detects whether a pre-captured facial image, submitted to an API operation, is a real face. The algorithm primarily detects presentation attacks, such as screen replays and printed photos. This service is suitable for low-risk business scen</p>
     * 
     * @param request FaceLivenessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceLivenessResponse
     */
    public FaceLivenessResponse faceLivenessWithOptions(FaceLivenessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceQuality)) {
            query.put("FaceQuality", request.faceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occlusion)) {
            query.put("Occlusion", request.occlusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            body.put("FacePictureBase64", request.facePictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceLiveness"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceLivenessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Passive liveness detection (FaceLiveness) is a service that detects whether a pre-captured facial image, submitted to an API operation, is a real face. The algorithm primarily detects presentation attacks, such as screen replays and printed photos. This service is suitable for low-risk business scen</p>
     * 
     * @param request FaceLivenessRequest
     * @return FaceLivenessResponse
     */
    public FaceLivenessResponse faceLiveness(FaceLivenessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceLivenessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Anti-Fraud Callback Interface</p>
     * 
     * @deprecated OpenAPI FraudResultCallBack is deprecated
     * 
     * @param request FraudResultCallBackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FraudResultCallBackResponse
     */
    @Deprecated
    // Deprecated
    public FraudResultCallBackResponse fraudResultCallBackWithOptions(FraudResultCallBackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultCode)) {
            query.put("ResultCode", request.resultCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyDeployEnv)) {
            query.put("VerifyDeployEnv", request.verifyDeployEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FraudResultCallBack"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FraudResultCallBackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Anti-Fraud Callback Interface</p>
     * 
     * @deprecated OpenAPI FraudResultCallBack is deprecated
     * 
     * @param request FraudResultCallBackRequest
     * @return FraudResultCallBackResponse
     */
    @Deprecated
    // Deprecated
    public FraudResultCallBackResponse fraudResultCallBack(FraudResultCallBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fraudResultCallBackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation verifies the authenticity and consistency of a name, ID card number, and the start and end dates of the ID card\&quot;s validity period against an authoritative source.</p>
     * 
     * @param request Id2MetaPeriodVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaPeriodVerifyIntlResponse
     */
    public Id2MetaPeriodVerifyIntlResponse id2MetaPeriodVerifyIntlWithOptions(Id2MetaPeriodVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            body.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docNo)) {
            body.put("DocNo", request.docNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            body.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            body.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            body.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityEndDate)) {
            body.put("ValidityEndDate", request.validityEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityStartDate)) {
            body.put("ValidityStartDate", request.validityStartDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaPeriodVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaPeriodVerifyIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation verifies the authenticity and consistency of a name, ID card number, and the start and end dates of the ID card\&quot;s validity period against an authoritative source.</p>
     * 
     * @param request Id2MetaPeriodVerifyIntlRequest
     * @return Id2MetaPeriodVerifyIntlResponse
     */
    public Id2MetaPeriodVerifyIntlResponse id2MetaPeriodVerifyIntl(Id2MetaPeriodVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaPeriodVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies that a name and an ID card number are consistent.</p>
     * 
     * @param request Id2MetaVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaVerifyIntlResponse
     */
    public Id2MetaVerifyIntlResponse id2MetaVerifyIntlWithOptions(Id2MetaVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaVerifyIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies that a name and an ID card number are consistent.</p>
     * 
     * @param request Id2MetaVerifyIntlRequest
     * @return Id2MetaVerifyIntlResponse
     */
    public Id2MetaVerifyIntlResponse id2MetaVerifyIntl(Id2MetaVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authentication Initialization</p>
     * 
     * @param tmpReq InitializeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeResponse
     */
    public InitializeResponse initializeWithOptions(InitializeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InitializeShrinkRequest request = new InitializeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.docPageConfig)) {
            request.docPageConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.docPageConfig, "DocPageConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appQualityCheck)) {
            query.put("AppQualityCheck", request.appQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            query.put("Authorize", request.authorize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRegistration)) {
            query.put("AutoRegistration", request.autoRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackToken)) {
            query.put("CallbackToken", request.callbackToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chameleonFrameEnable)) {
            query.put("ChameleonFrameEnable", request.chameleonFrameEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateOfBirth)) {
            query.put("DateOfBirth", request.dateOfBirth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateOfExpiry)) {
            query.put("DateOfExpiry", request.dateOfExpiry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            query.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docNo)) {
            query.put("DocNo", request.docNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docPageConfigShrink)) {
            query.put("DocPageConfig", request.docPageConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docScanMode)) {
            query.put("DocScanMode", request.docScanMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docVideo)) {
            query.put("DocVideo", request.docVideo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentNumber)) {
            query.put("DocumentNumber", request.documentNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.editOcrResult)) {
            query.put("EditOcrResult", request.editOcrResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experienceCode)) {
            query.put("ExperienceCode", request.experienceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGroupCodes)) {
            query.put("FaceGroupCodes", request.faceGroupCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceRegisterGroupCode)) {
            query.put("FaceRegisterGroupCode", request.faceRegisterGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceVerifyThreshold)) {
            query.put("FaceVerifyThreshold", request.faceVerifyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idSpoof)) {
            query.put("IdSpoof", request.idSpoof);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            query.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageConfig)) {
            query.put("LanguageConfig", request.languageConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MRTDInput)) {
            query.put("MRTDInput", request.MRTDInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaInfo)) {
            query.put("MetaInfo", request.metaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pages)) {
            query.put("Pages", request.pages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.procedurePriority)) {
            query.put("ProcedurePriority", request.procedurePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productFlow)) {
            query.put("ProductFlow", request.productFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFaces)) {
            query.put("ReturnFaces", request.returnFaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            query.put("ReturnUrl", request.returnUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveFacePicture)) {
            query.put("SaveFacePicture", request.saveFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityLevel)) {
            query.put("SecurityLevel", request.securityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showAlbumIcon)) {
            query.put("ShowAlbumIcon", request.showAlbumIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showGuidePage)) {
            query.put("ShowGuidePage", request.showGuidePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showOcrResult)) {
            query.put("ShowOcrResult", request.showOcrResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.styleConfig)) {
            query.put("StyleConfig", request.styleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePicture)) {
            query.put("TargetFacePicture", request.targetFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePictureUrl)) {
            query.put("TargetFacePictureUrl", request.targetFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useNFC)) {
            query.put("UseNFC", request.useNFC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyModel)) {
            query.put("VerifyModel", request.verifyModel);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            body.put("FacePictureBase64", request.facePictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Initialize"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authentication Initialization</p>
     * 
     * @param request InitializeRequest
     * @return InitializeResponse
     */
    public InitializeResponse initialize(InitializeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>If your server makes infrequent calls to the ID Verification API, you can call the KeepaliveIntl operation to maintain the client connection.</p>
     * 
     * @param request KeepaliveIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KeepaliveIntlResponse
     */
    public KeepaliveIntlResponse keepaliveIntlWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KeepaliveIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KeepaliveIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>If your server makes infrequent calls to the ID Verification API, you can call the KeepaliveIntl operation to maintain the client connection.</p>
     * @return KeepaliveIntlResponse
     */
    public KeepaliveIntlResponse keepaliveIntl() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.keepaliveIntlWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a mobile number and name against an authoritative data source.</p>
     * 
     * @param request Mobile2MetaVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile2MetaVerifyIntlResponse
     */
    public Mobile2MetaVerifyIntlResponse mobile2MetaVerifyIntlWithOptions(Mobile2MetaVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile2MetaVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile2MetaVerifyIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a mobile number and name against an authoritative data source.</p>
     * 
     * @param request Mobile2MetaVerifyIntlRequest
     * @return Mobile2MetaVerifyIntlResponse
     */
    public Mobile2MetaVerifyIntlResponse mobile2MetaVerifyIntl(Mobile2MetaVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile2MetaVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>International Version of Mobile Three Elements API</p>
     * 
     * @param request Mobile3MetaVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaVerifyIntlResponse
     */
    public Mobile3MetaVerifyIntlResponse mobile3MetaVerifyIntlWithOptions(Mobile3MetaVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile3MetaVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile3MetaVerifyIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>International Version of Mobile Three Elements API</p>
     * 
     * @param request Mobile3MetaVerifyIntlRequest
     * @return Mobile3MetaVerifyIntlResponse
     */
    public Mobile3MetaVerifyIntlResponse mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改人脸库</p>
     * 
     * @param request ModifyFaceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFaceGroupResponse
     */
    public ModifyFaceGroupResponse modifyFaceGroupWithOptions(ModifyFaceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFaceGroup"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFaceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改人脸库</p>
     * 
     * @param request ModifyFaceGroupRequest
     * @return ModifyFaceGroupResponse
     */
    public ModifyFaceGroupResponse modifyFaceGroup(ModifyFaceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFaceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增人脸</p>
     * 
     * @param request ModifyFaceRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFaceRecordResponse
     */
    public ModifyFaceRecordResponse modifyFaceRecordWithOptions(ModifyFaceRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceGroupCode)) {
            body.put("FaceGroupCode", request.faceGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imgOssInfos)) {
            body.put("ImgOssInfos", request.imgOssInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFaceRecord"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFaceRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增人脸</p>
     * 
     * @param request ModifyFaceRecordRequest
     * @return ModifyFaceRecordResponse
     */
    public ModifyFaceRecordResponse modifyFaceRecord(ModifyFaceRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFaceRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询人脸库</p>
     * 
     * @param request QueryFaceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceGroupResponse
     */
    public QueryFaceGroupResponse queryFaceGroupWithOptions(QueryFaceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            query.put("GroupCode", request.groupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceGroup"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询人脸库</p>
     * 
     * @param request QueryFaceGroupRequest
     * @return QueryFaceGroupResponse
     */
    public QueryFaceGroupResponse queryFaceGroup(QueryFaceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Face Records</p>
     * 
     * @param request QueryFaceRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceRecordResponse
     */
    public QueryFaceRecordResponse queryFaceRecordWithOptions(QueryFaceRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGroupCode)) {
            query.put("FaceGroupCode", request.faceGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceId)) {
            query.put("FaceId", request.faceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationType)) {
            query.put("RegistrationType", request.registrationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceRecord"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Face Records</p>
     * 
     * @param request QueryFaceRecordRequest
     * @return QueryFaceRecordResponse
     */
    public QueryFaceRecordResponse queryFaceRecord(QueryFaceRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Temporary Token</p>
     * 
     * @param request TempAccessTokenIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TempAccessTokenIntlResponse
     */
    public TempAccessTokenIntlResponse tempAccessTokenIntlWithOptions(TempAccessTokenIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TempAccessTokenIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempAccessTokenIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Temporary Token</p>
     * 
     * @param request TempAccessTokenIntlRequest
     * @return TempAccessTokenIntlResponse
     */
    public TempAccessTokenIntlResponse tempAccessTokenIntl(TempAccessTokenIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempAccessTokenIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Temporary File URL</p>
     * 
     * @param request TempOssUrlIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TempOssUrlIntlResponse
     */
    public TempOssUrlIntlResponse tempOssUrlIntlWithOptions(TempOssUrlIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectName)) {
            body.put("ObjectName", request.objectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TempOssUrlIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempOssUrlIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Temporary File URL</p>
     * 
     * @param request TempOssUrlIntlRequest
     * @return TempOssUrlIntlResponse
     */
    public TempOssUrlIntlResponse tempOssUrlIntl(TempOssUrlIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempOssUrlIntlWithOptions(request, runtime);
    }
}
