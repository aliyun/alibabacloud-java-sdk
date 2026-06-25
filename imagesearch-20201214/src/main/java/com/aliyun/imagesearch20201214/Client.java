// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.imagesearch20201214.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("eu-central-1", "imagesearch.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "imagesearch.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "imagesearch.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "imagesearch.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "imagesearch.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "imagesearch.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "imagesearch.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "imagesearch.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "imagesearch.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "imagesearch.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imagesearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
                String tmp = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                String host = "" + bucketName + "." + tmp + "";
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
     * <h2>Description</h2>
     * <p>This operation adds image information to an Image Search instance.</p>
     * <h2>QPS limit</h2>
     * <p>An instance with a maximum image capacity of 100,000 has a default concurrency of 1, which means that a maximum of 1 image addition request can be processed per second.
     * Instances with other image capacities have a default concurrency of 5, which means that a maximum of 5 image addition requests can be processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Describes the syntax and provides examples of the AddImage operation, which adds image information to an Image Search instance.</p>
     * 
     * @param request AddImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageResponse
     */
    public AddImageResponse addImageWithOptions(AddImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customContent)) {
            body.put("CustomContent", request.customContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr)) {
            body.put("IntAttr", request.intAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr2)) {
            body.put("IntAttr2", request.intAttr2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr3)) {
            body.put("IntAttr3", request.intAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr4)) {
            body.put("IntAttr4", request.intAttr4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            body.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr)) {
            body.put("StrAttr", request.strAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr2)) {
            body.put("StrAttr2", request.strAttr2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr3)) {
            body.put("StrAttr3", request.strAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr4)) {
            body.put("StrAttr4", request.strAttr4);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation adds image information to an Image Search instance.</p>
     * <h2>QPS limit</h2>
     * <p>An instance with a maximum image capacity of 100,000 has a default concurrency of 1, which means that a maximum of 1 image addition request can be processed per second.
     * Instances with other image capacities have a default concurrency of 5, which means that a maximum of 5 image addition requests can be processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Describes the syntax and provides examples of the AddImage operation, which adds image information to an Image Search instance.</p>
     * 
     * @param request AddImageRequest
     * @return AddImageResponse
     */
    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImageWithOptions(request, runtime);
    }

    public AddImageResponse addImageAdvance(AddImageAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "ImageSearch"),
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
        AddImageRequest addImageReq = new AddImageRequest();
        com.aliyun.openapiutil.Client.convert(request, addImageReq);
        if (!com.aliyun.teautil.Common.isUnset(request.picContentObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.picContentObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            addImageReq.picContent = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        AddImageResponse addImageResp = this.addImageWithOptions(addImageReq, runtime);
        return addImageResp;
    }

    /**
     * <b>description</b> :
     * <h2>How-To</h2>
     * <p>This API is used to query image information in an Image Search instance based on an image.</p>
     * <h2>QPS Limit</h2>
     * <p>The default maximum queries per second (QPS) for query operations can be viewed in the console. It corresponds to the Visit Frequency (QPS) you selected when purchasing the instance. Supported QPS values are 1, 5, and 10.</p>
     * <h3>SDK Version Guide</h3>
     * <p>Upgrade the Image SDK to version V3.1.1 to use the &quot;subject identification&quot; and &quot;similarity score&quot; features. For more information, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>CheckImageExists</p>
     * 
     * @param request CheckImageExistsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckImageExistsResponse
     */
    public CheckImageExistsResponse checkImageExistsWithOptions(CheckImageExistsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckImageExists"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckImageExistsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>How-To</h2>
     * <p>This API is used to query image information in an Image Search instance based on an image.</p>
     * <h2>QPS Limit</h2>
     * <p>The default maximum queries per second (QPS) for query operations can be viewed in the console. It corresponds to the Visit Frequency (QPS) you selected when purchasing the instance. Supported QPS values are 1, 5, and 10.</p>
     * <h3>SDK Version Guide</h3>
     * <p>Upgrade the Image SDK to version V3.1.1 to use the &quot;subject identification&quot; and &quot;similarity score&quot; features. For more information, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>CheckImageExists</p>
     * 
     * @param request CheckImageExistsRequest
     * @return CheckImageExistsResponse
     */
    public CheckImageExistsResponse checkImageExists(CheckImageExistsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkImageExistsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Compares two images and returns a similarity score.</p>
     * 
     * @param request CompareSimilarByImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompareSimilarByImageResponse
     */
    public CompareSimilarByImageResponse compareSimilarByImageWithOptions(CompareSimilarByImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryPicContent)) {
            body.put("PrimaryPicContent", request.primaryPicContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryPicContent)) {
            body.put("SecondaryPicContent", request.secondaryPicContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareSimilarByImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompareSimilarByImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Compares two images and returns a similarity score.</p>
     * 
     * @param request CompareSimilarByImageRequest
     * @return CompareSimilarByImageResponse
     */
    public CompareSimilarByImageResponse compareSimilarByImage(CompareSimilarByImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareSimilarByImageWithOptions(request, runtime);
    }

    public CompareSimilarByImageResponse compareSimilarByImageAdvance(CompareSimilarByImageAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "ImageSearch"),
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
        CompareSimilarByImageRequest compareSimilarByImageReq = new CompareSimilarByImageRequest();
        com.aliyun.openapiutil.Client.convert(request, compareSimilarByImageReq);
        if (!com.aliyun.teautil.Common.isUnset(request.primaryPicContentObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.primaryPicContentObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            compareSimilarByImageReq.primaryPicContent = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryPicContentObject)) {
            Object tmpResp1 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp1);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.secondaryPicContentObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            compareSimilarByImageReq.secondaryPicContent = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CompareSimilarByImageResponse compareSimilarByImageResp = this.compareSimilarByImageWithOptions(compareSimilarByImageReq, runtime);
        return compareSimilarByImageResp;
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to delete image information from an Image Search instance.</p>
     * <blockquote>
     * <ul>
     * <li>If the specified image does not exist in the Image Search instance, this operation still returns a success response. Do not use the response to determine whether the image exists.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for delete operations is 20, which means a maximum of 20 delete requests can be processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the DeleteImage operation, which is used to delete image information from an Image Search instance.</p>
     * 
     * @param request DeleteImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeleteByFilter)) {
            body.put("IsDeleteByFilter", request.isDeleteByFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to delete image information from an Image Search instance.</p>
     * <blockquote>
     * <ul>
     * <li>If the specified image does not exist in the Image Search instance, this operation still returns a success response. Do not use the response to determine whether the image exists.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for delete operations is 20, which means a maximum of 20 delete requests can be processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the DeleteImage operation, which is used to delete image information from an Image Search instance.</p>
     * 
     * @param request DeleteImageRequest
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries instance information from an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details or technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for query operations is 1, which means a maximum of 1 request is processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the Detail operation, which queries information about an Image Search instance by name.</p>
     * 
     * @param request DetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailResponse
     */
    public DetailResponse detailWithOptions(DetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Detail"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetailResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries instance information from an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details or technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for query operations is 1, which means a maximum of 1 request is processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the Detail operation, which queries information about an Image Search instance by name.</p>
     * 
     * @param request DetailRequest
     * @return DetailResponse
     */
    public DetailResponse detail(DetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation submits a metadata export task to an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for submit operations is 1, which means a maximum of 1 request is processed per second.</p>
     * <blockquote>
     * <p>You cannot submit a new metadata export task while the previous metadata export task is still in progress.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the DumpMeta operation, which creates a metadata export task for Image Search by name.</p>
     * 
     * @param request DumpMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DumpMetaResponse
     */
    public DumpMetaResponse dumpMetaWithOptions(DumpMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DumpMeta"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DumpMetaResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation submits a metadata export task to an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for submit operations is 1, which means a maximum of 1 request is processed per second.</p>
     * <blockquote>
     * <p>You cannot submit a new metadata export task while the previous metadata export task is still in progress.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the DumpMeta operation, which creates a metadata export task for Image Search by name.</p>
     * 
     * @param request DumpMetaRequest
     * @return DumpMetaResponse
     */
    public DumpMetaResponse dumpMeta(DumpMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dumpMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries metadata export tasks in an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for query operations is 1, which means a maximum of 1 request is processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Describes the syntax and provides examples of the DumpMetaList operation, which queries the list of metadata export tasks in an Image Search instance.</p>
     * 
     * @param request DumpMetaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DumpMetaListResponse
     */
    public DumpMetaListResponse dumpMetaListWithOptions(DumpMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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
            new TeaPair("action", "DumpMetaList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DumpMetaListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries metadata export tasks in an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for query operations is 1, which means a maximum of 1 request is processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Describes the syntax and provides examples of the DumpMetaList operation, which queries the list of metadata export tasks in an Image Search instance.</p>
     * 
     * @param request DumpMetaListRequest
     * @return DumpMetaListResponse
     */
    public DumpMetaListResponse dumpMetaList(DumpMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dumpMetaListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to submit a batch task to an Image Search instance.</p>
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;For more information about the product or technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us by using DingTalk group 35035130.</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>Only one batch task can run at a time.</p>
     * <blockquote>
     * <p>You cannot submit a new batch task until the previous batch task is complete.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Describes the syntax and provides examples of the IncreaseInstance operation, which is used to create a batch task for an Image Search instance by name.</p>
     * 
     * @param request IncreaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IncreaseInstanceResponse
     */
    public IncreaseInstanceResponse increaseInstanceWithOptions(IncreaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackAddress)) {
            query.put("CallbackAddress", request.callbackAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseInstance"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to submit a batch task to an Image Search instance.</p>
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;For more information about the product or technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us by using DingTalk group 35035130.</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>Only one batch task can run at a time.</p>
     * <blockquote>
     * <p>You cannot submit a new batch task until the previous batch task is complete.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Describes the syntax and provides examples of the IncreaseInstance operation, which is used to create a batch task for an Image Search instance by name.</p>
     * 
     * @param request IncreaseInstanceRequest
     * @return IncreaseInstanceResponse
     */
    public IncreaseInstanceResponse increaseInstance(IncreaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.increaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to query batch tasks in an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details or technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for query operations is 1, which means a maximum of 1 request is processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of batch tasks in an Image Search instance by calling the IncreaseList operation. This topic describes the syntax and provides examples.</p>
     * 
     * @param request IncreaseListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IncreaseListResponse
     */
    public IncreaseListResponse increaseListWithOptions(IncreaseListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to query batch tasks in an Image Search instance.</p>
     * <blockquote>
     * <p>For more product details or technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for query operations is 1, which means a maximum of 1 request is processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of batch tasks in an Image Search instance by calling the IncreaseList operation. This topic describes the syntax and provides examples.</p>
     * 
     * @param request IncreaseListRequest
     * @return IncreaseListResponse
     */
    public IncreaseListResponse increaseList(IncreaseListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.increaseListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of SearchImageByFilter, which is used to query image information in an Image Search instance based on filter conditions.</p>
     * 
     * @param request SearchImageByFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageByFilterResponse
     */
    public SearchImageByFilterResponse searchImageByFilterWithOptions(SearchImageByFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            body.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByFilter"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of SearchImageByFilter, which is used to query image information in an Image Search instance based on filter conditions.</p>
     * 
     * @param request SearchImageByFilterRequest
     * @return SearchImageByFilterResponse
     */
    public SearchImageByFilterResponse searchImageByFilter(SearchImageByFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageByFilterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <p>This operation queries image information in an Image Search instance by name (ProductId and PicName).</p>
     * <blockquote>
     * <p>For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The default maximum query rate can be viewed in the console. It is the QPS value you selected at the time of purchase. Currently supported values are 1 QPS, 5 QPS, and 10 QPS.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the SearchByName operation, which is used to query image information in an Image Search instance by name.</p>
     * 
     * @param request SearchImageByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageByNameResponse
     */
    public SearchImageByNameResponse searchImageByNameWithOptions(SearchImageByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scoreThreshold)) {
            query.put("ScoreThreshold", request.scoreThreshold);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinctProductId)) {
            body.put("DistinctProductId", request.distinctProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            body.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByName"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByNameResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <p>This operation queries image information in an Image Search instance by name (ProductId and PicName).</p>
     * <blockquote>
     * <p>For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The default maximum query rate can be viewed in the console. It is the QPS value you selected at the time of purchase. Currently supported values are 1 QPS, 5 QPS, and 10 QPS.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of the SearchByName operation, which is used to query image information in an Image Search instance by name.</p>
     * 
     * @param request SearchImageByNameRequest
     * @return SearchImageByNameResponse
     */
    public SearchImageByNameResponse searchImageByName(SearchImageByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageByNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to search for image information in an Image Search instance by image.</p>
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can view the default maximum access frequency for query operations in the console. The frequency is the QPS value that you selected when you made the purchase. The supported values are 1 QPS, 5 QPS, and 10 QPS.</p>
     * <h3>SDK version description</h3>
     * <p>Upgrade the Image Search SDK to V3.1.1 to use the multi-subject identification and similarity score features. For more information, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of SearchByPic, which is used to search for image information in an Image Search instance by image.</p>
     * 
     * @param request SearchImageByPicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageByPicResponse
     */
    public SearchImageByPicResponse searchImageByPicWithOptions(SearchImageByPicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scoreThreshold)) {
            query.put("ScoreThreshold", request.scoreThreshold);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinctProductId)) {
            body.put("DistinctProductId", request.distinctProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            body.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            body.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByPic"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByPicResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to search for image information in an Image Search instance by image.</p>
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can view the default maximum access frequency for query operations in the console. The frequency is the QPS value that you selected when you made the purchase. The supported values are 1 QPS, 5 QPS, and 10 QPS.</p>
     * <h3>SDK version description</h3>
     * <p>Upgrade the Image Search SDK to V3.1.1 to use the multi-subject identification and similarity score features. For more information, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of SearchByPic, which is used to search for image information in an Image Search instance by image.</p>
     * 
     * @param request SearchImageByPicRequest
     * @return SearchImageByPicResponse
     */
    public SearchImageByPicResponse searchImageByPic(SearchImageByPicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageByPicWithOptions(request, runtime);
    }

    public SearchImageByPicResponse searchImageByPicAdvance(SearchImageByPicAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "ImageSearch"),
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
        SearchImageByPicRequest searchImageByPicReq = new SearchImageByPicRequest();
        com.aliyun.openapiutil.Client.convert(request, searchImageByPicReq);
        if (!com.aliyun.teautil.Common.isUnset(request.picContentObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.picContentObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            searchImageByPicReq.picContent = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        SearchImageByPicResponse searchImageByPicResp = this.searchImageByPicWithOptions(searchImageByPicReq, runtime);
        return searchImageByPicResp;
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to search for image information in an Image Search instance based on text. This operation is available only for instances whose service type is product multimodal search.</p>
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through the DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can view the default maximum access frequency for query operations in the console. The frequency is the QPS value you selected at the time of purchase. Currently supported values are 1 QPS, 5 QPS, and 10 QPS.</p>
     * <h3>SDK version description</h3>
     * <p>Upgrade the Image Search SDK to V3.1.1 to use the multi-subject identification and similarity score features. For more information, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of SearchImageByText, which is used to search for image information in an Image Search instance based on text.</p>
     * 
     * @param request SearchImageByTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageByTextResponse
     */
    public SearchImageByTextResponse searchImageByTextWithOptions(SearchImageByTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scoreThreshold)) {
            query.put("ScoreThreshold", request.scoreThreshold);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distinctProductId)) {
            body.put("DistinctProductId", request.distinctProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            body.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByText"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByTextResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to search for image information in an Image Search instance based on text. This operation is available only for instances whose service type is product multimodal search.</p>
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;For more product details and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through the DingTalk group (35035130).</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can view the default maximum access frequency for query operations in the console. The frequency is the QPS value you selected at the time of purchase. Currently supported values are 1 QPS, 5 QPS, and 10 QPS.</p>
     * <h3>SDK version description</h3>
     * <p>Upgrade the Image Search SDK to V3.1.1 to use the multi-subject identification and similarity score features. For more information, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax and examples of SearchImageByText, which is used to search for image information in an Image Search instance based on text.</p>
     * 
     * @param request SearchImageByTextRequest
     * @return SearchImageByTextResponse
     */
    public SearchImageByTextResponse searchImageByText(SearchImageByTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageByTextWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation updates the image information in an Image Search instance based on the product ID and image name.</p>
     * <blockquote>
     * <ul>
     * <li>The instance must meet the creation date requirements.
     * &lt;props=&quot;china&quot;&gt;</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Instances created after June 2021 in the Shanghai and Hangzhou regions are supported. Instances in other regions can be used normally.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Instances created after December 2021 in the Singapore region are supported. Instances in other regions are currently unavailable.</li>
     * <li>For more information about the product and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through the DingTalk group (35035130).</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for update operations is 20, which means that a maximum of 20 requests can be processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the image information in an Image Search instance.</p>
     * 
     * @param request UpdateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intAttr3)) {
            query.put("IntAttr3", request.intAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr4)) {
            query.put("IntAttr4", request.intAttr4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr3)) {
            query.put("StrAttr3", request.strAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr4)) {
            query.put("StrAttr4", request.strAttr4);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customContent)) {
            body.put("CustomContent", request.customContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr)) {
            body.put("IntAttr", request.intAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr2)) {
            body.put("IntAttr2", request.intAttr2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr)) {
            body.put("StrAttr", request.strAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr2)) {
            body.put("StrAttr2", request.strAttr2);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation updates the image information in an Image Search instance based on the product ID and image name.</p>
     * <blockquote>
     * <ul>
     * <li>The instance must meet the creation date requirements.
     * &lt;props=&quot;china&quot;&gt;</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Instances created after June 2021 in the Shanghai and Hangzhou regions are supported. Instances in other regions can be used normally.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Instances created after December 2021 in the Singapore region are supported. Instances in other regions are currently unavailable.</li>
     * <li>For more information about the product and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consultation</a> or contact us through the DingTalk group (35035130).</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>The default concurrency for update operations is 20, which means that a maximum of 20 requests can be processed per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the image information in an Image Search instance.</p>
     * 
     * @param request UpdateImageRequest
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }
}
