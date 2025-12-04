// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706;

import com.aliyun.tea.*;
import com.aliyun.actiontrail20200706.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "actiontrail.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-edge-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-fujian", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-wuhan", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "actiontrail.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "actiontrail.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "actiontrail.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("actiontrail", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建高级查询历史记录</p>
     * 
     * @param request CreateAdvancedQueryHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAdvancedQueryHistoryResponse
     */
    public CreateAdvancedQueryHistoryResponse createAdvancedQueryHistoryWithOptions(CreateAdvancedQueryHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.querySql)) {
            query.put("QuerySql", request.querySql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simpleQuery)) {
            query.put("SimpleQuery", request.simpleQuery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdvancedQueryHistory"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdvancedQueryHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建高级查询历史记录</p>
     * 
     * @param request CreateAdvancedQueryHistoryRequest
     * @return CreateAdvancedQueryHistoryResponse
     */
    public CreateAdvancedQueryHistoryResponse createAdvancedQueryHistory(CreateAdvancedQueryHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdvancedQueryHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建高级查询模板</p>
     * 
     * @param request CreateAdvancedQueryTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAdvancedQueryTemplateResponse
     */
    public CreateAdvancedQueryTemplateResponse createAdvancedQueryTemplateWithOptions(CreateAdvancedQueryTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.simpleQuery)) {
            query.put("SimpleQuery", request.simpleQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateSql)) {
            query.put("TemplateSql", request.templateSql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdvancedQueryTemplate"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdvancedQueryTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建高级查询模板</p>
     * 
     * @param request CreateAdvancedQueryTemplateRequest
     * @return CreateAdvancedQueryTemplateResponse
     */
    public CreateAdvancedQueryTemplateResponse createAdvancedQueryTemplate(CreateAdvancedQueryTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdvancedQueryTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Limits</p>
     * <ul>
     * <li>Make sure that you have created a single-account trail to deliver events to Simple Log Service by calling the <a href="https://help.aliyun.com/document_detail/212313.html">CreateTrail</a> operation.</li>
     * <li>Only one data backfill task can run at a time within an Alibaba Cloud account.
     * This topic provides an example on how to create a data backfill task for a trail named <code>trail-name</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data backfill task.</p>
     * 
     * @param request CreateDeliveryHistoryJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeliveryHistoryJobResponse
     */
    public CreateDeliveryHistoryJobResponse createDeliveryHistoryJobWithOptions(CreateDeliveryHistoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailName)) {
            query.put("TrailName", request.trailName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryHistoryJob"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryHistoryJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Limits</p>
     * <ul>
     * <li>Make sure that you have created a single-account trail to deliver events to Simple Log Service by calling the <a href="https://help.aliyun.com/document_detail/212313.html">CreateTrail</a> operation.</li>
     * <li>Only one data backfill task can run at a time within an Alibaba Cloud account.
     * This topic provides an example on how to create a data backfill task for a trail named <code>trail-name</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data backfill task.</p>
     * 
     * @param request CreateDeliveryHistoryJobRequest
     * @return CreateDeliveryHistoryJobResponse
     */
    public CreateDeliveryHistoryJobResponse createDeliveryHistoryJob(CreateDeliveryHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeliveryHistoryJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Operation description</em>*</p>
     * <blockquote>
     * <p>By default, a trail that is created by calling an operation is in the Disabled state. You must call the StartLogging operation to enable the trail. This way, ActionTrail can deliver events to the destination cloud service.
     * <strong>Prerequisites</strong>
     * Before you create a trail, make sure that at least one of the following storage configurations is complete:</p>
     * </blockquote>
     * <ul>
     * <li><p>Deliver events to OSS</p>
     * <ul>
     * <li>OSS is activated and a bucket is created.</li>
     * </ul>
     * </li>
     * <li><p>Deliver events to Simple Log Service</p>
     * <ul>
     * <li>Simple Log Service is activated and a project is created.<blockquote>
     * <p>When a trail is created, ActionTrail automatically creates a Logstore named <code>actiontrail_&lt;Trail name&gt;</code> in the project. You cannot write data other than the audit data to the Logstore. This ensures the accuracy of the audit data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Deliver events to MaxCompute</p>
     * <ul>
     * <li>MaxCompute is activated.<blockquote>
     * <p>When a trail is created, ActionTrail automatically creates a project named <code>actiontrail_&lt;Account ID&gt;</code> on the Projects page. You cannot write data other than the audit data to the project. This ensures the accuracy of the audit data.
     * <strong>Usage Notes</strong>
     * This topic provides an example on how to create a single-account trail named <code>trail-test</code> to deliver events to an OSS bucket named <code>audit-log</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a trail. By default, ActionTrail allows you to query events generated within your Alibaba Cloud account in the last 90 days. To query and analyze events generated more than 90 days ago, create a trail to deliver events to Object Storage Service (OSS), Simple Log Service, or MaxCompute.</p>
     * 
     * @param request CreateTrailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrailResponse
     */
    public CreateTrailResponse createTrailWithOptions(CreateTrailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventRW)) {
            query.put("EventRW", request.eventRW);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOrganizationTrail)) {
            query.put("IsOrganizationTrail", request.isOrganizationTrail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectArn)) {
            query.put("MaxComputeProjectArn", request.maxComputeProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeWriteRoleArn)) {
            query.put("MaxComputeWriteRoleArn", request.maxComputeWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKeyPrefix)) {
            query.put("OssKeyPrefix", request.ossKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossWriteRoleArn)) {
            query.put("OssWriteRoleArn", request.ossWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectArn)) {
            query.put("SlsProjectArn", request.slsProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsWriteRoleArn)) {
            query.put("SlsWriteRoleArn", request.slsWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailRegion)) {
            query.put("TrailRegion", request.trailRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrail"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrailResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Operation description</em>*</p>
     * <blockquote>
     * <p>By default, a trail that is created by calling an operation is in the Disabled state. You must call the StartLogging operation to enable the trail. This way, ActionTrail can deliver events to the destination cloud service.
     * <strong>Prerequisites</strong>
     * Before you create a trail, make sure that at least one of the following storage configurations is complete:</p>
     * </blockquote>
     * <ul>
     * <li><p>Deliver events to OSS</p>
     * <ul>
     * <li>OSS is activated and a bucket is created.</li>
     * </ul>
     * </li>
     * <li><p>Deliver events to Simple Log Service</p>
     * <ul>
     * <li>Simple Log Service is activated and a project is created.<blockquote>
     * <p>When a trail is created, ActionTrail automatically creates a Logstore named <code>actiontrail_&lt;Trail name&gt;</code> in the project. You cannot write data other than the audit data to the Logstore. This ensures the accuracy of the audit data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Deliver events to MaxCompute</p>
     * <ul>
     * <li>MaxCompute is activated.<blockquote>
     * <p>When a trail is created, ActionTrail automatically creates a project named <code>actiontrail_&lt;Account ID&gt;</code> on the Projects page. You cannot write data other than the audit data to the project. This ensures the accuracy of the audit data.
     * <strong>Usage Notes</strong>
     * This topic provides an example on how to create a single-account trail named <code>trail-test</code> to deliver events to an OSS bucket named <code>audit-log</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a trail. By default, ActionTrail allows you to query events generated within your Alibaba Cloud account in the last 90 days. To query and analyze events generated more than 90 days ago, create a trail to deliver events to Object Storage Service (OSS), Simple Log Service, or MaxCompute.</p>
     * 
     * @param request CreateTrailRequest
     * @return CreateTrailResponse
     */
    public CreateTrailResponse createTrail(CreateTrailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除高级查询历史记录</p>
     * 
     * @param request DeleteAdvancedQueryHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAdvancedQueryHistoryResponse
     */
    public DeleteAdvancedQueryHistoryResponse deleteAdvancedQueryHistoryWithOptions(DeleteAdvancedQueryHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAdvancedQueryHistory"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdvancedQueryHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除高级查询历史记录</p>
     * 
     * @param request DeleteAdvancedQueryHistoryRequest
     * @return DeleteAdvancedQueryHistoryResponse
     */
    public DeleteAdvancedQueryHistoryResponse deleteAdvancedQueryHistory(DeleteAdvancedQueryHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAdvancedQueryHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除高级查询模板</p>
     * 
     * @param request DeleteAdvancedQueryTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAdvancedQueryTemplateResponse
     */
    public DeleteAdvancedQueryTemplateResponse deleteAdvancedQueryTemplateWithOptions(DeleteAdvancedQueryTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAdvancedQueryTemplate"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdvancedQueryTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除高级查询模板</p>
     * 
     * @param request DeleteAdvancedQueryTemplateRequest
     * @return DeleteAdvancedQueryTemplateResponse
     */
    public DeleteAdvancedQueryTemplateResponse deleteAdvancedQueryTemplate(DeleteAdvancedQueryTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAdvancedQueryTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据事件选择器</p>
     * 
     * @param request DeleteDataEventSelectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataEventSelectorResponse
     */
    public DeleteDataEventSelectorResponse deleteDataEventSelectorWithOptions(DeleteDataEventSelectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trailName)) {
            query.put("TrailName", request.trailName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataEventSelector"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataEventSelectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据事件选择器</p>
     * 
     * @param request DeleteDataEventSelectorRequest
     * @return DeleteDataEventSelectorResponse
     */
    public DeleteDataEventSelectorResponse deleteDataEventSelector(DeleteDataEventSelectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataEventSelectorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a data backfill task whose ID is <code>16602</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data backfill task.</p>
     * 
     * @param request DeleteDeliveryHistoryJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeliveryHistoryJobResponse
     */
    public DeleteDeliveryHistoryJobResponse deleteDeliveryHistoryJobWithOptions(DeleteDeliveryHistoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeliveryHistoryJob"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeliveryHistoryJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a data backfill task whose ID is <code>16602</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data backfill task.</p>
     * 
     * @param request DeleteDeliveryHistoryJobRequest
     * @return DeleteDeliveryHistoryJobResponse
     */
    public DeleteDeliveryHistoryJobResponse deleteDeliveryHistoryJob(DeleteDeliveryHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeliveryHistoryJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a sample trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a trail.</p>
     * 
     * @param request DeleteTrailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrailResponse
     */
    public DeleteTrailResponse deleteTrailWithOptions(DeleteTrailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrail"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrailResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a sample trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a trail.</p>
     * 
     * @param request DeleteTrailRequest
     * @return DeleteTrailResponse
     */
    public DeleteTrailResponse deleteTrail(DeleteTrailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTrailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询高级查询历史记录</p>
     * 
     * @param request DescribeAdvancedQueryHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvancedQueryHistoryResponse
     */
    public DescribeAdvancedQueryHistoryResponse describeAdvancedQueryHistoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvancedQueryHistory"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvancedQueryHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询高级查询历史记录</p>
     * @return DescribeAdvancedQueryHistoryResponse
     */
    public DescribeAdvancedQueryHistoryResponse describeAdvancedQueryHistory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvancedQueryHistoryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询高级查询模板</p>
     * 
     * @param request DescribeAdvancedQueryTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvancedQueryTemplateResponse
     */
    public DescribeAdvancedQueryTemplateResponse describeAdvancedQueryTemplateWithOptions(DescribeAdvancedQueryTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvancedQueryTemplate"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvancedQueryTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询高级查询模板</p>
     * 
     * @param request DescribeAdvancedQueryTemplateRequest
     * @return DescribeAdvancedQueryTemplateResponse
     */
    public DescribeAdvancedQueryTemplateResponse describeAdvancedQueryTemplate(DescribeAdvancedQueryTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvancedQueryTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud regions that are supported by ActionTrail.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-07-06"),
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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud regions that are supported by ActionTrail.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举资源生命周期事件</p>
     * 
     * @param request DescribeResourceLifeCycleEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceLifeCycleEventsResponse
     */
    public DescribeResourceLifeCycleEventsResponse describeResourceLifeCycleEventsWithOptions(DescribeResourceLifeCycleEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceLifeCycleEvents"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceLifeCycleEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举资源生命周期事件</p>
     * 
     * @param request DescribeResourceLifeCycleEventsRequest
     * @return DescribeResourceLifeCycleEventsResponse
     */
    public DescribeResourceLifeCycleEventsResponse describeResourceLifeCycleEvents(DescribeResourceLifeCycleEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceLifeCycleEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有场景</p>
     * 
     * @param request DescribeScenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScenesResponse
     */
    public DescribeScenesResponse describeScenesWithOptions(DescribeScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchCode)) {
            query.put("SearchCode", request.searchCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScenes"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有场景</p>
     * 
     * @param request DescribeScenesRequest
     * @return DescribeScenesResponse
     */
    public DescribeScenesResponse describeScenes(DescribeScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScenesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举所有模版</p>
     * 
     * @param request DescribeSearchTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSearchTemplatesResponse
     */
    public DescribeSearchTemplatesResponse describeSearchTemplatesWithOptions(DescribeSearchTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSearchTemplates"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSearchTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举所有模版</p>
     * 
     * @param request DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     */
    public DescribeSearchTemplatesResponse describeSearchTemplates(DescribeSearchTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSearchTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named <code>test-4</code> is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries created trails.</p>
     * 
     * @param request DescribeTrailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrailsResponse
     */
    public DescribeTrailsResponse describeTrailsWithOptions(DescribeTrailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeOrganizationTrail)) {
            query.put("IncludeOrganizationTrail", request.includeOrganizationTrail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeShadowTrails)) {
            query.put("IncludeShadowTrails", request.includeShadowTrails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameList)) {
            query.put("NameList", request.nameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrails"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrailsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named <code>test-4</code> is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries created trails.</p>
     * 
     * @param request DescribeTrailsRequest
     * @return DescribeTrailsResponse
     */
    public DescribeTrailsResponse describeTrails(DescribeTrailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户告警量</p>
     * 
     * @param request DescribeUserAlertCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAlertCountResponse
     */
    public DescribeUserAlertCountResponse describeUserAlertCountWithOptions(DescribeUserAlertCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAlertCount"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAlertCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户告警量</p>
     * 
     * @param request DescribeUserAlertCountRequest
     * @return DescribeUserAlertCountResponse
     */
    public DescribeUserAlertCountResponse describeUserAlertCount(DescribeUserAlertCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAlertCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户日志量</p>
     * 
     * @param request DescribeUserLogCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserLogCountResponse
     */
    public DescribeUserLogCountResponse describeUserLogCountWithOptions(DescribeUserLogCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserLogCount"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserLogCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户日志量</p>
     * 
     * @param request DescribeUserLogCountRequest
     * @return DescribeUserLogCountResponse
     */
    public DescribeUserLogCountResponse describeUserLogCount(DescribeUserLogCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserLogCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Insights feature</p>
     * 
     * @param request EnableInsightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInsightResponse
     */
    public EnableInsightResponse enableInsightWithOptions(EnableInsightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.insightType)) {
            query.put("InsightType", request.insightType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInsight"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInsightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Insights feature</p>
     * 
     * @param request EnableInsightRequest
     * @return EnableInsightResponse
     */
    public EnableInsightResponse enableInsight(EnableInsightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInsightWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see <a href="https://help.aliyun.com/document_detail/419214.html">Alibaba Cloud services and events that are supported by the AccessKey pair audit feature</a>. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the most recent events that are generated when a specified AccessKey pair is called to access Alibaba Cloud services.</p>
     * 
     * @param request GetAccessKeyLastUsedEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessKeyLastUsedEventsResponse
     */
    public GetAccessKeyLastUsedEventsResponse getAccessKeyLastUsedEventsWithOptions(GetAccessKeyLastUsedEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedEvents"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see <a href="https://help.aliyun.com/document_detail/419214.html">Alibaba Cloud services and events that are supported by the AccessKey pair audit feature</a>. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the most recent events that are generated when a specified AccessKey pair is called to access Alibaba Cloud services.</p>
     * 
     * @param request GetAccessKeyLastUsedEventsRequest
     * @return GetAccessKeyLastUsedEventsResponse
     */
    public GetAccessKeyLastUsedEventsResponse getAccessKeyLastUsedEvents(GetAccessKeyLastUsedEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the most recent call of a specified AccessKey pair.</p>
     * 
     * @param request GetAccessKeyLastUsedInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessKeyLastUsedInfoResponse
     */
    public GetAccessKeyLastUsedInfoResponse getAccessKeyLastUsedInfoWithOptions(GetAccessKeyLastUsedInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedInfo"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the most recent call of a specified AccessKey pair.</p>
     * 
     * @param request GetAccessKeyLastUsedInfoRequest
     * @return GetAccessKeyLastUsedInfoResponse
     */
    public GetAccessKeyLastUsedInfoResponse getAccessKeyLastUsedInfo(GetAccessKeyLastUsedInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the IP addresses that are most recently used when an AccessKey pair is called to access Alibaba Cloud services.</p>
     * 
     * @param request GetAccessKeyLastUsedIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessKeyLastUsedIpsResponse
     */
    public GetAccessKeyLastUsedIpsResponse getAccessKeyLastUsedIpsWithOptions(GetAccessKeyLastUsedIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedIps"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedIpsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the IP addresses that are most recently used when an AccessKey pair is called to access Alibaba Cloud services.</p>
     * 
     * @param request GetAccessKeyLastUsedIpsRequest
     * @return GetAccessKeyLastUsedIpsResponse
     */
    public GetAccessKeyLastUsedIpsResponse getAccessKeyLastUsedIps(GetAccessKeyLastUsedIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedIpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair.</p>
     * 
     * @param request GetAccessKeyLastUsedProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessKeyLastUsedProductsResponse
     */
    public GetAccessKeyLastUsedProductsResponse getAccessKeyLastUsedProductsWithOptions(GetAccessKeyLastUsedProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedProducts"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair.</p>
     * 
     * @param request GetAccessKeyLastUsedProductsRequest
     * @return GetAccessKeyLastUsedProductsResponse
     */
    public GetAccessKeyLastUsedProductsResponse getAccessKeyLastUsedProducts(GetAccessKeyLastUsedProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedProductsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the resources that are most recently accessed by using a specified AccessKey pair.</p>
     * 
     * @param request GetAccessKeyLastUsedResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessKeyLastUsedResourcesResponse
     */
    public GetAccessKeyLastUsedResourcesResponse getAccessKeyLastUsedResourcesWithOptions(GetAccessKeyLastUsedResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedResources"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the resources that are most recently accessed by using a specified AccessKey pair.</p>
     * 
     * @param request GetAccessKeyLastUsedResourcesRequest
     * @return GetAccessKeyLastUsedResourcesResponse
     */
    public GetAccessKeyLastUsedResourcesResponse getAccessKeyLastUsedResources(GetAccessKeyLastUsedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个高级查询模板</p>
     * 
     * @param request GetAdvancedQueryTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdvancedQueryTemplateResponse
     */
    public GetAdvancedQueryTemplateResponse getAdvancedQueryTemplateWithOptions(GetAdvancedQueryTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvancedQueryTemplate"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvancedQueryTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个高级查询模板</p>
     * 
     * @param request GetAdvancedQueryTemplateRequest
     * @return GetAdvancedQueryTemplateResponse
     */
    public GetAdvancedQueryTemplateResponse getAdvancedQueryTemplate(GetAdvancedQueryTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdvancedQueryTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件选择器</p>
     * 
     * @param request GetDataEventSelectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataEventSelectorResponse
     */
    public GetDataEventSelectorResponse getDataEventSelectorWithOptions(GetDataEventSelectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trailName)) {
            query.put("TrailName", request.trailName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataEventSelector"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataEventSelectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件选择器</p>
     * 
     * @param request GetDataEventSelectorRequest
     * @return GetDataEventSelectorResponse
     */
    public GetDataEventSelectorResponse getDataEventSelector(GetDataEventSelectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataEventSelectorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a data backfill task whose ID is <code>16602</code>. The return result shows that historical events for a trail named <code>trail-name</code> are delivered to Simple Log Service and the task is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a data backfill task.</p>
     * 
     * @param request GetDeliveryHistoryJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeliveryHistoryJobResponse
     */
    public GetDeliveryHistoryJobResponse getDeliveryHistoryJobWithOptions(GetDeliveryHistoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeliveryHistoryJob"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeliveryHistoryJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a data backfill task whose ID is <code>16602</code>. The return result shows that historical events for a trail named <code>trail-name</code> are delivered to Simple Log Service and the task is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a data backfill task.</p>
     * 
     * @param request GetDeliveryHistoryJobRequest
     * @return GetDeliveryHistoryJobResponse
     */
    public GetDeliveryHistoryJobResponse getDeliveryHistoryJob(GetDeliveryHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeliveryHistoryJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.
     * To obtain the permissions to call the API operation, you must submit a ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the region where global events are stored.</p>
     * 
     * @param request GetGlobalEventsStorageRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGlobalEventsStorageRegionResponse
     */
    public GetGlobalEventsStorageRegionResponse getGlobalEventsStorageRegionWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGlobalEventsStorageRegion"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGlobalEventsStorageRegionResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.
     * To obtain the permissions to call the API operation, you must submit a ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the region where global events are stored.</p>
     * @return GetGlobalEventsStorageRegionResponse
     */
    public GetGlobalEventsStorageRegionResponse getGlobalEventsStorageRegion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGlobalEventsStorageRegionWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>操作审计成熟度查询接口</p>
     * 
     * @param request GetGovernanceMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGovernanceMetricsResponse
     */
    public GetGovernanceMetricsResponse getGovernanceMetricsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGovernanceMetrics"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGovernanceMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>操作审计成熟度查询接口</p>
     * @return GetGovernanceMetricsResponse
     */
    public GetGovernanceMetricsResponse getGovernanceMetrics() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGovernanceMetricsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of a sample single-account trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a trail.</p>
     * 
     * @param request GetTrailStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrailStatusResponse
     */
    public GetTrailStatusResponse getTrailStatusWithOptions(GetTrailStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isOrganizationTrail)) {
            query.put("IsOrganizationTrail", request.isOrganizationTrail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrailStatus"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrailStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of a sample single-account trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a trail.</p>
     * 
     * @param request GetTrailStatusRequest
     * @return GetTrailStatusResponse
     */
    public GetTrailStatusResponse getTrailStatus(GetTrailStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrailStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询事件选择器</p>
     * 
     * @param request ListDataEventSelectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataEventSelectorsResponse
     */
    public ListDataEventSelectorsResponse listDataEventSelectorsWithOptions(ListDataEventSelectorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataEventSelectors"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataEventSelectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询事件选择器</p>
     * 
     * @param request ListDataEventSelectorsRequest
     * @return ListDataEventSelectorsResponse
     */
    public ListDataEventSelectorsResponse listDataEventSelectors(ListDataEventSelectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataEventSelectorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据事件支持的服务与事件名称</p>
     * 
     * @param request ListDataEventServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataEventServicesResponse
     */
    public ListDataEventServicesResponse listDataEventServicesWithOptions(ListDataEventServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataEventServices"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataEventServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据事件支持的服务与事件名称</p>
     * 
     * @param request ListDataEventServicesRequest
     * @return ListDataEventServicesResponse
     */
    public ListDataEventServicesResponse listDataEventServices(ListDataEventServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataEventServicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query a list of data backfill tasks. The returned result shows that a data backfill task with the ID <code>16602</code> is used to deliver historical events for a trail named <code>trail-name</code> to Simple Log Service.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data backfill tasks.</p>
     * 
     * @param request ListDeliveryHistoryJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeliveryHistoryJobsResponse
     */
    public ListDeliveryHistoryJobsResponse listDeliveryHistoryJobsWithOptions(ListDeliveryHistoryJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListDeliveryHistoryJobs"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeliveryHistoryJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query a list of data backfill tasks. The returned result shows that a data backfill task with the ID <code>16602</code> is used to deliver historical events for a trail named <code>trail-name</code> to Simple Log Service.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data backfill tasks.</p>
     * 
     * @param request ListDeliveryHistoryJobsRequest
     * @return ListDeliveryHistoryJobsResponse
     */
    public ListDeliveryHistoryJobsResponse listDeliveryHistoryJobs(ListDeliveryHistoryJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeliveryHistoryJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to query event details, you can query the event details at most twice per second.</p>
     * <blockquote>
     * <p>Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/28810.html">Create a single-account trail</a>, <a href="https://help.aliyun.com/document_detail/160661.html">Create a multi-account trail</a>, and <a href="https://help.aliyun.com/document_detail/28997.html">Overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries event details.</p>
     * 
     * @param request LookupEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LookupEventsResponse
     */
    public LookupEventsResponse lookupEventsWithOptions(LookupEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lookupAttribute)) {
            query.put("LookupAttribute", request.lookupAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LookupEvents"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LookupEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to query event details, you can query the event details at most twice per second.</p>
     * <blockquote>
     * <p>Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/28810.html">Create a single-account trail</a>, <a href="https://help.aliyun.com/document_detail/160661.html">Create a multi-account trail</a>, and <a href="https://help.aliyun.com/document_detail/28997.html">Overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries event details.</p>
     * 
     * @param request LookupEventsRequest
     * @return LookupEventsResponse
     */
    public LookupEventsResponse lookupEvents(LookupEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建事件选择器</p>
     * 
     * @param request PutDataEventSelectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutDataEventSelectorResponse
     */
    public PutDataEventSelectorResponse putDataEventSelectorWithOptions(PutDataEventSelectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventSelectors)) {
            query.put("EventSelectors", request.eventSelectors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTrailAllRegion)) {
            query.put("IsTrailAllRegion", request.isTrailAllRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailName)) {
            query.put("TrailName", request.trailName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailRegionIds)) {
            query.put("TrailRegionIds", request.trailRegionIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDataEventSelector"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDataEventSelectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建事件选择器</p>
     * 
     * @param request PutDataEventSelectorRequest
     * @return PutDataEventSelectorResponse
     */
    public PutDataEventSelectorResponse putDataEventSelector(PutDataEventSelectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDataEventSelectorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to enable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a trail to deliver events to an Object Storage Service (OSS) bucket or a Simple Log Service Logstore.</p>
     * 
     * @param request StartLoggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartLoggingResponse
     */
    public StartLoggingResponse startLoggingWithOptions(StartLoggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartLogging"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartLoggingResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to enable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a trail to deliver events to an Object Storage Service (OSS) bucket or a Simple Log Service Logstore.</p>
     * 
     * @param request StartLoggingRequest
     * @return StartLoggingResponse
     */
    public StartLoggingResponse startLogging(StartLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLoggingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to disable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a trail to stop the delivery of events to an Object Storage Service (OSS) bucket or a  Simple Log Service Logstore.</p>
     * 
     * @param request StopLoggingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopLoggingResponse
     */
    public StopLoggingResponse stopLoggingWithOptions(StopLoggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLogging"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLoggingResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to disable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a trail to stop the delivery of events to an Object Storage Service (OSS) bucket or a  Simple Log Service Logstore.</p>
     * 
     * @param request StopLoggingRequest
     * @return StopLoggingResponse
     */
    public StopLoggingResponse stopLogging(StopLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLoggingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新高级查询模板</p>
     * 
     * @param request UpdateAdvancedQueryTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAdvancedQueryTemplateResponse
     */
    public UpdateAdvancedQueryTemplateResponse updateAdvancedQueryTemplateWithOptions(UpdateAdvancedQueryTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.simpleQuery)) {
            query.put("SimpleQuery", request.simpleQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateSql)) {
            query.put("TemplateSql", request.templateSql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAdvancedQueryTemplate"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdvancedQueryTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新高级查询模板</p>
     * 
     * @param request UpdateAdvancedQueryTemplateRequest
     * @return UpdateAdvancedQueryTemplateResponse
     */
    public UpdateAdvancedQueryTemplateResponse updateAdvancedQueryTemplate(UpdateAdvancedQueryTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAdvancedQueryTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.</p>
     * <ul>
     * <li>To obtain the permissions to call the API operation, you must submit a ticket.</li>
     * <li>Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Specifies the region where you want to store global events.</p>
     * 
     * @param request UpdateGlobalEventsStorageRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGlobalEventsStorageRegionResponse
     */
    public UpdateGlobalEventsStorageRegionResponse updateGlobalEventsStorageRegionWithOptions(UpdateGlobalEventsStorageRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.storageRegion)) {
            query.put("StorageRegion", request.storageRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGlobalEventsStorageRegion"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGlobalEventsStorageRegionResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.</p>
     * <ul>
     * <li>To obtain the permissions to call the API operation, you must submit a ticket.</li>
     * <li>Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Specifies the region where you want to store global events.</p>
     * 
     * @param request UpdateGlobalEventsStorageRegionRequest
     * @return UpdateGlobalEventsStorageRegionResponse
     */
    public UpdateGlobalEventsStorageRegionResponse updateGlobalEventsStorageRegion(UpdateGlobalEventsStorageRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGlobalEventsStorageRegionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named <code>trail-test</code> to <code>audit-log</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of a trail.</p>
     * 
     * @param request UpdateTrailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTrailResponse
     */
    public UpdateTrailResponse updateTrailWithOptions(UpdateTrailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventRW)) {
            query.put("EventRW", request.eventRW);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectArn)) {
            query.put("MaxComputeProjectArn", request.maxComputeProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeWriteRoleArn)) {
            query.put("MaxComputeWriteRoleArn", request.maxComputeWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKeyPrefix)) {
            query.put("OssKeyPrefix", request.ossKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossWriteRoleArn)) {
            query.put("OssWriteRoleArn", request.ossWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectArn)) {
            query.put("SlsProjectArn", request.slsProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsWriteRoleArn)) {
            query.put("SlsWriteRoleArn", request.slsWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailRegion)) {
            query.put("TrailRegion", request.trailRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrail"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrailResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named <code>trail-test</code> to <code>audit-log</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of a trail.</p>
     * 
     * @param request UpdateTrailRequest
     * @return UpdateTrailResponse
     */
    public UpdateTrailResponse updateTrail(UpdateTrailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTrailWithOptions(request, runtime);
    }
}
