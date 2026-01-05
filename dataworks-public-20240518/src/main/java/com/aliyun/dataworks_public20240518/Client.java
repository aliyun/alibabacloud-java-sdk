// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.dataworks_public20240518.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dataworks.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dataworks.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dataworks.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-fujian", "dataworks.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dataworks.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dataworks.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dataworks.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dataworks.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dataworks.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dataworks-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p> This operation may not be available in earlier versions of the SDK. In this case, use the AbolishDeployment operation. The parameters for AbolishDeployment are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Terminates the specified deployment process. This operation changes the status of the process to Terminated but does not delete the process. You can still query the process.</p>
     * 
     * @param request AbolishPipelineRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbolishPipelineRunResponse
     */
    public AbolishPipelineRunResponse abolishPipelineRunWithOptions(AbolishPipelineRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbolishPipelineRun"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbolishPipelineRunResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation may not be available in earlier versions of the SDK. In this case, use the AbolishDeployment operation. The parameters for AbolishDeployment are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Terminates the specified deployment process. This operation changes the status of the process to Terminated but does not delete the process. You can still query the process.</p>
     * 
     * @param request AbolishPipelineRunRequest
     * @return AbolishPipelineRunResponse
     */
    public AbolishPipelineRunResponse abolishPipelineRun(AbolishPipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishPipelineRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从集合中移除实体对象</p>
     * 
     * @param request AddEntityIntoMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEntityIntoMetaCollectionResponse
     */
    public AddEntityIntoMetaCollectionResponse addEntityIntoMetaCollectionWithOptions(AddEntityIntoMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaCollectionId)) {
            query.put("MetaCollectionId", request.metaCollectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEntityIntoMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEntityIntoMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从集合中移除实体对象</p>
     * 
     * @param request AddEntityIntoMetaCollectionRequest
     * @return AddEntityIntoMetaCollectionResponse
     */
    public AddEntityIntoMetaCollectionResponse addEntityIntoMetaCollection(AddEntityIntoMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEntityIntoMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a resource group with a workspace.</p>
     * 
     * @param request AssociateProjectToResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateProjectToResourceGroupResponse
     */
    public AssociateProjectToResourceGroupResponse associateProjectToResourceGroupWithOptions(AssociateProjectToResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateProjectToResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateProjectToResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a resource group with a workspace.</p>
     * 
     * @param request AssociateProjectToResourceGroupRequest
     * @return AssociateProjectToResourceGroupResponse
     */
    public AssociateProjectToResourceGroupResponse associateProjectToResourceGroup(AssociateProjectToResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateProjectToResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates monitoring rules with a data quality monitoring task.</p>
     * 
     * @param tmpReq AttachDataQualityRulesToEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachDataQualityRulesToEvaluationTaskResponse
     */
    public AttachDataQualityRulesToEvaluationTaskResponse attachDataQualityRulesToEvaluationTaskWithOptions(AttachDataQualityRulesToEvaluationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachDataQualityRulesToEvaluationTaskShrinkRequest request = new AttachDataQualityRulesToEvaluationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataQualityRuleIds)) {
            request.dataQualityRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataQualityRuleIds, "DataQualityRuleIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationTaskId)) {
            body.put("DataQualityEvaluationTaskId", request.dataQualityEvaluationTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityRuleIdsShrink)) {
            body.put("DataQualityRuleIds", request.dataQualityRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDataQualityRulesToEvaluationTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDataQualityRulesToEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates monitoring rules with a data quality monitoring task.</p>
     * 
     * @param request AttachDataQualityRulesToEvaluationTaskRequest
     * @return AttachDataQualityRulesToEvaluationTaskResponse
     */
    public AttachDataQualityRulesToEvaluationTaskResponse attachDataQualityRulesToEvaluationTask(AttachDataQualityRulesToEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDataQualityRulesToEvaluationTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs incremental updates on multiple tasks at a time.</p>
     * 
     * @param tmpReq BatchUpdateTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateTasksResponse
     */
    public BatchUpdateTasksResponse batchUpdateTasksWithOptions(BatchUpdateTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateTasksShrinkRequest request = new BatchUpdateTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tasks)) {
            request.tasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tasks, "Tasks", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tasksShrink)) {
            body.put("Tasks", request.tasksShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs incremental updates on multiple tasks at a time.</p>
     * 
     * @param request BatchUpdateTasksRequest
     * @return BatchUpdateTasksResponse
     */
    public BatchUpdateTasksResponse batchUpdateTasks(BatchUpdateTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Clones an existing data source.</p>
     * 
     * @param request CloneDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneDataSourceResponse
     */
    public CloneDataSourceResponse cloneDataSourceWithOptions(CloneDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloneDataSourceName)) {
            query.put("CloneDataSourceName", request.cloneDataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Clones an existing data source.</p>
     * 
     * @param request CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    public CloneDataSourceResponse cloneDataSource(CloneDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom monitoring alert rule.</p>
     * 
     * @param tmpReq CreateAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertRuleResponse
     */
    public CreateAlertRuleResponse createAlertRuleWithOptions(CreateAlertRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAlertRuleShrinkRequest request = new CreateAlertRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerCondition)) {
            request.triggerConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerCondition, "TriggerCondition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConditionShrink)) {
            query.put("TriggerCondition", request.triggerConditionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom monitoring alert rule.</p>
     * 
     * @param request CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     */
    public CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlertRuleWithOptions(request, runtime);
    }

    /**
     * @param request CreateBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBusinessResponse
     */
    public CreateBusinessResponse createBusinessWithOptions(CreateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessName)) {
            body.put("BusinessName", request.businessName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useType)) {
            body.put("UseType", request.useType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBusiness"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBusinessResponse());
    }

    /**
     * @param request CreateBusinessRequest
     * @return CreateBusinessResponse
     */
    public CreateBusinessResponse createBusiness(CreateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates components.</p>
     * 
     * @param request CreateComponentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponentWithOptions(CreateComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComponent"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates components.</p>
     * 
     * @param request CreateComponentRequest
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComponentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request CreateComputeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeResourceResponse
     */
    public CreateComputeResourceResponse createComputeResourceWithOptions(CreateComputeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            query.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPropertiesMode)) {
            query.put("ConnectionPropertiesMode", request.connectionPropertiesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request CreateComputeResourceRequest
     * @return CreateComputeResourceResponse
     */
    public CreateComputeResourceResponse createComputeResource(CreateComputeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComputeResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert rule for a synchronization task.</p>
     * 
     * @param tmpReq CreateDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDIAlarmRuleResponse
     */
    public CreateDIAlarmRuleResponse createDIAlarmRuleWithOptions(CreateDIAlarmRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDIAlarmRuleShrinkRequest request = new CreateDIAlarmRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notificationSettings)) {
            request.notificationSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notificationSettings, "NotificationSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerConditions)) {
            request.triggerConditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerConditions, "TriggerConditions", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDIAlarmRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDIAlarmRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert rule for a synchronization task.</p>
     * 
     * @param request CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    public CreateDIAlarmRuleResponse createDIAlarmRule(CreateDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This API operation is available for all DataWorks editions.</p>
     * <ul>
     * <li>You can call this API operation to create a synchronization task. When you call this API operation, you must configure parameters such as SourceDataSourceSettings, DestinationDataSourceSettings, MigrationType, TransformationRules, TableMappings, and JobSettings. The SourceDataSourceSettings parameter defines the settings related to the source. The DestinationDataSourceSettings parameter defines the settings related to the destination. The MigrationType parameter defines the synchronization task type. The TransformationRules parameter defines the transformation rules for objects involved in the synchronization task. The TableMappings parameter defines the mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. The JobSettings parameter defines the settings for the dimension of the synchronization task, including policies for data type mappings between source fields and destination fields and settings for periodic scheduling.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new-version synchronization task.</p>
     * 
     * @param tmpReq CreateDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDIJobResponse
     */
    public CreateDIJobResponse createDIJobWithOptions(CreateDIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDIJobShrinkRequest request = new CreateDIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationDataSourceSettings)) {
            request.destinationDataSourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationDataSourceSettings, "DestinationDataSourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobSettings)) {
            request.jobSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobSettings, "JobSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSettings)) {
            request.resourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSettings, "ResourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceDataSourceSettings)) {
            request.sourceDataSourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceDataSourceSettings, "SourceDataSourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableMappings)) {
            request.tableMappingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableMappings, "TableMappings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transformationRules)) {
            request.transformationRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transformationRules, "TransformationRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationDataSourceType)) {
            query.put("DestinationDataSourceType", request.destinationDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationType)) {
            query.put("MigrationType", request.migrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDataSourceType)) {
            query.put("SourceDataSourceType", request.sourceDataSourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationDataSourceSettingsShrink)) {
            body.put("DestinationDataSourceSettings", request.destinationDataSourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSettingsShrink)) {
            body.put("JobSettings", request.jobSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSettingsShrink)) {
            body.put("ResourceSettings", request.resourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDataSourceSettingsShrink)) {
            body.put("SourceDataSourceSettings", request.sourceDataSourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMappingsShrink)) {
            body.put("TableMappings", request.tableMappingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformationRulesShrink)) {
            body.put("TransformationRules", request.transformationRulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDIJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This API operation is available for all DataWorks editions.</p>
     * <ul>
     * <li>You can call this API operation to create a synchronization task. When you call this API operation, you must configure parameters such as SourceDataSourceSettings, DestinationDataSourceSettings, MigrationType, TransformationRules, TableMappings, and JobSettings. The SourceDataSourceSettings parameter defines the settings related to the source. The DestinationDataSourceSettings parameter defines the settings related to the destination. The MigrationType parameter defines the synchronization task type. The TransformationRules parameter defines the transformation rules for objects involved in the synchronization task. The TableMappings parameter defines the mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. The JobSettings parameter defines the settings for the dimension of the synchronization task, including policies for data type mappings between source fields and destination fields and settings for periodic scheduling.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new-version synchronization task.</p>
     * 
     * @param request CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    public CreateDIJobResponse createDIJob(CreateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a tag.</p>
     * 
     * @param tmpReq CreateDataAssetTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataAssetTagResponse
     */
    public CreateDataAssetTagResponse createDataAssetTagWithOptions(CreateDataAssetTagRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataAssetTagShrinkRequest request = new CreateDataAssetTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.managers)) {
            request.managersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.managers, "Managers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.values)) {
            request.valuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.values, "Values", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managersShrink)) {
            query.put("Managers", request.managersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueType)) {
            query.put("ValueType", request.valueType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valuesShrink)) {
            query.put("Values", request.valuesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataAssetTag"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataAssetTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a tag.</p>
     * 
     * @param request CreateDataAssetTagRequest
     * @return CreateDataAssetTagResponse
     */
    public CreateDataAssetTagResponse createDataAssetTag(CreateDataAssetTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataAssetTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring alert rule in a project.</p>
     * 
     * @param tmpReq CreateDataQualityAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityAlertRuleResponse
     */
    public CreateDataQualityAlertRuleResponse createDataQualityAlertRuleWithOptions(CreateDataQualityAlertRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityAlertRuleShrinkRequest request = new CreateDataQualityAlertRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.target)) {
            request.targetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.target, "Target", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            body.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            body.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetShrink)) {
            body.put("Target", request.targetShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityAlertRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring alert rule in a project.</p>
     * 
     * @param request CreateDataQualityAlertRuleRequest
     * @return CreateDataQualityAlertRuleResponse
     */
    public CreateDataQualityAlertRuleResponse createDataQualityAlertRule(CreateDataQualityAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is supported in all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a monitor in DataWorks Data Quality.</p>
     * 
     * @param tmpReq CreateDataQualityEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityEvaluationTaskResponse
     */
    public CreateDataQualityEvaluationTaskResponse createDataQualityEvaluationTaskWithOptions(CreateDataQualityEvaluationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityEvaluationTaskShrinkRequest request = new CreateDataQualityEvaluationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataQualityRules)) {
            request.dataQualityRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataQualityRules, "DataQualityRules", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hooks)) {
            request.hooksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hooks, "Hooks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifications)) {
            request.notificationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifications, "Notifications", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.target)) {
            request.targetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.target, "Target", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trigger)) {
            request.triggerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trigger, "Trigger", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityRulesShrink)) {
            body.put("DataQualityRules", request.dataQualityRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooksShrink)) {
            body.put("Hooks", request.hooksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationsShrink)) {
            body.put("Notifications", request.notificationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeConf)) {
            body.put("RuntimeConf", request.runtimeConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetShrink)) {
            body.put("Target", request.targetShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerShrink)) {
            body.put("Trigger", request.triggerShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityEvaluationTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityEvaluationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is supported in all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a monitor in DataWorks Data Quality.</p>
     * 
     * @param request CreateDataQualityEvaluationTaskRequest
     * @return CreateDataQualityEvaluationTaskResponse
     */
    public CreateDataQualityEvaluationTaskResponse createDataQualityEvaluationTask(CreateDataQualityEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityEvaluationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitor instance.</p>
     * 
     * @param tmpReq CreateDataQualityEvaluationTaskInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityEvaluationTaskInstanceResponse
     */
    public CreateDataQualityEvaluationTaskInstanceResponse createDataQualityEvaluationTaskInstanceWithOptions(CreateDataQualityEvaluationTaskInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityEvaluationTaskInstanceShrinkRequest request = new CreateDataQualityEvaluationTaskInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimeResource)) {
            request.runtimeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimeResource, "RuntimeResource", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationTaskId)) {
            body.put("DataQualityEvaluationTaskId", request.dataQualityEvaluationTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResourceShrink)) {
            body.put("RuntimeResource", request.runtimeResourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityEvaluationTaskInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityEvaluationTaskInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitor instance.</p>
     * 
     * @param request CreateDataQualityEvaluationTaskInstanceRequest
     * @return CreateDataQualityEvaluationTaskInstanceResponse
     */
    public CreateDataQualityEvaluationTaskInstanceResponse createDataQualityEvaluationTaskInstance(CreateDataQualityEvaluationTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityEvaluationTaskInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring rule.</p>
     * 
     * @param tmpReq CreateDataQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityRuleResponse
     */
    public CreateDataQualityRuleResponse createDataQualityRuleWithOptions(CreateDataQualityRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityRuleShrinkRequest request = new CreateDataQualityRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkingConfig)) {
            request.checkingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkingConfig, "CheckingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.errorHandlers)) {
            request.errorHandlersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.errorHandlers, "ErrorHandlers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.samplingConfig)) {
            request.samplingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.samplingConfig, "SamplingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.target)) {
            request.targetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.target, "Target", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkingConfigShrink)) {
            body.put("CheckingConfig", request.checkingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorHandlersShrink)) {
            body.put("ErrorHandlers", request.errorHandlersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingConfigShrink)) {
            body.put("SamplingConfig", request.samplingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            body.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetShrink)) {
            body.put("Target", request.targetShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring rule.</p>
     * 
     * @param request CreateDataQualityRuleRequest
     * @return CreateDataQualityRuleResponse
     */
    public CreateDataQualityRuleResponse createDataQualityRule(CreateDataQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring rule template.</p>
     * 
     * @param tmpReq CreateDataQualityRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityRuleTemplateResponse
     */
    public CreateDataQualityRuleTemplateResponse createDataQualityRuleTemplateWithOptions(CreateDataQualityRuleTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityRuleTemplateShrinkRequest request = new CreateDataQualityRuleTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkingConfig)) {
            request.checkingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkingConfig, "CheckingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.samplingConfig)) {
            request.samplingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.samplingConfig, "SamplingConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkingConfigShrink)) {
            body.put("CheckingConfig", request.checkingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryPath)) {
            body.put("DirectoryPath", request.directoryPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingConfigShrink)) {
            body.put("SamplingConfig", request.samplingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleScope)) {
            body.put("VisibleScope", request.visibleScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityRuleTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityRuleTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring rule template.</p>
     * 
     * @param request CreateDataQualityRuleTemplateRequest
     * @return CreateDataQualityRuleTemplateResponse
     */
    public CreateDataQualityRuleTemplateResponse createDataQualityRuleTemplate(CreateDataQualityRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality monitor.</p>
     * 
     * @param tmpReq CreateDataQualityScanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityScanResponse
     */
    public CreateDataQualityScanResponse createDataQualityScanWithOptions(CreateDataQualityScanRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityScanShrinkRequest request = new CreateDataQualityScanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.computeResource)) {
            request.computeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.computeResource, "ComputeResource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hooks)) {
            request.hooksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hooks, "Hooks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimeResource)) {
            request.runtimeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimeResource, "RuntimeResource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trigger)) {
            request.triggerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trigger, "Trigger", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeResourceShrink)) {
            body.put("ComputeResource", request.computeResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooksShrink)) {
            body.put("Hooks", request.hooksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            body.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResourceShrink)) {
            body.put("RuntimeResource", request.runtimeResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerShrink)) {
            body.put("Trigger", request.triggerShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityScan"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality monitor.</p>
     * 
     * @param request CreateDataQualityScanRequest
     * @return CreateDataQualityScanResponse
     */
    public CreateDataQualityScanResponse createDataQualityScan(CreateDataQualityScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityScanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a data quality monitoring task and returns the run instance ID.</p>
     * 
     * @param tmpReq CreateDataQualityScanRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityScanRunResponse
     */
    public CreateDataQualityScanRunResponse createDataQualityScanRunWithOptions(CreateDataQualityScanRunRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataQualityScanRunShrinkRequest request = new CreateDataQualityScanRunShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimeResource)) {
            request.runtimeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimeResource, "RuntimeResource", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityScanId)) {
            body.put("DataQualityScanId", request.dataQualityScanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            body.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResourceShrink)) {
            body.put("RuntimeResource", request.runtimeResourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityScanRun"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityScanRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a data quality monitoring task and returns the run instance ID.</p>
     * 
     * @param request CreateDataQualityScanRunRequest
     * @return CreateDataQualityScanRunResponse
     */
    public CreateDataQualityScanRunResponse createDataQualityScanRun(CreateDataQualityScanRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityScanRunWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality template.</p>
     * 
     * @param request CreateDataQualityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataQualityTemplateResponse
     */
    public CreateDataQualityTemplateResponse createDataQualityTemplateWithOptions(CreateDataQualityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataQualityTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataQualityTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality template.</p>
     * 
     * @param request CreateDataQualityTemplateRequest
     * @return CreateDataQualityTemplateResponse
     */
    public CreateDataQualityTemplateResponse createDataQualityTemplate(CreateDataQualityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataQualityTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a data source to the development environment or production environment of a workspace.</p>
     * 
     * @param request CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            query.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPropertiesMode)) {
            query.put("ConnectionPropertiesMode", request.connectionPropertiesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a data source to the development environment or production environment of a workspace.</p>
     * 
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to share a data source from Workspace A to Workspace B, you must have the permissions to share the data source in both workspaces. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for sharing a data source to other workspaces or RAM users.</p>
     * 
     * @param request CreateDataSourceSharedRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceSharedRuleResponse
     */
    public CreateDataSourceSharedRuleResponse createDataSourceSharedRuleWithOptions(CreateDataSourceSharedRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedUser)) {
            query.put("SharedUser", request.sharedUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProjectId)) {
            query.put("TargetProjectId", request.targetProjectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSourceSharedRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceSharedRuleResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to share a data source from Workspace A to Workspace B, you must have the permissions to share the data source in both workspaces. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for sharing a data source to other workspaces or RAM users.</p>
     * 
     * @param request CreateDataSourceSharedRuleRequest
     * @return CreateDataSourceSharedRuleResponse
     */
    public CreateDataSourceSharedRuleResponse createDataSourceSharedRule(CreateDataSourceSharedRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceSharedRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset. This operation is supported only in workspaces that the user has joined. Currently, only DataWorks datasets are supported. The maximum number of datasets allowed per tenant is 2,000.</p>
     * 
     * @param tmpReq CreateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatasetShrinkRequest request = new CreateDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.initVersion)) {
            request.initVersionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.initVersion, "InitVersion", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initVersionShrink)) {
            body.put("InitVersion", request.initVersionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            body.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            body.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataset"),
            new TeaPair("version", "2024-05-18"),
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
     * <b>summary</b> : 
     * <p>Creates a dataset. This operation is supported only in workspaces that the user has joined. Currently, only DataWorks datasets are supported. The maximum number of datasets allowed per tenant is 2,000.</p>
     * 
     * @param request CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset version. Currently supports DataWorks datasets only, with a maximum of 20 versions.</p>
     * 
     * @param tmpReq CreateDatasetVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetVersionResponse
     */
    public CreateDatasetVersionResponse createDatasetVersionWithOptions(CreateDatasetVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatasetVersionShrinkRequest request = new CreateDatasetVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.importInfo)) {
            request.importInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.importInfo, "ImportInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importInfoShrink)) {
            body.put("ImportInfo", request.importInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPath)) {
            body.put("MountPath", request.mountPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatasetVersion"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset version. Currently supports DataWorks datasets only, with a maximum of 20 versions.</p>
     * 
     * @param request CreateDatasetVersionRequest
     * @return CreateDatasetVersionResponse
     */
    public CreateDatasetVersionResponse createDatasetVersion(CreateDatasetVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasetVersionWithOptions(request, runtime);
    }

    /**
     * @param request CreateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileResponse
     */
    public CreateFileResponse createFileWithOptions(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedSettings)) {
            body.put("AdvancedSettings", request.advancedSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyScheduleImmediately)) {
            body.put("ApplyScheduleImmediately", request.applyScheduleImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoParsing)) {
            body.put("AutoParsing", request.autoParsing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunIntervalMillis)) {
            body.put("AutoRerunIntervalMillis", request.autoRerunIntervalMillis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunTimes)) {
            body.put("AutoRerunTimes", request.autoRerunTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            body.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFolderIfNotExists)) {
            body.put("CreateFolderIfNotExists", request.createFolderIfNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpress)) {
            body.put("CronExpress", request.cronExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentNodeIdList)) {
            body.put("DependentNodeIdList", request.dependentNodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentType)) {
            body.put("DependentType", request.dependentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endEffectDate)) {
            body.put("EndEffectDate", request.endEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDescription)) {
            body.put("FileDescription", request.fileDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreParentSkipRunningProperty)) {
            body.put("IgnoreParentSkipRunningProperty", request.ignoreParentSkipRunningProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputList)) {
            body.put("InputList", request.inputList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParameters)) {
            body.put("InputParameters", request.inputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputParameters)) {
            body.put("OutputParameters", request.outputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paraValue)) {
            body.put("ParaValue", request.paraValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunMode)) {
            body.put("RerunMode", request.rerunMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdentifier)) {
            body.put("ResourceGroupIdentifier", request.resourceGroupIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEffectDate)) {
            body.put("StartEffectDate", request.startEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startImmediately)) {
            body.put("StartImmediately", request.startImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            body.put("Stop", request.stop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    /**
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    /**
     * @param request CreateFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderPath)) {
            body.put("FolderPath", request.folderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    /**
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple UDFs at a time. If you specify multiple UDFs by using FlowSpec, the system creates only the first specified UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a user-defined function (UDF) in DataStudio. The information about the UDF is described by using FlowSpec.</p>
     * 
     * @param request CreateFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunctionWithOptions(CreateFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple UDFs at a time. If you specify multiple UDFs by using FlowSpec, the system creates only the first specified UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a user-defined function (UDF) in DataStudio. The information about the UDF is described by using FlowSpec.</p>
     * 
     * @param request CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFunctionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation does not support batch processing. If multiple publishing entities are specified in the parameters, only the first one will be processed; the others will be ignored.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an identity credential.</p>
     * 
     * @param tmpReq CreateIdentifyCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentifyCredentialResponse
     */
    public CreateIdentifyCredentialResponse createIdentifyCredentialWithOptions(CreateIdentifyCredentialRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIdentifyCredentialShrinkRequest request = new CreateIdentifyCredentialShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.identifyCredential)) {
            request.identifyCredentialShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.identifyCredential, "IdentifyCredential", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyCredentialShrink)) {
            body.put("IdentifyCredential", request.identifyCredentialShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentifyCredential"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentifyCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation does not support batch processing. If multiple publishing entities are specified in the parameters, only the first one will be processed; the others will be ignored.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an identity credential.</p>
     * 
     * @param request CreateIdentifyCredentialRequest
     * @return CreateIdentifyCredentialResponse
     */
    public CreateIdentifyCredentialResponse createIdentifyCredential(CreateIdentifyCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdentifyCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lineage between a source entity and a destination entity. Either the source or destination entity must be a custom entity.</p>
     * 
     * @param tmpReq CreateLineageRelationshipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLineageRelationshipResponse
     */
    public CreateLineageRelationshipResponse createLineageRelationshipWithOptions(CreateLineageRelationshipRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLineageRelationshipShrinkRequest request = new CreateLineageRelationshipShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dstEntity)) {
            request.dstEntityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dstEntity, "DstEntity", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.srcEntity)) {
            request.srcEntityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.srcEntity, "SrcEntity", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.task)) {
            request.taskShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.task, "Task", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstEntityShrink)) {
            query.put("DstEntity", request.dstEntityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEntityShrink)) {
            query.put("SrcEntity", request.srcEntityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskShrink)) {
            query.put("Task", request.taskShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLineageRelationship"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLineageRelationshipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lineage between a source entity and a destination entity. Either the source or destination entity must be a custom entity.</p>
     * 
     * @param request CreateLineageRelationshipRequest
     * @return CreateLineageRelationshipResponse
     */
    public CreateLineageRelationshipResponse createLineageRelationship(CreateLineageRelationshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLineageRelationshipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a collection in Data Map. Collections include categories, subcategories, data albums, and categories that are created in the data albums.</p>
     * 
     * @param request CreateMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetaCollectionResponse
     */
    public CreateMetaCollectionResponse createMetaCollectionWithOptions(CreateMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a collection in Data Map. Collections include categories, subcategories, data albums, and categories that are created in the data albums.</p>
     * 
     * @param request CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    public CreateMetaCollectionResponse createMetaCollection(CreateMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a network and associates the network with a general resource group.</p>
     * 
     * @param request CreateNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetworkWithOptions(CreateNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            body.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetwork"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a network and associates the network with a general resource group.</p>
     * 
     * @param request CreateNetworkRequest
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple nodes at a time. If you specify multiple nodes by using FlowSpec, the system creates only the first specified node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a node in DataStudio. The information about the node is described by using FlowSpec.</p>
     * 
     * @param request CreateNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNodeWithOptions(CreateNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerId)) {
            body.put("ContainerId", request.containerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple nodes at a time. If you specify multiple nodes by using FlowSpec, the system creates only the first specified node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a node in DataStudio. The information about the node is described by using FlowSpec.</p>
     * 
     * @param request CreateNodeRequest
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Batch operations are not currently supported. If you specify multiple entities in the parameters, only the first entity takes effect, and the rest are ignored.
     *  This operation may not be available in earlier versions of the SDK. In this case, use the CreateDeployment operation. The parameters for CreateDeployment are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a deployment process for entities in the Data Studio (new version).</p>
     * 
     * @param tmpReq CreatePipelineRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineRunResponse
     */
    public CreatePipelineRunResponse createPipelineRunWithOptions(CreatePipelineRunRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePipelineRunShrinkRequest request = new CreatePipelineRunShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectIds)) {
            request.objectIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectIds, "ObjectIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectIdsShrink)) {
            body.put("ObjectIds", request.objectIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipelineRun"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineRunResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Batch operations are not currently supported. If you specify multiple entities in the parameters, only the first entity takes effect, and the rest are ignored.
     *  This operation may not be available in earlier versions of the SDK. In this case, use the CreateDeployment operation. The parameters for CreateDeployment are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a deployment process for entities in the Data Studio (new version).</p>
     * 
     * @param request CreatePipelineRunRequest
     * @return CreatePipelineRunResponse
     */
    public CreatePipelineRunResponse createPipelineRun(CreatePipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPipelineRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param tmpReq CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aliyunResourceTags)) {
            request.aliyunResourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aliyunResourceTags, "AliyunResourceTags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupId)) {
            body.put("AliyunResourceGroupId", request.aliyunResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceTagsShrink)) {
            body.put("AliyunResourceTags", request.aliyunResourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEnvironmentEnabled)) {
            body.put("DevEnvironmentEnabled", request.devEnvironmentEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devRoleDisabled)) {
            body.put("DevRoleDisabled", request.devRoleDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paiTaskEnabled)) {
            body.put("PaiTaskEnabled", request.paiTaskEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a workspace member and assigns a workspace-level role to the member.</p>
     * 
     * @param tmpReq CreateProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMemberWithOptions(CreateProjectMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectMemberShrinkRequest request = new CreateProjectMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectMember"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a workspace member and assigns a workspace-level role to the member.</p>
     * 
     * @param request CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMember(CreateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Private</p>
     * 
     * <b>summary</b> : 
     * <blockquote>
     * <p> You cannot use this API operation to create multiple file resources at a time. If you specify multiple file resources by using FlowSpec, the system creates only the first specified resource.</p>
     * </blockquote>
     * 
     * @param request CreateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFile)) {
            body.put("ResourceFile", request.resourceFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Private</p>
     * 
     * <b>summary</b> : 
     * <blockquote>
     * <p> You cannot use this API operation to create multiple file resources at a time. If you specify multiple file resources by using FlowSpec, the system creates only the first specified resource.</p>
     * </blockquote>
     * 
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceWithOptions(request, runtime);
    }

    public CreateResourceResponse createResourceAdvance(CreateResourceAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "dataworks-public"),
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
        CreateResourceRequest createResourceReq = new CreateResourceRequest();
        com.aliyun.openapiutil.Client.convert(request, createResourceReq);
        if (!com.aliyun.teautil.Common.isUnset(request.resourceFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.resourceFileObject),
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
            createResourceReq.resourceFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CreateResourceResponse createResourceResp = this.createResourceWithOptions(createResourceReq, runtime);
        return createResourceResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource file in DataStudio. The following types are supported: JAR, Archive, File, and Python.</p>
     * 
     * @param request CreateResourceFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceFileResponse
     */
    public CreateResourceFileResponse createResourceFileWithOptions(CreateResourceFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDescription)) {
            body.put("FileDescription", request.fileDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originResourceName)) {
            body.put("OriginResourceName", request.originResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerToCalcEngine)) {
            body.put("RegisterToCalcEngine", request.registerToCalcEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFile)) {
            body.put("ResourceFile", request.resourceFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageURL)) {
            body.put("StorageURL", request.storageURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMode)) {
            body.put("UploadMode", request.uploadMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource file in DataStudio. The following types are supported: JAR, Archive, File, and Python.</p>
     * 
     * @param request CreateResourceFileRequest
     * @return CreateResourceFileResponse
     */
    public CreateResourceFileResponse createResourceFile(CreateResourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceFileWithOptions(request, runtime);
    }

    public CreateResourceFileResponse createResourceFileAdvance(CreateResourceFileAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "dataworks-public"),
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
        CreateResourceFileRequest createResourceFileReq = new CreateResourceFileRequest();
        com.aliyun.openapiutil.Client.convert(request, createResourceFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.resourceFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.resourceFileObject),
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
            createResourceFileReq.resourceFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CreateResourceFileResponse createResourceFileResp = this.createResourceFileWithOptions(createResourceFileReq, runtime);
        return createResourceFileResp;
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>**Before you call this API operation, you must make sure that you have a good command of the billing details and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of serverless resource groups.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a serverless resource group.</p>
     * 
     * @param tmpReq CreateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateResourceGroupShrinkRequest request = new CreateResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aliyunResourceTags)) {
            request.aliyunResourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aliyunResourceTags, "AliyunResourceTags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupId)) {
            body.put("AliyunResourceGroupId", request.aliyunResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceTagsShrink)) {
            body.put("AliyunResourceTags", request.aliyunResourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewEnabled)) {
            body.put("AutoRenewEnabled", request.autoRenewEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            body.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            body.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            body.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>**Before you call this API operation, you must make sure that you have a good command of the billing details and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of serverless resource groups.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a serverless resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a route for a network.</p>
     * 
     * @param request CreateRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRouteResponse
     */
    public CreateRouteResponse createRouteWithOptions(CreateRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            body.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            body.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a route for a network.</p>
     * 
     * @param request CreateRouteRequest
     * @return CreateRouteResponse
     */
    public CreateRouteResponse createRoute(CreateRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouteWithOptions(request, runtime);
    }

    /**
     * @param request CreateUdfFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUdfFileResponse
     */
    public CreateUdfFileResponse createUdfFileWithOptions(CreateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("ClassName", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdDescription)) {
            body.put("CmdDescription", request.cmdDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFolderIfNotExists)) {
            body.put("CreateFolderIfNotExists", request.createFolderIfNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.example)) {
            body.put("Example", request.example);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            body.put("FunctionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterDescription)) {
            body.put("ParameterDescription", request.parameterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnValue)) {
            body.put("ReturnValue", request.returnValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udfDescription)) {
            body.put("UdfDescription", request.udfDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUdfFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUdfFileResponse());
    }

    /**
     * @param request CreateUdfFileRequest
     * @return CreateUdfFileResponse
     */
    public CreateUdfFileResponse createUdfFile(CreateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUdfFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system creates only the first specified workflow. Other specified workflows and the nodes in the workflows are ignored. You can call the CreateNode operation to create a node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow in a directory of DataStudio.</p>
     * 
     * @param request CreateWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkflowDefinitionResponse
     */
    public CreateWorkflowDefinitionResponse createWorkflowDefinitionWithOptions(CreateWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkflowDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system creates only the first specified workflow. Other specified workflows and the nodes in the workflows are ignored. You can call the CreateNode operation to create a node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow in a directory of DataStudio.</p>
     * 
     * @param request CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    public CreateWorkflowDefinitionResponse createWorkflowDefinition(CreateWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow instance, such as a data backfill workflow instance, based on configurations.</p>
     * 
     * @param tmpReq CreateWorkflowInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkflowInstancesResponse
     */
    public CreateWorkflowInstancesResponse createWorkflowInstancesWithOptions(CreateWorkflowInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkflowInstancesShrinkRequest request = new CreateWorkflowInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultRunProperties)) {
            request.defaultRunPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultRunProperties, "DefaultRunProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.periods)) {
            request.periodsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.periods, "Periods", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStartEnabled)) {
            body.put("AutoStartEnabled", request.autoStartEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRunPropertiesShrink)) {
            body.put("DefaultRunProperties", request.defaultRunPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodsShrink)) {
            body.put("Periods", request.periodsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCreationPolicy)) {
            body.put("TagCreationPolicy", request.tagCreationPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParameters)) {
            body.put("TaskParameters", request.taskParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowParameters)) {
            body.put("WorkflowParameters", request.workflowParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkflowInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkflowInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow instance, such as a data backfill workflow instance, based on configurations.</p>
     * 
     * @param request CreateWorkflowInstancesRequest
     * @return CreateWorkflowInstancesResponse
     */
    public CreateWorkflowInstancesResponse createWorkflowInstances(CreateWorkflowInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkflowInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom monitoring alert rule.</p>
     * 
     * @param request DeleteAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRuleWithOptions(DeleteAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom monitoring alert rule.</p>
     * 
     * @param request DeleteAlertRuleRequest
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBusinessResponse
     */
    public DeleteBusinessResponse deleteBusinessWithOptions(DeleteBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBusiness"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBusinessResponse());
    }

    /**
     * @param request DeleteBusinessRequest
     * @return DeleteBusinessResponse
     */
    public DeleteBusinessResponse deleteBusiness(DeleteBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusinessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a certificate file.</p>
     * 
     * @param request DeleteCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificateWithOptions(DeleteCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCertificate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a certificate file.</p>
     * 
     * @param request DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a component.</p>
     * 
     * @param request DeleteComponentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponentWithOptions(DeleteComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentId)) {
            body.put("ComponentId", request.componentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComponent"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComponentResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a component.</p>
     * 
     * @param request DeleteComponentRequest
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComponentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request DeleteComputeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComputeResourceResponse
     */
    public DeleteComputeResourceResponse deleteComputeResourceWithOptions(DeleteComputeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComputeResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComputeResourceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request DeleteComputeResourceRequest
     * @return DeleteComputeResourceResponse
     */
    public DeleteComputeResourceResponse deleteComputeResource(DeleteComputeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComputeResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule configured for a synchronization task.</p>
     * 
     * @param request DeleteDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDIAlarmRuleResponse
     */
    public DeleteDIAlarmRuleResponse deleteDIAlarmRuleWithOptions(DeleteDIAlarmRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDIAlarmRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDIAlarmRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule configured for a synchronization task.</p>
     * 
     * @param request DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    public DeleteDIAlarmRuleResponse deleteDIAlarmRule(DeleteDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a new-version synchronization task.</p>
     * 
     * @param request DeleteDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJobWithOptions(DeleteDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDIJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a new-version synchronization task.</p>
     * 
     * @param request DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJob(DeleteDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a tag.</p>
     * 
     * @param tmpReq DeleteDataAssetTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataAssetTagResponse
     */
    public DeleteDataAssetTagResponse deleteDataAssetTagWithOptions(DeleteDataAssetTagRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDataAssetTagShrinkRequest request = new DeleteDataAssetTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.values)) {
            request.valuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.values, "Values", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valuesShrink)) {
            query.put("Values", request.valuesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataAssetTag"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataAssetTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a tag.</p>
     * 
     * @param request DeleteDataAssetTagRequest
     * @return DeleteDataAssetTagResponse
     */
    public DeleteDataAssetTagResponse deleteDataAssetTag(DeleteDataAssetTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataAssetTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Subscribe to DataWorks Basic Edition or a higher version to use this API.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data quality alert rule by ID.</p>
     * 
     * @param request DeleteDataQualityAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataQualityAlertRuleResponse
     */
    public DeleteDataQualityAlertRuleResponse deleteDataQualityAlertRuleWithOptions(DeleteDataQualityAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataQualityAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataQualityAlertRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Subscribe to DataWorks Basic Edition or a higher version to use this API.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data quality alert rule by ID.</p>
     * 
     * @param request DeleteDataQualityAlertRuleRequest
     * @return DeleteDataQualityAlertRuleResponse
     */
    public DeleteDataQualityAlertRuleResponse deleteDataQualityAlertRule(DeleteDataQualityAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataQualityAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data quality monitoring task.</p>
     * 
     * @param request DeleteDataQualityEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataQualityEvaluationTaskResponse
     */
    public DeleteDataQualityEvaluationTaskResponse deleteDataQualityEvaluationTaskWithOptions(DeleteDataQualityEvaluationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataQualityEvaluationTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataQualityEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data quality monitoring task.</p>
     * 
     * @param request DeleteDataQualityEvaluationTaskRequest
     * @return DeleteDataQualityEvaluationTaskResponse
     */
    public DeleteDataQualityEvaluationTaskResponse deleteDataQualityEvaluationTask(DeleteDataQualityEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataQualityEvaluationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data quality monitoring rule.</p>
     * 
     * @param request DeleteDataQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataQualityRuleResponse
     */
    public DeleteDataQualityRuleResponse deleteDataQualityRuleWithOptions(DeleteDataQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataQualityRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataQualityRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data quality monitoring rule.</p>
     * 
     * @param request DeleteDataQualityRuleRequest
     * @return DeleteDataQualityRuleResponse
     */
    public DeleteDataQualityRuleResponse deleteDataQualityRule(DeleteDataQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data quality monitoring rule template.</p>
     * 
     * @param request DeleteDataQualityRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataQualityRuleTemplateResponse
     */
    public DeleteDataQualityRuleTemplateResponse deleteDataQualityRuleTemplateWithOptions(DeleteDataQualityRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataQualityRuleTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataQualityRuleTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data quality monitoring rule template.</p>
     * 
     * @param request DeleteDataQualityRuleTemplateRequest
     * @return DeleteDataQualityRuleTemplateResponse
     */
    public DeleteDataQualityRuleTemplateResponse deleteDataQualityRuleTemplate(DeleteDataQualityRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataQualityRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data quality monitor.</p>
     * 
     * @param request DeleteDataQualityScanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataQualityScanResponse
     */
    public DeleteDataQualityScanResponse deleteDataQualityScanWithOptions(DeleteDataQualityScanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataQualityScan"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataQualityScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data quality monitor.</p>
     * 
     * @param request DeleteDataQualityScanRequest
     * @return DeleteDataQualityScanResponse
     */
    public DeleteDataQualityScanResponse deleteDataQualityScan(DeleteDataQualityScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataQualityScanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Request description</h2>
     * <ul>
     * <li><strong>Id</strong>: the unique identifier of the user-defined rule template, in the format <code>USER_DEFINED:&lt;template_id&gt;</code>.</li>
     * <li><strong>ProjectId</strong>: The ID of the DataWorks project to which the rule template belongs.
     * This API is used to remove data quality rule templates that are no longer needed from the system. Make sure the provided <code>Id</code> and <code>ProjectId</code> are correct when calling this API operation; otherwise, the deletion may fail or lead to unexpected data loss. Use this function with caution and verify the exact information of the template before performing the operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data quality rule template by ID.</p>
     * 
     * @param request DeleteDataQualityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataQualityTemplateResponse
     */
    public DeleteDataQualityTemplateResponse deleteDataQualityTemplateWithOptions(DeleteDataQualityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataQualityTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataQualityTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Request description</h2>
     * <ul>
     * <li><strong>Id</strong>: the unique identifier of the user-defined rule template, in the format <code>USER_DEFINED:&lt;template_id&gt;</code>.</li>
     * <li><strong>ProjectId</strong>: The ID of the DataWorks project to which the rule template belongs.
     * This API is used to remove data quality rule templates that are no longer needed from the system. Make sure the provided <code>Id</code> and <code>ProjectId</code> are correct when calling this API operation; otherwise, the deletion may fail or lead to unexpected data loss. Use this function with caution and verify the exact information of the template before performing the operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data quality rule template by ID.</p>
     * 
     * @param request DeleteDataQualityTemplateRequest
     * @return DeleteDataQualityTemplateResponse
     */
    public DeleteDataQualityTemplateResponse deleteDataQualityTemplate(DeleteDataQualityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataQualityTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all Dataworks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a data source by ID.</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all Dataworks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a data source by ID.</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to delete a sharing rule of a data source from Workspace A to Workspace B, you must have the permissions to share the data source in Workspace A or Workspace B. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a sharing rule of a data source by ID.</p>
     * 
     * @param request DeleteDataSourceSharedRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceSharedRuleResponse
     */
    public DeleteDataSourceSharedRuleResponse deleteDataSourceSharedRuleWithOptions(DeleteDataSourceSharedRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSourceSharedRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceSharedRuleResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to delete a sharing rule of a data source from Workspace A to Workspace B, you must have the permissions to share the data source in Workspace A or Workspace B. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a sharing rule of a data source by ID.</p>
     * 
     * @param request DeleteDataSourceSharedRuleRequest
     * @return DeleteDataSourceSharedRuleResponse
     */
    public DeleteDataSourceSharedRuleResponse deleteDataSourceSharedRule(DeleteDataSourceSharedRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceSharedRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a dataset. Only DataWorks datasets are supported. This operation cascades to delete all associated dataset versions. Requires dataset creator or workspace administrator permissions.</p>
     * 
     * @param request DeleteDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDatasetWithOptions(DeleteDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataset"),
            new TeaPair("version", "2024-05-18"),
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
     * <b>summary</b> : 
     * <p>Delete a dataset. Only DataWorks datasets are supported. This operation cascades to delete all associated dataset versions. Requires dataset creator or workspace administrator permissions.</p>
     * 
     * @param request DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset version. Only non-v1 DataWorks datasets are supported. To delete v1 datasets, use the DeleteDataset operation. Requires dataset creator or workspace administrator permissions.</p>
     * 
     * @param request DeleteDatasetVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetVersionResponse
     */
    public DeleteDatasetVersionResponse deleteDatasetVersionWithOptions(DeleteDatasetVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatasetVersion"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset version. Only non-v1 DataWorks datasets are supported. To delete v1 datasets, use the DeleteDataset operation. Requires dataset creator or workspace administrator permissions.</p>
     * 
     * @param request DeleteDatasetVersionRequest
     * @return DeleteDatasetVersionResponse
     */
    public DeleteDatasetVersionResponse deleteDatasetVersion(DeleteDatasetVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasetVersionWithOptions(request, runtime);
    }

    /**
     * @param request DeleteFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    /**
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    /**
     * @param request DeleteFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    /**
     * @param request DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request DeleteFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunctionWithOptions(DeleteFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除血缘关系</p>
     * 
     * @param request DeleteLineageRelationshipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLineageRelationshipResponse
     */
    public DeleteLineageRelationshipResponse deleteLineageRelationshipWithOptions(DeleteLineageRelationshipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLineageRelationship"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLineageRelationshipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除血缘关系</p>
     * 
     * @param request DeleteLineageRelationshipRequest
     * @return DeleteLineageRelationshipResponse
     */
    public DeleteLineageRelationshipResponse deleteLineageRelationship(DeleteLineageRelationshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLineageRelationshipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除集合</p>
     * 
     * @param request DeleteMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetaCollectionResponse
     */
    public DeleteMetaCollectionResponse deleteMetaCollectionWithOptions(DeleteMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除集合</p>
     * 
     * @param request DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    public DeleteMetaCollectionResponse deleteMetaCollection(DeleteMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates and deletes a network from a general resource group.</p>
     * 
     * @param request DeleteNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetworkWithOptions(DeleteNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetwork"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates and deletes a network from a general resource group.</p>
     * 
     * @param request DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A node that is deployed cannot be deleted. If you want to delete such a node, you must first undeploy the node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a node from DataStudio.</p>
     * 
     * @param request DeleteNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNodeWithOptions(DeleteNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A node that is deployed cannot be deleted. If you want to delete such a node, you must first undeploy the node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a node from DataStudio.</p>
     * 
     * @param request DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a DataWorks workspace.</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a DataWorks workspace.</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a workspace member and the workspace-level roles that are assigned to the member.</p>
     * 
     * @param request DeleteProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMemberWithOptions(DeleteProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectMember"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a workspace member and the workspace-level roles that are assigned to the member.</p>
     * 
     * @param request DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMember(DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A file resource that is deployed cannot be deleted. If you want to delete such a file resource, you must first undeploy the file resource.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file resource from DataStudio.</p>
     * 
     * @param request DeleteResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResourceWithOptions(DeleteResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A file resource that is deployed cannot be deleted. If you want to delete such a file resource, you must first undeploy the file resource.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file resource from DataStudio.</p>
     * 
     * @param request DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>**Before you call this API operation, you must make sure that you have a good command of the billing details and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of serverless resource groups.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a serverless resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(DeleteResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>**Before you call this API operation, you must make sure that you have a good command of the billing details and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of serverless resource groups.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a serverless resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route from a network resource.</p>
     * 
     * @param request DeleteRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteResponse
     */
    public DeleteRouteResponse deleteRouteWithOptions(DeleteRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route from a network resource.</p>
     * 
     * @param request DeleteRouteRequest
     * @return DeleteRouteResponse
     */
    public DeleteRouteResponse deleteRoute(DeleteRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a task.</p>
     * 
     * @param request DeleteTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(DeleteTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            query.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a task.</p>
     * 
     * @param request DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow.</p>
     * 
     * @param request DeleteWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflowWithOptions(DeleteWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientUniqueCode)) {
            body.put("ClientUniqueCode", request.clientUniqueCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflow"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow.</p>
     * 
     * @param request DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A workflow that is deployed cannot be deleted. If you want to delete such a workflow, you must first undeploy the workflow.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow from DataStudio.</p>
     * 
     * @param request DeleteWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowDefinitionResponse
     */
    public DeleteWorkflowDefinitionResponse deleteWorkflowDefinitionWithOptions(DeleteWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A workflow that is deployed cannot be deleted. If you want to delete such a workflow, you must first undeploy the workflow.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow from DataStudio.</p>
     * 
     * @param request DeleteWorkflowDefinitionRequest
     * @return DeleteWorkflowDefinitionResponse
     */
    public DeleteWorkflowDefinitionResponse deleteWorkflowDefinition(DeleteWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * @param request DeployFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployFileResponse
     */
    public DeployFileResponse deployFileWithOptions(DeployFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployFileResponse());
    }

    /**
     * @param request DeployFileRequest
     * @return DeployFileResponse
     */
    public DeployFileResponse deployFile(DeployFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates monitoring rules from a data quality monitoring task.</p>
     * 
     * @param tmpReq DetachDataQualityRulesFromEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachDataQualityRulesFromEvaluationTaskResponse
     */
    public DetachDataQualityRulesFromEvaluationTaskResponse detachDataQualityRulesFromEvaluationTaskWithOptions(DetachDataQualityRulesFromEvaluationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachDataQualityRulesFromEvaluationTaskShrinkRequest request = new DetachDataQualityRulesFromEvaluationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataQualityRuleIds)) {
            request.dataQualityRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataQualityRuleIds, "DataQualityRuleIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationTaskId)) {
            body.put("DataQualityEvaluationTaskId", request.dataQualityEvaluationTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityRuleIdsShrink)) {
            body.put("DataQualityRuleIds", request.dataQualityRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDataQualityRulesFromEvaluationTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDataQualityRulesFromEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates monitoring rules from a data quality monitoring task.</p>
     * 
     * @param request DetachDataQualityRulesFromEvaluationTaskRequest
     * @return DetachDataQualityRulesFromEvaluationTaskResponse
     */
    public DetachDataQualityRulesFromEvaluationTaskResponse detachDataQualityRulesFromEvaluationTask(DetachDataQualityRulesFromEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDataQualityRulesFromEvaluationTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a resource group from a workspace.</p>
     * 
     * @param request DissociateProjectFromResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateProjectFromResourceGroupResponse
     */
    public DissociateProjectFromResourceGroupResponse dissociateProjectFromResourceGroupWithOptions(DissociateProjectFromResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateProjectFromResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateProjectFromResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a resource group from a workspace.</p>
     * 
     * @param request DissociateProjectFromResourceGroupRequest
     * @return DissociateProjectFromResourceGroupResponse
     */
    public DissociateProjectFromResourceGroupResponse dissociateProjectFromResourceGroup(DissociateProjectFromResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateProjectFromResourceGroupWithOptions(request, runtime);
    }

    /**
     * @param request EstablishRelationTableToBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EstablishRelationTableToBusinessResponse
     */
    public EstablishRelationTableToBusinessResponse establishRelationTableToBusinessWithOptions(EstablishRelationTableToBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            body.put("TableGuid", request.tableGuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EstablishRelationTableToBusiness"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstablishRelationTableToBusinessResponse());
    }

    /**
     * @param request EstablishRelationTableToBusinessRequest
     * @return EstablishRelationTableToBusinessResponse
     */
    public EstablishRelationTableToBusinessResponse establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.establishRelationTableToBusinessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The stages in a process are sequential. For more information, see the GetDeployment operation. Skipping or repeating a stage is not allowed.
     *  The execution of a stage is asynchronous. The response of this operation indicates only whether a stage is triggered but does not indicate whether the execution of the stage is successful. You can call the GetDeployment operation to check whether the execution is successful.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Executes a stage in a process.</p>
     * 
     * @param request ExecPipelineRunStageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecPipelineRunStageResponse
     */
    public ExecPipelineRunStageResponse execPipelineRunStageWithOptions(ExecPipelineRunStageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecPipelineRunStage"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecPipelineRunStageResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The stages in a process are sequential. For more information, see the GetDeployment operation. Skipping or repeating a stage is not allowed.
     *  The execution of a stage is asynchronous. The response of this operation indicates only whether a stage is triggered but does not indicate whether the execution of the stage is successful. You can call the GetDeployment operation to check whether the execution is successful.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Executes a stage in a process.</p>
     * 
     * @param request ExecPipelineRunStageRequest
     * @return ExecPipelineRunStageResponse
     */
    public ExecPipelineRunStageResponse execPipelineRunStage(ExecPipelineRunStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execPipelineRunStageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a temporary workflow instance based on configurations.</p>
     * 
     * @param tmpReq ExecuteAdhocWorkflowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAdhocWorkflowInstanceResponse
     */
    public ExecuteAdhocWorkflowInstanceResponse executeAdhocWorkflowInstanceWithOptions(ExecuteAdhocWorkflowInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteAdhocWorkflowInstanceShrinkRequest request = new ExecuteAdhocWorkflowInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tasks)) {
            request.tasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tasks, "Tasks", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tasksShrink)) {
            body.put("Tasks", request.tasksShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAdhocWorkflowInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAdhocWorkflowInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a temporary workflow instance based on configurations.</p>
     * 
     * @param request ExecuteAdhocWorkflowInstanceRequest
     * @return ExecuteAdhocWorkflowInstanceResponse
     */
    public ExecuteAdhocWorkflowInstanceResponse executeAdhocWorkflowInstance(ExecuteAdhocWorkflowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeAdhocWorkflowInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a custom alert monitoring rule.</p>
     * 
     * @param request GetAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertRuleResponse
     */
    public GetAlertRuleResponse getAlertRuleWithOptions(GetAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a custom alert monitoring rule.</p>
     * 
     * @param request GetAlertRuleRequest
     * @return GetAlertRuleResponse
     */
    public GetAlertRuleResponse getAlertRule(GetAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertRuleWithOptions(request, runtime);
    }

    /**
     * @param request GetBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBusinessResponse
     */
    public GetBusinessResponse getBusinessWithOptions(GetBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBusiness"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBusinessResponse());
    }

    /**
     * @param request GetBusinessRequest
     * @return GetBusinessResponse
     */
    public GetBusinessResponse getBusiness(GetBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据目录详情</p>
     * 
     * @param request GetCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalogWithOptions(GetCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalog"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据目录详情</p>
     * 
     * @param request GetCatalogRequest
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalog(GetCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCatalogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries a certificate file.</p>
     * 
     * @param request GetCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificateWithOptions(GetCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertificate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries a certificate file.</p>
     * 
     * @param request GetCertificateRequest
     * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取字段详情</p>
     * 
     * @param request GetColumnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetColumnResponse
     */
    public GetColumnResponse getColumnWithOptions(GetColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetColumn"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetColumnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取字段详情</p>
     * 
     * @param request GetColumnRequest
     * @return GetColumnResponse
     */
    public GetColumnResponse getColumn(GetColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getColumnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Gets component information.</p>
     * 
     * @param request GetComponentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComponentResponse
     */
    public GetComponentResponse getComponentWithOptions(GetComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentId)) {
            query.put("ComponentId", request.componentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComponent"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComponentResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Gets component information.</p>
     * 
     * @param request GetComponentRequest
     * @return GetComponentResponse
     */
    public GetComponentResponse getComponent(GetComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComponentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request GetComputeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeResourceResponse
     */
    public GetComputeResourceResponse getComputeResourceWithOptions(GetComputeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request GetComputeResourceRequest
     * @return GetComputeResourceResponse
     */
    public GetComputeResourceResponse getComputeResource(GetComputeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComputeResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of asynchronously creating a workflow instance.</p>
     * 
     * @param request GetCreateWorkflowInstancesResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreateWorkflowInstancesResultResponse
     */
    public GetCreateWorkflowInstancesResultResponse getCreateWorkflowInstancesResultWithOptions(GetCreateWorkflowInstancesResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreateWorkflowInstancesResult"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreateWorkflowInstancesResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of asynchronously creating a workflow instance.</p>
     * 
     * @param request GetCreateWorkflowInstancesResultRequest
     * @return GetCreateWorkflowInstancesResultResponse
     */
    public GetCreateWorkflowInstancesResultResponse getCreateWorkflowInstancesResult(GetCreateWorkflowInstancesResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreateWorkflowInstancesResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a synchronization task.</p>
     * 
     * @param request GetDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIJobResponse
     */
    public GetDIJobResponse getDIJobWithOptions(GetDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a synchronization task.</p>
     * 
     * @param request GetDIJobRequest
     * @return GetDIJobResponse
     */
    public GetDIJobResponse getDIJob(GetDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains logs generated for a synchronization task.</p>
     * 
     * @param request GetDIJobLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIJobLogResponse
     */
    public GetDIJobLogResponse getDIJobLogWithOptions(GetDIJobLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDIJobLog"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIJobLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains logs generated for a synchronization task.</p>
     * 
     * @param request GetDIJobLogRequest
     * @return GetDIJobLogResponse
     */
    public GetDIJobLogResponse getDIJobLog(GetDIJobLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIJobLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a data quality monitoring and alerting rule by alert rule ID.</p>
     * 
     * @param request GetDataQualityAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityAlertRuleResponse
     */
    public GetDataQualityAlertRuleResponse getDataQualityAlertRuleWithOptions(GetDataQualityAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityAlertRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a data quality monitoring and alerting rule by alert rule ID.</p>
     * 
     * @param request GetDataQualityAlertRuleRequest
     * @return GetDataQualityAlertRuleResponse
     */
    public GetDataQualityAlertRuleResponse getDataQualityAlertRule(GetDataQualityAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a monitor.</p>
     * 
     * @param request GetDataQualityEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityEvaluationTaskResponse
     */
    public GetDataQualityEvaluationTaskResponse getDataQualityEvaluationTaskWithOptions(GetDataQualityEvaluationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityEvaluationTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a monitor.</p>
     * 
     * @param request GetDataQualityEvaluationTaskRequest
     * @return GetDataQualityEvaluationTaskResponse
     */
    public GetDataQualityEvaluationTaskResponse getDataQualityEvaluationTask(GetDataQualityEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityEvaluationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a monitor instance.</p>
     * 
     * @param request GetDataQualityEvaluationTaskInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityEvaluationTaskInstanceResponse
     */
    public GetDataQualityEvaluationTaskInstanceResponse getDataQualityEvaluationTaskInstanceWithOptions(GetDataQualityEvaluationTaskInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityEvaluationTaskInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityEvaluationTaskInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a monitor instance.</p>
     * 
     * @param request GetDataQualityEvaluationTaskInstanceRequest
     * @return GetDataQualityEvaluationTaskInstanceResponse
     */
    public GetDataQualityEvaluationTaskInstanceResponse getDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityEvaluationTaskInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a data quality monitoring rule.</p>
     * 
     * @param request GetDataQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityRuleResponse
     */
    public GetDataQualityRuleResponse getDataQualityRuleWithOptions(GetDataQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a data quality monitoring rule.</p>
     * 
     * @param request GetDataQualityRuleRequest
     * @return GetDataQualityRuleResponse
     */
    public GetDataQualityRuleResponse getDataQualityRule(GetDataQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a data quality monitoring rule template.</p>
     * 
     * @param request GetDataQualityRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityRuleTemplateResponse
     */
    public GetDataQualityRuleTemplateResponse getDataQualityRuleTemplateWithOptions(GetDataQualityRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityRuleTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityRuleTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a data quality monitoring rule template.</p>
     * 
     * @param request GetDataQualityRuleTemplateRequest
     * @return GetDataQualityRuleTemplateResponse
     */
    public GetDataQualityRuleTemplateResponse getDataQualityRuleTemplate(GetDataQualityRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets data quality monitoring details.</p>
     * 
     * @param request GetDataQualityScanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityScanResponse
     */
    public GetDataQualityScanResponse getDataQualityScanWithOptions(GetDataQualityScanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityScan"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets data quality monitoring details.</p>
     * 
     * @param request GetDataQualityScanRequest
     * @return GetDataQualityScanResponse
     */
    public GetDataQualityScanResponse getDataQualityScan(GetDataQualityScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityScanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring run instance.</p>
     * 
     * @param request GetDataQualityScanRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityScanRunResponse
     */
    public GetDataQualityScanRunResponse getDataQualityScanRunWithOptions(GetDataQualityScanRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityScanRun"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityScanRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data quality monitoring run instance.</p>
     * 
     * @param request GetDataQualityScanRunRequest
     * @return GetDataQualityScanRunResponse
     */
    public GetDataQualityScanRunResponse getDataQualityScanRun(GetDataQualityScanRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityScanRunWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of a specific task instance that monitors data quality.</p>
     * 
     * @param request GetDataQualityScanRunLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityScanRunLogResponse
     */
    public GetDataQualityScanRunLogResponse getDataQualityScanRunLogWithOptions(GetDataQualityScanRunLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityScanRunLog"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityScanRunLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of a specific task instance that monitors data quality.</p>
     * 
     * @param request GetDataQualityScanRunLogRequest
     * @return GetDataQualityScanRunLogResponse
     */
    public GetDataQualityScanRunLogResponse getDataQualityScanRunLog(GetDataQualityScanRunLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityScanRunLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a data quality rule template by ID.</p>
     * 
     * @param request GetDataQualityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityTemplateResponse
     */
    public GetDataQualityTemplateResponse getDataQualityTemplateWithOptions(GetDataQualityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a data quality rule template by ID.</p>
     * 
     * @param request GetDataQualityTemplateRequest
     * @return GetDataQualityTemplateResponse
     */
    public GetDataQualityTemplateResponse getDataQualityTemplate(GetDataQualityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataQualityTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Development, Project Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a data source by ID.</p>
     * 
     * @param request GetDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceResponse
     */
    public GetDataSourceResponse getDataSourceWithOptions(GetDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Development, Project Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a data source by ID.</p>
     * 
     * @param request GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    public GetDataSourceResponse getDataSource(GetDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据库详情</p>
     * 
     * @param request GetDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabase"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据库详情</p>
     * 
     * @param request GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集详情</p>
     * 
     * @param request GetDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDatasetWithOptions(GetDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataset"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集详情</p>
     * 
     * @param request GetDatasetRequest
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDataset(GetDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets information for a given dataset version.</p>
     * 
     * @param request GetDatasetVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetVersionResponse
     */
    public GetDatasetVersionResponse getDatasetVersionWithOptions(GetDatasetVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatasetVersion"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets information for a given dataset version.</p>
     * 
     * @param request GetDatasetVersionRequest
     * @return GetDatasetVersionResponse
     */
    public GetDatasetVersionResponse getDatasetVersion(GetDatasetVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatasetVersionWithOptions(request, runtime);
    }

    /**
     * @param request GetDeploymentPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentPackageResponse
     */
    public GetDeploymentPackageResponse getDeploymentPackageWithOptions(GetDeploymentPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            body.put("DeploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeploymentPackage"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentPackageResponse());
    }

    /**
     * @param request GetDeploymentPackageRequest
     * @return GetDeploymentPackageResponse
     */
    public GetDeploymentPackageResponse getDeploymentPackage(GetDeploymentPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file.</p>
     * 
     * @param request GetFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileResponse
     */
    public GetFileResponse getFileWithOptions(GetFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file.</p>
     * 
     * @param request GetFileRequest
     * @return GetFileResponse
     */
    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file version.</p>
     * 
     * @param request GetFileVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileVersionResponse
     */
    public GetFileVersionResponse getFileVersionWithOptions(GetFileVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileVersion)) {
            body.put("FileVersion", request.fileVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileVersion"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file version.</p>
     * 
     * @param request GetFileVersionRequest
     * @return GetFileVersionResponse
     */
    public GetFileVersionResponse getFileVersion(GetFileVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileVersionWithOptions(request, runtime);
    }

    /**
     * @param request GetFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderPath)) {
            body.put("FolderPath", request.folderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFolder"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFolderResponse());
    }

    /**
     * @param request GetFolderRequest
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request GetFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunctionWithOptions(GetFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request GetFunctionRequest
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunction(GetFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data snapshot of an extension point based on the ID of a message in DataWorks OpenEvent when the related extension point event is triggered.</p>
     * 
     * @param request GetIDEEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIDEEventDetailResponse
     */
    public GetIDEEventDetailResponse getIDEEventDetailWithOptions(GetIDEEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIDEEventDetail"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIDEEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data snapshot of an extension point based on the ID of a message in DataWorks OpenEvent when the related extension point event is triggered.</p>
     * 
     * @param request GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    public GetIDEEventDetailResponse getIDEEventDetail(GetIDEEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIDEEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status information of an asynchronous task. After you call an asynchronous operation, an asynchronous task is generated. You can call the GetJobStatus operation to query the status of the asynchronous task.</p>
     * 
     * @param request GetJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobStatusResponse
     */
    public GetJobStatusResponse getJobStatusWithOptions(GetJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobStatus"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status information of an asynchronous task. After you call an asynchronous operation, an asynchronous task is generated. You can call the GetJobStatus operation to query the status of the asynchronous task.</p>
     * 
     * @param request GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    public GetJobStatusResponse getJobStatus(GetJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取血缘关系详情</p>
     * 
     * @param request GetLineageRelationshipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLineageRelationshipResponse
     */
    public GetLineageRelationshipResponse getLineageRelationshipWithOptions(GetLineageRelationshipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLineageRelationship"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLineageRelationshipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取血缘关系详情</p>
     * 
     * @param request GetLineageRelationshipRequest
     * @return GetLineageRelationshipResponse
     */
    public GetLineageRelationshipResponse getLineageRelationship(GetLineageRelationshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLineageRelationshipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a collection in Data Map. Collections include categories and data albums.</p>
     * 
     * @param request GetMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaCollectionResponse
     */
    public GetMetaCollectionResponse getMetaCollectionWithOptions(GetMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a collection in Data Map. Collections include categories and data albums.</p>
     * 
     * @param request GetMetaCollectionRequest
     * @return GetMetaCollectionResponse
     */
    public GetMetaCollectionResponse getMetaCollection(GetMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a network resource.</p>
     * 
     * @param request GetNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkResponse
     */
    public GetNetworkResponse getNetworkWithOptions(GetNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetwork"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a network resource.</p>
     * 
     * @param request GetNetworkRequest
     * @return GetNetworkResponse
     */
    public GetNetworkResponse getNetwork(GetNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a node in DataStudio.</p>
     * 
     * @param request GetNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeResponse
     */
    public GetNodeResponse getNodeWithOptions(GetNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a node in DataStudio.</p>
     * 
     * @param request GetNodeRequest
     * @return GetNodeResponse
     */
    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>This operation supports MaxCompute and HMS (EMR cluster) tables only.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves partition details for a data map table. Currently supports MaxCompute and HMS (EMR cluster) types only.</p>
     * 
     * @param request GetPartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPartitionResponse
     */
    public GetPartitionResponse getPartitionWithOptions(GetPartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPartition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPartitionResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>This operation supports MaxCompute and HMS (EMR cluster) tables only.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves partition details for a data map table. Currently supports MaxCompute and HMS (EMR cluster) types only.</p>
     * 
     * @param request GetPartitionRequest
     * @return GetPartitionResponse
     */
    public GetPartitionResponse getPartition(GetPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a process for deploying or undeploying an entity.</p>
     * 
     * @param request GetPipelineRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineRunResponse
     */
    public GetPipelineRunResponse getPipelineRunWithOptions(GetPipelineRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineRun"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a process for deploying or undeploying an entity.</p>
     * 
     * @param request GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    public GetPipelineRunResponse getPipelineRun(GetPipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPipelineRunWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a DataWorks workspace.</p>
     * 
     * @param request GetProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a DataWorks workspace.</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a member in a workspace.</p>
     * 
     * @param request GetProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectMemberResponse
     */
    public GetProjectMemberResponse getProjectMemberWithOptions(GetProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectMember"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a member in a workspace.</p>
     * 
     * @param request GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    public GetProjectMemberResponse getProjectMember(GetProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a role in a DataWorks workspace.</p>
     * 
     * @param request GetProjectRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectRoleResponse
     */
    public GetProjectRoleResponse getProjectRoleWithOptions(GetProjectRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectRole"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a role in a DataWorks workspace.</p>
     * 
     * @param request GetProjectRoleRequest
     * @return GetProjectRoleResponse
     */
    public GetProjectRoleResponse getProjectRole(GetProjectRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the result of asynchronous workflow instance reruns.</p>
     * 
     * @param request GetRerunWorkflowInstancesResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRerunWorkflowInstancesResultResponse
     */
    public GetRerunWorkflowInstancesResultResponse getRerunWorkflowInstancesResultWithOptions(GetRerunWorkflowInstancesResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRerunWorkflowInstancesResult"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRerunWorkflowInstancesResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the result of asynchronous workflow instance reruns.</p>
     * 
     * @param request GetRerunWorkflowInstancesResultRequest
     * @return GetRerunWorkflowInstancesResultResponse
     */
    public GetRerunWorkflowInstancesResultResponse getRerunWorkflowInstancesResult(GetRerunWorkflowInstancesResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRerunWorkflowInstancesResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file resource.</p>
     * 
     * @param request GetResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceResponse
     */
    public GetResourceResponse getResourceWithOptions(GetResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file resource.</p>
     * 
     * @param request GetResourceRequest
     * @return GetResourceResponse
     */
    public GetResourceResponse getResource(GetResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a resource group based on its ID.</p>
     * 
     * @param request GetResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroupWithOptions(GetResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a resource group based on its ID.</p>
     * 
     * @param request GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroup(GetResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a route based on its ID.</p>
     * 
     * @param request GetRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRouteResponse
     */
    public GetRouteResponse getRouteWithOptions(GetRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a route based on its ID.</p>
     * 
     * @param request GetRouteRequest
     * @return GetRouteResponse
     */
    public GetRouteResponse getRoute(GetRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this API operation to query the information only about MaxCompute and Hologres schemas.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a schema in Data Map. You can call this API operation to query the information only about MaxCompute and Hologres schemas.</p>
     * 
     * @param request GetSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSchemaResponse
     */
    public GetSchemaResponse getSchemaWithOptions(GetSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSchema"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSchemaResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this API operation to query the information only about MaxCompute and Hologres schemas.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a schema in Data Map. You can call this API operation to query the information only about MaxCompute and Hologres schemas.</p>
     * 
     * @param request GetSchemaRequest
     * @return GetSchemaResponse
     */
    public GetSchemaResponse getSchema(GetSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取表详情</p>
     * 
     * @param request GetTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(GetTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取表详情</p>
     * 
     * @param request GetTableRequest
     * @return GetTableResponse
     */
    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a task.</p>
     * 
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a task.</p>
     * 
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an instance.</p>
     * 
     * @param request GetTaskInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskInstanceResponse
     */
    public GetTaskInstanceResponse getTaskInstanceWithOptions(GetTaskInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an instance.</p>
     * 
     * @param request GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     */
    public GetTaskInstanceResponse getTaskInstance(GetTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the run log generated during a specific run of an instance.</p>
     * 
     * @param request GetTaskInstanceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskInstanceLogResponse
     */
    public GetTaskInstanceLogResponse getTaskInstanceLogWithOptions(GetTaskInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskInstanceLog"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskInstanceLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the run log generated during a specific run of an instance.</p>
     * 
     * @param request GetTaskInstanceLogRequest
     * @return GetTaskInstanceLogResponse
     */
    public GetTaskInstanceLogResponse getTaskInstanceLog(GetTaskInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskInstanceLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a workflow.</p>
     * 
     * @param request GetWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowResponse
     */
    public GetWorkflowResponse getWorkflowWithOptions(GetWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflow"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a workflow.</p>
     * 
     * @param request GetWorkflowRequest
     * @return GetWorkflowResponse
     */
    public GetWorkflowResponse getWorkflow(GetWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a workflow.</p>
     * 
     * @param request GetWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowDefinitionResponse
     */
    public GetWorkflowDefinitionResponse getWorkflowDefinitionWithOptions(GetWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a workflow.</p>
     * 
     * @param request GetWorkflowDefinitionRequest
     * @return GetWorkflowDefinitionResponse
     */
    public GetWorkflowDefinitionResponse getWorkflowDefinition(GetWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a workflow instance.</p>
     * 
     * @param request GetWorkflowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowInstanceResponse
     */
    public GetWorkflowInstanceResponse getWorkflowInstanceWithOptions(GetWorkflowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a workflow instance.</p>
     * 
     * @param request GetWorkflowInstanceRequest
     * @return GetWorkflowInstanceResponse
     */
    public GetWorkflowInstanceResponse getWorkflowInstance(GetWorkflowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns roles to members in a workspace.</p>
     * 
     * @param tmpReq GrantMemberProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantMemberProjectRolesResponse
     */
    public GrantMemberProjectRolesResponse grantMemberProjectRolesWithOptions(GrantMemberProjectRolesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantMemberProjectRolesShrinkRequest request = new GrantMemberProjectRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantMemberProjectRoles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantMemberProjectRolesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns roles to members in a workspace.</p>
     * 
     * @param request GrantMemberProjectRolesRequest
     * @return GrantMemberProjectRolesResponse
     */
    public GrantMemberProjectRolesResponse grantMemberProjectRoles(GrantMemberProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantMemberProjectRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a certificate file.</p>
     * 
     * @param request ImportCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportCertificateResponse
     */
    public ImportCertificateResponse importCertificateWithOptions(ImportCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateFile)) {
            query.put("CertificateFile", request.certificateFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportCertificate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a certificate file.</p>
     * 
     * @param request ImportCertificateRequest
     * @return ImportCertificateResponse
     */
    public ImportCertificateResponse importCertificate(ImportCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importCertificateWithOptions(request, runtime);
    }

    public ImportCertificateResponse importCertificateAdvance(ImportCertificateAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "dataworks-public"),
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
        ImportCertificateRequest importCertificateReq = new ImportCertificateRequest();
        com.aliyun.openapiutil.Client.convert(request, importCertificateReq);
        if (!com.aliyun.teautil.Common.isUnset(request.certificateFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.certificateFileObject),
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
            importCertificateReq.certificateFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        ImportCertificateResponse importCertificateResp = this.importCertificateWithOptions(importCertificateReq, runtime);
        return importCertificateResp;
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You cannot use this API operation to import multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system imports only the first specified workflow.</li>
     * <li>ImportWorkflowDefinition is an asynchronous operation. After you send a request, an asynchronous task is generated, and the system returns the ID of the asynchronous task. You can call the GetJobStatus operation to query the status of the asynchronous task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports a workflow and its child nodes that are specified by the FlowSpec field to DataStudio.</p>
     * 
     * @param request ImportWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportWorkflowDefinitionResponse
     */
    public ImportWorkflowDefinitionResponse importWorkflowDefinitionWithOptions(ImportWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportWorkflowDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You cannot use this API operation to import multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system imports only the first specified workflow.</li>
     * <li>ImportWorkflowDefinition is an asynchronous operation. After you send a request, an asynchronous task is generated, and the system returns the ID of the asynchronous task. You can call the GetJobStatus operation to query the status of the asynchronous task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports a workflow and its child nodes that are specified by the FlowSpec field to DataStudio.</p>
     * 
     * @param request ImportWorkflowDefinitionRequest
     * @return ImportWorkflowDefinitionResponse
     */
    public ImportWorkflowDefinitionResponse importWorkflowDefinition(ImportWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom monitoring alert rules.</p>
     * 
     * @param tmpReq ListAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertRulesResponse
     */
    public ListAlertRulesResponse listAlertRulesWithOptions(ListAlertRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlertRulesShrinkRequest request = new ListAlertRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiver)) {
            query.put("Receiver", request.receiver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            query.put("TaskIds", request.taskIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            query.put("Types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom monitoring alert rules.</p>
     * 
     * @param request ListAlertRulesRequest
     * @return ListAlertRulesResponse
     */
    public ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertRulesWithOptions(request, runtime);
    }

    /**
     * @param request ListBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusinessWithOptions(ListBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBusiness"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusinessResponse());
    }

    /**
     * @param request ListBusinessRequest
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据目录列表</p>
     * 
     * @param tmpReq ListCatalogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogsWithOptions(ListCatalogsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCatalogsShrinkRequest request = new ListCatalogsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCatalogs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCatalogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据目录列表</p>
     * 
     * @param request ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCatalogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of certificate files.</p>
     * 
     * @param request ListCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificatesWithOptions(ListCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCertificates"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertificatesResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of certificate files.</p>
     * 
     * @param request ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询字段列表</p>
     * 
     * @param request ListColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumnsWithOptions(ListColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListColumns"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListColumnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询字段列表</p>
     * 
     * @param request ListColumnsRequest
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumns(ListColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of components.</p>
     * 
     * @param request ListComponentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of components.</p>
     * 
     * @param request ListComponentsRequest
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComponentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param tmpReq ListComputeResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeResourcesResponse
     */
    public ListComputeResourcesResponse listComputeResourcesWithOptions(ListComputeResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListComputeResourcesShrinkRequest request = new ListComputeResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            query.put("Types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeResources"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request ListComputeResourcesRequest
     * @return ListComputeResourcesResponse
     */
    public ListComputeResourcesResponse listComputeResources(ListComputeResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComputeResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询元数据采集器类型列表</p>
     * 
     * @param request ListCrawlerTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCrawlerTypesResponse
     */
    public ListCrawlerTypesResponse listCrawlerTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCrawlerTypes"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCrawlerTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询元数据采集器类型列表</p>
     * @return ListCrawlerTypesResponse
     */
    public ListCrawlerTypesResponse listCrawlerTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCrawlerTypesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Views alert rules configured for a synchronization task.</p>
     * 
     * @param request ListDIAlarmRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRulesWithOptions(ListDIAlarmRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIAlarmRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIAlarmRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Views alert rules configured for a synchronization task.</p>
     * 
     * @param request ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRules(ListDIAlarmRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIAlarmRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries events for a synchronization task.</p>
     * 
     * @param request ListDIJobEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobEventsResponse
     */
    public ListDIJobEventsResponse listDIJobEventsWithOptions(ListDIJobEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobEvents"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries events for a synchronization task.</p>
     * 
     * @param request ListDIJobEventsRequest
     * @return ListDIJobEventsResponse
     */
    public ListDIJobEventsResponse listDIJobEvents(ListDIJobEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metrics for a synchronization task.</p>
     * 
     * @param tmpReq ListDIJobMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobMetricsResponse
     */
    public ListDIJobMetricsResponse listDIJobMetricsWithOptions(ListDIJobMetricsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDIJobMetricsShrinkRequest request = new ListDIJobMetricsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricName)) {
            request.metricNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricName, "MetricName", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobMetrics"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobMetricsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metrics for a synchronization task.</p>
     * 
     * @param request ListDIJobMetricsRequest
     * @return ListDIJobMetricsResponse
     */
    public ListDIJobMetricsResponse listDIJobMetrics(ListDIJobMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobMetricsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the running information about a synchronization task.</p>
     * 
     * @param request ListDIJobRunDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobRunDetailsResponse
     */
    public ListDIJobRunDetailsResponse listDIJobRunDetailsWithOptions(ListDIJobRunDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobRunDetails"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobRunDetailsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the running information about a synchronization task.</p>
     * 
     * @param request ListDIJobRunDetailsRequest
     * @return ListDIJobRunDetailsResponse
     */
    public ListDIJobRunDetailsResponse listDIJobRunDetails(ListDIJobRunDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobRunDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of new-version synchronization tasks in Data Integration. A new-version synchronization task can be a real-time synchronization task used to synchronize full or incremental data in a database, a batch synchronization task used to synchronize full or incremental data in a database, or a real-time synchronization task used to synchronize incremental data in a single table.</p>
     * 
     * @param request ListDIJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobsWithOptions(ListDIJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of new-version synchronization tasks in Data Integration. A new-version synchronization task can be a real-time synchronization task used to synchronize full or incremental data in a database, a batch synchronization task used to synchronize full or incremental data in a database, or a real-time synchronization task used to synchronize incremental data in a single table.</p>
     * 
     * @param request ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobs(ListDIJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tags.</p>
     * 
     * @param request ListDataAssetTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataAssetTagsResponse
     */
    public ListDataAssetTagsResponse listDataAssetTagsWithOptions(ListDataAssetTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataAssetTags"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataAssetTagsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tags.</p>
     * 
     * @param request ListDataAssetTagsRequest
     * @return ListDataAssetTagsResponse
     */
    public ListDataAssetTagsResponse listDataAssetTags(ListDataAssetTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataAssetTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about DataWorks data assets to which tags are added by page.</p>
     * 
     * @param tmpReq ListDataAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataAssetsResponse
     */
    public ListDataAssetsResponse listDataAssetsWithOptions(ListDataAssetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataAssetsShrinkRequest request = new ListDataAssetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataAssetIds)) {
            request.dataAssetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataAssetIds, "DataAssetIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataAssets"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataAssetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about DataWorks data assets to which tags are added by page.</p>
     * 
     * @param request ListDataAssetsRequest
     * @return ListDataAssetsResponse
     */
    public ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataAssetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of data quality alert rules in a project.</p>
     * 
     * @param request ListDataQualityAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityAlertRulesResponse
     */
    public ListDataQualityAlertRulesResponse listDataQualityAlertRulesWithOptions(ListDataQualityAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityScanId)) {
            query.put("DataQualityScanId", request.dataQualityScanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityAlertRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityAlertRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of data quality alert rules in a project.</p>
     * 
     * @param request ListDataQualityAlertRulesRequest
     * @return ListDataQualityAlertRulesResponse
     */
    public ListDataQualityAlertRulesResponse listDataQualityAlertRules(ListDataQualityAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityAlertRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of instances generated by a data quality monitoring task by page.</p>
     * 
     * @param request ListDataQualityEvaluationTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    public ListDataQualityEvaluationTaskInstancesResponse listDataQualityEvaluationTaskInstancesWithOptions(ListDataQualityEvaluationTaskInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityEvaluationTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityEvaluationTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of instances generated by a data quality monitoring task by page.</p>
     * 
     * @param request ListDataQualityEvaluationTaskInstancesRequest
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    public ListDataQualityEvaluationTaskInstancesResponse listDataQualityEvaluationTaskInstances(ListDataQualityEvaluationTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityEvaluationTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data quality monitoring tasks by page.</p>
     * 
     * @param request ListDataQualityEvaluationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityEvaluationTasksResponse
     */
    public ListDataQualityEvaluationTasksResponse listDataQualityEvaluationTasksWithOptions(ListDataQualityEvaluationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityEvaluationTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityEvaluationTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data quality monitoring tasks by page.</p>
     * 
     * @param request ListDataQualityEvaluationTasksRequest
     * @return ListDataQualityEvaluationTasksResponse
     */
    public ListDataQualityEvaluationTasksResponse listDataQualityEvaluationTasks(ListDataQualityEvaluationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityEvaluationTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request ListDataQualityResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityResultsResponse
     */
    public ListDataQualityResultsResponse listDataQualityResultsWithOptions(ListDataQualityResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityResults"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityResultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request ListDataQualityResultsRequest
     * @return ListDataQualityResultsResponse
     */
    public ListDataQualityResultsResponse listDataQualityResults(ListDataQualityResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data quality monitoring rule templates.</p>
     * 
     * @param request ListDataQualityRuleTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityRuleTemplatesResponse
     */
    public ListDataQualityRuleTemplatesResponse listDataQualityRuleTemplatesWithOptions(ListDataQualityRuleTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityRuleTemplates"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityRuleTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data quality monitoring rule templates.</p>
     * 
     * @param request ListDataQualityRuleTemplatesRequest
     * @return ListDataQualityRuleTemplatesResponse
     */
    public ListDataQualityRuleTemplatesResponse listDataQualityRuleTemplates(ListDataQualityRuleTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityRuleTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data quality monitoring rules by page.</p>
     * 
     * @param request ListDataQualityRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityRulesResponse
     */
    public ListDataQualityRulesResponse listDataQualityRulesWithOptions(ListDataQualityRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data quality monitoring rules by page.</p>
     * 
     * @param request ListDataQualityRulesRequest
     * @return ListDataQualityRulesResponse
     */
    public ListDataQualityRulesResponse listDataQualityRules(ListDataQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution records of data quality scans in a project.</p>
     * 
     * @param tmpReq ListDataQualityScanRunsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityScanRunsResponse
     */
    public ListDataQualityScanRunsResponse listDataQualityScanRunsWithOptions(ListDataQualityScanRunsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataQualityScanRunsShrinkRequest request = new ListDataQualityScanRunsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeFrom)) {
            query.put("CreateTimeFrom", request.createTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeTo)) {
            query.put("CreateTimeTo", request.createTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityScanId)) {
            query.put("DataQualityScanId", request.dataQualityScanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityScanRuns"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityScanRunsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution records of data quality scans in a project.</p>
     * 
     * @param request ListDataQualityScanRunsRequest
     * @return ListDataQualityScanRunsResponse
     */
    public ListDataQualityScanRunsResponse listDataQualityScanRuns(ListDataQualityScanRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityScanRunsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of data quality scan tasks in a project.</p>
     * 
     * @param request ListDataQualityScansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityScansResponse
     */
    public ListDataQualityScansResponse listDataQualityScansWithOptions(ListDataQualityScansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            query.put("Table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityScans"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityScansResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of data quality scan tasks in a project.</p>
     * 
     * @param request ListDataQualityScansRequest
     * @return ListDataQualityScansResponse
     */
    public ListDataQualityScansResponse listDataQualityScans(ListDataQualityScansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityScansWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of data quality rule templates in a project.</p>
     * 
     * @param request ListDataQualityTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityTemplatesResponse
     */
    public ListDataQualityTemplatesResponse listDataQualityTemplatesWithOptions(ListDataQualityTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityTemplates"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of data quality rule templates in a project.</p>
     * 
     * @param request ListDataQualityTemplatesRequest
     * @return ListDataQualityTemplatesResponse
     */
    public ListDataQualityTemplatesResponse listDataQualityTemplates(ListDataQualityTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to query the sharing rules of a data source that is associated with Workspace A, you must have the permissions to share the data source in Workspace A. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of sharing rules of a data source.</p>
     * 
     * @param request ListDataSourceSharedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceSharedRulesResponse
     */
    public ListDataSourceSharedRulesResponse listDataSourceSharedRulesWithOptions(ListDataSourceSharedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceSharedRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceSharedRulesResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to query the sharing rules of a data source that is associated with Workspace A, you must have the permissions to share the data source in Workspace A. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of sharing rules of a data source.</p>
     * 
     * @param request ListDataSourceSharedRulesRequest
     * @return ListDataSourceSharedRulesResponse
     */
    public ListDataSourceSharedRulesResponse listDataSourceSharedRules(ListDataSourceSharedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceSharedRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data sources based on the business information of data sources.</p>
     * 
     * @param tmpReq ListDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourcesShrinkRequest request = new ListDataSourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data sources based on the business information of data sources.</p>
     * 
     * @param request ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据库列表</p>
     * 
     * @param request ListDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据库列表</p>
     * 
     * @param request ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the version list for a given dataset.</p>
     * 
     * @param request ListDatasetVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasetVersionsResponse
     */
    public ListDatasetVersionsResponse listDatasetVersionsWithOptions(ListDatasetVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasetVersions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasetVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the version list for a given dataset.</p>
     * 
     * @param request ListDatasetVersionsRequest
     * @return ListDatasetVersionsResponse
     */
    public ListDatasetVersionsResponse listDatasetVersions(ListDatasetVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatasetVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets. Currently, DataWorks datasets and PAI datasets are supported.</p>
     * 
     * @param tmpReq ListDatasetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasetsWithOptions(ListDatasetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDatasetsShrinkRequest request = new ListDatasetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataTypeList)) {
            request.dataTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataTypeList, "DataTypeList", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storageTypeList)) {
            request.storageTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storageTypeList, "StorageTypeList", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataTypeListShrink)) {
            body.put("DataTypeList", request.dataTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            body.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageTypeListShrink)) {
            body.put("StorageTypeList", request.storageTypeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasets"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets. Currently, DataWorks datasets and PAI datasets are supported.</p>
     * 
     * @param request ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatasetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of versions of files to be deployed.</p>
     * 
     * @param tmpReq ListDeploymentPackageFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentPackageFilesResponse
     */
    public ListDeploymentPackageFilesResponse listDeploymentPackageFilesWithOptions(ListDeploymentPackageFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeploymentPackageFilesShrinkRequest request = new ListDeploymentPackageFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeType)) {
            query.put("ChangeType", request.changeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitFrom)) {
            query.put("CommitFrom", request.commitFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitTo)) {
            query.put("CommitTo", request.commitTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitUserId)) {
            query.put("CommitUserId", request.commitUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            query.put("FileIds", request.fileIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            query.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentPackageFiles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentPackageFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of versions of files to be deployed.</p>
     * 
     * @param request ListDeploymentPackageFilesRequest
     * @return ListDeploymentPackageFilesResponse
     */
    public ListDeploymentPackageFilesResponse listDeploymentPackageFiles(ListDeploymentPackageFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentPackageFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of deployment packages.</p>
     * 
     * @param request ListDeploymentPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentPackagesResponse
     */
    public ListDeploymentPackagesResponse listDeploymentPackagesWithOptions(ListDeploymentPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            body.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            body.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endExecuteTime)) {
            body.put("EndExecuteTime", request.endExecuteTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executor)) {
            body.put("Executor", request.executor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentPackages"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of deployment packages.</p>
     * 
     * @param request ListDeploymentPackagesRequest
     * @return ListDeploymentPackagesResponse
     */
    public ListDeploymentPackagesResponse listDeploymentPackages(ListDeploymentPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentPackagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of descendant instances of an instance by page.</p>
     * 
     * @param request ListDownstreamTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownstreamTaskInstancesResponse
     */
    public ListDownstreamTaskInstancesResponse listDownstreamTaskInstancesWithOptions(ListDownstreamTaskInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownstreamTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownstreamTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of descendant instances of an instance by page.</p>
     * 
     * @param request ListDownstreamTaskInstancesRequest
     * @return ListDownstreamTaskInstancesResponse
     */
    public ListDownstreamTaskInstancesResponse listDownstreamTaskInstances(ListDownstreamTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownstreamTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of descendant tasks of a task by page.</p>
     * 
     * @param request ListDownstreamTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownstreamTasksResponse
     */
    public ListDownstreamTasksResponse listDownstreamTasksWithOptions(ListDownstreamTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownstreamTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownstreamTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of descendant tasks of a task by page.</p>
     * 
     * @param request ListDownstreamTasksRequest
     * @return ListDownstreamTasksResponse
     */
    public ListDownstreamTasksResponse listDownstreamTasks(ListDownstreamTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownstreamTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities in a collection in Data Map. Collections include categories and data albums. Entities can only be tables.</p>
     * 
     * @param request ListEntitiesInMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEntitiesInMetaCollectionResponse
     */
    public ListEntitiesInMetaCollectionResponse listEntitiesInMetaCollectionWithOptions(ListEntitiesInMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEntitiesInMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEntitiesInMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities in a collection in Data Map. Collections include categories and data albums. Entities can only be tables.</p>
     * 
     * @param request ListEntitiesInMetaCollectionRequest
     * @return ListEntitiesInMetaCollectionResponse
     */
    public ListEntitiesInMetaCollectionResponse listEntitiesInMetaCollection(ListEntitiesInMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntitiesInMetaCollectionWithOptions(request, runtime);
    }

    /**
     * @param request ListFileVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileVersionsResponse
     */
    public ListFileVersionsResponse listFileVersionsWithOptions(ListFileVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileVersions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileVersionsResponse());
    }

    /**
     * @param request ListFileVersionsRequest
     * @return ListFileVersionsResponse
     */
    public ListFileVersionsResponse listFileVersions(ListFileVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileVersionsWithOptions(request, runtime);
    }

    /**
     * @param request ListFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilesResponse
     */
    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commitStatus)) {
            body.put("CommitStatus", request.commitStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exactFileName)) {
            body.put("ExactFileName", request.exactFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdIn)) {
            body.put("FileIdIn", request.fileIdIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileTypes)) {
            body.put("FileTypes", request.fileTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastEditUser)) {
            body.put("LastEditUser", request.lastEditUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAbsoluteFolderPath)) {
            body.put("NeedAbsoluteFolderPath", request.needAbsoluteFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needContent)) {
            body.put("NeedContent", request.needContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useType)) {
            body.put("UseType", request.useType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFiles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
    }

    /**
     * @param request ListFilesRequest
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    /**
     * @param request ListFoldersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFoldersResponse
     */
    public ListFoldersResponse listFoldersWithOptions(ListFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderPath)) {
            body.put("ParentFolderPath", request.parentFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFolders"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoldersResponse());
    }

    /**
     * @param request ListFoldersRequest
     * @return ListFoldersResponse
     */
    public ListFoldersResponse listFolders(ListFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user-defined functions (UDFs) in DataStudio. You can also specify filter conditions to query specific UDFs.</p>
     * 
     * @param request ListFunctionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctionsWithOptions(ListFunctionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user-defined functions (UDFs) in DataStudio. You can also specify filter conditions to query specific UDFs.</p>
     * 
     * @param request ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFunctionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询血缘关系</p>
     * 
     * @param request ListLineageRelationshipsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLineageRelationshipsResponse
     */
    public ListLineageRelationshipsResponse listLineageRelationshipsWithOptions(ListLineageRelationshipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLineageRelationships"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLineageRelationshipsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询血缘关系</p>
     * 
     * @param request ListLineageRelationshipsRequest
     * @return ListLineageRelationshipsResponse
     */
    public ListLineageRelationshipsResponse listLineageRelationships(ListLineageRelationshipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLineageRelationshipsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实体血缘</p>
     * 
     * @param request ListLineagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLineagesResponse
     */
    public ListLineagesResponse listLineagesWithOptions(ListLineagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLineages"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLineagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实体血缘</p>
     * 
     * @param request ListLineagesRequest
     * @return ListLineagesResponse
     */
    public ListLineagesResponse listLineages(ListLineagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLineagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of collections in Data Map. Collections include categories and data albums.</p>
     * 
     * @param request ListMetaCollectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetaCollectionsResponse
     */
    public ListMetaCollectionsResponse listMetaCollectionsWithOptions(ListMetaCollectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetaCollections"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetaCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of collections in Data Map. Collections include categories and data albums.</p>
     * 
     * @param request ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    public ListMetaCollectionsResponse listMetaCollections(ListMetaCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaCollectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of network resources of a serverless resource group.</p>
     * 
     * @param request ListNetworksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworksResponse
     */
    public ListNetworksResponse listNetworksWithOptions(ListNetworksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworksResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of network resources of a serverless resource group.</p>
     * 
     * @param request ListNetworksRequest
     * @return ListNetworksResponse
     */
    public ListNetworksResponse listNetworks(ListNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of descendant nodes of a node in DataStudio.</p>
     * 
     * @param request ListNodeDependenciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeDependenciesResponse
     */
    public ListNodeDependenciesResponse listNodeDependenciesWithOptions(ListNodeDependenciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeDependencies"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeDependenciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of descendant nodes of a node in DataStudio.</p>
     * 
     * @param request ListNodeDependenciesRequest
     * @return ListNodeDependenciesResponse
     */
    public ListNodeDependenciesResponse listNodeDependencies(ListNodeDependenciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeDependenciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes in DataStudio. You can also specify filter conditions to query specific nodes.</p>
     * 
     * @param request ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes in DataStudio. You can also specify filter conditions to query specific nodes.</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据表的分区列表</p>
     * 
     * @param request ListPartitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitionsWithOptions(ListPartitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据表的分区列表</p>
     * 
     * @param request ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitions(ListPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPartitionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about deployment objects by deployment process ID.</p>
     * 
     * @param request ListPipelineRunItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineRunItemsResponse
     */
    public ListPipelineRunItemsResponse listPipelineRunItemsWithOptions(ListPipelineRunItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineRunItems"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRunItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about deployment objects by deployment process ID.</p>
     * 
     * @param request ListPipelineRunItemsRequest
     * @return ListPipelineRunItemsResponse
     */
    public ListPipelineRunItemsResponse listPipelineRunItems(ListPipelineRunItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPipelineRunItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of processes that are used to deploy or undeploy entities in DataStudio. You can also specify filter conditions to query specific processes.</p>
     * 
     * @param request ListPipelineRunsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRunsWithOptions(ListPipelineRunsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineRuns"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRunsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of processes that are used to deploy or undeploy entities in DataStudio. You can also specify filter conditions to query specific processes.</p>
     * 
     * @param request ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRuns(ListPipelineRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPipelineRunsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries details about members in a workspace.</p>
     * 
     * @param tmpReq ListProjectMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembersWithOptions(ListProjectMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectMembersShrinkRequest request = new ListProjectMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIds)) {
            request.userIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIds, "UserIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdsShrink)) {
            body.put("UserIds", request.userIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries details about members in a workspace.</p>
     * 
     * @param request ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about roles in a DataWorks workspace by page.</p>
     * 
     * @param tmpReq ListProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectRolesResponse
     */
    public ListProjectRolesResponse listProjectRolesWithOptions(ListProjectRolesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectRolesShrinkRequest request = new ListProjectRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codes)) {
            request.codesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codes, "Codes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.names)) {
            request.namesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.names, "Names", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codesShrink)) {
            body.put("Codes", request.codesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namesShrink)) {
            body.put("Names", request.namesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectRoles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectRolesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about roles in a DataWorks workspace by page.</p>
     * 
     * @param request ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    public ListProjectRolesResponse listProjectRoles(ListProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of DataWorks workspaces of the tenant to which your account belongs.</p>
     * 
     * @param tmpReq ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aliyunResourceTags)) {
            request.aliyunResourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aliyunResourceTags, "AliyunResourceTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.names)) {
            request.namesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.names, "Names", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupId)) {
            body.put("AliyunResourceGroupId", request.aliyunResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceTagsShrink)) {
            body.put("AliyunResourceTags", request.aliyunResourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEnvironmentEnabled)) {
            body.put("DevEnvironmentEnabled", request.devEnvironmentEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devRoleDisabled)) {
            body.put("DevRoleDisabled", request.devRoleDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namesShrink)) {
            body.put("Names", request.namesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paiTaskEnabled)) {
            body.put("PaiTaskEnabled", request.paiTaskEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of DataWorks workspaces of the tenant to which your account belongs.</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>**Make sure that the AliyunServiceRoleForDataWorks service-linked role is created before you call this operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Query the list of workspaces with which a resource group is associated</p>
     * 
     * @param request ListResourceGroupAssociateProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupAssociateProjectsResponse
     */
    public ListResourceGroupAssociateProjectsResponse listResourceGroupAssociateProjectsWithOptions(ListResourceGroupAssociateProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupAssociateProjects"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupAssociateProjectsResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>**Make sure that the AliyunServiceRoleForDataWorks service-linked role is created before you call this operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Query the list of workspaces with which a resource group is associated</p>
     * 
     * @param request ListResourceGroupAssociateProjectsRequest
     * @return ListResourceGroupAssociateProjectsResponse
     */
    public ListResourceGroupAssociateProjectsResponse listResourceGroupAssociateProjects(ListResourceGroupAssociateProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupAssociateProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定资源组的监控指标数据</p>
     * 
     * @param request ListResourceGroupMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupMetricDataResponse
     */
    public ListResourceGroupMetricDataResponse listResourceGroupMetricDataWithOptions(ListResourceGroupMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            body.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            body.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            body.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupMetricData"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupMetricDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定资源组的监控指标数据</p>
     * 
     * @param request ListResourceGroupMetricDataRequest
     * @return ListResourceGroupMetricDataResponse
     */
    public ListResourceGroupMetricDataResponse listResourceGroupMetricData(ListResourceGroupMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of resource groups.</p>
     * 
     * @param tmpReq ListResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceGroupsShrinkRequest request = new ListResourceGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aliyunResourceTags)) {
            request.aliyunResourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aliyunResourceTags, "AliyunResourceTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceGroupTypes)) {
            request.resourceGroupTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceGroupTypes, "ResourceGroupTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statuses)) {
            request.statusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statuses, "Statuses", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of resource groups.</p>
     * 
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of file resources in DataStudio. You can also specify filter conditions to query specific file resources.</p>
     * 
     * @param request ListResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of file resources in DataStudio. You can also specify filter conditions to query specific file resources.</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of routes of a network resource.</p>
     * 
     * @param request ListRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutesResponse
     */
    public ListRoutesResponse listRoutesWithOptions(ListRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutes"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of routes of a network resource.</p>
     * 
     * @param request ListRoutesRequest
     * @return ListRoutesResponse
     */
    public ListRoutesResponse listRoutes(ListRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of schemas in a database or a MaxCompute project in Data Map. Only schemas of the MaxCompute and Hologres metadata crawler types are supported.</p>
     * 
     * @param tmpReq ListSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemasWithOptions(ListSchemasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSchemasShrinkRequest request = new ListSchemasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSchemas"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of schemas in a database or a MaxCompute project in Data Map. Only schemas of the MaxCompute and Hologres metadata crawler types are supported.</p>
     * 
     * @param request ListSchemasRequest
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemas(ListSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tables in Data Map. For data source types that do not support schemas, you can call this API operation to query a list of tables in a specific database. For data source types that support schemas, you can call this API operation to query a list of tables in a specific database, MaxCompute project, or schema. Only the basic information about tables is returned. The information about technical metadata and business metadata is not returned.</p>
     * 
     * @param tmpReq ListTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTablesShrinkRequest request = new ListTablesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableTypes)) {
            request.tableTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableTypes, "TableTypes", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tables in Data Map. For data source types that do not support schemas, you can call this API operation to query a list of tables in a specific database. For data source types that support schemas, you can call this API operation to query a list of tables in a specific database, MaxCompute project, or schema. Only the basic information about tables is returned. The information about technical metadata and business metadata is not returned.</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * You can call this operation to query only the operation logs generated within the previous 31 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of operation logs of an instance by page.</p>
     * 
     * @param request ListTaskInstanceOperationLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskInstanceOperationLogsResponse
     */
    public ListTaskInstanceOperationLogsResponse listTaskInstanceOperationLogsWithOptions(ListTaskInstanceOperationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskInstanceOperationLogs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskInstanceOperationLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * You can call this operation to query only the operation logs generated within the previous 31 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of operation logs of an instance by page.</p>
     * 
     * @param request ListTaskInstanceOperationLogsRequest
     * @return ListTaskInstanceOperationLogsResponse
     */
    public ListTaskInstanceOperationLogsResponse listTaskInstanceOperationLogs(ListTaskInstanceOperationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskInstanceOperationLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of instances. You can also specify filter conditions to query specific instances.</p>
     * 
     * @param tmpReq ListTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskInstancesResponse
     */
    public ListTaskInstancesResponse listTaskInstancesWithOptions(ListTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTaskInstancesShrinkRequest request = new ListTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResource)) {
            body.put("RuntimeResource", request.runtimeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            body.put("TaskIds", request.taskIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerRecurrence)) {
            body.put("TriggerRecurrence", request.triggerRecurrence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unifiedWorkflowInstanceId)) {
            body.put("UnifiedWorkflowInstanceId", request.unifiedWorkflowInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            body.put("WorkflowInstanceId", request.workflowInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceType)) {
            body.put("WorkflowInstanceType", request.workflowInstanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of instances. You can also specify filter conditions to query specific instances.</p>
     * 
     * @param request ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    public ListTaskInstancesResponse listTaskInstances(ListTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * You can call this operation to query only the operation logs generated within the previous 31 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of operation logs of a task by page.</p>
     * 
     * @param request ListTaskOperationLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskOperationLogsResponse
     */
    public ListTaskOperationLogsResponse listTaskOperationLogsWithOptions(ListTaskOperationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskOperationLogs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskOperationLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * You can call this operation to query only the operation logs generated within the previous 31 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of operation logs of a task by page.</p>
     * 
     * @param request ListTaskOperationLogsRequest
     * @return ListTaskOperationLogsResponse
     */
    public ListTaskOperationLogsResponse listTaskOperationLogs(ListTaskOperationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskOperationLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tasks by page. You can also specify filter conditions to query tasks.</p>
     * 
     * @param tmpReq ListTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResource)) {
            body.put("RuntimeResource", request.runtimeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerRecurrence)) {
            body.put("TriggerRecurrence", request.triggerRecurrence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tasks by page. You can also specify filter conditions to query tasks.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of ancestor instances of an instance by page.</p>
     * 
     * @param request ListUpstreamTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpstreamTaskInstancesResponse
     */
    public ListUpstreamTaskInstancesResponse listUpstreamTaskInstancesWithOptions(ListUpstreamTaskInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpstreamTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpstreamTaskInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of ancestor instances of an instance by page.</p>
     * 
     * @param request ListUpstreamTaskInstancesRequest
     * @return ListUpstreamTaskInstancesResponse
     */
    public ListUpstreamTaskInstancesResponse listUpstreamTaskInstances(ListUpstreamTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpstreamTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of ancestor tasks of a task by page.</p>
     * 
     * @param request ListUpstreamTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpstreamTasksResponse
     */
    public ListUpstreamTasksResponse listUpstreamTasksWithOptions(ListUpstreamTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpstreamTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpstreamTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of ancestor tasks of a task by page.</p>
     * 
     * @param request ListUpstreamTasksRequest
     * @return ListUpstreamTasksResponse
     */
    public ListUpstreamTasksResponse listUpstreamTasks(ListUpstreamTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpstreamTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workflows in DataStudio. You can also specify filter conditions to query specific workflows.</p>
     * 
     * @param request ListWorkflowDefinitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowDefinitionsResponse
     */
    public ListWorkflowDefinitionsResponse listWorkflowDefinitionsWithOptions(ListWorkflowDefinitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowDefinitions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowDefinitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workflows in DataStudio. You can also specify filter conditions to query specific workflows.</p>
     * 
     * @param request ListWorkflowDefinitionsRequest
     * @return ListWorkflowDefinitionsResponse
     */
    public ListWorkflowDefinitionsResponse listWorkflowDefinitions(ListWorkflowDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowDefinitionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workflow instances by page. You can also specify filter conditions to query workflow instances.</p>
     * 
     * @param tmpReq ListWorkflowInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowInstancesResponse
     */
    public ListWorkflowInstancesResponse listWorkflowInstancesWithOptions(ListWorkflowInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkflowInstancesShrinkRequest request = new ListWorkflowInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unifiedWorkflowInstanceId)) {
            body.put("UnifiedWorkflowInstanceId", request.unifiedWorkflowInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workflow instances by page. You can also specify filter conditions to query workflow instances.</p>
     * 
     * @param request ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    public ListWorkflowInstancesResponse listWorkflowInstances(ListWorkflowInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workflows by page. You can also specify filter conditions to query workflows.</p>
     * 
     * @param tmpReq ListWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflowsWithOptions(ListWorkflowsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkflowsShrinkRequest request = new ListWorkflowsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflows"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workflows by page. You can also specify filter conditions to query workflows.</p>
     * 
     * @param request ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a user-defined function (UDF) to a path in DataStudio.</p>
     * 
     * @param request MoveFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveFunctionResponse
     */
    public MoveFunctionResponse moveFunctionWithOptions(MoveFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a user-defined function (UDF) to a path in DataStudio.</p>
     * 
     * @param request MoveFunctionRequest
     * @return MoveFunctionResponse
     */
    public MoveFunctionResponse moveFunction(MoveFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a node to a path in DataStudio.</p>
     * 
     * @param request MoveNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveNodeResponse
     */
    public MoveNodeResponse moveNodeWithOptions(MoveNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a node to a path in DataStudio.</p>
     * 
     * @param request MoveNodeRequest
     * @return MoveNodeResponse
     */
    public MoveNodeResponse moveNode(MoveNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file resource to a path in DataStudio.</p>
     * 
     * @param request MoveResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceResponse
     */
    public MoveResourceResponse moveResourceWithOptions(MoveResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file resource to a path in DataStudio.</p>
     * 
     * @param request MoveResourceRequest
     * @return MoveResourceResponse
     */
    public MoveResourceResponse moveResource(MoveResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a workflow to a path in DataStudio.</p>
     * 
     * @param request MoveWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveWorkflowDefinitionResponse
     */
    public MoveWorkflowDefinitionResponse moveWorkflowDefinitionWithOptions(MoveWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a workflow to a path in DataStudio.</p>
     * 
     * @param request MoveWorkflowDefinitionRequest
     * @return MoveWorkflowDefinitionResponse
     */
    public MoveWorkflowDefinitionResponse moveWorkflowDefinition(MoveWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Previews the content of a specified dataset version. Currently only text file preview is supported for OSS-type datasets. Supported MIME types 1. application/json 2. application/xml 3. text/html 4. text/plain 5. application/octet-stream</p>
     * 
     * @param request PreviewDatasetVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewDatasetVersionResponse
     */
    public PreviewDatasetVersionResponse previewDatasetVersionWithOptions(PreviewDatasetVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewDatasetVersion"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewDatasetVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Previews the content of a specified dataset version. Currently only text file preview is supported for OSS-type datasets. Supported MIME types 1. application/json 2. application/xml 3. text/html 4. text/plain 5. application/octet-stream</p>
     * 
     * @param request PreviewDatasetVersionRequest
     * @return PreviewDatasetVersionResponse
     */
    public PreviewDatasetVersionResponse previewDatasetVersion(PreviewDatasetVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewDatasetVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从集合中移除实体对象</p>
     * 
     * @param request RemoveEntityFromMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveEntityFromMetaCollectionResponse
     */
    public RemoveEntityFromMetaCollectionResponse removeEntityFromMetaCollectionWithOptions(RemoveEntityFromMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaCollectionId)) {
            query.put("MetaCollectionId", request.metaCollectionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEntityFromMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveEntityFromMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从集合中移除实体对象</p>
     * 
     * @param request RemoveEntityFromMetaCollectionRequest
     * @return RemoveEntityFromMetaCollectionResponse
     */
    public RemoveEntityFromMetaCollectionResponse removeEntityFromMetaCollection(RemoveEntityFromMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEntityFromMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes multiple upstream dependencies of an instance at a time.</p>
     * 
     * @param tmpReq RemoveTaskInstanceDependenciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTaskInstanceDependenciesResponse
     */
    public RemoveTaskInstanceDependenciesResponse removeTaskInstanceDependenciesWithOptions(RemoveTaskInstanceDependenciesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveTaskInstanceDependenciesShrinkRequest request = new RemoveTaskInstanceDependenciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upstreamTaskInstanceIds)) {
            request.upstreamTaskInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upstreamTaskInstanceIds, "UpstreamTaskInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamTaskInstanceIdsShrink)) {
            body.put("UpstreamTaskInstanceIds", request.upstreamTaskInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTaskInstanceDependencies"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTaskInstanceDependenciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes multiple upstream dependencies of an instance at a time.</p>
     * 
     * @param request RemoveTaskInstanceDependenciesRequest
     * @return RemoveTaskInstanceDependenciesResponse
     */
    public RemoveTaskInstanceDependenciesResponse removeTaskInstanceDependencies(RemoveTaskInstanceDependenciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTaskInstanceDependenciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request RenameFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameFunctionResponse
     */
    public RenameFunctionResponse renameFunctionWithOptions(RenameFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request RenameFunctionRequest
     * @return RenameFunctionResponse
     */
    public RenameFunctionResponse renameFunction(RenameFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a node in DataStudio.</p>
     * 
     * @param request RenameNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameNodeResponse
     */
    public RenameNodeResponse renameNodeWithOptions(RenameNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a node in DataStudio.</p>
     * 
     * @param request RenameNodeRequest
     * @return RenameNodeResponse
     */
    public RenameNodeResponse renameNode(RenameNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a file resource in DataStudio.</p>
     * 
     * @param request RenameResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameResourceResponse
     */
    public RenameResourceResponse renameResourceWithOptions(RenameResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a file resource in DataStudio.</p>
     * 
     * @param request RenameResourceRequest
     * @return RenameResourceResponse
     */
    public RenameResourceResponse renameResource(RenameResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a workflow in DataStudio.</p>
     * 
     * @param request RenameWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameWorkflowDefinitionResponse
     */
    public RenameWorkflowDefinitionResponse renameWorkflowDefinitionWithOptions(RenameWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a workflow in DataStudio.</p>
     * 
     * @param request RenameWorkflowDefinitionRequest
     * @return RenameWorkflowDefinitionResponse
     */
    public RenameWorkflowDefinitionResponse renameWorkflowDefinition(RenameWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Reruns multiple instances at a time.</p>
     * 
     * @param tmpReq RerunTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RerunTaskInstancesResponse
     */
    public RerunTaskInstancesResponse rerunTaskInstancesWithOptions(RerunTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RerunTaskInstancesShrinkRequest request = new RerunTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Reruns multiple instances at a time.</p>
     * 
     * @param request RerunTaskInstancesRequest
     * @return RerunTaskInstancesResponse
     */
    public RerunTaskInstancesResponse rerunTaskInstances(RerunTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rerunTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reruns workflow instances.</p>
     * 
     * @param tmpReq RerunWorkflowInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RerunWorkflowInstancesResponse
     */
    public RerunWorkflowInstancesResponse rerunWorkflowInstancesWithOptions(RerunWorkflowInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RerunWorkflowInstancesShrinkRequest request = new RerunWorkflowInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTriggerTime)) {
            body.put("EndTriggerTime", request.endTriggerTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            body.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTriggerTime)) {
            body.put("StartTriggerTime", request.startTriggerTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunWorkflowInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunWorkflowInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reruns workflow instances.</p>
     * 
     * @param request RerunWorkflowInstancesRequest
     * @return RerunWorkflowInstancesResponse
     */
    public RerunWorkflowInstancesResponse rerunWorkflowInstances(RerunWorkflowInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rerunWorkflowInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes multiple suspended instances at a time.</p>
     * 
     * @param tmpReq ResumeTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTaskInstancesResponse
     */
    public ResumeTaskInstancesResponse resumeTaskInstancesWithOptions(ResumeTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumeTaskInstancesShrinkRequest request = new ResumeTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes multiple suspended instances at a time.</p>
     * 
     * @param request ResumeTaskInstancesRequest
     * @return ResumeTaskInstancesResponse
     */
    public ResumeTaskInstancesResponse resumeTaskInstances(ResumeTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes roles that are assigned to a member in a workspace.</p>
     * 
     * @param tmpReq RevokeMemberProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeMemberProjectRolesResponse
     */
    public RevokeMemberProjectRolesResponse revokeMemberProjectRolesWithOptions(RevokeMemberProjectRolesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokeMemberProjectRolesShrinkRequest request = new RevokeMemberProjectRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeMemberProjectRoles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeMemberProjectRolesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes roles that are assigned to a member in a workspace.</p>
     * 
     * @param request RevokeMemberProjectRolesRequest
     * @return RevokeMemberProjectRolesResponse
     */
    public RevokeMemberProjectRolesResponse revokeMemberProjectRoles(RevokeMemberProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeMemberProjectRolesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the statuses of multiple instances to successful at a time.</p>
     * 
     * @param tmpReq SetSuccessTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSuccessTaskInstancesResponse
     */
    public SetSuccessTaskInstancesResponse setSuccessTaskInstancesWithOptions(SetSuccessTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSuccessTaskInstancesShrinkRequest request = new SetSuccessTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSuccessTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSuccessTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the statuses of multiple instances to successful at a time.</p>
     * 
     * @param request SetSuccessTaskInstancesRequest
     * @return SetSuccessTaskInstancesResponse
     */
    public SetSuccessTaskInstancesResponse setSuccessTaskInstances(SetSuccessTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a new-version synchronization task.</p>
     * 
     * @param tmpReq StartDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDIJobResponse
     */
    public StartDIJobResponse startDIJobWithOptions(StartDIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartDIJobShrinkRequest request = new StartDIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.realtimeStartSettings)) {
            request.realtimeStartSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.realtimeStartSettings, "RealtimeStartSettings", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDIJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a new-version synchronization task.</p>
     * 
     * @param request StartDIJobRequest
     * @return StartDIJobResponse
     */
    public StartDIJobResponse startDIJob(StartDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts multiple workflow instances at a time.</p>
     * 
     * @param tmpReq StartWorkflowInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartWorkflowInstancesResponse
     */
    public StartWorkflowInstancesResponse startWorkflowInstancesWithOptions(StartWorkflowInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartWorkflowInstancesShrinkRequest request = new StartWorkflowInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartWorkflowInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartWorkflowInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts multiple workflow instances at a time.</p>
     * 
     * @param request StartWorkflowInstancesRequest
     * @return StartWorkflowInstancesResponse
     */
    public StartWorkflowInstancesResponse startWorkflowInstances(StartWorkflowInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startWorkflowInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a synchronization task.</p>
     * 
     * @param request StopDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJobWithOptions(StopDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDIJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a synchronization task.</p>
     * 
     * @param request StopDIJobRequest
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJob(StopDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops multiple instances at a time.</p>
     * 
     * @param tmpReq StopTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTaskInstancesResponse
     */
    public StopTaskInstancesResponse stopTaskInstancesWithOptions(StopTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopTaskInstancesShrinkRequest request = new StopTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops multiple instances at a time.</p>
     * 
     * @param request StopTaskInstancesRequest
     * @return StopTaskInstancesResponse
     */
    public StopTaskInstancesResponse stopTaskInstances(StopTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops multiple workflow instances at a time.</p>
     * 
     * @param tmpReq StopWorkflowInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopWorkflowInstancesResponse
     */
    public StopWorkflowInstancesResponse stopWorkflowInstancesWithOptions(StopWorkflowInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopWorkflowInstancesShrinkRequest request = new StopWorkflowInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopWorkflowInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopWorkflowInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops multiple workflow instances at a time.</p>
     * 
     * @param request StopWorkflowInstancesRequest
     * @return StopWorkflowInstancesResponse
     */
    public StopWorkflowInstancesResponse stopWorkflowInstances(StopWorkflowInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopWorkflowInstancesWithOptions(request, runtime);
    }

    /**
     * @param request SubmitFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitFileResponse
     */
    public SubmitFileResponse submitFileWithOptions(SubmitFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipAllDeployFileExtensions)) {
            body.put("SkipAllDeployFileExtensions", request.skipAllDeployFileExtensions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFileResponse());
    }

    /**
     * @param request SubmitFileRequest
     * @return SubmitFileResponse
     */
    public SubmitFileResponse submitFile(SubmitFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends multiple instances at a time.</p>
     * 
     * @param tmpReq SuspendTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendTaskInstancesResponse
     */
    public SuspendTaskInstancesResponse suspendTaskInstancesWithOptions(SuspendTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SuspendTaskInstancesShrinkRequest request = new SuspendTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends multiple instances at a time.</p>
     * 
     * @param request SuspendTaskInstancesRequest
     * @return SuspendTaskInstancesResponse
     */
    public SuspendTaskInstancesResponse suspendTaskInstances(SuspendTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to data assets.</p>
     * 
     * @param tmpReq TagDataAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagDataAssetsResponse
     */
    public TagDataAssetsResponse tagDataAssetsWithOptions(TagDataAssetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TagDataAssetsShrinkRequest request = new TagDataAssetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataAssetIds)) {
            request.dataAssetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataAssetIds, "DataAssetIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoTraceEnabled)) {
            query.put("AutoTraceEnabled", request.autoTraceEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetIdsShrink)) {
            query.put("DataAssetIds", request.dataAssetIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetType)) {
            query.put("DataAssetType", request.dataAssetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagDataAssets"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagDataAssetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to data assets.</p>
     * 
     * @param request TagDataAssetsRequest
     * @return TagDataAssetsResponse
     */
    public TagDataAssetsResponse tagDataAssets(TagDataAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagDataAssetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace: Tenant Owner, Workspace Administrator, Deploy, Develop, Workspace Owner, and O\&amp;M</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Tests the connectivity between a data source and a resource group.</p>
     * 
     * @param request TestDataSourceConnectivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestDataSourceConnectivityResponse
     */
    public TestDataSourceConnectivityResponse testDataSourceConnectivityWithOptions(TestDataSourceConnectivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestDataSourceConnectivity"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestDataSourceConnectivityResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace: Tenant Owner, Workspace Administrator, Deploy, Develop, Workspace Owner, and O\&amp;M</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Tests the connectivity between a data source and a resource group.</p>
     * 
     * @param request TestDataSourceConnectivityRequest
     * @return TestDataSourceConnectivityResponse
     */
    public TestDataSourceConnectivityResponse testDataSourceConnectivity(TestDataSourceConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testDataSourceConnectivityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a task to run by using an HTTP Trigger node at a specified time.</p>
     * 
     * @param request TriggerSchedulerTaskInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerSchedulerTaskInstanceResponse
     */
    public TriggerSchedulerTaskInstanceResponse triggerSchedulerTaskInstanceWithOptions(TriggerSchedulerTaskInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTime)) {
            body.put("TriggerTime", request.triggerTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerSchedulerTaskInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerSchedulerTaskInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a task to run by using an HTTP Trigger node at a specified time.</p>
     * 
     * @param request TriggerSchedulerTaskInstanceRequest
     * @return TriggerSchedulerTaskInstanceResponse
     */
    public TriggerSchedulerTaskInstanceResponse triggerSchedulerTaskInstance(TriggerSchedulerTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerSchedulerTaskInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from data assets.</p>
     * 
     * @param tmpReq UnTagDataAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagDataAssetsResponse
     */
    public UnTagDataAssetsResponse unTagDataAssetsWithOptions(UnTagDataAssetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnTagDataAssetsShrinkRequest request = new UnTagDataAssetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataAssetIds)) {
            request.dataAssetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataAssetIds, "DataAssetIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetIdsShrink)) {
            query.put("DataAssetIds", request.dataAssetIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetType)) {
            query.put("DataAssetType", request.dataAssetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagDataAssets"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagDataAssetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from data assets.</p>
     * 
     * @param request UnTagDataAssetsRequest
     * @return UnTagDataAssetsResponse
     */
    public UnTagDataAssetsResponse unTagDataAssets(UnTagDataAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagDataAssetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a custom alert monitoring rule.</p>
     * 
     * @param tmpReq UpdateAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRuleWithOptions(UpdateAlertRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAlertRuleShrinkRequest request = new UpdateAlertRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerCondition)) {
            request.triggerConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerCondition, "TriggerCondition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConditionShrink)) {
            query.put("TriggerCondition", request.triggerConditionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a custom alert monitoring rule.</p>
     * 
     * @param request UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workflow.</p>
     * 
     * @param request UpdateBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBusinessResponse
     */
    public UpdateBusinessResponse updateBusinessWithOptions(UpdateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessName)) {
            body.put("BusinessName", request.businessName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBusiness"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBusinessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workflow.</p>
     * 
     * @param request UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    public UpdateBusinessResponse updateBusiness(UpdateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新字段业务元数据</p>
     * 
     * @param request UpdateColumnBusinessMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateColumnBusinessMetadataResponse
     */
    public UpdateColumnBusinessMetadataResponse updateColumnBusinessMetadataWithOptions(UpdateColumnBusinessMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateColumnBusinessMetadata"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateColumnBusinessMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新字段业务元数据</p>
     * 
     * @param request UpdateColumnBusinessMetadataRequest
     * @return UpdateColumnBusinessMetadataResponse
     */
    public UpdateColumnBusinessMetadataResponse updateColumnBusinessMetadata(UpdateColumnBusinessMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateColumnBusinessMetadataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is currently in beta. To join the beta testing, please submit a request. You can call this operation after we add you to the beta program.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates components.</p>
     * 
     * @param request UpdateComponentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponentWithOptions(UpdateComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentId)) {
            body.put("ComponentId", request.componentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComponent"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComponentResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is currently in beta. To join the beta testing, please submit a request. You can call this operation after we add you to the beta program.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates components.</p>
     * 
     * @param request UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponent(UpdateComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComponentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request UpdateComputeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeResourceResponse
     */
    public UpdateComputeResourceResponse updateComputeResourceWithOptions(UpdateComputeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            query.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPropertiesMode)) {
            query.put("ConnectionPropertiesMode", request.connectionPropertiesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request UpdateComputeResourceRequest
     * @return UpdateComputeResourceResponse
     */
    public UpdateComputeResourceResponse updateComputeResource(UpdateComputeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an alert rule configured for a synchronization task.</p>
     * 
     * @param tmpReq UpdateDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDIAlarmRuleResponse
     */
    public UpdateDIAlarmRuleResponse updateDIAlarmRuleWithOptions(UpdateDIAlarmRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDIAlarmRuleShrinkRequest request = new UpdateDIAlarmRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notificationSettings)) {
            request.notificationSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notificationSettings, "NotificationSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerConditions)) {
            request.triggerConditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerConditions, "TriggerConditions", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIAlarmRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIAlarmRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an alert rule configured for a synchronization task.</p>
     * 
     * @param request UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    public UpdateDIAlarmRuleResponse updateDIAlarmRule(UpdateDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a synchronization task.</p>
     * 
     * @param tmpReq UpdateDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDIJobResponse
     */
    public UpdateDIJobResponse updateDIJobWithOptions(UpdateDIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDIJobShrinkRequest request = new UpdateDIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobSettings)) {
            request.jobSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobSettings, "JobSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSettings)) {
            request.resourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSettings, "ResourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableMappings)) {
            request.tableMappingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableMappings, "TableMappings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transformationRules)) {
            request.transformationRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transformationRules, "TransformationRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            query.put("DIJobId", request.DIJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSettingsShrink)) {
            body.put("JobSettings", request.jobSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSettingsShrink)) {
            body.put("ResourceSettings", request.resourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMappingsShrink)) {
            body.put("TableMappings", request.tableMappingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformationRulesShrink)) {
            body.put("TransformationRules", request.transformationRulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a synchronization task.</p>
     * 
     * @param request UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    public UpdateDIJobResponse updateDIJob(UpdateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tag.</p>
     * 
     * @param tmpReq UpdateDataAssetTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataAssetTagResponse
     */
    public UpdateDataAssetTagResponse updateDataAssetTagWithOptions(UpdateDataAssetTagRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataAssetTagShrinkRequest request = new UpdateDataAssetTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.managers)) {
            request.managersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.managers, "Managers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.values)) {
            request.valuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.values, "Values", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managersShrink)) {
            query.put("Managers", request.managersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valuesShrink)) {
            query.put("Values", request.valuesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataAssetTag"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataAssetTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tag.</p>
     * 
     * @param request UpdateDataAssetTagRequest
     * @return UpdateDataAssetTagResponse
     */
    public UpdateDataAssetTagResponse updateDataAssetTag(UpdateDataAssetTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataAssetTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified data quality monitoring alert rule.</p>
     * 
     * @param tmpReq UpdateDataQualityAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataQualityAlertRuleResponse
     */
    public UpdateDataQualityAlertRuleResponse updateDataQualityAlertRuleWithOptions(UpdateDataQualityAlertRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataQualityAlertRuleShrinkRequest request = new UpdateDataQualityAlertRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.target)) {
            request.targetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.target, "Target", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            body.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            body.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetShrink)) {
            body.put("Target", request.targetShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataQualityAlertRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataQualityAlertRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified data quality monitoring alert rule.</p>
     * 
     * @param request UpdateDataQualityAlertRuleRequest
     * @return UpdateDataQualityAlertRuleResponse
     */
    public UpdateDataQualityAlertRuleResponse updateDataQualityAlertRule(UpdateDataQualityAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataQualityAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is supported in all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a monitor.</p>
     * 
     * @param tmpReq UpdateDataQualityEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataQualityEvaluationTaskResponse
     */
    public UpdateDataQualityEvaluationTaskResponse updateDataQualityEvaluationTaskWithOptions(UpdateDataQualityEvaluationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataQualityEvaluationTaskShrinkRequest request = new UpdateDataQualityEvaluationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataQualityRules)) {
            request.dataQualityRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataQualityRules, "DataQualityRules", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hooks)) {
            request.hooksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hooks, "Hooks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifications)) {
            request.notificationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifications, "Notifications", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.target)) {
            request.targetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.target, "Target", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trigger)) {
            request.triggerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trigger, "Trigger", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityRulesShrink)) {
            body.put("DataQualityRules", request.dataQualityRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooksShrink)) {
            body.put("Hooks", request.hooksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationsShrink)) {
            body.put("Notifications", request.notificationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeConf)) {
            body.put("RuntimeConf", request.runtimeConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetShrink)) {
            body.put("Target", request.targetShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerShrink)) {
            body.put("Trigger", request.triggerShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataQualityEvaluationTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataQualityEvaluationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is supported in all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a monitor.</p>
     * 
     * @param request UpdateDataQualityEvaluationTaskRequest
     * @return UpdateDataQualityEvaluationTaskResponse
     */
    public UpdateDataQualityEvaluationTaskResponse updateDataQualityEvaluationTask(UpdateDataQualityEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataQualityEvaluationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data quality monitoring rule.</p>
     * 
     * @param tmpReq UpdateDataQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataQualityRuleResponse
     */
    public UpdateDataQualityRuleResponse updateDataQualityRuleWithOptions(UpdateDataQualityRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataQualityRuleShrinkRequest request = new UpdateDataQualityRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkingConfig)) {
            request.checkingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkingConfig, "CheckingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.errorHandlers)) {
            request.errorHandlersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.errorHandlers, "ErrorHandlers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.samplingConfig)) {
            request.samplingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.samplingConfig, "SamplingConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkingConfigShrink)) {
            body.put("CheckingConfig", request.checkingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorHandlersShrink)) {
            body.put("ErrorHandlers", request.errorHandlersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingConfigShrink)) {
            body.put("SamplingConfig", request.samplingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            body.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataQualityRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataQualityRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data quality monitoring rule.</p>
     * 
     * @param request UpdateDataQualityRuleRequest
     * @return UpdateDataQualityRuleResponse
     */
    public UpdateDataQualityRuleResponse updateDataQualityRule(UpdateDataQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data quality monitoring rule template.</p>
     * 
     * @param tmpReq UpdateDataQualityRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataQualityRuleTemplateResponse
     */
    public UpdateDataQualityRuleTemplateResponse updateDataQualityRuleTemplateWithOptions(UpdateDataQualityRuleTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataQualityRuleTemplateShrinkRequest request = new UpdateDataQualityRuleTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkingConfig)) {
            request.checkingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkingConfig, "CheckingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.samplingConfig)) {
            request.samplingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.samplingConfig, "SamplingConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkingConfigShrink)) {
            body.put("CheckingConfig", request.checkingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryPath)) {
            body.put("DirectoryPath", request.directoryPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingConfigShrink)) {
            body.put("SamplingConfig", request.samplingConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataQualityRuleTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataQualityRuleTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data quality monitoring rule template.</p>
     * 
     * @param request UpdateDataQualityRuleTemplateRequest
     * @return UpdateDataQualityRuleTemplateResponse
     */
    public UpdateDataQualityRuleTemplateResponse updateDataQualityRuleTemplate(UpdateDataQualityRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataQualityRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a data quality monitor.</p>
     * 
     * @param tmpReq UpdateDataQualityScanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataQualityScanResponse
     */
    public UpdateDataQualityScanResponse updateDataQualityScanWithOptions(UpdateDataQualityScanRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataQualityScanShrinkRequest request = new UpdateDataQualityScanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.computeResource)) {
            request.computeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.computeResource, "ComputeResource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hooks)) {
            request.hooksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hooks, "Hooks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimeResource)) {
            request.runtimeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimeResource, "RuntimeResource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trigger)) {
            request.triggerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trigger, "Trigger", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computeResourceShrink)) {
            body.put("ComputeResource", request.computeResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooksShrink)) {
            body.put("Hooks", request.hooksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            body.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResourceShrink)) {
            body.put("RuntimeResource", request.runtimeResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerShrink)) {
            body.put("Trigger", request.triggerShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataQualityScan"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataQualityScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a data quality monitor.</p>
     * 
     * @param request UpdateDataQualityScanRequest
     * @return UpdateDataQualityScanResponse
     */
    public UpdateDataQualityScanResponse updateDataQualityScan(UpdateDataQualityScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataQualityScanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a data quality rule template in a project</p>
     * 
     * @param request UpdateDataQualityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataQualityTemplateResponse
     */
    public UpdateDataQualityTemplateResponse updateDataQualityTemplateWithOptions(UpdateDataQualityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataQualityTemplate"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataQualityTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a data quality rule template in a project</p>
     * 
     * @param request UpdateDataQualityTemplateRequest
     * @return UpdateDataQualityTemplateResponse
     */
    public UpdateDataQualityTemplateResponse updateDataQualityTemplate(UpdateDataQualityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataQualityTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a data source by ID.</p>
     * 
     * @param request UpdateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            query.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPropertiesMode)) {
            query.put("ConnectionPropertiesMode", request.connectionPropertiesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a data source by ID.</p>
     * 
     * @param request UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates dataset information. Only DataWorks datasets are supported. The operator must be the creator of the dataset or the administrator of the workspace where the dataset is located.</p>
     * 
     * @param request UpdateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDatasetWithOptions(UpdateDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readme)) {
            body.put("Readme", request.readme);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataset"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates dataset information. Only DataWorks datasets are supported. The operator must be the creator of the dataset or the administrator of the workspace where the dataset is located.</p>
     * 
     * @param request UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates dataset version information. Only DataWorks datasets are supported. Requires dataset creator or workspace administrator permissions.</p>
     * 
     * @param request UpdateDatasetVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasetVersionResponse
     */
    public UpdateDatasetVersionResponse updateDatasetVersionWithOptions(UpdateDatasetVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDatasetVersion"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasetVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates dataset version information. Only DataWorks datasets are supported. Requires dataset creator or workspace administrator permissions.</p>
     * 
     * @param request UpdateDatasetVersionRequest
     * @return UpdateDatasetVersionResponse
     */
    public UpdateDatasetVersionResponse updateDatasetVersion(UpdateDatasetVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDatasetVersionWithOptions(request, runtime);
    }

    /**
     * @param request UpdateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFileWithOptions(UpdateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedSettings)) {
            body.put("AdvancedSettings", request.advancedSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyScheduleImmediately)) {
            body.put("ApplyScheduleImmediately", request.applyScheduleImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoParsing)) {
            body.put("AutoParsing", request.autoParsing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunIntervalMillis)) {
            body.put("AutoRerunIntervalMillis", request.autoRerunIntervalMillis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunTimes)) {
            body.put("AutoRerunTimes", request.autoRerunTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            body.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpress)) {
            body.put("CronExpress", request.cronExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentNodeIdList)) {
            body.put("DependentNodeIdList", request.dependentNodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentType)) {
            body.put("DependentType", request.dependentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endEffectDate)) {
            body.put("EndEffectDate", request.endEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDescription)) {
            body.put("FileDescription", request.fileDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreParentSkipRunningProperty)) {
            body.put("IgnoreParentSkipRunningProperty", request.ignoreParentSkipRunningProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputList)) {
            body.put("InputList", request.inputList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParameters)) {
            body.put("InputParameters", request.inputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputList)) {
            body.put("OutputList", request.outputList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputParameters)) {
            body.put("OutputParameters", request.outputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paraValue)) {
            body.put("ParaValue", request.paraValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunMode)) {
            body.put("RerunMode", request.rerunMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdentifier)) {
            body.put("ResourceGroupIdentifier", request.resourceGroupIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEffectDate)) {
            body.put("StartEffectDate", request.startEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startImmediately)) {
            body.put("StartImmediately", request.startImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            body.put("Stop", request.stop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileResponse());
    }

    /**
     * @param request UpdateFileRequest
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileWithOptions(request, runtime);
    }

    /**
     * @param request UpdateFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderName)) {
            body.put("FolderName", request.folderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFolder"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFolderResponse());
    }

    /**
     * @param request UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a user-defined function (UDF) in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunctionWithOptions(UpdateFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a user-defined function (UDF) in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回调扩展点消息的检查结果</p>
     * 
     * @param request UpdateIDEEventResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIDEEventResultResponse
     */
    public UpdateIDEEventResultResponse updateIDEEventResultWithOptions(UpdateIDEEventResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            body.put("CheckResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkResultTip)) {
            body.put("CheckResultTip", request.checkResultTip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionCode)) {
            body.put("ExtensionCode", request.extensionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIDEEventResult"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIDEEventResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>回调扩展点消息的检查结果</p>
     * 
     * @param request UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    public UpdateIDEEventResultResponse updateIDEEventResult(UpdateIDEEventResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIDEEventResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a collection in Data Map, including the collection name, description, and administrator. Collections include categories and data albums. If you want to update the information about a data album, the account that you use must be attached the AliyunDataWorksFullAccess policy, or you are the data album creator or administrator.</p>
     * 
     * @param tmpReq UpdateMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetaCollectionResponse
     */
    public UpdateMetaCollectionResponse updateMetaCollectionWithOptions(UpdateMetaCollectionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMetaCollectionShrinkRequest request = new UpdateMetaCollectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.administrators)) {
            request.administratorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.administrators, "Administrators", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.administratorsShrink)) {
            query.put("Administrators", request.administratorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaCollection"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a collection in Data Map, including the collection name, description, and administrator. Collections include categories and data albums. If you want to update the information about a data album, the account that you use must be attached the AliyunDataWorksFullAccess policy, or you are the data album creator or administrator.</p>
     * 
     * @param request UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    public UpdateMetaCollectionResponse updateMetaCollection(UpdateMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a node in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNodeWithOptions(UpdateNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a node in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateNodeRequest
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a DataWorks workspace.</p>
     * 
     * @param request UpdateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEnvironmentEnabled)) {
            body.put("DevEnvironmentEnabled", request.devEnvironmentEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devRoleDisabled)) {
            body.put("DevRoleDisabled", request.devRoleDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paiTaskEnabled)) {
            body.put("PaiTaskEnabled", request.paiTaskEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a DataWorks workspace.</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a file resource in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResourceWithOptions(UpdateResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFile)) {
            body.put("ResourceFile", request.resourceFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a file resource in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceWithOptions(request, runtime);
    }

    public UpdateResourceResponse updateResourceAdvance(UpdateResourceAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "dataworks-public"),
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
        UpdateResourceRequest updateResourceReq = new UpdateResourceRequest();
        com.aliyun.openapiutil.Client.convert(request, updateResourceReq);
        if (!com.aliyun.teautil.Common.isUnset(request.resourceFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.resourceFileObject),
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
            updateResourceReq.resourceFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        UpdateResourceResponse updateResourceResp = this.updateResourceWithOptions(updateResourceReq, runtime);
        return updateResourceResp;
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates basic information about a resource group.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroupWithOptions(UpdateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupId)) {
            body.put("AliyunResourceGroupId", request.aliyunResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates basic information about a resource group.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about a route.</p>
     * 
     * @param request UpdateRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRouteResponse
     */
    public UpdateRouteResponse updateRouteWithOptions(UpdateRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            body.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about a route.</p>
     * 
     * @param request UpdateRouteRequest
     * @return UpdateRouteResponse
     */
    public UpdateRouteResponse updateRoute(UpdateRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the business metadata of a table in Data Map. Currently, only the usage notes of a table can be updated.</p>
     * 
     * @param request UpdateTableBusinessMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableBusinessMetadataResponse
     */
    public UpdateTableBusinessMetadataResponse updateTableBusinessMetadataWithOptions(UpdateTableBusinessMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readme)) {
            body.put("Readme", request.readme);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableBusinessMetadata"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableBusinessMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the business metadata of a table in Data Map. Currently, only the usage notes of a table can be updated.</p>
     * 
     * @param request UpdateTableBusinessMetadataRequest
     * @return UpdateTableBusinessMetadataResponse
     */
    public UpdateTableBusinessMetadataResponse updateTableBusinessMetadata(UpdateTableBusinessMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableBusinessMetadataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update a task. The changes are synchronized to Data Studio, which creates a new saved version.</p>
     * 
     * @param tmpReq UpdateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTaskWithOptions(UpdateTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskShrinkRequest request = new UpdateTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSource)) {
            request.dataSourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSource, "DataSource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependencies)) {
            request.dependenciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependencies, "Dependencies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimeResource)) {
            request.runtimeResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimeResource, "RuntimeResource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.script)) {
            request.scriptShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.script, "Script", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trigger)) {
            request.triggerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trigger, "Trigger", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientUniqueCode)) {
            body.put("ClientUniqueCode", request.clientUniqueCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceShrink)) {
            body.put("DataSource", request.dataSourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependenciesShrink)) {
            body.put("Dependencies", request.dependenciesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            body.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceMode)) {
            body.put("InstanceMode", request.instanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsShrink)) {
            body.put("Outputs", request.outputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunInterval)) {
            body.put("RerunInterval", request.rerunInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunMode)) {
            body.put("RerunMode", request.rerunMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunTimes)) {
            body.put("RerunTimes", request.rerunTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResourceShrink)) {
            body.put("RuntimeResource", request.runtimeResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptShrink)) {
            body.put("Script", request.scriptShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerShrink)) {
            body.put("Trigger", request.triggerShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update a task. The changes are synchronized to Data Studio, which creates a new saved version.</p>
     * 
     * @param request UpdateTaskRequest
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies properties configured for multiple instances at a time. The properties include the priority, resource group for scheduling, and data source.</p>
     * 
     * @param tmpReq UpdateTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskInstancesResponse
     */
    public UpdateTaskInstancesResponse updateTaskInstancesWithOptions(UpdateTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskInstancesShrinkRequest request = new UpdateTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskInstances)) {
            request.taskInstancesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskInstances, "TaskInstances", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskInstancesShrink)) {
            body.put("TaskInstances", request.taskInstancesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies properties configured for multiple instances at a time. The properties include the priority, resource group for scheduling, and data source.</p>
     * 
     * @param request UpdateTaskInstancesRequest
     * @return UpdateTaskInstancesResponse
     */
    public UpdateTaskInstancesResponse updateTaskInstances(UpdateTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param request UpdateUdfFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUdfFileResponse
     */
    public UpdateUdfFileResponse updateUdfFileWithOptions(UpdateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("ClassName", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdDescription)) {
            body.put("CmdDescription", request.cmdDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.example)) {
            body.put("Example", request.example);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            body.put("FunctionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterDescription)) {
            body.put("ParameterDescription", request.parameterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnValue)) {
            body.put("ReturnValue", request.returnValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udfDescription)) {
            body.put("UdfDescription", request.udfDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUdfFile"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUdfFileResponse());
    }

    /**
     * @param request UpdateUdfFileRequest
     * @return UpdateUdfFileResponse
     */
    public UpdateUdfFileResponse updateUdfFile(UpdateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUdfFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified workflow in full update mode.</p>
     * 
     * @param tmpReq UpdateWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflowWithOptions(UpdateWorkflowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkflowShrinkRequest request = new UpdateWorkflowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependencies)) {
            request.dependenciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependencies, "Dependencies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tasks)) {
            request.tasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tasks, "Tasks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trigger)) {
            request.triggerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trigger, "Trigger", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientUniqueCode)) {
            body.put("ClientUniqueCode", request.clientUniqueCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependenciesShrink)) {
            body.put("Dependencies", request.dependenciesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceMode)) {
            body.put("InstanceMode", request.instanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputsShrink)) {
            body.put("Outputs", request.outputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tasksShrink)) {
            body.put("Tasks", request.tasksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerShrink)) {
            body.put("Trigger", request.triggerShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflow"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified workflow in full update mode.</p>
     * 
     * @param request UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows in the FlowSpec filed, only the first workflow is created. Other specified workflows and the nodes in the workflows are ignored. You can call the UpdateNode operation to update a node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information about a workflow in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowDefinitionResponse
     */
    public UpdateWorkflowDefinitionResponse updateWorkflowDefinitionWithOptions(UpdateWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows in the FlowSpec filed, only the first workflow is created. Other specified workflows and the nodes in the workflows are ignored. You can call the UpdateNode operation to update a node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information about a workflow in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateWorkflowDefinitionRequest
     * @return UpdateWorkflowDefinitionResponse
     */
    public UpdateWorkflowDefinitionResponse updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowDefinitionWithOptions(request, runtime);
    }
}
