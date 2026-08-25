// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.iacservice20210806.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-zhangjiakou", "iac.cn-zhangjiakou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iacservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds shared accounts.</p>
     * 
     * @param request AddSharedAccountsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSharedAccountsResponse
     */
    public AddSharedAccountsResponse addSharedAccountsWithOptions(AddSharedAccountsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            body.put("accountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSharedAccounts"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sharedAccounts"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSharedAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds shared accounts.</p>
     * 
     * @param request AddSharedAccountsRequest
     * @return AddSharedAccountsResponse
     */
    public AddSharedAccountsResponse addSharedAccounts(AddSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSharedAccountsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a drift detection configuration.</p>
     * 
     * @param request AssociateDetectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateDetectConfigResponse
     */
    public AssociateDetectConfigResponse associateDetectConfigWithOptions(AssociateDetectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectConfigId)) {
            body.put("detectConfigId", request.detectConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            body.put("targetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("targetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateDetectConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig/operations/associate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateDetectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a drift detection configuration.</p>
     * 
     * @param request AssociateDetectConfigRequest
     * @return AssociateDetectConfigResponse
     */
    public AssociateDetectConfigResponse associateDetectConfig(AssociateDetectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.associateDetectConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates resources with a group.</p>
     * 
     * @param request AssociateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateGroupResponse
     */
    public AssociateGroupResponse associateGroupWithOptions(String groupId, AssociateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/associate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates resources with a group.</p>
     * 
     * @param request AssociateGroupRequest
     * @return AssociateGroupResponse
     */
    public AssociateGroupResponse associateGroup(String groupId, AssociateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.associateGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After creating a parameter set, you need to associate it with a resource. Valid values for the resource type:</p>
     * <ul>
     * <li>Module: template</li>
     * <li>ModuleVersion: template version</li>
     * <li>Task: node.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates parameter sets.</p>
     * 
     * @param request AssociateParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateParameterSetResponse
     */
    public AssociateParameterSetResponse associateParameterSetWithOptions(AssociateParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameterSetIds)) {
            body.put("parameterSetIds", request.parameterSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/operations/associate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateParameterSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>After creating a parameter set, you need to associate it with a resource. Valid values for the resource type:</p>
     * <ul>
     * <li>Module: template</li>
     * <li>ModuleVersion: template version</li>
     * <li>Task: node.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates parameter sets.</p>
     * 
     * @param request AssociateParameterSetRequest
     * @return AssociateParameterSetResponse
     */
    public AssociateParameterSetResponse associateParameterSet(AssociateParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.associateParameterSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a resource export task.</p>
     * 
     * @param request CancelResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelResourceExportTaskResponse
     */
    public CancelResourceExportTaskResponse cancelResourceExportTaskWithOptions(String exportTaskId, CancelResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/cancel/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelResourceExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a resource export task.</p>
     * 
     * @param request CancelResourceExportTaskRequest
     * @return CancelResourceExportTaskResponse
     */
    public CancelResourceExportTaskResponse cancelResourceExportTask(String exportTaskId, CancelResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must specify the alerting method <code>type</code> and the corresponding alerting address <code>address</code>.  </li>
     * <li>If the <code>enabled</code> parameter is not explicitly set, its default value is <code>true</code>, meaning newly created detection configurations are enabled by default.  </li>
     * <li>It is recommended to use a UUID as the value of <code>clientToken</code> to ensure request idempotence.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a drift detection configuration that supports manual or scheduled triggering.</p>
     * 
     * @param request CreateDetectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDetectConfigResponse
     */
    public CreateDetectConfigResponse createDetectConfigWithOptions(CreateDetectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmConfigs)) {
            body.put("alarmConfigs", request.alarmConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            body.put("cronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectConfigName)) {
            body.put("detectConfigName", request.detectConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("triggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDetectConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDetectConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must specify the alerting method <code>type</code> and the corresponding alerting address <code>address</code>.  </li>
     * <li>If the <code>enabled</code> parameter is not explicitly set, its default value is <code>true</code>, meaning newly created detection configurations are enabled by default.  </li>
     * <li>It is recommended to use a UUID as the value of <code>clientToken</code> to ensure request idempotence.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a drift detection configuration that supports manual or scheduled triggering.</p>
     * 
     * @param request CreateDetectConfigRequest
     * @return CreateDetectConfigResponse
     */
    public CreateDetectConfigResponse createDetectConfig(CreateDetectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDetectConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTrigger)) {
            body.put("autoTrigger", request.autoTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forcedSetting)) {
            body.put("forcedSetting", request.forcedSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            body.put("notifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyOperationTypes)) {
            body.put("notifyOperationTypes", request.notifyOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportField)) {
            body.put("reportExportField", request.reportExportField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportPath)) {
            body.put("reportExportPath", request.reportExportPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            body.put("triggerConfig", request.triggerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerResourceType)) {
            body.put("triggerResourceType", request.triggerResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a job and runs a task.</p>
     * 
     * @param request CreateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(String taskId, CreateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCommand)) {
            body.put("subCommand", request.subCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a job and runs a task.</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(String taskId, CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Terraform template. Multiple source methods are supported, such as OSS import, Registry import, file upload, and online editing.</p>
     * 
     * @param request CreateModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModuleResponse
     */
    public CreateModuleResponse createModuleWithOptions(CreateModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statePath)) {
            body.put("statePath", request.statePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStrategy)) {
            body.put("versionStrategy", request.versionStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Terraform template. Multiple source methods are supported, such as OSS import, Registry import, file upload, and online editing.</p>
     * 
     * @param request CreateModuleRequest
     * @return CreateModuleResponse
     */
    public CreateModuleResponse createModule(CreateModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Use the <code>clientToken</code> parameter to ensure idempotence of the request and prevent duplicate submissions caused by network retries.</li>
     * <li>Use semantic versioning (such as <code>v1.0.0</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Publishes a new version for a specified template.</p>
     * 
     * @param request CreateModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModuleVersionResponse
     */
    public CreateModuleVersionResponse createModuleVersionWithOptions(String moduleId, CreateModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Use the <code>clientToken</code> parameter to ensure idempotence of the request and prevent duplicate submissions caused by network retries.</li>
     * <li>Use semantic versioning (such as <code>v1.0.0</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Publishes a new version for a specified template.</p>
     * 
     * @param request CreateModuleVersionRequest
     * @return CreateModuleVersionResponse
     */
    public CreateModuleVersionResponse createModuleVersion(String moduleId, CreateModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModuleVersionWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a new parameter set.</li>
     * <li>The <code>name</code> field is required and can be up to 128 characters in length.</li>
     * <li>Each element in the <code>parameters</code> array must contain the <code>name</code> field. Other fields are optional.</li>
     * <li>Use the <code>clientToken</code> field to ensure idempotence of the request.</li>
     * <li>The request header must contain authentication information to ensure secure access.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a new parameter set. You can set the name, description, and parameter list.</p>
     * 
     * @param request CreateParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateParameterSetResponse
     */
    public CreateParameterSetResponse createParameterSetWithOptions(CreateParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateParameterSetResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a new parameter set.</li>
     * <li>The <code>name</code> field is required and can be up to 128 characters in length.</li>
     * <li>Each element in the <code>parameters</code> array must contain the <code>name</code> field. Other fields are optional.</li>
     * <li>Use the <code>clientToken</code> field to ensure idempotence of the request.</li>
     * <li>The request header must contain authentication information to ensure secure access.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a new parameter set. You can set the name, description, and parameter list.</p>
     * 
     * @param request CreateParameterSetRequest
     * @return CreateParameterSetResponse
     */
    public CreateParameterSetResponse createParameterSet(CreateParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createParameterSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Registry template.</p>
     * 
     * @param request CreateRegistryModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRegistryModuleResponse
     */
    public CreateRegistryModuleResponse createRegistryModuleWithOptions(CreateRegistryModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            body.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRegistryModuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Registry template.</p>
     * 
     * @param request CreateRegistryModuleRequest
     * @return CreateRegistryModuleResponse
     */
    public CreateRegistryModuleResponse createRegistryModule(CreateRegistryModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRegistryModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateRegistryNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRegistryNamespaceResponse
     */
    public CreateRegistryNamespaceResponse createRegistryNamespaceWithOptions(CreateRegistryNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainer)) {
            body.put("maintainer", request.maintainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("namespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRegistryNamespace"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRegistryNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateRegistryNamespaceRequest
     * @return CreateRegistryNamespaceResponse
     */
    public CreateRegistryNamespaceResponse createRegistryNamespace(CreateRegistryNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRegistryNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource export task.</p>
     * 
     * @param request CreateResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceExportTaskResponse
     */
    public CreateResourceExportTaskResponse createResourceExportTaskWithOptions(CreateResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportToModule)) {
            body.put("exportToModule", request.exportToModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRules)) {
            body.put("includeRules", request.includeRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource export task.</p>
     * 
     * @param request CreateResourceExportTaskRequest
     * @return CreateResourceExportTaskResponse
     */
    public CreateResourceExportTaskResponse createResourceExportTask(CreateResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceExportTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource stack and triggers deployment.</p>
     * 
     * @param request CreateStackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStackResponse
     */
    public CreateStackResponse createStackWithOptions(CreateStackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterSetIds)) {
            body.put("parameterSetIds", request.parameterSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingDirectory)) {
            body.put("workingDirectory", request.workingDirectory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStack"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource stack and triggers deployment.</p>
     * 
     * @param request CreateStackRequest
     * @return CreateStackResponse
     */
    public CreateStackResponse createStack(CreateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStackWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a task.</p>
     * 
     * @param request CreateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoApply)) {
            body.put("autoApply", request.autoApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initModuleState)) {
            body.put("initModuleState", request.initModuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            body.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            body.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterSetIds)) {
            body.put("parameterSetIds", request.parameterSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionStrategy)) {
            body.put("protectionStrategy", request.protectionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPropertyValidation)) {
            body.put("skipPropertyValidation", request.skipPropertyValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipRegionValidation)) {
            body.put("skipRegionValidation", request.skipRegionValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskBackend)) {
            body.put("taskBackend", request.taskBackend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a task.</p>
     * 
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node from a resource import result.</p>
     * 
     * @param request CreateTaskFromResourceImportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskFromResourceImportResponse
     */
    public CreateTaskFromResourceImportResponse createTaskFromResourceImportWithOptions(CreateTaskFromResourceImportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskId)) {
            body.put("exportTaskId", request.exportTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportVersion)) {
            body.put("exportVersion", request.exportVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskFromResourceImport"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/operations/createTaskFromResourceImport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskFromResourceImportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node from a resource import result.</p>
     * 
     * @param request CreateTaskFromResourceImportRequest
     * @return CreateTaskFromResourceImportResponse
     */
    public CreateTaskFromResourceImportResponse createTaskFromResourceImport(CreateTaskFromResourceImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskFromResourceImportWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bias detection configuration.</p>
     * 
     * @param request DeleteDetectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDetectConfigResponse
     */
    public DeleteDetectConfigResponse deleteDetectConfigWithOptions(String detectConfigId, DeleteDetectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDetectConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig/" + com.aliyun.openapiutil.Client.getEncodeParam(detectConfigId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDetectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bias detection configuration.</p>
     * 
     * @param request DeleteDetectConfigRequest
     * @return DeleteDetectConfigResponse
     */
    public DeleteDetectConfigResponse deleteDetectConfig(String detectConfigId, DeleteDetectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDetectConfigWithOptions(detectConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a group.</p>
     * 
     * @param request DeleteGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(String groupId, DeleteGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a group.</p>
     * 
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(String groupId, DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation deletes a specified template.</li>
     * <li>Deletion is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified template and all its versions.</p>
     * 
     * @param request DeleteModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModuleWithOptions(String moduleId, DeleteModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModuleResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation deletes a specified template.</li>
     * <li>Deletion is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified template and all its versions.</p>
     * 
     * @param request DeleteModuleRequest
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModule(String moduleId, DeleteModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModuleWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified parameter set.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified parameter set by parameter set ID.</p>
     * 
     * @param request DeleteParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteParameterSetResponse
     */
    public DeleteParameterSetResponse deleteParameterSetWithOptions(String parameterSetId, DeleteParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/" + com.aliyun.openapiutil.Client.getEncodeParam(parameterSetId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteParameterSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified parameter set.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified parameter set by parameter set ID.</p>
     * 
     * @param request DeleteParameterSetRequest
     * @return DeleteParameterSetResponse
     */
    public DeleteParameterSetResponse deleteParameterSet(String parameterSetId, DeleteParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteParameterSetWithOptions(parameterSetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String projectId, DeleteProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String projectId, DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Registry template.</p>
     * 
     * @param request DeleteRegistryModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistryModuleResponse
     */
    public DeleteRegistryModuleResponse deleteRegistryModuleWithOptions(String namespaceName, String moduleName, DeleteRegistryModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistryModuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Registry template.</p>
     * 
     * @param request DeleteRegistryModuleRequest
     * @return DeleteRegistryModuleResponse
     */
    public DeleteRegistryModuleResponse deleteRegistryModule(String namespaceName, String moduleName, DeleteRegistryModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryModuleWithOptions(namespaceName, moduleName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Registry template version.</p>
     * 
     * @param request DeleteRegistryModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistryModuleVersionResponse
     */
    public DeleteRegistryModuleVersionResponse deleteRegistryModuleVersionWithOptions(String namespaceName, String moduleName, String version, DeleteRegistryModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistryModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistryModuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Registry template version.</p>
     * 
     * @param request DeleteRegistryModuleVersionRequest
     * @return DeleteRegistryModuleVersionResponse
     */
    public DeleteRegistryModuleVersionResponse deleteRegistryModuleVersion(String namespaceName, String moduleName, String version, DeleteRegistryModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryModuleVersionWithOptions(namespaceName, moduleName, version, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param request DeleteRegistryNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistryNamespaceResponse
     */
    public DeleteRegistryNamespaceResponse deleteRegistryNamespaceWithOptions(String namespaceName, DeleteRegistryNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistryNamespace"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistryNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param request DeleteRegistryNamespaceRequest
     * @return DeleteRegistryNamespaceResponse
     */
    public DeleteRegistryNamespaceResponse deleteRegistryNamespace(String namespaceName, DeleteRegistryNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryNamespaceWithOptions(namespaceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource export task.</p>
     * 
     * @param request DeleteResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceExportTaskResponse
     */
    public DeleteResourceExportTaskResponse deleteResourceExportTaskWithOptions(String exportTaskId, DeleteResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource export task.</p>
     * 
     * @param request DeleteResourceExportTaskRequest
     * @return DeleteResourceExportTaskResponse
     */
    public DeleteResourceExportTaskResponse deleteResourceExportTask(String exportTaskId, DeleteResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a stack.</p>
     * 
     * @param request DeleteStackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStackResponse
     */
    public DeleteStackResponse deleteStackWithOptions(String stackId, DeleteStackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cleanResources)) {
            query.put("cleanResources", request.cleanResources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStack"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/" + com.aliyun.openapiutil.Client.getEncodeParam(stackId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a stack.</p>
     * 
     * @param request DeleteStackRequest
     * @return DeleteStackResponse
     */
    public DeleteStackResponse deleteStack(String stackId, DeleteStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStackWithOptions(stackId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.
     * Deletes a node. If the node has resources that have not been destroyed, the deletion is not allowed.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a node.</p>
     * 
     * @param request DeleteTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(String taskId, DeleteTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceRetentionPolicy)) {
            query.put("resourceRetentionPolicy", request.resourceRetentionPolicy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.
     * Deletes a node. If the node has resources that have not been destroyed, the deletion is not allowed.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a node.</p>
     * 
     * @param request DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(String taskId, DeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTaskWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to perform drift detection on the state files of resource orchestration tasks and stack tasks in the automated service desk.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a state file consistency check.</p>
     * 
     * @param request DetectTerraformStateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectTerraformStateResponse
     */
    public DetectTerraformStateResponse detectTerraformStateWithOptions(DetectTerraformStateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectTerraformState"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detect"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectTerraformStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to perform drift detection on the state files of resource orchestration tasks and stack tasks in the automated service desk.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a state file consistency check.</p>
     * 
     * @param request DetectTerraformStateRequest
     * @return DetectTerraformStateResponse
     */
    public DetectTerraformStateResponse detectTerraformState(DetectTerraformStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detectTerraformStateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a drift detection configuration.</p>
     * 
     * @param request DissociateDetectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateDetectConfigResponse
     */
    public DissociateDetectConfigResponse dissociateDetectConfigWithOptions(DissociateDetectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectConfigId)) {
            body.put("detectConfigId", request.detectConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            body.put("targetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("targetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateDetectConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig/operations/dissociate"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateDetectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a drift detection configuration.</p>
     * 
     * @param request DissociateDetectConfigRequest
     * @return DissociateDetectConfigResponse
     */
    public DissociateDetectConfigResponse dissociateDetectConfig(DissociateDetectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dissociateDetectConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a resource group.</p>
     * 
     * @param request DissociateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateGroupResponse
     */
    public DissociateGroupResponse dissociateGroupWithOptions(String projectId, String groupId, DissociateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/dissociate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a resource group.</p>
     * 
     * @param request DissociateGroupRequest
     * @return DissociateGroupResponse
     */
    public DissociateGroupResponse dissociateGroup(String projectId, String groupId, DissociateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dissociateGroupWithOptions(projectId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a parameter set from other resources.</p>
     * 
     * @param request DissociateParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateParameterSetResponse
     */
    public DissociateParameterSetResponse dissociateParameterSetWithOptions(DissociateParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameterSetIds)) {
            body.put("parameterSetIds", request.parameterSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/operations/dissociate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateParameterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a parameter set from other resources.</p>
     * 
     * @param request DissociateParameterSetRequest
     * @return DissociateParameterSetResponse
     */
    public DissociateParameterSetResponse dissociateParameterSet(DissociateParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dissociateParameterSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is used to execute Terraform Module code to create or update cloud resources. Before using this API operation, make sure that all required authentication information is correctly configured and that the Terraform code corresponding to the Module meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a Module officially provided by Alibaba Cloud Terraform.</p>
     * 
     * @param request ExecuteRegistryModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteRegistryModuleResponse
     */
    public ExecuteRegistryModuleResponse executeRegistryModuleWithOptions(String namespaceName, String moduleName, ExecuteRegistryModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + "/execution"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteRegistryModuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is used to execute Terraform Module code to create or update cloud resources. Before using this API operation, make sure that all required authentication information is correctly configured and that the Terraform code corresponding to the Module meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a Module officially provided by Alibaba Cloud Terraform.</p>
     * 
     * @param request ExecuteRegistryModuleRequest
     * @return ExecuteRegistryModuleResponse
     */
    public ExecuteRegistryModuleResponse executeRegistryModule(String namespaceName, String moduleName, ExecuteRegistryModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeRegistryModuleWithOptions(namespaceName, moduleName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs a resource export task.</p>
     * 
     * @param request ExecuteResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteResourceExportTaskResponse
     */
    public ExecuteResourceExportTaskResponse executeResourceExportTaskWithOptions(String exportTaskId, ExecuteResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/execute/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteResourceExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs a resource export task.</p>
     * 
     * @param request ExecuteResourceExportTaskRequest
     * @return ExecuteResourceExportTaskResponse
     */
    public ExecuteResourceExportTaskResponse executeResourceExportTask(String exportTaskId, ExecuteResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Executes the Terraform Apply command to create or update cloud resources based on the provided Terraform code. This API can handle complex scenarios such as operations that depend on a previous state.
     * Before calling this API, ensure that all required authentication information is properly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes TerraformApply.</p>
     * 
     * @param request ExecuteTerraformApplyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTerraformApplyResponse
     */
    public ExecuteTerraformApplyResponse executeTerraformApplyWithOptions(ExecuteTerraformApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateId)) {
            body.put("stateId", request.stateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTerraformApply"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTerraformApplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Executes the Terraform Apply command to create or update cloud resources based on the provided Terraform code. This API can handle complex scenarios such as operations that depend on a previous state.
     * Before calling this API, ensure that all required authentication information is properly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes TerraformApply.</p>
     * 
     * @param request ExecuteTerraformApplyRequest
     * @return ExecuteTerraformApplyResponse
     */
    public ExecuteTerraformApplyResponse executeTerraformApply(ExecuteTerraformApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTerraformApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Executes the Terraform Destroy command to destroy resources created by Terraform.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes Terraform Destroy.</p>
     * 
     * @param request ExecuteTerraformDestroyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTerraformDestroyResponse
     */
    public ExecuteTerraformDestroyResponse executeTerraformDestroyWithOptions(ExecuteTerraformDestroyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateId)) {
            body.put("stateId", request.stateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTerraformDestroy"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/destroy"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTerraformDestroyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Executes the Terraform Destroy command to destroy resources created by Terraform.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes Terraform Destroy.</p>
     * 
     * @param request ExecuteTerraformDestroyRequest
     * @return ExecuteTerraformDestroyResponse
     */
    public ExecuteTerraformDestroyResponse executeTerraformDestroy(ExecuteTerraformDestroyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTerraformDestroyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Executes a Terraform Plan command by using the provided Terraform code to create or update cloud resources. This API operation can handle complex scenarios such as operations that depend on a previous state.
     * Before calling this API operation, ensure that all required authentication information is properly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a Terraform plan.</p>
     * 
     * @param request ExecuteTerraformPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTerraformPlanResponse
     */
    public ExecuteTerraformPlanResponse executeTerraformPlanWithOptions(ExecuteTerraformPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateId)) {
            body.put("stateId", request.stateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTerraformPlan"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/plan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTerraformPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Executes a Terraform Plan command by using the provided Terraform code to create or update cloud resources. This API operation can handle complex scenarios such as operations that depend on a previous state.
     * Before calling this API operation, ensure that all required authentication information is properly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a Terraform plan.</p>
     * 
     * @param request ExecuteTerraformPlanRequest
     * @return ExecuteTerraformPlanResponse
     */
    public ExecuteTerraformPlanResponse executeTerraformPlan(ExecuteTerraformPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTerraformPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates Terraform HCL template code.</p>
     * 
     * @param request GenerateModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateModuleResponse
     */
    public GenerateModuleResponse generateModuleWithOptions(GenerateModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generateSource)) {
            body.put("generateSource", request.generateSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syntax)) {
            body.put("syntax", request.syntax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformResourceType)) {
            body.put("terraformResourceType", request.terraformResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorer/generate/module"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GenerateModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates Terraform HCL template code.</p>
     * 
     * @param request GenerateModuleRequest
     * @return GenerateModuleResponse
     */
    public GenerateModuleResponse generateModule(GenerateModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve drift detection configuration</p>
     * 
     * @param request GetDetectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDetectConfigResponse
     */
    public GetDetectConfigResponse getDetectConfigWithOptions(String detectConfigId, GetDetectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig/" + com.aliyun.openapiutil.Client.getEncodeParam(detectConfigId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve drift detection configuration</p>
     * 
     * @param request GetDetectConfigRequest
     * @return GetDetectConfigResponse
     */
    public GetDetectConfigResponse getDetectConfig(String detectConfigId, GetDetectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDetectConfigWithOptions(detectConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the encryption configuration.</p>
     * 
     * @param request GetEncryptionConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEncryptionConfigResponse
     */
    public GetEncryptionConfigResponse getEncryptionConfigWithOptions(GetEncryptionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEncryptionConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/encryption/config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEncryptionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the encryption configuration.</p>
     * 
     * @param request GetEncryptionConfigRequest
     * @return GetEncryptionConfigResponse
     */
    public GetEncryptionConfigResponse getEncryptionConfig(GetEncryptionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEncryptionConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the result of a Terraform run.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the result of a Terraform run.</p>
     * 
     * @param request GetExecuteStateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecuteStateResponse
     */
    public GetExecuteStateResponse getExecuteStateWithOptions(String stateId, GetExecuteStateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecuteState"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/" + com.aliyun.openapiutil.Client.getEncodeParam(stateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecuteStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the result of a Terraform run.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the result of a Terraform run.</p>
     * 
     * @param request GetExecuteStateRequest
     * @return GetExecuteStateResponse
     */
    public GetExecuteStateResponse getExecuteState(String stateId, GetExecuteStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExecuteStateWithOptions(stateId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a group.</p>
     * 
     * @param request GetGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(String groupId, GetGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a group.</p>
     * 
     * @param request GetGroupRequest
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(String groupId, GetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves job information.</p>
     * 
     * @param request GetJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String taskId, String jobId, GetJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves job information.</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String taskId, String jobId, GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(taskId, jobId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a specified template, including but not limited to the template name, description, source, status, and latest version. You must specify the template ID and include authentication information in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified template.</p>
     * 
     * @param request GetModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModuleResponse
     */
    public GetModuleResponse getModuleWithOptions(String moduleId, GetModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModuleResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a specified template, including but not limited to the template name, description, source, status, and latest version. You must specify the template ID and include authentication information in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified template.</p>
     * 
     * @param request GetModuleRequest
     * @return GetModuleResponse
     */
    public GetModuleResponse getModule(String moduleId, GetModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModuleWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a specific version of a specified template, including the version number, description, and release time. Make sure that the template ID and version number are correct.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific version of a specified template.</p>
     * 
     * @param request GetModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModuleVersionResponse
     */
    public GetModuleVersionResponse getModuleVersionWithOptions(String moduleId, String moduleVersion, GetModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a specific version of a specified template, including the version number, description, and release time. Make sure that the template ID and version number are correct.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific version of a specified template.</p>
     * 
     * @param request GetModuleVersionRequest
     * @return GetModuleVersionResponse
     */
    public GetModuleVersionResponse getModuleVersion(String moduleId, String moduleVersion, GetModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModuleVersionWithOptions(moduleId, moduleVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves detailed parameter set information by specifying a <code>parameterSetId</code>.</li>
     * <li>Authentication is required to access this operation.</li>
     * <li>If the request is successful, detailed data including the parameter set name, description, and parameter list is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a parameter set by parameter set ID.</p>
     * 
     * @param request GetParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParameterSetResponse
     */
    public GetParameterSetResponse getParameterSetWithOptions(String parameterSetId, GetParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/" + com.aliyun.openapiutil.Client.getEncodeParam(parameterSetId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParameterSetResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves detailed parameter set information by specifying a <code>parameterSetId</code>.</li>
     * <li>Authentication is required to access this operation.</li>
     * <li>If the request is successful, detailed data including the parameter set name, description, and parameter list is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a parameter set by parameter set ID.</p>
     * 
     * @param request GetParameterSetRequest
     * @return GetParameterSetResponse
     */
    public GetParameterSetResponse getParameterSet(String parameterSetId, GetParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getParameterSetWithOptions(parameterSetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a project.</p>
     * 
     * @param request GetProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String projectId, GetProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a project.</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String projectId, GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the resource documentation of a Terraform provider.</p>
     * 
     * @param request GetProviderDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProviderDocumentResponse
     */
    public GetProviderDocumentResponse getProviderDocumentWithOptions(GetProviderDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.providerVersion)) {
            query.put("providerVersion", request.providerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformResourceType)) {
            query.put("terraformResourceType", request.terraformResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProviderDocument"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/version/terraform/provider/document"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProviderDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the resource documentation of a Terraform provider.</p>
     * 
     * @param request GetProviderDocumentRequest
     * @return GetProviderDocumentResponse
     */
    public GetProviderDocumentResponse getProviderDocument(GetProviderDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProviderDocumentWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a Registry module.</p>
     * 
     * @param request GetRegistryModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistryModuleResponse
     */
    public GetRegistryModuleResponse getRegistryModuleWithOptions(String namespaceName, String moduleName, GetRegistryModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistryModuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a Registry module.</p>
     * 
     * @param request GetRegistryModuleRequest
     * @return GetRegistryModuleResponse
     */
    public GetRegistryModuleResponse getRegistryModule(String namespaceName, String moduleName, GetRegistryModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryModuleWithOptions(namespaceName, moduleName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a Registry template version.</p>
     * 
     * @param request GetRegistryModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistryModuleVersionResponse
     */
    public GetRegistryModuleVersionResponse getRegistryModuleVersionWithOptions(String namespaceName, String moduleName, String version, GetRegistryModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistryModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistryModuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a Registry template version.</p>
     * 
     * @param request GetRegistryModuleVersionRequest
     * @return GetRegistryModuleVersionResponse
     */
    public GetRegistryModuleVersionResponse getRegistryModuleVersion(String namespaceName, String moduleName, String version, GetRegistryModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryModuleVersionWithOptions(namespaceName, moduleName, version, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a workspace.</p>
     * 
     * @param request GetRegistryNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistryNamespaceResponse
     */
    public GetRegistryNamespaceResponse getRegistryNamespaceWithOptions(String namespaceName, GetRegistryNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistryNamespace"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistryNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a workspace.</p>
     * 
     * @param request GetRegistryNamespaceRequest
     * @return GetRegistryNamespaceResponse
     */
    public GetRegistryNamespaceResponse getRegistryNamespace(String namespaceName, GetRegistryNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryNamespaceWithOptions(namespaceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a resource export task.</p>
     * 
     * @param request GetResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceExportTaskResponse
     */
    public GetResourceExportTaskResponse getResourceExportTaskWithOptions(String exportTaskId, GetResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportVersion)) {
            query.put("exportVersion", request.exportVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a resource export task.</p>
     * 
     * @param request GetResourceExportTaskRequest
     * @return GetResourceExportTaskResponse
     */
    public GetResourceExportTaskResponse getResourceExportTask(String exportTaskId, GetResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Retrieves resource type information.</p>
     * 
     * @param request GetResourceTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceTypeWithOptions(String resourceType, GetResourceTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterReadOnly)) {
            query.put("filterReadOnly", request.filterReadOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            query.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceType"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceType/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetResourceTypeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Retrieves resource type information.</p>
     * 
     * @param request GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceType(String resourceType, GetResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceTypeWithOptions(resourceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a stack.</p>
     * 
     * @param request GetStackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStackResponse
     */
    public GetStackResponse getStackWithOptions(String stackId, GetStackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStack"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/" + com.aliyun.openapiutil.Client.getEncodeParam(stackId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a stack.</p>
     * 
     * @param request GetStackRequest
     * @return GetStackResponse
     */
    public GetStackResponse getStack(String stackId, GetStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStackWithOptions(stackId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of deployments for a stack.</p>
     * 
     * @param request GetStackDeploymentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStackDeploymentsResponse
     */
    public GetStackDeploymentsResponse getStackDeploymentsWithOptions(String stackId, GetStackDeploymentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configVersion)) {
            query.put("configVersion", request.configVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentName)) {
            query.put("deploymentName", request.deploymentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentNo)) {
            query.put("deploymentNo", request.deploymentNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackDeployments"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/" + com.aliyun.openapiutil.Client.getEncodeParam(stackId) + "/deployments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackDeploymentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of deployments for a stack.</p>
     * 
     * @param request GetStackDeploymentsRequest
     * @return GetStackDeploymentsResponse
     */
    public GetStackDeploymentsResponse getStackDeployments(String stackId, GetStackDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStackDeploymentsWithOptions(stackId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the trigger result of a Stack.</p>
     * 
     * @param request GetStackExecutionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStackExecutionResultResponse
     */
    public GetStackExecutionResultResponse getStackExecutionResultWithOptions(String triggerId, GetStackExecutionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackExecutionResult"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/trigger/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackExecutionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the trigger result of a Stack.</p>
     * 
     * @param request GetStackExecutionResultRequest
     * @return GetStackExecutionResultResponse
     */
    public GetStackExecutionResultResponse getStackExecutionResult(String triggerId, GetStackExecutionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStackExecutionResultWithOptions(triggerId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a task.</p>
     * 
     * @param request GetTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(String taskId, GetTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a task.</p>
     * 
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(String taskId, GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to retrieve the detection results of state files for resource orchestration tasks and stack tasks on the automation service desk.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detection result of a state file.</p>
     * 
     * @param request GetTerraformStateDetectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTerraformStateDetectionResponse
     */
    public GetTerraformStateDetectionResponse getTerraformStateDetectionWithOptions(String detectionId, GetTerraformStateDetectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTerraformStateDetection"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detect/" + com.aliyun.openapiutil.Client.getEncodeParam(detectionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTerraformStateDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to retrieve the detection results of state files for resource orchestration tasks and stack tasks on the automation service desk.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detection result of a state file.</p>
     * 
     * @param request GetTerraformStateDetectionRequest
     * @return GetTerraformStateDetectionResponse
     */
    public GetTerraformStateDetectionResponse getTerraformStateDetection(String detectionId, GetTerraformStateDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTerraformStateDetectionWithOptions(detectionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List drift detection associations</p>
     * 
     * @param request ListDetectConfigRelationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDetectConfigRelationsResponse
     */
    public ListDetectConfigRelationsResponse listDetectConfigRelationsWithOptions(ListDetectConfigRelationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectConfigId)) {
            query.put("detectConfigId", request.detectConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("targetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("targetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDetectConfigRelations"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig/operations/relation"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDetectConfigRelationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List drift detection associations</p>
     * 
     * @param request ListDetectConfigRelationsRequest
     * @return ListDetectConfigRelationsResponse
     */
    public ListDetectConfigRelationsResponse listDetectConfigRelations(ListDetectConfigRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDetectConfigRelationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List drift detection configurations</p>
     * 
     * @param request ListDetectConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDetectConfigsResponse
     */
    public ListDetectConfigsResponse listDetectConfigsWithOptions(ListDetectConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectConfigName)) {
            query.put("detectConfigName", request.detectConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDetectConfigs"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDetectConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List drift detection configurations</p>
     * 
     * @param request ListDetectConfigsRequest
     * @return ListDetectConfigsResponse
     */
    public ListDetectConfigsResponse listDetectConfigs(ListDetectConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDetectConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the example information of Terraform Modules officially provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModuleExamples operation to the <code>nextToken</code> value returned in the previous response. If the <code>NextToken</code> parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can use keyword, namespaceName, moduleName, moduleVersion, and exampleName as conditional filter settings to narrow down the search scope. Multiple filter conditions have a logical <code>AND</code> relationship, and only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Searches by keyword and supports fuzzy match on exampleName. For example, if keyword is set to ecs, module examples whose names contain ecs are returned.</li>
     * <li>namespaceName: optional. Filters module examples by a specific workspace. For example, if namespaceName is set to alibaba, module examples in the alibaba workspace are returned.</li>
     * <li>moduleName: optional. Filters module examples by a specific module name. For example, if moduleName is set to ecs, module examples whose module name is ecs are returned.</li>
     * <li>moduleVersion: optional. Filters module examples by a specific module version. For example, if moduleVersion is set to 1.0.0, module examples whose module version is 1.0.0 are returned.</li>
     * <li>exampleName: optional. Filters module examples by a specific example name. For example, if exampleName is set to ecs, module examples whose example name is ecs are returned.
     * The response contains the request ID, total number of entries, data of the current page, and pagination information, which facilitates processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of official Terraform Module examples.</p>
     * 
     * @param request ListExplorerRegistryModuleExamplesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    public ListExplorerRegistryModuleExamplesResponse listExplorerRegistryModuleExamplesWithOptions(ListExplorerRegistryModuleExamplesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exampleName)) {
            query.put("exampleName", request.exampleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            query.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerRegistryModuleExamples"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerRegistryModule/example"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListExplorerRegistryModuleExamplesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the example information of Terraform Modules officially provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModuleExamples operation to the <code>nextToken</code> value returned in the previous response. If the <code>NextToken</code> parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can use keyword, namespaceName, moduleName, moduleVersion, and exampleName as conditional filter settings to narrow down the search scope. Multiple filter conditions have a logical <code>AND</code> relationship, and only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Searches by keyword and supports fuzzy match on exampleName. For example, if keyword is set to ecs, module examples whose names contain ecs are returned.</li>
     * <li>namespaceName: optional. Filters module examples by a specific workspace. For example, if namespaceName is set to alibaba, module examples in the alibaba workspace are returned.</li>
     * <li>moduleName: optional. Filters module examples by a specific module name. For example, if moduleName is set to ecs, module examples whose module name is ecs are returned.</li>
     * <li>moduleVersion: optional. Filters module examples by a specific module version. For example, if moduleVersion is set to 1.0.0, module examples whose module version is 1.0.0 are returned.</li>
     * <li>exampleName: optional. Filters module examples by a specific example name. For example, if exampleName is set to ecs, module examples whose example name is ecs are returned.
     * The response contains the request ID, total number of entries, data of the current page, and pagination information, which facilitates processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of official Terraform Module examples.</p>
     * 
     * @param request ListExplorerRegistryModuleExamplesRequest
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    public ListExplorerRegistryModuleExamplesResponse listExplorerRegistryModuleExamples(ListExplorerRegistryModuleExamplesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerRegistryModuleExamplesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the version information of official Terraform modules provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If the <code>NextToken</code> parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can use keyword, namespaceName, moduleName, and moduleVersion as conditional filter Settings to narrow the search scope. Multiple filter conditions have a logical <code>AND</code> relationship. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Performs a fuzzy match on the module name. For example, if keyword is set to ecs, modules whose names contain ecs are returned.</li>
     * <li>namespaceName: optional. Filters modules by a specific workspace. For example, if namespaceName is set to alibaba, modules whose workspace is alibaba are returned. When moduleName is specified, namespaceName must also be specified. You can call the ListExplorerRegistryModule operation to obtain the namespaceName information.</li>
     * <li>moduleName: optional. Filters modules by a specific name. For example, if moduleName is set to ecs, modules whose name is ecs are returned.</li>
     * <li>moduleVersion: optional. Filters modules by a specific version. For example, if moduleVersion is set to 1.0.0, modules whose version is 1.0.0 are returned.
     * The response contains the request ID, total number of entries, data on the current page, and pagination information, which facilitates the processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the version information of official Terraform modules provided by Alibaba Cloud.</p>
     * 
     * @param request ListExplorerRegistryModuleVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    public ListExplorerRegistryModuleVersionsResponse listExplorerRegistryModuleVersionsWithOptions(ListExplorerRegistryModuleVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            query.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerRegistryModuleVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerRegistryModule/version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListExplorerRegistryModuleVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the version information of official Terraform modules provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If the <code>NextToken</code> parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can use keyword, namespaceName, moduleName, and moduleVersion as conditional filter Settings to narrow the search scope. Multiple filter conditions have a logical <code>AND</code> relationship. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Performs a fuzzy match on the module name. For example, if keyword is set to ecs, modules whose names contain ecs are returned.</li>
     * <li>namespaceName: optional. Filters modules by a specific workspace. For example, if namespaceName is set to alibaba, modules whose workspace is alibaba are returned. When moduleName is specified, namespaceName must also be specified. You can call the ListExplorerRegistryModule operation to obtain the namespaceName information.</li>
     * <li>moduleName: optional. Filters modules by a specific name. For example, if moduleName is set to ecs, modules whose name is ecs are returned.</li>
     * <li>moduleVersion: optional. Filters modules by a specific version. For example, if moduleVersion is set to 1.0.0, modules whose version is 1.0.0 are returned.
     * The response contains the request ID, total number of entries, data on the current page, and pagination information, which facilitates the processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the version information of official Terraform modules provided by Alibaba Cloud.</p>
     * 
     * @param request ListExplorerRegistryModuleVersionsRequest
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    public ListExplorerRegistryModuleVersionsResponse listExplorerRegistryModuleVersions(ListExplorerRegistryModuleVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerRegistryModuleVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries information about official Terraform modules provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If the <code>nextToken</code> parameter is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If you do not specify the <code>NextToken</code> parameter, the first page of data is returned by default.</li>
     * <li>You can use keyword and moduleName as filter conditions to narrow the search scope. Multiple filter conditions are evaluated by using a logical <code>AND</code>. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Searches by keyword through fuzzy matching against ModuleName. For example, if keyword is set to ecs, modules whose names contain ecs are returned.</li>
     * <li>moduleName: optional. Filters modules by a specific name. For example, if moduleName is set to ecs, only the module whose name is exactly ecs is returned.
     * The response contains the request ID, total number of entries, data of the current page, and pagination information, which facilitates the processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists information about official Terraform modules provided by Alibaba Cloud.</p>
     * 
     * @param request ListExplorerRegistryModulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerRegistryModulesResponse
     */
    public ListExplorerRegistryModulesResponse listExplorerRegistryModulesWithOptions(ListExplorerRegistryModulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerRegistryModules"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerRegistryModule"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListExplorerRegistryModulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries information about official Terraform modules provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If the <code>nextToken</code> parameter is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If you do not specify the <code>NextToken</code> parameter, the first page of data is returned by default.</li>
     * <li>You can use keyword and moduleName as filter conditions to narrow the search scope. Multiple filter conditions are evaluated by using a logical <code>AND</code>. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Searches by keyword through fuzzy matching against ModuleName. For example, if keyword is set to ecs, modules whose names contain ecs are returned.</li>
     * <li>moduleName: optional. Filters modules by a specific name. For example, if moduleName is set to ecs, only the module whose name is exactly ecs is returned.
     * The response contains the request ID, total number of entries, data of the current page, and pagination information, which facilitates the processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists information about official Terraform modules provided by Alibaba Cloud.</p>
     * 
     * @param request ListExplorerRegistryModulesRequest
     * @return ListExplorerRegistryModulesResponse
     */
    public ListExplorerRegistryModulesResponse listExplorerRegistryModules(ListExplorerRegistryModulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerRegistryModulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of groups.</p>
     * 
     * @param tmpReq ListGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroupWithOptions(ListGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGroupShrinkRequest request = new ListGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of groups.</p>
     * 
     * @param request ListGroupRequest
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroup(ListGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of jobs.</p>
     * 
     * @param request ListJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(String taskId, ListJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("jobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of jobs.</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(String taskId, ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of template versions.</p>
     * 
     * @param request ListModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModuleVersionResponse
     */
    public ListModuleVersionResponse listModuleVersionWithOptions(String moduleId, ListModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of template versions.</p>
     * 
     * @param request ListModuleVersionRequest
     * @return ListModuleVersionResponse
     */
    public ListModuleVersionResponse listModuleVersion(String moduleId, ListModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModuleVersionWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation lists all Terraform templates under the current user. You can specify query parameters to implement pagination, fuzzy match template names, filter templates by source or status, and more. You can also filter templates by tags for more granular results.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The pagination parameters <code>pageNumber</code> and <code>pageSize</code> help control the number of returned results.</li>
     * <li>Use the <code>name</code> parameter to perform a fuzzy match search on template names.</li>
     * <li>Use the <code>source</code> parameter to filter templates by source (such as OSS import or file upload).</li>
     * <li>Use the <code>status</code> parameter to filter templates by status (such as created or published).</li>
     * <li>Tag filtering requires a JSON-formatted string, for example, <code>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;prod&quot;}]</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of templates under the current user, with support for pagination and conditional filtering.</p>
     * 
     * @param tmpReq ListModulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModulesResponse
     */
    public ListModulesResponse listModulesWithOptions(ListModulesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModulesShrinkRequest request = new ListModulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModules"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModulesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation lists all Terraform templates under the current user. You can specify query parameters to implement pagination, fuzzy match template names, filter templates by source or status, and more. You can also filter templates by tags for more granular results.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The pagination parameters <code>pageNumber</code> and <code>pageSize</code> help control the number of returned results.</li>
     * <li>Use the <code>name</code> parameter to perform a fuzzy match search on template names.</li>
     * <li>Use the <code>source</code> parameter to filter templates by source (such as OSS import or file upload).</li>
     * <li>Use the <code>status</code> parameter to filter templates by status (such as created or published).</li>
     * <li>Tag filtering requires a JSON-formatted string, for example, <code>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;prod&quot;}]</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of templates under the current user, with support for pagination and conditional filtering.</p>
     * 
     * @param request ListModulesRequest
     * @return ListModulesResponse
     */
    public ListModulesResponse listModules(ListModulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the parameter sets associated with a resource.</p>
     * 
     * @param request ListParameterSetRelationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParameterSetRelationResponse
     */
    public ListParameterSetRelationResponse listParameterSetRelationWithOptions(ListParameterSetRelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParameterSetRelation"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/operations/relation"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParameterSetRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the parameter sets associated with a resource.</p>
     * 
     * @param request ListParameterSetRelationRequest
     * @return ListParameterSetRelationResponse
     */
    public ListParameterSetRelationResponse listParameterSetRelation(ListParameterSetRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParameterSetRelationWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries all parameter sets in the system and supports filtering by keyword and paginated results. Authentication information is required in the request.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>The <code>keyword</code> parameter can be used to fuzzy match parameter sets by name or description.</li>
     * <li>Pagination is controlled by <code>pageNumber</code> and <code>pageSize</code>. By default, results start from the first page. The page size is customizable but should be set to a reasonable value to avoid performance issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries and retrieves a paginated list of parameter sets with keyword search support.</p>
     * 
     * @param request ListParameterSetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParameterSetsResponse
     */
    public ListParameterSetsResponse listParameterSetsWithOptions(ListParameterSetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("kmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParameterSets"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParameterSetsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries all parameter sets in the system and supports filtering by keyword and paginated results. Authentication information is required in the request.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>The <code>keyword</code> parameter can be used to fuzzy match parameter sets by name or description.</li>
     * <li>Pagination is controlled by <code>pageNumber</code> and <code>pageSize</code>. By default, results start from the first page. The page size is customizable but should be set to a reasonable value to avoid performance issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries and retrieves a paginated list of parameter sets with keyword search support.</p>
     * 
     * @param request ListParameterSetsRequest
     * @return ListParameterSetsResponse
     */
    public ListParameterSetsResponse listParameterSets(ListParameterSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParameterSetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Keyword search</strong>: Use the <code>keyword</code> parameter for fuzzy matching.</li>
     * <li><strong>Paged query</strong>: Use <code>nextToken</code> for pagination and <code>maxResults</code> to specify the maximum number of results per page (default: 100, maximum: 200).</li>
     * <li><strong>Terraform Provider version</strong>: The optional <code>terraformProviderVersion</code> parameter filters products associated with a specific Provider version.</li>
     * <li><strong>Response structure</strong>: The response contains the request ID, total number of entries, data of the current page, and pagination information for easy processing of query results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of all products.</p>
     * 
     * @param request ListProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTerraformer)) {
            query.put("supportTerraformer", request.supportTerraformer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            query.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Keyword search</strong>: Use the <code>keyword</code> parameter for fuzzy matching.</li>
     * <li><strong>Paged query</strong>: Use <code>nextToken</code> for pagination and <code>maxResults</code> to specify the maximum number of results per page (default: 100, maximum: 200).</li>
     * <li><strong>Terraform Provider version</strong>: The optional <code>terraformProviderVersion</code> parameter filters products associated with a specific Provider version.</li>
     * <li><strong>Response structure</strong>: The response contains the request ID, total number of entries, data of the current page, and pagination information for easy processing of query results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of all products.</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of projects.</p>
     * 
     * @param tmpReq ListProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectShrinkRequest request = new ListProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of projects.</p>
     * 
     * @param request ListProjectRequest
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Registry template versions.</p>
     * 
     * @param request ListRegistryModuleVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistryModuleVersionsResponse
     */
    public ListRegistryModuleVersionsResponse listRegistryModuleVersionsWithOptions(ListRegistryModuleVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistryModuleVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistryModuleVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Registry template versions.</p>
     * 
     * @param request ListRegistryModuleVersionsRequest
     * @return ListRegistryModuleVersionsResponse
     */
    public ListRegistryModuleVersionsResponse listRegistryModuleVersions(ListRegistryModuleVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryModuleVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Registry modules.</p>
     * 
     * @param request ListRegistryModulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistryModulesResponse
     */
    public ListRegistryModulesResponse listRegistryModulesWithOptions(ListRegistryModulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistryModules"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistryModulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Registry modules.</p>
     * 
     * @param request ListRegistryModulesRequest
     * @return ListRegistryModulesResponse
     */
    public ListRegistryModulesResponse listRegistryModules(ListRegistryModulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryModulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of workspaces.</p>
     * 
     * @param request ListRegistryNamespacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistryNamespacesResponse
     */
    public ListRegistryNamespacesResponse listRegistryNamespacesWithOptions(ListRegistryNamespacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistryNamespaces"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistryNamespacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of workspaces.</p>
     * 
     * @param request ListRegistryNamespacesRequest
     * @return ListRegistryNamespacesResponse
     */
    public ListRegistryNamespacesResponse listRegistryNamespaces(ListRegistryNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryNamespacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of versions for a resource export task.</p>
     * 
     * @param request ListResourceExportTaskVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceExportTaskVersionsResponse
     */
    public ListResourceExportTaskVersionsResponse listResourceExportTaskVersionsWithOptions(String exportTaskId, ListResourceExportTaskVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportVersion)) {
            query.put("exportVersion", request.exportVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceExportTaskVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + "/exportVersions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceExportTaskVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of versions for a resource export task.</p>
     * 
     * @param request ListResourceExportTaskVersionsRequest
     * @return ListResourceExportTaskVersionsResponse
     */
    public ListResourceExportTaskVersionsResponse listResourceExportTaskVersions(String exportTaskId, ListResourceExportTaskVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceExportTaskVersionsWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of resource export tasks.</p>
     * 
     * @param request ListResourceExportTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceExportTasksResponse
     */
    public ListResourceExportTasksResponse listResourceExportTasksWithOptions(ListResourceExportTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskId)) {
            query.put("exportTaskId", request.exportTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceExportTasks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceExportTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of resource export tasks.</p>
     * 
     * @param request ListResourceExportTasksRequest
     * @return ListResourceExportTasksResponse
     */
    public ListResourceExportTasksResponse listResourceExportTasks(ListResourceExportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceExportTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows you to perform a conditional query for a list of resource types based on conditions such as product code, Terraform Provider version, child class, status, and keyword. The results contain detailed information about resources, including product code, status, status effective version, child class, Terraform Provider version, and resource type code. Paging is supported for handling large amounts of data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource types by filter conditions with pagination support.</p>
     * 
     * @param tmpReq ListResourceTypesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypesWithOptions(ListResourceTypesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceTypesShrinkRequest request = new ListResourceTypesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.terraformResourceTypes)) {
            request.terraformResourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.terraformResourceTypes, "terraformResourceTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subcategory)) {
            query.put("subcategory", request.subcategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTerraformer)) {
            query.put("supportTerraformer", request.supportTerraformer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            query.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformResourceTypesShrink)) {
            query.put("terraformResourceTypes", request.terraformResourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceTypes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListResourceTypesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows you to perform a conditional query for a list of resource types based on conditions such as product code, Terraform Provider version, child class, status, and keyword. The results contain detailed information about resources, including product code, status, status effective version, child class, Terraform Provider version, and resource type code. Paging is supported for handling large amounts of data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource types by filter conditions with pagination support.</p>
     * 
     * @param request ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceTypesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the resources of a node.</p>
     * 
     * @param request ListResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceValue)) {
            query.put("sourceValue", request.sourceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("specType", request.specType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resources/stateparser"),
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
     * <p>Retrieves the resources of a node.</p>
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
     * <p>Queries the list of stack configurations.</p>
     * 
     * @param request ListStackConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStackConfigsResponse
     */
    public ListStackConfigsResponse listStackConfigsWithOptions(String stackId, ListStackConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStackConfigs"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/" + com.aliyun.openapiutil.Client.getEncodeParam(stackId) + "/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStackConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of stack configurations.</p>
     * 
     * @param request ListStackConfigsRequest
     * @return ListStackConfigsResponse
     */
    public ListStackConfigsResponse listStackConfigs(String stackId, ListStackConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStackConfigsWithOptions(stackId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of stacks.</p>
     * 
     * @param request ListStacksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStacksResponse
     */
    public ListStacksResponse listStacksWithOptions(ListStacksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("kmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStacks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStacksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of stacks.</p>
     * 
     * @param request ListStacksRequest
     * @return ListStacksResponse
     */
    public ListStacksResponse listStacks(ListStacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStacksWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of tasks.</p>
     * 
     * @param tmpReq ListTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("kmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            query.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of tasks.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of Terraform provider versions.</p>
     * 
     * @param request ListTerraformProviderVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTerraformProviderVersionsResponse
     */
    public ListTerraformProviderVersionsResponse listTerraformProviderVersionsWithOptions(ListTerraformProviderVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTerraformProviderVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/version/terraform/provider"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListTerraformProviderVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of Terraform provider versions.</p>
     * 
     * @param request ListTerraformProviderVersionsRequest
     * @return ListTerraformProviderVersionsResponse
     */
    public ListTerraformProviderVersionsResponse listTerraformProviderVersions(ListTerraformProviderVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTerraformProviderVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to manage state files for resource orchestration tasks and stack tasks on the automated service desk.
     * Before using this API, make sure that all required authentication information is correctly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports resource import and removal for state files.</p>
     * 
     * @param request ManageTerraformStateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageTerraformStateResponse
     */
    public ManageTerraformStateResponse manageTerraformStateWithOptions(ManageTerraformStateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importResourceId)) {
            body.put("importResourceId", request.importResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdentifier)) {
            body.put("resourceIdentifier", request.resourceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageTerraformState"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/manage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageTerraformStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to manage state files for resource orchestration tasks and stack tasks on the automated service desk.
     * Before using this API, make sure that all required authentication information is correctly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports resource import and removal for state files.</p>
     * 
     * @param request ManageTerraformStateRequest
     * @return ManageTerraformStateResponse
     */
    public ManageTerraformStateResponse manageTerraformState(ManageTerraformStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.manageTerraformStateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>After a job is created, you can perform the <strong>Cancel</strong> operation to stop the job while it is running.
     * After a job reaches the pending confirmation state, you can perform the <strong>Abolish</strong> operation to stop the job, or perform the <strong>Execute</strong> operation to continue the job execution.</p>
     * 
     * @param request OperateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateJobResponse
     */
    public OperateJobResponse operateJobWithOptions(String taskId, String jobId, String operationType, OperateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateJob"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/operation/" + com.aliyun.openapiutil.Client.getEncodeParam(operationType) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>After a job is created, you can perform the <strong>Cancel</strong> operation to stop the job while it is running.
     * After a job reaches the pending confirmation state, you can perform the <strong>Abolish</strong> operation to stop the job, or perform the <strong>Execute</strong> operation to continue the job execution.</p>
     * 
     * @param request OperateJobRequest
     * @return OperateJobResponse
     */
    public OperateJobResponse operateJob(String taskId, String jobId, String operationType, OperateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateJobWithOptions(taskId, jobId, operationType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a Registry template version.</p>
     * 
     * @param request PublishRegistryModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRegistryModuleVersionResponse
     */
    public PublishRegistryModuleVersionResponse publishRegistryModuleVersionWithOptions(PublishRegistryModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            body.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRegistryModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRegistryModuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a Registry template version.</p>
     * 
     * @param request PublishRegistryModuleVersionRequest
     * @return PublishRegistryModuleVersionResponse
     */
    public PublishRegistryModuleVersionResponse publishRegistryModuleVersion(PublishRegistryModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishRegistryModuleVersionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a shared account.</p>
     * 
     * @param tmpReq RemoveSharedAccountsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSharedAccountsResponse
     */
    public RemoveSharedAccountsResponse removeSharedAccountsWithOptions(RemoveSharedAccountsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveSharedAccountsShrinkRequest request = new RemoveSharedAccountsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "accountIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("accountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSharedAccounts"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sharedAccounts"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSharedAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a shared account.</p>
     * 
     * @param request RemoveSharedAccountsRequest
     * @return RemoveSharedAccountsResponse
     */
    public RemoveSharedAccountsResponse removeSharedAccounts(RemoveSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSharedAccountsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the encryption configuration.</p>
     * 
     * @param request SetEncryptionConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetEncryptionConfigResponse
     */
    public SetEncryptionConfigResponse setEncryptionConfigWithOptions(SetEncryptionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            body.put("kmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsRegionId)) {
            body.put("kmsRegionId", request.kmsRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEncryptionConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/encryption/config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEncryptionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the encryption configuration.</p>
     * 
     * @param request SetEncryptionConfigRequest
     * @return SetEncryptionConfigResponse
     */
    public SetEncryptionConfigResponse setEncryptionConfig(SetEncryptionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setEncryptionConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers the execution of a stack.</p>
     * 
     * @param request TriggerStackExecutionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerStackExecutionResponse
     */
    public TriggerStackExecutionResponse triggerStackExecutionWithOptions(TriggerStackExecutionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changedFolders)) {
            body.put("changedFolders", request.changedFolders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codePackagePath)) {
            body.put("codePackagePath", request.codePackagePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVersionId)) {
            body.put("codeVersionId", request.codeVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTriggerId)) {
            body.put("sourceTriggerId", request.sourceTriggerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerStackExecution"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/trigger"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerStackExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers the execution of a stack.</p>
     * 
     * @param request TriggerStackExecutionRequest
     * @return TriggerStackExecutionResponse
     */
    public TriggerStackExecutionResponse triggerStackExecution(TriggerStackExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerStackExecutionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li><code>detectConfigId</code> is a required parameter used to identify the specific detection configuration to update.  </li>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must include an alert type (<code>type</code>) and an address (<code>address</code>).  </li>
     * <li>If you do not want to change certain properties (such as <code>name</code>, <code>description</code>, etc.), you can omit these fields from the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the drift detection configuration information for the specified ID.</p>
     * 
     * @param request UpdateDetectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDetectConfigResponse
     */
    public UpdateDetectConfigResponse updateDetectConfigWithOptions(String detectConfigId, UpdateDetectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmConfigs)) {
            body.put("alarmConfigs", request.alarmConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            body.put("cronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectConfigName)) {
            body.put("detectConfigName", request.detectConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("triggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDetectConfig"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/detectConfig/" + com.aliyun.openapiutil.Client.getEncodeParam(detectConfigId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDetectConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li><code>detectConfigId</code> is a required parameter used to identify the specific detection configuration to update.  </li>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must include an alert type (<code>type</code>) and an address (<code>address</code>).  </li>
     * <li>If you do not want to change certain properties (such as <code>name</code>, <code>description</code>, etc.), you can omit these fields from the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the drift detection configuration information for the specified ID.</p>
     * 
     * @param request UpdateDetectConfigRequest
     * @return UpdateDetectConfigResponse
     */
    public UpdateDetectConfigResponse updateDetectConfig(String detectConfigId, UpdateDetectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDetectConfigWithOptions(detectConfigId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates an Explorer template.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an Explorer template.</p>
     * 
     * @param request UpdateExplorerModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExplorerModuleAttributeResponse
     */
    public UpdateExplorerModuleAttributeResponse updateExplorerModuleAttributeWithOptions(String explorerModuleId, UpdateExplorerModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExplorerModuleAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerModule/" + com.aliyun.openapiutil.Client.getEncodeParam(explorerModuleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExplorerModuleAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates an Explorer template.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an Explorer template.</p>
     * 
     * @param request UpdateExplorerModuleAttributeRequest
     * @return UpdateExplorerModuleAttributeResponse
     */
    public UpdateExplorerModuleAttributeResponse updateExplorerModuleAttribute(String explorerModuleId, UpdateExplorerModuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExplorerModuleAttributeWithOptions(explorerModuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a group.</p>
     * 
     * @param request UpdateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(String groupId, UpdateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTrigger)) {
            body.put("autoTrigger", request.autoTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forcedSetting)) {
            body.put("forcedSetting", request.forcedSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            body.put("notifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyOperationTypes)) {
            body.put("notifyOperationTypes", request.notifyOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportField)) {
            body.put("reportExportField", request.reportExportField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportPath)) {
            body.put("reportExportPath", request.reportExportPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            body.put("triggerConfig", request.triggerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerResourceType)) {
            body.put("triggerResourceType", request.triggerResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a group.</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(String groupId, UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic attributes of an existing template, including but not limited to the template name, description, and tags.</li>
     * <li>The update operation does not affect the content or version information of the template.</li>
     * <li>To enable or disable deletion protection, use the deletionProtection parameter.</li>
     * <li>Use clientToken to ensure the idempotence of the request and avoid duplicate submissions caused by network issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the name, description, tags, and other information of a specified template.</p>
     * 
     * @param request UpdateModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModuleAttributeResponse
     */
    public UpdateModuleAttributeResponse updateModuleAttributeWithOptions(String moduleId, UpdateModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statePath)) {
            body.put("statePath", request.statePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStrategy)) {
            body.put("versionStrategy", request.versionStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModuleAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModuleAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic attributes of an existing template, including but not limited to the template name, description, and tags.</li>
     * <li>The update operation does not affect the content or version information of the template.</li>
     * <li>To enable or disable deletion protection, use the deletionProtection parameter.</li>
     * <li>Use clientToken to ensure the idempotence of the request and avoid duplicate submissions caused by network issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the name, description, tags, and other information of a specified template.</p>
     * 
     * @param request UpdateModuleAttributeRequest
     * @return UpdateModuleAttributeResponse
     */
    public UpdateModuleAttributeResponse updateModuleAttribute(String moduleId, UpdateModuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModuleAttributeWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic information of an existing parameter set, including the name and description.</li>
     * <li>If the request includes the <code>parameters</code> field, the parameter list in the parameter set is updated.</li>
     * <li>The <code>clientToken</code> field can be used to ensure the idempotence of the request.</li>
     * <li>The update operation requires a valid <code>parameterSetId</code> as a path parameter.</li>
     * <li>The request must include authentication information to pass identity verification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a specified parameter set, such as the name and description.</p>
     * 
     * @param request UpdateParameterSetAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateParameterSetAttributeResponse
     */
    public UpdateParameterSetAttributeResponse updateParameterSetAttributeWithOptions(String parameterSetId, UpdateParameterSetAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateParameterSetAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/" + com.aliyun.openapiutil.Client.getEncodeParam(parameterSetId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateParameterSetAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic information of an existing parameter set, including the name and description.</li>
     * <li>If the request includes the <code>parameters</code> field, the parameter list in the parameter set is updated.</li>
     * <li>The <code>clientToken</code> field can be used to ensure the idempotence of the request.</li>
     * <li>The update operation requires a valid <code>parameterSetId</code> as a path parameter.</li>
     * <li>The request must include authentication information to pass identity verification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a specified parameter set, such as the name and description.</p>
     * 
     * @param request UpdateParameterSetAttributeRequest
     * @return UpdateParameterSetAttributeResponse
     */
    public UpdateParameterSetAttributeResponse updateParameterSetAttribute(String parameterSetId, UpdateParameterSetAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateParameterSetAttributeWithOptions(parameterSetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates project information.</p>
     * 
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(String projectId, UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates project information.</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(String projectId, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a Registry template.</p>
     * 
     * @param request UpdateRegistryModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegistryModuleAttributeResponse
     */
    public UpdateRegistryModuleAttributeResponse updateRegistryModuleAttributeWithOptions(String namespaceName, String moduleName, UpdateRegistryModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegistryModuleAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegistryModuleAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a Registry template.</p>
     * 
     * @param request UpdateRegistryModuleAttributeRequest
     * @return UpdateRegistryModuleAttributeResponse
     */
    public UpdateRegistryModuleAttributeResponse updateRegistryModuleAttribute(String namespaceName, String moduleName, UpdateRegistryModuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegistryModuleAttributeWithOptions(namespaceName, moduleName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a workspace.</p>
     * 
     * @param request UpdateRegistryNamespaceAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    public UpdateRegistryNamespaceAttributeResponse updateRegistryNamespaceAttributeWithOptions(String namespaceName, UpdateRegistryNamespaceAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegistryNamespaceAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegistryNamespaceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a workspace.</p>
     * 
     * @param request UpdateRegistryNamespaceAttributeRequest
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    public UpdateRegistryNamespaceAttributeResponse updateRegistryNamespaceAttribute(String namespaceName, UpdateRegistryNamespaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegistryNamespaceAttributeWithOptions(namespaceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a resource export task.</p>
     * 
     * @param request UpdateResourceExportTaskAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceExportTaskAttributeResponse
     */
    public UpdateResourceExportTaskAttributeResponse updateResourceExportTaskAttributeWithOptions(String exportTaskId, UpdateResourceExportTaskAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportToModule)) {
            body.put("exportToModule", request.exportToModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRules)) {
            body.put("includeRules", request.includeRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceExportTaskAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceExportTaskAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a resource export task.</p>
     * 
     * @param request UpdateResourceExportTaskAttributeRequest
     * @return UpdateResourceExportTaskAttributeResponse
     */
    public UpdateResourceExportTaskAttributeResponse updateResourceExportTaskAttribute(String exportTaskId, UpdateResourceExportTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceExportTaskAttributeWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a stack. When the configuration changes, a stack deployment is triggered.</p>
     * 
     * @param request UpdateStackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStackResponse
     */
    public UpdateStackResponse updateStackWithOptions(String stackId, UpdateStackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingDirectory)) {
            body.put("workingDirectory", request.workingDirectory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStack"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/stacks/" + com.aliyun.openapiutil.Client.getEncodeParam(stackId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a stack. When the configuration changes, a stack deployment is triggered.</p>
     * 
     * @param request UpdateStackRequest
     * @return UpdateStackResponse
     */
    public UpdateStackResponse updateStack(String stackId, UpdateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStackWithOptions(stackId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a node.</p>
     * 
     * @param request UpdateTaskAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskAttributeResponse
     */
    public UpdateTaskAttributeResponse updateTaskAttributeWithOptions(String taskId, UpdateTaskAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoApply)) {
            body.put("autoApply", request.autoApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initModuleState)) {
            body.put("initModuleState", request.initModuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            body.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionStrategy)) {
            body.put("protectionStrategy", request.protectionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPropertyValidation)) {
            body.put("skipPropertyValidation", request.skipPropertyValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipRegionValidation)) {
            body.put("skipRegionValidation", request.skipRegionValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a node.</p>
     * 
     * @param request UpdateTaskAttributeRequest
     * @return UpdateTaskAttributeResponse
     */
    public UpdateTaskAttributeResponse updateTaskAttribute(String taskId, UpdateTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTaskAttributeWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a template.</p>
     * 
     * @param request UploadModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadModuleResponse
     */
    public UploadModuleResponse uploadModuleWithOptions(String resourceType, UploadModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            query.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("url", request.url);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/upload/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a template.</p>
     * 
     * @param request UploadModuleRequest
     * @return UploadModuleResponse
     */
    public UploadModuleResponse uploadModule(String resourceType, UploadModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadModuleWithOptions(resourceType, request, headers, runtime);
    }

    public UploadModuleResponse uploadModuleAdvance(String resourceType, UploadModuleAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "IaCService"),
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
        UploadModuleRequest uploadModuleReq = new UploadModuleRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadModuleReq);
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
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            uploadModuleReq.url = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        UploadModuleResponse uploadModuleResp = this.uploadModuleWithOptions(resourceType, uploadModuleReq, headers, runtime);
        return uploadModuleResp;
    }

    /**
     * <b>description</b> :
     * <p>Performs a dry run on the content of a Terraform configuration file.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a dry run on a template.</p>
     * 
     * @param request ValidateModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateModuleResponse
     */
    public ValidateModuleResponse validateModuleWithOptions(ValidateModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeMap)) {
            body.put("codeMap", request.codeMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/module/validation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateModuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a dry run on the content of a Terraform configuration file.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a dry run on a template.</p>
     * 
     * @param request ValidateModuleRequest
     * @return ValidateModuleResponse
     */
    public ValidateModuleResponse validateModule(ValidateModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateModuleWithOptions(request, headers, runtime);
    }
}
