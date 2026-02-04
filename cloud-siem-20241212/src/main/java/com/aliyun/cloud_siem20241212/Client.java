// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212;

import com.aliyun.tea.*;
import com.aliyun.cloud_siem20241212.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloud-siem", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>检查升级项</p>
     * 
     * @param request CheckUpgradeItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUpgradeItemResponse
     */
    public CheckUpgradeItemResponse checkUpgradeItemWithOptions(CheckUpgradeItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeItemId)) {
            body.put("UpgradeItemId", request.upgradeItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUpgradeItem"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUpgradeItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查升级项</p>
     * 
     * @param request CheckUpgradeItemRequest
     * @return CheckUpgradeItemResponse
     */
    public CheckUpgradeItemResponse checkUpgradeItem(CheckUpgradeItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUpgradeItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据源</p>
     * 
     * @param request CreateDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataIngestionResponse
     */
    public CreateDataIngestionResponse createDataIngestionWithOptions(CreateDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacityCount)) {
            body.put("CapacityCount", request.capacityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionMode)) {
            body.put("DataIngestionMode", request.dataIngestionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionStateCode)) {
            body.put("DataIngestionStateCode", request.dataIngestionStateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionType)) {
            body.put("DataIngestionType", request.dataIngestionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceEditable)) {
            body.put("DataSourceEditable", request.dataSourceEditable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleEditable)) {
            body.put("NormalizationRuleEditable", request.normalizationRuleEditable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanDataSourceId)) {
            body.put("ScanDataSourceId", request.scanDataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamJobId)) {
            body.put("StreamJobId", request.streamJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTime)) {
            body.put("UpdateTime", request.updateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据源</p>
     * 
     * @param request CreateDataIngestionRequest
     * @return CreateDataIngestionResponse
     */
    public CreateDataIngestionResponse createDataIngestion(CreateDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSetResponse
     */
    public CreateDataSetResponse createDataSetWithOptions(CreateDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDescription)) {
            body.put("DataSetDescription", request.dataSetDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFieldKeyName)) {
            body.put("DataSetFieldKeyName", request.dataSetFieldKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFileName)) {
            body.put("DataSetFileName", request.dataSetFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetName)) {
            body.put("DataSetName", request.dataSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetStatus)) {
            body.put("DataSetStatus", request.dataSetStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetType)) {
            body.put("DataSetType", request.dataSetType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelistRecognizers)) {
            bodyFlat.put("IpWhitelistRecognizers", request.ipWhitelistRecognizers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSet"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    public CreateDataSetResponse createDataSet(CreateDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据源</p>
     * 
     * @param tmpReq CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataSourceShrinkRequest request = new CreateDataSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceIds)) {
            request.dataSourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceIds, "DataSourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceReferences)) {
            request.dataSourceReferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceReferences, "DataSourceReferences", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFrom)) {
            body.put("DataSourceFrom", request.dataSourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdsShrink)) {
            body.put("DataSourceIds", request.dataSourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            body.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizer)) {
            body.put("DataSourceRecognizer", request.dataSourceRecognizer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceReferencesShrink)) {
            body.put("DataSourceReferences", request.dataSourceReferencesShrink);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStores)) {
            bodyFlat.put("DataSourceStores", request.dataSourceStores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateId)) {
            body.put("DataSourceTemplateId", request.dataSourceTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2024-12-12"),
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
     * <b>summary</b> : 
     * <p>创建数据源</p>
     * 
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建检测规则</p>
     * 
     * @param request CreateDetectionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDetectionRuleResponse
     */
    public CreateDetectionRuleResponse createDetectionRuleWithOptions(CreateDetectionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCk)) {
            body.put("AlertAttCk", request.alertAttCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertDescription)) {
            body.put("AlertDescription", request.alertDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertSchemaId)) {
            body.put("AlertSchemaId", request.alertSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTacticId)) {
            body.put("AlertTacticId", request.alertTacticId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdCount)) {
            body.put("AlertThresholdCount", request.alertThresholdCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdGroup)) {
            body.put("AlertThresholdGroup", request.alertThresholdGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdPeriod)) {
            body.put("AlertThresholdPeriod", request.alertThresholdPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionContent)) {
            body.put("DetectionExpressionContent", request.detectionExpressionContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionType)) {
            body.put("DetectionExpressionType", request.detectionExpressionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleDescription)) {
            body.put("DetectionRuleDescription", request.detectionRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleName)) {
            body.put("DetectionRuleName", request.detectionRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleStatus)) {
            body.put("DetectionRuleStatus", request.detectionRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleTemplateId)) {
            body.put("DetectionRuleTemplateId", request.detectionRuleTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleTemplateVersion)) {
            body.put("DetectionRuleTemplateVersion", request.detectionRuleTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleType)) {
            body.put("DetectionRuleType", request.detectionRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityMappings)) {
            body.put("EntityMappings", request.entityMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationExpression)) {
            body.put("IncidentAggregationExpression", request.incidentAggregationExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationType)) {
            body.put("IncidentAggregationType", request.incidentAggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCategoryId)) {
            body.put("LogCategoryId", request.logCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaId)) {
            body.put("LogSchemaId", request.logSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParameters)) {
            body.put("PlaybookParameters", request.playbookParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleBeginTime)) {
            body.put("ScheduleBeginTime", request.scheduleBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleExpression)) {
            body.put("ScheduleExpression", request.scheduleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxRetries)) {
            body.put("ScheduleMaxRetries", request.scheduleMaxRetries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxTimeout)) {
            body.put("ScheduleMaxTimeout", request.scheduleMaxTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleWindow)) {
            body.put("ScheduleWindow", request.scheduleWindow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDetectionRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDetectionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建检测规则</p>
     * 
     * @param request CreateDetectionRuleRequest
     * @return CreateDetectionRuleResponse
     */
    public CreateDetectionRuleResponse createDetectionRule(CreateDetectionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDetectionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建导出任务</p>
     * 
     * @param request CreateExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTaskWithOptions(CreateExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskParameter)) {
            body.put("ExportTaskParameter", request.exportTaskParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskType)) {
            body.put("ExportTaskType", request.exportTaskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExportTask"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建导出任务</p>
     * 
     * @param request CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTask(CreateExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建LogStore</p>
     * 
     * @param request CreateLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStoreWithOptions(CreateLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogStore"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建LogStore</p>
     * 
     * @param request CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStore(CreateLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准化规则</p>
     * 
     * @param tmpReq CreateNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNormalizationRuleResponse
     */
    public CreateNormalizationRuleResponse createNormalizationRuleWithOptions(CreateNormalizationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNormalizationRuleShrinkRequest request = new CreateNormalizationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendContentPacked)) {
            body.put("ExtendContentPacked", request.extendContentPacked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendFieldStoreMode)) {
            body.put("ExtendFieldStoreMode", request.extendFieldStoreMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleDescription)) {
            body.put("NormalizationRuleDescription", request.normalizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleExpression)) {
            body.put("NormalizationRuleExpression", request.normalizationRuleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleFormat)) {
            body.put("NormalizationRuleFormat", request.normalizationRuleFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleMode)) {
            body.put("NormalizationRuleMode", request.normalizationRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleName)) {
            body.put("NormalizationRuleName", request.normalizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleType)) {
            body.put("NormalizationRuleType", request.normalizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNormalizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准化规则</p>
     * 
     * @param request CreateNormalizationRuleRequest
     * @return CreateNormalizationRuleResponse
     */
    public CreateNormalizationRuleResponse createNormalizationRule(CreateNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准化结构</p>
     * 
     * @param request CreateNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNormalizationSchemaResponse
     */
    public CreateNormalizationSchemaResponse createNormalizationSchemaWithOptions(CreateNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFields)) {
            body.put("NormalizationFields", request.normalizationFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaDescription)) {
            body.put("NormalizationSchemaDescription", request.normalizationSchemaDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaName)) {
            body.put("NormalizationSchemaName", request.normalizationSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLogStore)) {
            body.put("TargetLogStore", request.targetLogStore);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNormalizationSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准化结构</p>
     * 
     * @param request CreateNormalizationSchemaRequest
     * @return CreateNormalizationSchemaResponse
     */
    public CreateNormalizationSchemaResponse createNormalizationSchema(CreateNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建厂商</p>
     * 
     * @param request CreateVendorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVendorResponse
     */
    public CreateVendorResponse createVendorWithOptions(CreateVendorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVendor"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVendorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建厂商</p>
     * 
     * @param request CreateVendorRequest
     * @return CreateVendorResponse
     */
    public CreateVendorResponse createVendor(CreateVendorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVendorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据接入</p>
     * 
     * @param request DeleteDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataIngestionResponse
     */
    public DeleteDataIngestionResponse deleteDataIngestionWithOptions(DeleteDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据接入</p>
     * 
     * @param request DeleteDataIngestionRequest
     * @return DeleteDataIngestionResponse
     */
    public DeleteDataIngestionResponse deleteDataIngestion(DeleteDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request DeleteDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSetResponse
     */
    public DeleteDataSetResponse deleteDataSetWithOptions(DeleteDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSet"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    public DeleteDataSetResponse deleteDataSet(DeleteDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集记录</p>
     * 
     * @param request DeleteDataSetRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSetRecordResponse
     */
    public DeleteDataSetRecordResponse deleteDataSetRecordWithOptions(DeleteDataSetRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetRecordIds)) {
            body.put("DataSetRecordIds", request.dataSetRecordIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSetRecord"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSetRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集记录</p>
     * 
     * @param request DeleteDataSetRecordRequest
     * @return DeleteDataSetRecordResponse
     */
    public DeleteDataSetRecordResponse deleteDataSetRecord(DeleteDataSetRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSetRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除检测规则</p>
     * 
     * @param request DeleteDetectionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDetectionRuleResponse
     */
    public DeleteDetectionRuleResponse deleteDetectionRuleWithOptions(DeleteDetectionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDetectionRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDetectionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除检测规则</p>
     * 
     * @param request DeleteDetectionRuleRequest
     * @return DeleteDetectionRuleResponse
     */
    public DeleteDetectionRuleResponse deleteDetectionRule(DeleteDetectionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDetectionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除LogStore</p>
     * 
     * @param request DeleteLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStoreWithOptions(DeleteLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogStore"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除LogStore</p>
     * 
     * @param request DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStore(DeleteLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则</p>
     * 
     * @param request DeleteNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNormalizationRuleResponse
     */
    public DeleteNormalizationRuleResponse deleteNormalizationRuleWithOptions(DeleteNormalizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNormalizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则</p>
     * 
     * @param request DeleteNormalizationRuleRequest
     * @return DeleteNormalizationRuleResponse
     */
    public DeleteNormalizationRuleResponse deleteNormalizationRule(DeleteNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则版本</p>
     * 
     * @param request DeleteNormalizationRuleVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNormalizationRuleVersionResponse
     */
    public DeleteNormalizationRuleVersionResponse deleteNormalizationRuleVersionWithOptions(DeleteNormalizationRuleVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNormalizationRuleVersion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNormalizationRuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则版本</p>
     * 
     * @param request DeleteNormalizationRuleVersionRequest
     * @return DeleteNormalizationRuleVersionResponse
     */
    public DeleteNormalizationRuleVersionResponse deleteNormalizationRuleVersion(DeleteNormalizationRuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNormalizationRuleVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除厂商</p>
     * 
     * @param request DeleteVendorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVendorResponse
     */
    public DeleteVendorResponse deleteVendorWithOptions(DeleteVendorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVendor"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVendorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除厂商</p>
     * 
     * @param request DeleteVendorRequest
     * @return DeleteVendorResponse
     */
    public DeleteVendorResponse deleteVendor(DeleteVendorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVendorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止数据接入</p>
     * 
     * @param request DisableDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDataIngestionResponse
     */
    public DisableDataIngestionResponse disableDataIngestionWithOptions(DisableDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止数据接入</p>
     * 
     * @param request DisableDataIngestionRequest
     * @return DisableDataIngestionResponse
     */
    public DisableDataIngestionResponse disableDataIngestion(DisableDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动数据接入</p>
     * 
     * @param request EnableDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDataIngestionResponse
     */
    public EnableDataIngestionResponse enableDataIngestionWithOptions(EnableDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动数据接入</p>
     * 
     * @param request EnableDataIngestionRequest
     * @return EnableDataIngestionResponse
     */
    public EnableDataIngestionResponse enableDataIngestion(EnableDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看LogStore</p>
     * 
     * @param request ExecuteLogQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteLogQueryResponse
     */
    public ExecuteLogQueryResponse executeLogQueryWithOptions(ExecuteLogQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendContentPacked)) {
            body.put("ExtendContentPacked", request.extendContentPacked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logQuery)) {
            body.put("LogQuery", request.logQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteLogQuery"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteLogQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看LogStore</p>
     * 
     * @param request ExecuteLogQueryRequest
     * @return ExecuteLogQueryResponse
     */
    public ExecuteLogQueryResponse executeLogQuery(ExecuteLogQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeLogQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行升级</p>
     * 
     * @param request ExecuteUpgradeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteUpgradeResponse
     */
    public ExecuteUpgradeResponse executeUpgradeWithOptions(ExecuteUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteUpgrade"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteUpgradeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行升级</p>
     * 
     * @param request ExecuteUpgradeRequest
     * @return ExecuteUpgradeResponse
     */
    public ExecuteUpgradeResponse executeUpgrade(ExecuteUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeUpgradeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据批量接入</p>
     * 
     * @param request GetDataBatchIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataBatchIngestionResponse
     */
    public GetDataBatchIngestionResponse getDataBatchIngestionWithOptions(GetDataBatchIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataBatchIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataBatchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据批量接入</p>
     * 
     * @param request GetDataBatchIngestionRequest
     * @return GetDataBatchIngestionResponse
     */
    public GetDataBatchIngestionResponse getDataBatchIngestion(GetDataBatchIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataBatchIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志管理页面里用户数据存储的详情。</p>
     * 
     * @param request GetDataStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataStorageResponse
     */
    public GetDataStorageResponse getDataStorageWithOptions(GetDataStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataStorage"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志管理页面里用户数据存储的详情。</p>
     * 
     * @param request GetDataStorageRequest
     * @return GetDataStorageResponse
     */
    public GetDataStorageResponse getDataStorage(GetDataStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新检测规则</p>
     * 
     * @param request GetDetectionStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDetectionStatisticResponse
     */
    public GetDetectionStatisticResponse getDetectionStatisticWithOptions(GetDetectionStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectionStatistic"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectionStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新检测规则</p>
     * 
     * @param request GetDetectionStatisticRequest
     * @return GetDetectionStatisticResponse
     */
    public GetDetectionStatisticResponse getDetectionStatistic(GetDetectionStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectionStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取导出任务进度</p>
     * 
     * @param request GetExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExportTaskResponse
     */
    public GetExportTaskResponse getExportTaskWithOptions(GetExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            body.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExportTask"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取导出任务进度</p>
     * 
     * @param request GetExportTaskRequest
     * @return GetExportTaskResponse
     */
    public GetExportTaskResponse getExportTask(GetExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件列表</p>
     * 
     * @param request GetIncidentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentResponse
     */
    public GetIncidentResponse getIncidentWithOptions(GetIncidentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncident"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件列表</p>
     * 
     * @param request GetIncidentRequest
     * @return GetIncidentResponse
     */
    public GetIncidentResponse getIncident(GetIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIncidentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看LogStore</p>
     * 
     * @param request GetLogTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogTicketResponse
     */
    public GetLogTicketResponse getLogTicketWithOptions(GetLogTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogTicket"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看LogStore</p>
     * 
     * @param request GetLogTicketRequest
     * @return GetLogTicketResponse
     */
    public GetLogTicketResponse getLogTicket(GetLogTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则</p>
     * 
     * @param request GetNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNormalizationRuleResponse
     */
    public GetNormalizationRuleResponse getNormalizationRuleWithOptions(GetNormalizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNormalizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则</p>
     * 
     * @param request GetNormalizationRuleRequest
     * @return GetNormalizationRuleResponse
     */
    public GetNormalizationRuleResponse getNormalizationRule(GetNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则指定版本信息</p>
     * 
     * @param request GetNormalizationRuleVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNormalizationRuleVersionResponse
     */
    public GetNormalizationRuleVersionResponse getNormalizationRuleVersionWithOptions(GetNormalizationRuleVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNormalizationRuleVersion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNormalizationRuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则指定版本信息</p>
     * 
     * @param request GetNormalizationRuleVersionRequest
     * @return GetNormalizationRuleVersionResponse
     */
    public GetNormalizationRuleVersionResponse getNormalizationRuleVersion(GetNormalizationRuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNormalizationRuleVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Schema信息以及字段</p>
     * 
     * @param request GetNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNormalizationSchemaResponse
     */
    public GetNormalizationSchemaResponse getNormalizationSchemaWithOptions(GetNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNormalizationSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Schema信息以及字段</p>
     * 
     * @param request GetNormalizationSchemaRequest
     * @return GetNormalizationSchemaResponse
     */
    public GetNormalizationSchemaResponse getNormalizationSchema(GetNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户配置信息</p>
     * 
     * @param request GetUserConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserConfigResponse
     */
    public GetUserConfigResponse getUserConfigWithOptions(GetUserConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserConfig"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户配置信息</p>
     * 
     * @param request GetUserConfigRequest
     * @return GetUserConfigResponse
     */
    public GetUserConfigResponse getUserConfig(GetUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入模板</p>
     * 
     * @param request ListDataIngestionTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataIngestionTemplatesResponse
     */
    public ListDataIngestionTemplatesResponse listDataIngestionTemplatesWithOptions(ListDataIngestionTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateStatus)) {
            body.put("DataIngestionTemplateStatus", request.dataIngestionTemplateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateIds)) {
            body.put("DataSourceTemplateIds", request.dataSourceTemplateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataIngestionTemplates"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataIngestionTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入模板</p>
     * 
     * @param request ListDataIngestionTemplatesRequest
     * @return ListDataIngestionTemplatesResponse
     */
    public ListDataIngestionTemplatesResponse listDataIngestionTemplates(ListDataIngestionTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataIngestionTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据接入任务列表</p>
     * 
     * @param tmpReq ListDataIngestionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataIngestionsResponse
     */
    public ListDataIngestionsResponse listDataIngestionsWithOptions(ListDataIngestionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataIngestionsShrinkRequest request = new ListDataIngestionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIngestionIds)) {
            request.dataIngestionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIngestionIds, "DataIngestionIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIngestionTemplateIds)) {
            request.dataIngestionTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIngestionTemplateIds, "DataIngestionTemplateIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionIdsShrink)) {
            body.put("DataIngestionIds", request.dataIngestionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionStatus)) {
            body.put("DataIngestionStatus", request.dataIngestionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateIdsShrink)) {
            body.put("DataIngestionTemplateIds", request.dataIngestionTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataIngestions"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataIngestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据接入任务列表</p>
     * 
     * @param request ListDataIngestionsRequest
     * @return ListDataIngestionsResponse
     */
    public ListDataIngestionsResponse listDataIngestions(ListDataIngestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataIngestionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集记录列表</p>
     * 
     * @param request ListDataSetRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetRecordsResponse
     */
    public ListDataSetRecordsResponse listDataSetRecordsWithOptions(ListDataSetRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSetRecords"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集记录列表</p>
     * 
     * @param request ListDataSetRecordsRequest
     * @return ListDataSetRecordsResponse
     */
    public ListDataSetRecordsResponse listDataSetRecords(ListDataSetRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSetRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @param tmpReq ListDataSetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetsResponse
     */
    public ListDataSetsResponse listDataSetsWithOptions(ListDataSetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSetsShrinkRequest request = new ListDataSetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSetIds)) {
            request.dataSetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSetIds, "DataSetIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetIdsShrink)) {
            body.put("DataSetIds", request.dataSetIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetName)) {
            body.put("DataSetName", request.dataSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetStatus)) {
            body.put("DataSetStatus", request.dataSetStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetType)) {
            body.put("DataSetType", request.dataSetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSets"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @param request ListDataSetsRequest
     * @return ListDataSetsResponse
     */
    public ListDataSetsResponse listDataSets(ListDataSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源模板</p>
     * 
     * @param tmpReq ListDataSourceTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceTemplatesResponse
     */
    public ListDataSourceTemplatesResponse listDataSourceTemplatesWithOptions(ListDataSourceTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourceTemplatesShrinkRequest request = new ListDataSourceTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceTemplateIds)) {
            request.dataSourceTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceTemplateIds, "DataSourceTemplateIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateIdsShrink)) {
            body.put("DataSourceTemplateIds", request.dataSourceTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTemplates"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源模板</p>
     * 
     * @param request ListDataSourceTemplatesRequest
     * @return ListDataSourceTemplatesResponse
     */
    public ListDataSourceTemplatesResponse listDataSourceTemplates(ListDataSourceTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取厂商列表</p>
     * 
     * @param tmpReq ListDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourcesShrinkRequest request = new ListDataSourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceIds)) {
            request.dataSourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceIds, "DataSourceIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceTemplateIds)) {
            request.dataSourceTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceTemplateIds, "DataSourceTemplateIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFrom)) {
            body.put("DataSourceFrom", request.dataSourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdsShrink)) {
            body.put("DataSourceIds", request.dataSourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStatus)) {
            body.put("DataSourceStatus", request.dataSourceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStoreStatus)) {
            body.put("DataSourceStoreStatus", request.dataSourceStoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateIdsShrink)) {
            body.put("DataSourceTemplateIds", request.dataSourceTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取厂商列表</p>
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
     * <p>获取检测规则列表</p>
     * 
     * @param tmpReq ListDetectionRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDetectionRulesResponse
     */
    public ListDetectionRulesResponse listDetectionRulesWithOptions(ListDetectionRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDetectionRulesShrinkRequest request = new ListDetectionRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detectionRuleIds)) {
            request.detectionRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detectionRuleIds, "DetectionRuleIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCk)) {
            body.put("AlertAttCk", request.alertAttCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTacticId)) {
            body.put("AlertTacticId", request.alertTacticId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionType)) {
            body.put("DetectionExpressionType", request.detectionExpressionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleIdsShrink)) {
            body.put("DetectionRuleIds", request.detectionRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleName)) {
            body.put("DetectionRuleName", request.detectionRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleStatus)) {
            body.put("DetectionRuleStatus", request.detectionRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleType)) {
            body.put("DetectionRuleType", request.detectionRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationType)) {
            body.put("IncidentAggregationType", request.incidentAggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCategoryId)) {
            body.put("LogCategoryId", request.logCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaId)) {
            body.put("LogSchemaId", request.logSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDetectionRules"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDetectionRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取检测规则列表</p>
     * 
     * @param request ListDetectionRulesRequest
     * @return ListDetectionRulesResponse
     */
    public ListDetectionRulesResponse listDetectionRules(ListDetectionRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDetectionRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件列表</p>
     * 
     * @param tmpReq ListIncidentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidentsWithOptions(ListIncidentsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListIncidentsShrinkRequest request = new ListIncidentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.incidentUuids)) {
            request.incidentUuidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.incidentUuids, "IncidentUuids", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentName)) {
            query.put("IncidentName", request.incidentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuidsShrink)) {
            query.put("IncidentUuids", request.incidentUuidsShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertUuid)) {
            body.put("AlertUuid", request.alertUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentStatus)) {
            body.put("IncidentStatus", request.incidentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentTags)) {
            body.put("IncidentTags", request.incidentTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owners)) {
            body.put("Owners", request.owners);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relateAssetId)) {
            body.put("RelateAssetId", request.relateAssetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relateEntityId)) {
            body.put("RelateEntityId", request.relateEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            body.put("ThreatLevel", request.threatLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidents"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件列表</p>
     * 
     * @param request ListIncidentsRequest
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIncidentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志Project列表</p>
     * 
     * @param request ListLogProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogProjectsResponse
     */
    public ListLogProjectsResponse listLogProjectsWithOptions(ListLogProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogProjects"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志Project列表</p>
     * 
     * @param request ListLogProjectsRequest
     * @return ListLogProjectsResponse
     */
    public ListLogProjectsResponse listLogProjects(ListLogProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取所有的区域</p>
     * 
     * @param request ListLogRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogRegionsResponse
     */
    public ListLogRegionsResponse listLogRegionsWithOptions(ListLogRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogRegions"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取所有的区域</p>
     * 
     * @param request ListLogRegionsRequest
     * @return ListLogRegionsResponse
     */
    public ListLogRegionsResponse listLogRegions(ListLogRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志store列表</p>
     * 
     * @param request ListLogStoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStoresWithOptions(ListLogStoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogStores"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogStoresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志store列表</p>
     * 
     * @param request ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStores(ListLogStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogStoresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化目录</p>
     * 
     * @param request ListNormalizationCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationCategoriesResponse
     */
    public ListNormalizationCategoriesResponse listNormalizationCategoriesWithOptions(ListNormalizationCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryType)) {
            body.put("NormalizationCategoryType", request.normalizationCategoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationCategories"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化目录</p>
     * 
     * @param request ListNormalizationCategoriesRequest
     * @return ListNormalizationCategoriesResponse
     */
    public ListNormalizationCategoriesResponse listNormalizationCategories(ListNormalizationCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化日志所有字段</p>
     * 
     * @param request ListNormalizationFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationFieldsResponse
     */
    public ListNormalizationFieldsResponse listNormalizationFieldsWithOptions(ListNormalizationFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationFields"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化日志所有字段</p>
     * 
     * @param request ListNormalizationFieldsRequest
     * @return ListNormalizationFieldsResponse
     */
    public ListNormalizationFieldsResponse listNormalizationFields(ListNormalizationFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取规则的安全能力</p>
     * 
     * @param tmpReq ListNormalizationRuleCapacitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationRuleCapacitiesResponse
     */
    public ListNormalizationRuleCapacitiesResponse listNormalizationRuleCapacitiesWithOptions(ListNormalizationRuleCapacitiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNormalizationRuleCapacitiesShrinkRequest request = new ListNormalizationRuleCapacitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationRuleCapacities"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationRuleCapacitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取规则的安全能力</p>
     * 
     * @param request ListNormalizationRuleCapacitiesRequest
     * @return ListNormalizationRuleCapacitiesResponse
     */
    public ListNormalizationRuleCapacitiesResponse listNormalizationRuleCapacities(ListNormalizationRuleCapacitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationRuleCapacitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则版本列表</p>
     * 
     * @param request ListNormalizationRuleVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationRuleVersionsResponse
     */
    public ListNormalizationRuleVersionsResponse listNormalizationRuleVersionsWithOptions(ListNormalizationRuleVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationRuleVersions"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationRuleVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则版本列表</p>
     * 
     * @param request ListNormalizationRuleVersionsRequest
     * @return ListNormalizationRuleVersionsResponse
     */
    public ListNormalizationRuleVersionsResponse listNormalizationRuleVersions(ListNormalizationRuleVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationRuleVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则列表</p>
     * 
     * @param tmpReq ListNormalizationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationRulesResponse
     */
    public ListNormalizationRulesResponse listNormalizationRulesWithOptions(ListNormalizationRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNormalizationRulesShrinkRequest request = new ListNormalizationRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleName)) {
            body.put("NormalizationRuleName", request.normalizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleType)) {
            body.put("NormalizationRuleType", request.normalizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationRules"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则列表</p>
     * 
     * @param request ListNormalizationRulesRequest
     * @return ListNormalizationRulesResponse
     */
    public ListNormalizationRulesResponse listNormalizationRules(ListNormalizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化类目</p>
     * 
     * @param request ListNormalizationSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationSchemasResponse
     */
    public ListNormalizationSchemasResponse listNormalizationSchemasWithOptions(ListNormalizationSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationSchemas"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化类目</p>
     * 
     * @param request ListNormalizationSchemasRequest
     * @return ListNormalizationSchemasResponse
     */
    public ListNormalizationSchemasResponse listNormalizationSchemas(ListNormalizationSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品列表</p>
     * 
     * @param tmpReq ListProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductsShrinkRequest request = new ListProductsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productIds)) {
            request.productIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productIds, "ProductIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIdsShrink)) {
            body.put("ProductIds", request.productIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品列表</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取接入流量统计</p>
     * 
     * @param tmpReq ListTrafficStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrafficStatisticsResponse
     */
    public ListTrafficStatisticsResponse listTrafficStatisticsWithOptions(ListTrafficStatisticsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTrafficStatisticsShrinkRequest request = new ListTrafficStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            body.put("RegionTag", request.regionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficStatisticPeriod)) {
            body.put("TrafficStatisticPeriod", request.trafficStatisticPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficStatisticPeriodType)) {
            body.put("TrafficStatisticPeriodType", request.trafficStatisticPeriodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficStatisticType)) {
            body.put("TrafficStatisticType", request.trafficStatisticType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrafficStatistics"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取接入流量统计</p>
     * 
     * @param request ListTrafficStatisticsRequest
     * @return ListTrafficStatisticsResponse
     */
    public ListTrafficStatisticsResponse listTrafficStatistics(ListTrafficStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrafficStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取升级项列表</p>
     * 
     * @param request ListUpgradeItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpgradeItemsResponse
     */
    public ListUpgradeItemsResponse listUpgradeItemsWithOptions(ListUpgradeItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpgradeItems"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpgradeItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取升级项列表</p>
     * 
     * @param request ListUpgradeItemsRequest
     * @return ListUpgradeItemsResponse
     */
    public ListUpgradeItemsResponse listUpgradeItems(ListUpgradeItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpgradeItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取厂商列表</p>
     * 
     * @param tmpReq ListVendorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVendorsResponse
     */
    public ListVendorsResponse listVendorsWithOptions(ListVendorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListVendorsShrinkRequest request = new ListVendorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vendorIds)) {
            request.vendorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vendorIds, "VendorIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorIdsShrink)) {
            body.put("VendorIds", request.vendorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            body.put("VendorType", request.vendorType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVendors"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVendorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取厂商列表</p>
     * 
     * @param request ListVendorsRequest
     * @return ListVendorsResponse
     */
    public ListVendorsResponse listVendors(ListVendorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVendorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新数据源</p>
     * 
     * @param request RefreshDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDataSourceResponse
     */
    public RefreshDataSourceResponse refreshDataSourceWithOptions(RefreshDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDataSource"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新数据源</p>
     * 
     * @param request RefreshDataSourceRequest
     * @return RefreshDataSourceResponse
     */
    public RefreshDataSourceResponse refreshDataSource(RefreshDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>数据存储的清空操作，该动作会删除已有的数据，重新初始化物理存储。</p>
     * 
     * @param request ResetDataStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDataStorageResponse
     */
    public ResetDataStorageResponse resetDataStorageWithOptions(ResetDataStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDataStorage"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDataStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>数据存储的清空操作，该动作会删除已有的数据，重新初始化物理存储。</p>
     * 
     * @param request ResetDataStorageRequest
     * @return ResetDataStorageResponse
     */
    public ResetDataStorageResponse resetDataStorage(ResetDataStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDataStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置标准化规则默认版本</p>
     * 
     * @param request SetDefaultNormalizationRuleVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    public SetDefaultNormalizationRuleVersionResponse setDefaultNormalizationRuleVersionWithOptions(SetDefaultNormalizationRuleVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultNormalizationRuleVersion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultNormalizationRuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置标准化规则默认版本</p>
     * 
     * @param request SetDefaultNormalizationRuleVersionRequest
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    public SetDefaultNormalizationRuleVersionResponse setDefaultNormalizationRuleVersion(SetDefaultNormalizationRuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultNormalizationRuleVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据批量接入</p>
     * 
     * @param tmpReq UpdateDataBatchIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataBatchIngestionResponse
     */
    public UpdateDataBatchIngestionResponse updateDataBatchIngestionWithOptions(UpdateDataBatchIngestionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataBatchIngestionShrinkRequest request = new UpdateDataBatchIngestionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIngestionIds)) {
            request.dataIngestionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIngestionIds, "DataIngestionIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScanNew)) {
            body.put("AutoScanNew", request.autoScanNew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataBatchIngestionMode)) {
            body.put("DataBatchIngestionMode", request.dataBatchIngestionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionIdsShrink)) {
            body.put("DataIngestionIds", request.dataIngestionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            body.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataBatchIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataBatchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据批量接入</p>
     * 
     * @param request UpdateDataBatchIngestionRequest
     * @return UpdateDataBatchIngestionResponse
     */
    public UpdateDataBatchIngestionResponse updateDataBatchIngestion(UpdateDataBatchIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataBatchIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据接入信息</p>
     * 
     * @param request UpdateDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataIngestionResponse
     */
    public UpdateDataIngestionResponse updateDataIngestionWithOptions(UpdateDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionMode)) {
            body.put("DataIngestionMode", request.dataIngestionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据接入信息</p>
     * 
     * @param request UpdateDataIngestionRequest
     * @return UpdateDataIngestionResponse
     */
    public UpdateDataIngestionResponse updateDataIngestion(UpdateDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新接入模板</p>
     * 
     * @param request UpdateDataIngestionTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataIngestionTemplateResponse
     */
    public UpdateDataIngestionTemplateResponse updateDataIngestionTemplateWithOptions(UpdateDataIngestionTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionStatus)) {
            body.put("DataIngestionStatus", request.dataIngestionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateId)) {
            body.put("DataIngestionTemplateId", request.dataIngestionTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateName)) {
            body.put("DataIngestionTemplateName", request.dataIngestionTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataIngestionTemplate"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataIngestionTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新接入模板</p>
     * 
     * @param request UpdateDataIngestionTemplateRequest
     * @return UpdateDataIngestionTemplateResponse
     */
    public UpdateDataIngestionTemplateResponse updateDataIngestionTemplate(UpdateDataIngestionTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataIngestionTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param request UpdateDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSetResponse
     */
    public UpdateDataSetResponse updateDataSetWithOptions(UpdateDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDescription)) {
            body.put("DataSetDescription", request.dataSetDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFileName)) {
            body.put("DataSetFileName", request.dataSetFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetName)) {
            body.put("DataSetName", request.dataSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetStatus)) {
            body.put("DataSetStatus", request.dataSetStatus);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelistRecognizers)) {
            bodyFlat.put("IpWhitelistRecognizers", request.ipWhitelistRecognizers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSet"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param request UpdateDataSetRequest
     * @return UpdateDataSetResponse
     */
    public UpdateDataSetResponse updateDataSet(UpdateDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集记录</p>
     * 
     * @param request UpdateDataSetRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSetRecordResponse
     */
    public UpdateDataSetRecordResponse updateDataSetRecordWithOptions(UpdateDataSetRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFileName)) {
            body.put("DataSetFileName", request.dataSetFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetRecords)) {
            body.put("DataSetRecords", request.dataSetRecords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSetRecord"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSetRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集记录</p>
     * 
     * @param request UpdateDataSetRecordRequest
     * @return UpdateDataSetRecordResponse
     */
    public UpdateDataSetRecordResponse updateDataSetRecord(UpdateDataSetRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSetRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据源</p>
     * 
     * @param request UpdateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFrom)) {
            body.put("DataSourceFrom", request.dataSourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            body.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStores)) {
            bodyFlat.put("DataSourceStores", request.dataSourceStores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2024-12-12"),
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
     * <b>summary</b> : 
     * <p>更新数据源</p>
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
     * <p>修改数据源模板</p>
     * 
     * @param tmpReq UpdateDataSourceTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceTemplateResponse
     */
    public UpdateDataSourceTemplateResponse updateDataSourceTemplateWithOptions(UpdateDataSourceTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataSourceTemplateShrinkRequest request = new UpdateDataSourceTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            query.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScanNew)) {
            body.put("AutoScanNew", request.autoScanNew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateId)) {
            body.put("DataSourceTemplateId", request.dataSourceTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateName)) {
            body.put("DataSourceTemplateName", request.dataSourceTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectPattern)) {
            body.put("LogProjectPattern", request.logProjectPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionIds)) {
            body.put("LogRegionIds", request.logRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStorePattern)) {
            body.put("LogStorePattern", request.logStorePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSourceTemplate"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据源模板</p>
     * 
     * @param request UpdateDataSourceTemplateRequest
     * @return UpdateDataSourceTemplateResponse
     */
    public UpdateDataSourceTemplateResponse updateDataSourceTemplate(UpdateDataSourceTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志管理页面里用户数据存储的详情。</p>
     * 
     * @param request UpdateDataStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataStorageResponse
     */
    public UpdateDataStorageResponse updateDataStorageWithOptions(UpdateDataStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataStorageRegionId)) {
            body.put("DataStorageRegionId", request.dataStorageRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryStatus)) {
            body.put("DeliveryStatus", request.deliveryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataStorage"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志管理页面里用户数据存储的详情。</p>
     * 
     * @param request UpdateDataStorageRequest
     * @return UpdateDataStorageResponse
     */
    public UpdateDataStorageResponse updateDataStorage(UpdateDataStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>操作日志投递.</p>
     * 
     * @param request UpdateDataStorageDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataStorageDeliveryResponse
     */
    public UpdateDataStorageDeliveryResponse updateDataStorageDeliveryWithOptions(UpdateDataStorageDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCode)) {
            body.put("LogCode", request.logCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDeliveryStatus)) {
            body.put("LogDeliveryStatus", request.logDeliveryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataStorageDelivery"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataStorageDeliveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>操作日志投递.</p>
     * 
     * @param request UpdateDataStorageDeliveryRequest
     * @return UpdateDataStorageDeliveryResponse
     */
    public UpdateDataStorageDeliveryResponse updateDataStorageDelivery(UpdateDataStorageDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataStorageDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据存储中日志的数据保存天数。</p>
     * 
     * @param request UpdateDataStorageTtlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataStorageTtlResponse
     */
    public UpdateDataStorageTtlResponse updateDataStorageTtlWithOptions(UpdateDataStorageTtlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreColdTtl)) {
            body.put("LogStoreColdTtl", request.logStoreColdTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreHotTtl)) {
            body.put("LogStoreHotTtl", request.logStoreHotTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreTtl)) {
            body.put("LogStoreTtl", request.logStoreTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataStorageTtl"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataStorageTtlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据存储中日志的数据保存天数。</p>
     * 
     * @param request UpdateDataStorageTtlRequest
     * @return UpdateDataStorageTtlResponse
     */
    public UpdateDataStorageTtlResponse updateDataStorageTtl(UpdateDataStorageTtlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataStorageTtlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新检测规则</p>
     * 
     * @param request UpdateDetectionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDetectionRuleResponse
     */
    public UpdateDetectionRuleResponse updateDetectionRuleWithOptions(UpdateDetectionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCk)) {
            body.put("AlertAttCk", request.alertAttCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertDescription)) {
            body.put("AlertDescription", request.alertDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertSchemaId)) {
            body.put("AlertSchemaId", request.alertSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTacticId)) {
            body.put("AlertTacticId", request.alertTacticId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdCount)) {
            body.put("AlertThresholdCount", request.alertThresholdCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdGroup)) {
            body.put("AlertThresholdGroup", request.alertThresholdGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdPeriod)) {
            body.put("AlertThresholdPeriod", request.alertThresholdPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionContent)) {
            body.put("DetectionExpressionContent", request.detectionExpressionContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionType)) {
            body.put("DetectionExpressionType", request.detectionExpressionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleDescription)) {
            body.put("DetectionRuleDescription", request.detectionRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleName)) {
            body.put("DetectionRuleName", request.detectionRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleStatus)) {
            body.put("DetectionRuleStatus", request.detectionRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleType)) {
            body.put("DetectionRuleType", request.detectionRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityMappings)) {
            body.put("EntityMappings", request.entityMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationExpression)) {
            body.put("IncidentAggregationExpression", request.incidentAggregationExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationType)) {
            body.put("IncidentAggregationType", request.incidentAggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCategoryId)) {
            body.put("LogCategoryId", request.logCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaId)) {
            body.put("LogSchemaId", request.logSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParameters)) {
            body.put("PlaybookParameters", request.playbookParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleBeginTime)) {
            body.put("ScheduleBeginTime", request.scheduleBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleExpression)) {
            body.put("ScheduleExpression", request.scheduleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxRetries)) {
            body.put("ScheduleMaxRetries", request.scheduleMaxRetries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxTimeout)) {
            body.put("ScheduleMaxTimeout", request.scheduleMaxTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleWindow)) {
            body.put("ScheduleWindow", request.scheduleWindow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDetectionRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDetectionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新检测规则</p>
     * 
     * @param request UpdateDetectionRuleRequest
     * @return UpdateDetectionRuleResponse
     */
    public UpdateDetectionRuleResponse updateDetectionRule(UpdateDetectionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDetectionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准化规则</p>
     * 
     * @param tmpReq UpdateNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNormalizationRuleResponse
     */
    public UpdateNormalizationRuleResponse updateNormalizationRuleWithOptions(UpdateNormalizationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNormalizationRuleShrinkRequest request = new UpdateNormalizationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendContentPacked)) {
            body.put("ExtendContentPacked", request.extendContentPacked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendFieldStoreMode)) {
            body.put("ExtendFieldStoreMode", request.extendFieldStoreMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleDescription)) {
            body.put("NormalizationRuleDescription", request.normalizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleExpression)) {
            body.put("NormalizationRuleExpression", request.normalizationRuleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleFormat)) {
            body.put("NormalizationRuleFormat", request.normalizationRuleFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleMode)) {
            body.put("NormalizationRuleMode", request.normalizationRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleName)) {
            body.put("NormalizationRuleName", request.normalizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleType)) {
            body.put("NormalizationRuleType", request.normalizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNormalizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准化规则</p>
     * 
     * @param request UpdateNormalizationRuleRequest
     * @return UpdateNormalizationRuleResponse
     */
    public UpdateNormalizationRuleResponse updateNormalizationRule(UpdateNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准化结构</p>
     * 
     * @param request UpdateNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNormalizationSchemaResponse
     */
    public UpdateNormalizationSchemaResponse updateNormalizationSchemaWithOptions(UpdateNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFields)) {
            body.put("NormalizationFields", request.normalizationFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaDescription)) {
            body.put("NormalizationSchemaDescription", request.normalizationSchemaDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaName)) {
            body.put("NormalizationSchemaName", request.normalizationSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNormalizationSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准化结构</p>
     * 
     * @param request UpdateNormalizationSchemaRequest
     * @return UpdateNormalizationSchemaResponse
     */
    public UpdateNormalizationSchemaResponse updateNormalizationSchema(UpdateNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新产品品</p>
     * 
     * @param request UpdateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新产品品</p>
     * 
     * @param request UpdateProductRequest
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新厂商</p>
     * 
     * @param request UpdateVendorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVendorResponse
     */
    public UpdateVendorResponse updateVendorWithOptions(UpdateVendorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVendor"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVendorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新厂商</p>
     * 
     * @param request UpdateVendorRequest
     * @return UpdateVendorResponse
     */
    public UpdateVendorResponse updateVendor(UpdateVendorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVendorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验LogStore</p>
     * 
     * @param request ValidateLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateLogStoreResponse
     */
    public ValidateLogStoreResponse validateLogStoreWithOptions(ValidateLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateLogStore"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateLogStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验LogStore</p>
     * 
     * @param request ValidateLogStoreRequest
     * @return ValidateLogStoreResponse
     */
    public ValidateLogStoreResponse validateLogStore(ValidateLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验规则和数据</p>
     * 
     * @param request ValidateNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateNormalizationRuleResponse
     */
    public ValidateNormalizationRuleResponse validateNormalizationRuleWithOptions(ValidateNormalizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendFieldStoreMode)) {
            body.put("ExtendFieldStoreMode", request.extendFieldStoreMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSample)) {
            body.put("LogSample", request.logSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleExpression)) {
            body.put("NormalizationRuleExpression", request.normalizationRuleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleMode)) {
            body.put("NormalizationRuleMode", request.normalizationRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateNormalizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验规则和数据</p>
     * 
     * @param request ValidateNormalizationRuleRequest
     * @return ValidateNormalizationRuleResponse
     */
    public ValidateNormalizationRuleResponse validateNormalizationRule(ValidateNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateNormalizationRuleWithOptions(request, runtime);
    }
}
