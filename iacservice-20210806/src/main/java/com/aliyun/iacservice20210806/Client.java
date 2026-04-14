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
        this._endpointRule = "";
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
     * <b>summary</b> : 
     * <p>新增共享账号信息</p>
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
     * <b>summary</b> : 
     * <p>新增共享账号信息</p>
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
     * <p>将参数集关联资源</p>
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
     * <p>将参数集关联资源</p>
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
     * <p>分组关联</p>
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
     * <p>分组关联</p>
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
     * <b>summary</b> : 
     * <p>将参数集关联资源</p>
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
     * <b>summary</b> : 
     * <p>将参数集关联资源</p>
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
     * <b>summary</b> : 
     * <p>取消资源导出任务</p>
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
     * <b>summary</b> : 
     * <p>取消资源导出任务</p>
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
     * <b>summary</b> : 
     * <p>创建偏差检测配置</p>
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
     * <b>summary</b> : 
     * <p>创建偏差检测配置</p>
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
     * <p>创建分组</p>
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
     * <p>创建分组</p>
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
     * <b>summary</b> : 
     * <p>创建作业</p>
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
     * <b>summary</b> : 
     * <p>创建作业</p>
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
     * <b>summary</b> : 
     * <p>Create Module</p>
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
     * <b>summary</b> : 
     * <p>Create Module</p>
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
     * <b>summary</b> : 
     * <p>创建模板版本</p>
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
     * <b>summary</b> : 
     * <p>创建模板版本</p>
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
     * <b>summary</b> : 
     * <p>创建参数集</p>
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
     * <b>summary</b> : 
     * <p>创建参数集</p>
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
     * <p>创建项目</p>
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
     * <p>创建项目</p>
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
     * <b>summary</b> : 
     * <p>创建RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>创建RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>创建工作空间</p>
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
     * <b>summary</b> : 
     * <p>创建工作空间</p>
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
     * <b>summary</b> : 
     * <p>创建导出任务</p>
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
     * <b>summary</b> : 
     * <p>创建导出任务</p>
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
     * <p>创建资源栈</p>
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
     * <p>创建资源栈</p>
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
     * <b>summary</b> : 
     * <p>创建任务</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.protectionStrategy)) {
            body.put("protectionStrategy", request.protectionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPropertyValidation)) {
            body.put("skipPropertyValidation", request.skipPropertyValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskBackend)) {
            body.put("taskBackend", request.taskBackend);
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
     * <b>summary</b> : 
     * <p>创建任务</p>
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
     * <p>删除偏差检测配置</p>
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
     * <p>删除偏差检测配置</p>
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
     * <p>删除分组</p>
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
     * <p>删除分组</p>
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
     * <b>summary</b> : 
     * <p>删除模板</p>
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
     * <b>summary</b> : 
     * <p>删除模板</p>
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
     * <b>summary</b> : 
     * <p>删除参数集</p>
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
     * <b>summary</b> : 
     * <p>删除参数集</p>
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
     * <p>删除项目</p>
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
     * <p>删除项目</p>
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
     * <b>summary</b> : 
     * <p>删除RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>删除RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>删除RegistryModule版本</p>
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
     * <b>summary</b> : 
     * <p>删除RegistryModule版本</p>
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
     * <b>summary</b> : 
     * <p>删除工作空间</p>
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
     * <b>summary</b> : 
     * <p>删除工作空间</p>
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
     * <b>summary</b> : 
     * <p>删除资源导出任务</p>
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
     * <b>summary</b> : 
     * <p>删除资源导出任务</p>
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
     * <p>删除资源栈</p>
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
     * <p>删除资源栈</p>
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
     * <b>summary</b> : 
     * <p>删除任务</p>
     * 
     * @param request DeleteTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(String taskId, DeleteTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
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
     * <b>summary</b> : 
     * <p>删除任务</p>
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
     * <b>summary</b> : 
     * <p>发起状态文件一致性检测</p>
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
     * <b>summary</b> : 
     * <p>发起状态文件一致性检测</p>
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
     * <p>解除参数集关联资源关系</p>
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
     * <p>解除参数集关联资源关系</p>
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
     * <p>取消关联分组</p>
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
     * <p>取消关联分组</p>
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
     * <p>解除参数集关联资源关系</p>
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
     * <p>解除参数集关联资源关系</p>
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
     * <b>summary</b> : 
     * <p>执行RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>执行RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>执行资源导出任务</p>
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
     * <b>summary</b> : 
     * <p>执行资源导出任务</p>
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
     * <b>summary</b> : 
     * <p>执行TerraformApply</p>
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
     * <b>summary</b> : 
     * <p>执行TerraformApply</p>
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
     * <b>summary</b> : 
     * <p>执行TerraformDestroy</p>
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
     * <b>summary</b> : 
     * <p>执行TerraformDestroy</p>
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
     * <b>summary</b> : 
     * <p>执行TerraformPlan</p>
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
     * <b>summary</b> : 
     * <p>执行TerraformPlan</p>
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
     * <p>生成模板</p>
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
     * <p>生成模板</p>
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
     * <p>偏差检测配置详情</p>
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
     * <p>偏差检测配置详情</p>
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
     * <p>获取Terraform运行结果</p>
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
     * <b>summary</b> : 
     * <p>获取Terraform运行结果</p>
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
     * <p>查询分组</p>
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
     * <p>查询分组</p>
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
     * <b>summary</b> : 
     * <p>作业详情</p>
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
     * <b>summary</b> : 
     * <p>作业详情</p>
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
     * <b>summary</b> : 
     * <p>Get Module Details</p>
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
     * <b>summary</b> : 
     * <p>Get Module Details</p>
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
     * <b>summary</b> : 
     * <p>模板版本详情</p>
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
     * <b>summary</b> : 
     * <p>模板版本详情</p>
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
     * <b>summary</b> : 
     * <p>参数集详情</p>
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
     * <b>summary</b> : 
     * <p>参数集详情</p>
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
     * <p>查询项目</p>
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
     * <p>查询项目</p>
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
     * <p>获取RegistryModule信息</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule信息</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule版本信息</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule版本信息</p>
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
     * <b>summary</b> : 
     * <p>获取工作空间信息</p>
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
     * <b>summary</b> : 
     * <p>获取工作空间信息</p>
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
     * <b>summary</b> : 
     * <p>查询导出任务详情</p>
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
     * <b>summary</b> : 
     * <p>查询导出任务详情</p>
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
     * <b>summary</b> : 
     * <p>获取资源类型信息</p>
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
     * <b>summary</b> : 
     * <p>获取资源类型信息</p>
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
     * <p>获取资源栈</p>
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
     * <p>获取资源栈</p>
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
     * <p>部署详情接口</p>
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
     * <p>部署详情接口</p>
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
     * <p>获取资源栈部署结果</p>
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
     * <p>获取资源栈部署结果</p>
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
     * <b>summary</b> : 
     * <p>查询任务详情</p>
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
     * <b>summary</b> : 
     * <p>查询任务详情</p>
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
     * <b>summary</b> : 
     * <p>获取状态文件检测结果</p>
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
     * <b>summary</b> : 
     * <p>获取状态文件检测结果</p>
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
     * <p>关联到资源的偏差检测配置列表</p>
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
     * <p>关联到资源的偏差检测配置列表</p>
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
     * <p>偏差检测配置列表</p>
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
     * <p>偏差检测配置列表</p>
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
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本示例列表</p>
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
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本示例列表</p>
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
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本列表</p>
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
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本列表</p>
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
     * <b>summary</b> : 
     * <p>获取Explorer的Registry Module列表</p>
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
     * <b>summary</b> : 
     * <p>获取Explorer的Registry Module列表</p>
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
     * <p>查询分组列表</p>
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
     * <p>查询分组列表</p>
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
     * <b>summary</b> : 
     * <p>作业列表</p>
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
     * <b>summary</b> : 
     * <p>作业列表</p>
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
     * <b>summary</b> : 
     * <p>模板版本列表</p>
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
     * <b>summary</b> : 
     * <p>模板版本列表</p>
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
     * <b>summary</b> : 
     * <p>列举模板</p>
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
     * <b>summary</b> : 
     * <p>列举模板</p>
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
     * <p>关联到资源的参数集列表</p>
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
     * <p>关联到资源的参数集列表</p>
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
     * <b>summary</b> : 
     * <p>参数集列表</p>
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
     * <b>summary</b> : 
     * <p>参数集列表</p>
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
     * <b>summary</b> : 
     * <p>所有产品列表</p>
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
     * <b>summary</b> : 
     * <p>所有产品列表</p>
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
     * <p>查询项目列表</p>
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
     * <p>查询项目列表</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule版本列表</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule版本列表</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule列表</p>
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
     * <b>summary</b> : 
     * <p>获取RegistryModule列表</p>
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
     * <b>summary</b> : 
     * <p>获取工作空间列表</p>
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
     * <b>summary</b> : 
     * <p>获取工作空间列表</p>
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
     * <b>summary</b> : 
     * <p>获取任务版本列表</p>
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
     * <b>summary</b> : 
     * <p>获取任务版本列表</p>
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
     * <b>summary</b> : 
     * <p>查询导出任务列表</p>
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
     * <b>summary</b> : 
     * <p>查询导出任务列表</p>
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
     * <b>summary</b> : 
     * <p>资源类型列表</p>
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
     * <b>summary</b> : 
     * <p>资源类型列表</p>
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
     * <p>资源列表</p>
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
     * <p>资源列表</p>
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
     * <p>查询资源栈配置列表</p>
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
     * <p>查询资源栈配置列表</p>
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
     * <p>列举资源栈</p>
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
     * <p>列举资源栈</p>
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
     * <b>summary</b> : 
     * <p>任务列表</p>
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
     * <b>summary</b> : 
     * <p>任务列表</p>
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
     * <p>terraformProvider版本</p>
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
     * <p>terraformProvider版本</p>
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
     * <b>summary</b> : 
     * <p>支持状态文件的资源导入和移除</p>
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
     * <b>summary</b> : 
     * <p>支持状态文件的资源导入和移除</p>
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
     * <b>summary</b> : 
     * <p>控制作业</p>
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
     * <b>summary</b> : 
     * <p>控制作业</p>
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
     * <b>summary</b> : 
     * <p>发布RegistryModule版本</p>
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
     * <b>summary</b> : 
     * <p>发布RegistryModule版本</p>
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
     * <b>summary</b> : 
     * <p>删除共享账号信息</p>
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
     * <b>summary</b> : 
     * <p>删除共享账号信息</p>
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
     * <p>触发资源栈部署</p>
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
     * <p>触发资源栈部署</p>
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
     * <b>summary</b> : 
     * <p>更新偏差检测配置</p>
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
     * <b>summary</b> : 
     * <p>更新偏差检测配置</p>
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
     * <b>summary</b> : 
     * <p>修改ExplorerModule</p>
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
     * <b>summary</b> : 
     * <p>修改ExplorerModule</p>
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
     * <p>修改分组</p>
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
     * <p>修改分组</p>
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
     * <b>summary</b> : 
     * <p>Update Module</p>
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
     * <b>summary</b> : 
     * <p>Update Module</p>
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
     * <b>summary</b> : 
     * <p>更新参数集</p>
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
     * <b>summary</b> : 
     * <p>更新参数集</p>
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
     * <p>修改项目</p>
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
     * <p>修改项目</p>
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
     * <b>summary</b> : 
     * <p>修改RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>修改RegistryModule</p>
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
     * <b>summary</b> : 
     * <p>修改工作空间</p>
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
     * <b>summary</b> : 
     * <p>修改工作空间</p>
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
     * <b>summary</b> : 
     * <p>更新导出任务</p>
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
     * <b>summary</b> : 
     * <p>更新导出任务</p>
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
     * <p>更新资源栈</p>
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
     * <p>更新资源栈</p>
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
     * <b>summary</b> : 
     * <p>修改任务</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
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
     * <b>summary</b> : 
     * <p>修改任务</p>
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
     * <p>模版上传</p>
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
     * <p>模版上传</p>
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
     * <b>summary</b> : 
     * <p>模版预检</p>
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
     * <b>summary</b> : 
     * <p>模版预检</p>
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
